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
public final class a implements pcc {
    public final psb a;
    public final boolean[] b;
    public final qsb c;
    public final rxc d;
    public final pcc e;

    public a(psb psbVar, boolean[] zArr, qsb qsbVar, rxc rxcVar, pcc pccVar) {
        this.a = psbVar;
        this.b = zArr;
        this.c = qsbVar;
        this.d = rxcVar;
        this.e = pccVar;
    }

    @Override
    public final void a(Object obj) {
        psb psbVar = this.a;
        boolean[] zArr = this.b;
        qsb qsbVar = this.c;
        rxc rxcVar = this.d;
        pcc pccVar = this.e;
        InputStream inputStream = (InputStream) obj;
        qsb.a(psbVar);
        if (zArr[0]) {
            return;
        }
        psb d = qsb.d(qsbVar, "readHTML");
        String str = rxcVar.a;
        final hu0 hu0Var = new hu0(d, zArr, qsbVar, rxcVar, pccVar, (byte) 9);
        if (inputStream == null) {
            hu0Var.a(null);
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.a.b;
        }
        Activity W = hl.W(context);
        if (W == null) {
            hu0Var.a(null);
            return;
        }
        View rootView = W.findViewById(16908290).getRootView();
        if (!(rootView instanceof ViewGroup)) {
            hu0Var.a(null);
            return;
        }
        final ir8 ir8Var = new ir8(context, (byte) 23);
        ((ViewGroup) rootView).addView(ir8Var);
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
        webView.setWebViewClient(new mxc(rxcVar, inputStream));
        webView.setWebChromeClient(new WebChromeClient());
        ir8Var.addView(webView, tre.c(-1.0f, -1));
        final boolean[] zArr2 = {false};
        webView.addJavascriptInterface(new Object() {
            @JavascriptInterface
            public void done(String str2) {
                hl.c3(new uwa(zArr2, webView, ir8Var, str2, hu0Var, (byte) 11));
            }
        }, "Instant");
        webView.loadUrl(str);
    }
}
