var exec = require('cordova/exec');

var patterncheck = {

	isPatternEnabled:function(successCB,failureCB){
		exec(successCB, failureCB, "PatternCheck","isPatternEnabled", []);
	}
};

module.export = patterncheck;