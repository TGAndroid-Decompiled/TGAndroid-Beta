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
public final class a implements qac {
    public final qqb a;
    public final boolean[] b;
    public final rqb c;
    public final dvc d;
    public final qac e;

    public a(qqb qqbVar, boolean[] zArr, rqb rqbVar, dvc dvcVar, qac qacVar) {
        this.a = qqbVar;
        this.b = zArr;
        this.c = rqbVar;
        this.d = dvcVar;
        this.e = qacVar;
    }

    @Override
    public final void a(Object obj) {
        qqb qqbVar = this.a;
        boolean[] zArr = this.b;
        rqb rqbVar = this.c;
        dvc dvcVar = this.d;
        qac qacVar = this.e;
        InputStream inputStream = (InputStream) obj;
        rqb.a(qqbVar);
        if (zArr[0]) {
            return;
        }
        qqb d = rqb.d(rqbVar, "readHTML");
        String str = dvcVar.a;
        final hv0 hv0Var = new hv0(d, zArr, rqbVar, dvcVar, qacVar, (byte) 9);
        if (inputStream == null) {
            hv0Var.a(null);
            return;
        }
        Context context = LaunchActivity.H1;
        if (context == null) {
            context = org.telegram.messenger.a.b;
        }
        Activity W = gm.W(context);
        if (W == null) {
            hv0Var.a(null);
            return;
        }
        View rootView = W.findViewById(16908290).getRootView();
        if (!(rootView instanceof ViewGroup)) {
            hv0Var.a(null);
            return;
        }
        final ct8 ct8Var = new ct8(context, (byte) 22);
        ((ViewGroup) rootView).addView(ct8Var);
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
        webView.setWebViewClient(new yuc(dvcVar, inputStream));
        webView.setWebChromeClient(new WebChromeClient());
        ct8Var.addView(webView, qoe.c(-1.0f, -1));
        final boolean[] zArr2 = {false};
        webView.addJavascriptInterface(new Object() {
            @JavascriptInterface
            public void done(String str2) {
                gm.c3(new vua(zArr2, webView, ct8Var, str2, hv0Var, (byte) 10));
            }
        }, "Instant");
        webView.loadUrl(str);
    }
}
