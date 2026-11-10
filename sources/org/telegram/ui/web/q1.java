package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.r31;
public final class q1 implements ValueCallback {
    public final int f51218a;
    public final Object f51219b;
    public final WebView f51220c;
    public final Object d;
    public final Object f51221e;

    public q1(w1 w1Var, WebView webView, File file, p1 p1Var, int i7) {
        this.f51218a = i7;
        this.f51219b = w1Var;
        this.f51220c = webView;
        this.d = file;
        this.f51221e = p1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f51218a) {
            case 0:
                w1 w1Var = (w1) this.f51219b;
                WebView webView = this.f51220c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new q1(w1Var, webView, file, (p1) this.f51221e, 1));
                return;
            case 1:
                w1 w1Var2 = (w1) this.f51219b;
                WebView webView2 = this.f51220c;
                File file2 = (File) this.d;
                p1 p1Var = (p1) this.f51221e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, 2131624109).replace("$OPEN$", "false"), new e0(1));
                try {
                    ab.b0 b0Var = new ab.b0(file2);
                    w1Var2.f51288b = b0Var;
                    if (!((ArrayList) b0Var.f908c).isEmpty()) {
                        p1Var.a(((c1) ((ArrayList) w1Var2.f51288b.f908c).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                p1Var.a(null);
                return;
            default:
                ui.i iVar = (ui.i) this.f51219b;
                WebView webView3 = this.f51220c;
                e5.f fVar = (e5.f) this.f51221e;
                String str3 = (String) obj;
                org.telegram.messenger.g0.r((r31) this.d);
                synchronized (iVar.f56950a) {
                    if (!iVar.f56968u && iVar.f56962o == webView3 && iVar.f56963p == fVar && !iVar.f56965r) {
                        if (!"true".equals(str3)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.q();
                            return;
                        } else if (!iVar.j(webView3)) {
                            iVar.h();
                            return;
                        } else {
                            iVar.f56966s = false;
                            iVar.f56965r = true;
                            a8.b("WEB proxy: Base64 bridge ready");
                            iVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public q1(ui.i iVar, r31 r31Var, WebView webView, e5.f fVar) {
        this.f51218a = 2;
        this.f51219b = iVar;
        this.d = r31Var;
        this.f51220c = webView;
        this.f51221e = fVar;
    }
}
