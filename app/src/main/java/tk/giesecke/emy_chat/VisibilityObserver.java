package tk.giesecke.emy_chat;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

public class VisibilityObserver implements LifecycleObserver {
	private String LOG_TAG = "VisibilityObserver";

	public static boolean isVisible = false;

//	@OnLifecycleEvent(Lifecycle.Event.ON_ANY)
//	public void onAny(LifecycleOwner owner, Lifecycle.Event event) {
//		Log.i(LOG_TAG, owner.getLifecycle().getCurrentState().name());
//	}

	@OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
	public void onResume() {
		Log.i(LOG_TAG, "onResume");
		isVisible = true;
	}

	@OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
	public void onPause() {
		Log.i(LOG_TAG, "onPause");
		isVisible = false;
	}

	@OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
	public void onCreate() {
		Log.i(LOG_TAG, "onCreate");
	}

	@OnLifecycleEvent(Lifecycle.Event.ON_START)
	public void onStart() {
		Log.i(LOG_TAG, "onStart");
	}

	@OnLifecycleEvent(Lifecycle.Event.ON_STOP)
	public void onStop() {
		Log.i(LOG_TAG, "onStop");
	}

	@OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
	public void onDestroy() {
		Log.i(LOG_TAG, "onDestroy");
	}}
