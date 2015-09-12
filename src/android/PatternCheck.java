package org.apache.cordova.patterncheck;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import android.app.KeyguardManager;
import android.content.Context;

import android.provider.Settings;

public class PatternCheck extends CordovaPlugin {
	protected void pluginInitialize() {
	  }

	  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) 
	      throws JSONException {
	    if (action.equals("isPatternEnabled")) {
			Context ctx = this.cordova.getActivity().getApplicationContext();
			KeyguardManager km;
			km = (KeyguardManager)ctx.getSystemService(Context.KEYGUARD_SERVICE);
			//System.out.println( Settings.Secure.LOCK_PATTERN_ENABLED);
			System.out.println("^^^"+km.isKeyguardSecure());
			return km.isKeyguardSecure();
	    }
	    return false;
	  }
}