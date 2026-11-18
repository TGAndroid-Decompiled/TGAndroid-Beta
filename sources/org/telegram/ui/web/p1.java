package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
public final class p1 implements ValueCallback {
    public final int f53231a;
    public final Object f53232b;
    public final WebView f53233c;
    public final Object d;
    public final Object f53234e;

    public p1(v1 v1Var, WebView webView, File file, o1 o1Var, int i7) {
        this.f53231a = i7;
        this.f53232b = v1Var;
        this.f53233c = webView;
        this.d = file;
        this.f53234e = o1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f53231a) {
            case 0:
                v1 v1Var = (v1) this.f53232b;
                WebView webView = this.f53233c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new p1(v1Var, webView, file, (o1) this.f53234e, 1));
                return;
            case 1:
                v1 v1Var2 = (v1) this.f53232b;
                WebView webView2 = this.f53233c;
                File file2 = (File) this.d;
                o1 o1Var = (o1) this.f53234e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, 2131624110).replace("$OPEN$", "false"), new d0(1));
                try {
                    xi.e eVar = new xi.e(file2);
                    v1Var2.f53333b = eVar;
                    if (!((ArrayList) eVar.f60622b).isEmpty()) {
                        o1Var.a(((b1) ((ArrayList) v1Var2.f53333b.f60622b).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                o1Var.a(null);
                return;
            default:
                xi.i iVar = (xi.i) this.f53232b;
                WebView webView3 = this.f53233c;
                e5.f fVar = (e5.f) this.f53234e;
                String str3 = (String) obj;
                org.telegram.messenger.g0.r((wg.q) this.d);
                synchronized (iVar.f60632a) {
                    if (!iVar.f60650u && iVar.f60644o == webView3 && iVar.f60645p == fVar && !iVar.f60647r) {
                        if (!"true".equals(str3)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.q();
                            return;
                        } else if (!iVar.j(webView3)) {
                            iVar.h();
                            return;
                        } else {
                            iVar.f60648s = false;
                            iVar.f60647r = true;
                            a8.b("WEB proxy: Base64 bridge ready");
                            iVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public p1(xi.i iVar, wg.q qVar, WebView webView, e5.f fVar) {
        this.f53231a = 2;
        this.f53232b = iVar;
        this.d = qVar;
        this.f53233c = webView;
        this.f53234e = fVar;
    }
}
