package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.f8;
public final class r1 implements ValueCallback {
    public final int f42983a;
    public final Object f42984b;
    public final WebView f42985c;
    public final Object d;
    public final Object e;

    public r1(ji.k kVar, a3.l0 l0Var, WebView webView, b5.h hVar) {
        this.f42983a = 2;
        this.f42984b = kVar;
        this.d = l0Var;
        this.f42985c = webView;
        this.e = hVar;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42983a) {
            case 0:
                y1 y1Var = (y1) this.f42984b;
                WebView webView = this.f42985c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new r1(y1Var, webView, file, (q1) this.e, 1));
                return;
            case 1:
                y1 y1Var2 = (y1) this.f42984b;
                WebView webView2 = this.f42985c;
                File file2 = (File) this.d;
                q1 q1Var = (q1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(org.telegram.messenger.i0.y2(null, 2131624107).replace("$OPEN$", "false"), new e0(1));
                try {
                    xa.n nVar = new xa.n(file2);
                    y1Var2.f43054b = nVar;
                    if (!((ArrayList) nVar.f53573b).isEmpty()) {
                        q1Var.a(((e1) ((ArrayList) y1Var2.f43054b.f53573b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                }
                q1Var.a(null);
                return;
            default:
                ji.k kVar = (ji.k) this.f42984b;
                WebView webView3 = this.f42985c;
                b5.h hVar = (b5.h) this.e;
                String str3 = (String) obj;
                org.telegram.messenger.i0.r((a3.l0) this.d);
                synchronized (kVar.f10453a) {
                    if (!kVar.f10470u && kVar.f10464o == webView3 && kVar.f10465p == hVar && !kVar.f10467r) {
                        if (!"true".equals(str3)) {
                            f8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            kVar.q();
                            return;
                        } else if (!kVar.j(webView3)) {
                            kVar.h();
                            return;
                        } else {
                            kVar.f10468s = false;
                            kVar.f10467r = true;
                            f8.b("WEB proxy: Base64 bridge ready");
                            kVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public r1(y1 y1Var, WebView webView, File file, q1 q1Var, int i10) {
        this.f42983a = i10;
        this.f42984b = y1Var;
        this.f42985c = webView;
        this.d = file;
        this.e = q1Var;
    }
}
