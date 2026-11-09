package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.s31;
public final class q1 implements ValueCallback {
    public final int f51264a;
    public final Object f51265b;
    public final WebView f51266c;
    public final Object d;
    public final Object f51267e;

    public q1(w1 w1Var, WebView webView, File file, p1 p1Var, int i7) {
        this.f51264a = i7;
        this.f51265b = w1Var;
        this.f51266c = webView;
        this.d = file;
        this.f51267e = p1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f51264a) {
            case 0:
                w1 w1Var = (w1) this.f51265b;
                WebView webView = this.f51266c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new q1(w1Var, webView, file, (p1) this.f51267e, 1));
                return;
            case 1:
                w1 w1Var2 = (w1) this.f51265b;
                WebView webView2 = this.f51266c;
                File file2 = (File) this.d;
                p1 p1Var = (p1) this.f51267e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, 2131624109).replace("$OPEN$", "false"), new e0(1));
                try {
                    ab.b0 b0Var = new ab.b0(file2);
                    w1Var2.f51334b = b0Var;
                    if (!((ArrayList) b0Var.f908c).isEmpty()) {
                        p1Var.a(((c1) ((ArrayList) w1Var2.f51334b.f908c).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                p1Var.a(null);
                return;
            default:
                ui.i iVar = (ui.i) this.f51265b;
                WebView webView3 = this.f51266c;
                e5.f fVar = (e5.f) this.f51267e;
                String str3 = (String) obj;
                org.telegram.messenger.g0.r((s31) this.d);
                synchronized (iVar.f56954a) {
                    if (!iVar.f56972u && iVar.f56966o == webView3 && iVar.f56967p == fVar && !iVar.f56969r) {
                        if (!"true".equals(str3)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.q();
                            return;
                        } else if (!iVar.j(webView3)) {
                            iVar.h();
                            return;
                        } else {
                            iVar.f56970s = false;
                            iVar.f56969r = true;
                            a8.b("WEB proxy: Base64 bridge ready");
                            iVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public q1(ui.i iVar, s31 s31Var, WebView webView, e5.f fVar) {
        this.f51264a = 2;
        this.f51265b = iVar;
        this.d = s31Var;
        this.f51266c = webView;
        this.f51267e = fVar;
    }
}
