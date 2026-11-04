package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.iv0;
public final class o1 implements ValueCallback {
    public final int f50978a;
    public final Object f50979b;
    public final WebView f50980c;
    public final Object d;
    public final Object f50981e;

    public o1(u1 u1Var, WebView webView, File file, n1 n1Var, int i3) {
        this.f50978a = i3;
        this.f50979b = u1Var;
        this.f50980c = webView;
        this.d = file;
        this.f50981e = n1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f50978a) {
            case 0:
                u1 u1Var = (u1) this.f50979b;
                WebView webView = this.f50980c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new o1(u1Var, webView, file, (n1) this.f50981e, 1));
                return;
            case 1:
                u1 u1Var2 = (u1) this.f50979b;
                WebView webView2 = this.f50980c;
                File file2 = (File) this.d;
                n1 n1Var = (n1) this.f50981e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, 2131624109).replace("$OPEN$", "false"), new e0(1));
                try {
                    za.p pVar = new za.p(file2);
                    u1Var2.f51047b = pVar;
                    if (!((ArrayList) pVar.f60312b).isEmpty()) {
                        n1Var.a(((b1) ((ArrayList) u1Var2.f51047b.f60312b).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                n1Var.a(null);
                return;
            default:
                ui.j jVar = (ui.j) this.f50979b;
                WebView webView3 = this.f50980c;
                d5.g gVar = (d5.g) this.f50981e;
                String str3 = (String) obj;
                org.telegram.messenger.g0.r((iv0) this.d);
                synchronized (jVar.f56401a) {
                    if (!jVar.f56419u && jVar.f56413o == webView3 && jVar.f56414p == gVar && !jVar.f56416r) {
                        if (!"true".equals(str3)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            jVar.q();
                            return;
                        } else if (!jVar.j(webView3)) {
                            jVar.h();
                            return;
                        } else {
                            jVar.f56417s = false;
                            jVar.f56416r = true;
                            a8.b("WEB proxy: Base64 bridge ready");
                            jVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public o1(ui.j jVar, iv0 iv0Var, WebView webView, d5.g gVar) {
        this.f50978a = 2;
        this.f50979b = jVar;
        this.d = iv0Var;
        this.f50980c = webView;
        this.f50981e = gVar;
    }
}
