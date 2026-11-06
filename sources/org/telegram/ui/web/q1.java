package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.l31;
public final class q1 implements ValueCallback {
    public final int f51271a;
    public final Object f51272b;
    public final WebView f51273c;
    public final Object d;
    public final Object f51274e;

    public q1(w1 w1Var, WebView webView, File file, p1 p1Var, int i7) {
        this.f51271a = i7;
        this.f51272b = w1Var;
        this.f51273c = webView;
        this.d = file;
        this.f51274e = p1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f51271a) {
            case 0:
                w1 w1Var = (w1) this.f51272b;
                WebView webView = this.f51273c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new q1(w1Var, webView, file, (p1) this.f51274e, 1));
                return;
            case 1:
                w1 w1Var2 = (w1) this.f51272b;
                WebView webView2 = this.f51273c;
                File file2 = (File) this.d;
                p1 p1Var = (p1) this.f51274e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, 2131624109).replace("$OPEN$", "false"), new e0(1));
                try {
                    ab.b0 b0Var = new ab.b0(file2);
                    w1Var2.f51341b = b0Var;
                    if (!((ArrayList) b0Var.f908c).isEmpty()) {
                        p1Var.a(((c1) ((ArrayList) w1Var2.f51341b.f908c).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                p1Var.a(null);
                return;
            default:
                ui.i iVar = (ui.i) this.f51272b;
                WebView webView3 = this.f51273c;
                e5.f fVar = (e5.f) this.f51274e;
                String str3 = (String) obj;
                org.telegram.messenger.g0.r((l31) this.d);
                synchronized (iVar.f56825a) {
                    if (!iVar.f56843u && iVar.f56837o == webView3 && iVar.f56838p == fVar && !iVar.f56840r) {
                        if (!"true".equals(str3)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.q();
                            return;
                        } else if (!iVar.j(webView3)) {
                            iVar.h();
                            return;
                        } else {
                            iVar.f56841s = false;
                            iVar.f56840r = true;
                            a8.b("WEB proxy: Base64 bridge ready");
                            iVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public q1(ui.i iVar, l31 l31Var, WebView webView, e5.f fVar) {
        this.f51271a = 2;
        this.f51272b = iVar;
        this.d = l31Var;
        this.f51273c = webView;
        this.f51274e = fVar;
    }
}
