var debugMode = true;

function showConsole(logString) {
    if(debugMode == true) {
        console.log(logString);
    }
}
function alertError(errorString) {
    if(debugMode == true) {
        alert(errorString);
    } else {
    	console.log(errorString);
    }
}
