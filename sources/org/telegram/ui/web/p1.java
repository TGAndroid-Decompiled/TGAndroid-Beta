package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
public final class p1 implements ValueCallback {
    public final int f53280a;
    public final Object f53281b;
    public final WebView f53282c;
    public final Object d;
    public final Object f53283e;

    public p1(v1 v1Var, WebView webView, File file, o1 o1Var, int i7) {
        this.f53280a = i7;
        this.f53281b = v1Var;
        this.f53282c = webView;
        this.d = file;
        this.f53283e = o1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f53280a) {
            case 0:
                v1 v1Var = (v1) this.f53281b;
                WebView webView = this.f53282c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new p1(v1Var, webView, file, (o1) this.f53283e, 1));
                return;
            case 1:
                v1 v1Var2 = (v1) this.f53281b;
                WebView webView2 = this.f53282c;
                File file2 = (File) this.d;
                o1 o1Var = (o1) this.f53283e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, 2131624110).replace("$OPEN$", "false"), new d0(1));
                try {
                    xi.e eVar = new xi.e(file2);
                    v1Var2.f53382b = eVar;
                    if (!((ArrayList) eVar.f60621b).isEmpty()) {
                        o1Var.a(((b1) ((ArrayList) v1Var2.f53382b.f60621b).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                o1Var.a(null);
                return;
            default:
                xi.i iVar = (xi.i) this.f53281b;
                WebView webView3 = this.f53282c;
                e5.f fVar = (e5.f) this.f53283e;
                String str3 = (String) obj;
                org.telegram.messenger.g0.r((wg.q) this.d);
                synchronized (iVar.f60631a) {
                    if (!iVar.f60649u && iVar.f60643o == webView3 && iVar.f60644p == fVar && !iVar.f60646r) {
                        if (!"true".equals(str3)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.q();
                            return;
                        } else if (!iVar.j(webView3)) {
                            iVar.h();
                            return;
                        } else {
                            iVar.f60647s = false;
                            iVar.f60646r = true;
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
        this.f53280a = 2;
        this.f53281b = iVar;
        this.d = qVar;
        this.f53282c = webView;
        this.f53283e = fVar;
    }
}
