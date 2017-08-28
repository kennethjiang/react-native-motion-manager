//
//  DeviceMotion.h
//
//  Created by Patrick Williams in beautiful Seattle, WA.
//

#import "React/RCTBridgeModule.h"
#import <CoreMotion/CoreMotion.h>

@interface DeviceMotion : NSObject <RCTBridgeModule>

- (void) setDeviceMotionUpdateInterval:(double) interval;
- (void) getDeviceMotionUpdateInterval:(nonnull RCTResponseSenderBlock) cb;
- (void) getDeviceMotionData:(nonnull RCTResponseSenderBlock) cb;
- (void) startDeviceMotionUpdates:(nonnull RCTResponseSenderBlock) cb;
- (void) stopDeviceMotionUpdates;

@end
