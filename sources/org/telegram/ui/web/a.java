package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.io.InputStream;
import org.telegram.ui.LaunchActivity;
public final class a implements p8c {
    public final pob a;
    public final boolean[] b;
    public final qob c;
    public final ctc d;
    public final p8c e;

    public a(pob pobVar, boolean[] zArr, qob qobVar, ctc ctcVar, p8c p8cVar) {
        this.a = pobVar;
        this.b = zArr;
        this.c = qobVar;
        this.d = ctcVar;
        this.e = p8cVar;
    }

    @Override
    public final void a(Object obj) {
        pob pobVar = this.a;
        boolean[] zArr = this.b;
        qob qobVar = this.c;
        ctc ctcVar = this.d;
        p8c p8cVar = this.e;
        InputStream inputStream = (InputStream) obj;
        qob.a(pobVar);
        if (zArr[0]) {
            return;
        }
        pob d = qob.d(qobVar, "readHTML");
        String str = ctcVar.a;
        final yt0 yt0Var = new yt0(d, zArr, qobVar, ctcVar, p8cVar, (byte) 9);
        if (inputStream == null) {
            yt0Var.a(null);
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.a.b;
        }
        Activity W = gl.W(context);
        if (W == null) {
            yt0Var.a(null);
            return;
        }
        View rootView = W.findViewById(16908290).getRootView();
        if (!(rootView instanceof ViewGroup)) {
            yt0Var.a(null);
            return;
        }
        final ar8 ar8Var = new ar8(context, (byte) 22);
        ((ViewGroup) rootView).addView(ar8Var);
        final WebView webView = new WebView(context);
        WebSettings settings = webView.getSettings();
        settings.setAllowContentAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setGeolocationEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        webView.setWebViewClient(new xsc(ctcVar, inputStream));
        webView.setWebChromeClient(new WebChromeClient());
        ar8Var.addView(webView, nme.c(-1.0f, -1));
        final boolean[] zArr2 = {false};
        webView.addJavascriptInterface(new Object() {
            @JavascriptInterface
            public void done(String str2) {
                gl.c3(new tsa(zArr2, webView, ar8Var, str2, yt0Var, (byte) 10));
            }
        }, "Instant");
        webView.loadUrl(str);
    }
}
