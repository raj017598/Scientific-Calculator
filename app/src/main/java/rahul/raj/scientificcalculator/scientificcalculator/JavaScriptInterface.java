package rahul.raj.scientificcalculator.scientificcalculator;

import android.webkit.JavascriptInterface;

/**
 * Passed in addJavascriptInterface of WebView to allow web views's JS execute
 * Java code
 */
public class JavaScriptInterface {
	private final CallJavaResultInterface mCallJavaResultInterface;

	public JavaScriptInterface(CallJavaResultInterface callJavaResult) {
		mCallJavaResultInterface = callJavaResult;
	}

	@JavascriptInterface
	public void returnResultToJava(String value) {
		mCallJavaResultInterface.jsCallFinished(value);
	}
}