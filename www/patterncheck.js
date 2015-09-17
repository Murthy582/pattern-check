module.export = {

	isPatternEnabled:function(successCB,failureCB){
		cordova.exec(successCB, failureCB, "PatternCheck","isPatternEnabled", []);
	}
};

 