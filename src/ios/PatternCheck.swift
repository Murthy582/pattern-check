import Foundation

 @objc(PCheck) class Hello : CDVPlugin {
    func greet(command: CDVInvokedUrlCommand) {
        //var message = command.arguments[0] as String
        
        var pluginResult = CDVPluginResult(status: CDVCommandStatus_OK, messageAsString: "Hello Murthy !")
        commandDelegate.sendPluginResult(pluginResult, callbackId:command.callbackId)
    }
}