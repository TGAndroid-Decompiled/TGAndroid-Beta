package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class a2 implements ValueCallback {
    public final int f43415a;
    public final Object f43416b;
    public final WebView f43417c;
    public final Object d;
    public final Object f43418e;

    public a2(i2 i2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f43415a = i10;
        this.f43416b = i2Var;
        this.f43417c = webView;
        this.d = file;
        this.f43418e = z1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f43415a) {
            case 0:
                i2 i2Var = (i2) this.f43416b;
                WebView webView = this.f43417c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(i2Var, webView, file, (z1) this.f43418e, 1));
                return;
            case 1:
                i2 i2Var2 = (i2) this.f43416b;
                WebView webView2 = this.f43417c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.f43418e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    pi.f fVar = new pi.f(file2);
                    i2Var2.f43543b = fVar;
                    if (!((ArrayList) fVar.f45939b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) i2Var2.f43543b.f45939b).get(0)).a());
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                z1Var.run(null);
                return;
            default:
                pi.k kVar = (pi.k) this.f43416b;
                WebView webView3 = this.f43417c;
                b5.h hVar = (b5.h) this.f43418e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((pi.h) this.d);
                synchronized (kVar.f45952a) {
                    if (!kVar.f45970u && kVar.f45964o == webView3 && kVar.f45965p == hVar && !kVar.f45967r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            kVar.o();
                            return;
                        } else if (!kVar.h(webView3)) {
                            kVar.f();
                            return;
                        } else {
                            kVar.f45968s = false;
                            kVar.f45967r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            kVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public a2(pi.k kVar, pi.h hVar, WebView webView, b5.h hVar2) {
        this.f43415a = 2;
        this.f43416b = kVar;
        this.d = hVar;
        this.f43417c = webView;
        this.f43418e = hVar2;
    }
}
