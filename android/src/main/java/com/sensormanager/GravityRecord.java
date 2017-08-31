package com.sensormanager;

import android.hardware.Sensor;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

public class GravityRecord extends SensorRecord {

	private static final String GRAVITY_FIELD_KEY = "gravity";
	private static final String GRAVITY_EVENT_KEY = "GravityData";

	public GravityRecord(ReactApplicationContext reactContext) {
		super(reactContext);
	}

	@Override
	public String getName() {
		return "Gravity";
	}

	@Override
	protected int getSensorType() {
		return Sensor.TYPE_GRAVITY;
	}

	@Override
	protected String getEventNameKey() {
		return GRAVITY_EVENT_KEY;
	}

	@Override
	protected String getDataMapKey() {
		return GRAVITY_FIELD_KEY;
	}

	/**
	 * @param delaySeconds Delay in seconds and/or fractions of a second.
	 */
	@ReactMethod
	public void setGravityUpdateInterval(double delaySeconds) {
		setUpdateDelay(delaySeconds);
	}

	/**
	 * @return true if Gravity exists on device, false if it does not exist and so could not be started.
	 */
	@ReactMethod
	public void startGravityUpdates(Callback onStarted) {
		startUpdates(onStarted);
	}

	@ReactMethod
	public void stopGravityUpdates() {
		stopUpdates();
	}
}
