package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.q31;
public final class r1 implements ValueCallback {
    public final int f51293a;
    public final Object f51294b;
    public final WebView f51295c;
    public final Object d;
    public final Object f51296e;

    public r1(x1 x1Var, WebView webView, File file, q1 q1Var, int i7) {
        this.f51293a = i7;
        this.f51294b = x1Var;
        this.f51295c = webView;
        this.d = file;
        this.f51296e = q1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f51293a) {
            case 0:
                x1 x1Var = (x1) this.f51294b;
                WebView webView = this.f51295c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new r1(x1Var, webView, file, (q1) this.f51296e, 1));
                return;
            case 1:
                x1 x1Var2 = (x1) this.f51294b;
                WebView webView2 = this.f51295c;
                File file2 = (File) this.d;
                q1 q1Var = (q1) this.f51296e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, 2131624109).replace("$OPEN$", "false"), new e0(1));
                try {
                    ab.b0 b0Var = new ab.b0(file2);
                    x1Var2.f51397b = b0Var;
                    if (!((ArrayList) b0Var.f908c).isEmpty()) {
                        q1Var.a(((d1) ((ArrayList) x1Var2.f51397b.f908c).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                q1Var.a(null);
                return;
            default:
                ui.i iVar = (ui.i) this.f51294b;
                WebView webView3 = this.f51295c;
                e5.f fVar = (e5.f) this.f51296e;
                String str3 = (String) obj;
                org.telegram.messenger.g0.r((q31) this.d);
                synchronized (iVar.f56850a) {
                    if (!iVar.f56868u && iVar.f56862o == webView3 && iVar.f56863p == fVar && !iVar.f56865r) {
                        if (!"true".equals(str3)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.q();
                            return;
                        } else if (!iVar.j(webView3)) {
                            iVar.h();
                            return;
                        } else {
                            iVar.f56866s = false;
                            iVar.f56865r = true;
                            a8.b("WEB proxy: Base64 bridge ready");
                            iVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public r1(ui.i iVar, q31 q31Var, WebView webView, e5.f fVar) {
        this.f51293a = 2;
        this.f51294b = iVar;
        this.d = q31Var;
        this.f51295c = webView;
        this.f51296e = fVar;
    }
}
