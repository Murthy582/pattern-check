var exec = require("cordova/exec");

/**
 * This is a global variable called exposed by cordova
 */    
var patterncheck = function(){};

patterncheck.prototype.isPatternEnabled:function(successCB,failureCB){
		cordova.exec(successCB, failureCB, "PatternCheck","isPatternEnabled", []);
	};

module.exports = new patterncheck();