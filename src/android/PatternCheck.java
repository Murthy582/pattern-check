package org.apache.cordova.patterncheck;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.provider.Settings;

public class PatternCheck extends CordovaPlugin {
	protected void pluginInitialize() {
	  }

	  public boolean execute(String action, JSONArray args, CallbackContext callbackContext) 
	      throws JSONException {
	    if (action.equals("isPatternEnabled")) {
	      System.out.println( Settings.Secure.LOCK_PATTERN_ENABLED);
	      return true;
	    }
	    return false;
	  }
}