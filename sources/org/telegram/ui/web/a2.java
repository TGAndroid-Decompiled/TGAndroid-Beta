package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class a2 implements ValueCallback {
    public final int f43168a;
    public final Object f43169b;
    public final WebView f43170c;
    public final Object d;
    public final Object f43171e;

    public a2(oi.k kVar, gg.t tVar, WebView webView, b5.h hVar) {
        this.f43168a = 2;
        this.f43169b = kVar;
        this.d = tVar;
        this.f43170c = webView;
        this.f43171e = hVar;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f43168a) {
            case 0:
                h2 h2Var = (h2) this.f43169b;
                WebView webView = this.f43170c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(h2Var, webView, file, (z1) this.f43171e, 1));
                return;
            case 1:
                h2 h2Var2 = (h2) this.f43169b;
                WebView webView2 = this.f43170c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.f43171e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    oi.f fVar = new oi.f(file2);
                    h2Var2.f43281b = fVar;
                    if (!((ArrayList) fVar.f16927b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) h2Var2.f43281b.f16927b).get(0)).a());
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                z1Var.run(null);
                return;
            default:
                oi.k kVar = (oi.k) this.f43169b;
                WebView webView3 = this.f43170c;
                b5.h hVar = (b5.h) this.f43171e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((gg.t) this.d);
                synchronized (kVar.f16939a) {
                    if (!kVar.f16957u && kVar.f16951o == webView3 && kVar.f16952p == hVar && !kVar.f16954r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            kVar.o();
                            return;
                        } else if (!kVar.h(webView3)) {
                            kVar.f();
                            return;
                        } else {
                            kVar.f16955s = false;
                            kVar.f16954r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            kVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public a2(h2 h2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f43168a = i10;
        this.f43169b = h2Var;
        this.f43170c = webView;
        this.d = file;
        this.f43171e = z1Var;
    }
}
