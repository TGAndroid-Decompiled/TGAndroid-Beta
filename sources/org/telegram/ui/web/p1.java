package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
public final class p1 implements ValueCallback {
    public final int f53513a;
    public final Object f53514b;
    public final WebView f53515c;
    public final Object d;
    public final Object f53516e;

    public p1(w1 w1Var, WebView webView, File file, o1 o1Var, int i7) {
        this.f53513a = i7;
        this.f53514b = w1Var;
        this.f53515c = webView;
        this.d = file;
        this.f53516e = o1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f53513a) {
            case 0:
                w1 w1Var = (w1) this.f53514b;
                WebView webView = this.f53515c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new p1(w1Var, webView, file, (o1) this.f53516e, 1));
                return;
            case 1:
                w1 w1Var2 = (w1) this.f53514b;
                WebView webView2 = this.f53515c;
                File file2 = (File) this.d;
                o1 o1Var = (o1) this.f53516e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, 2131624110).replace("$OPEN$", "false"), new d0(1));
                try {
                    xi.e eVar = new xi.e(file2);
                    w1Var2.f53624b = eVar;
                    if (!((ArrayList) eVar.f60750b).isEmpty()) {
                        o1Var.a(((b1) ((ArrayList) w1Var2.f53624b.f60750b).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                o1Var.a(null);
                return;
            default:
                xi.i iVar = (xi.i) this.f53514b;
                WebView webView3 = this.f53515c;
                e5.f fVar = (e5.f) this.f53516e;
                String str3 = (String) obj;
                org.telegram.messenger.g0.r((wg.p) this.d);
                synchronized (iVar.f60760a) {
                    if (!iVar.f60778u && iVar.f60772o == webView3 && iVar.f60773p == fVar && !iVar.f60775r) {
                        if (!"true".equals(str3)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.q();
                            return;
                        } else if (!iVar.j(webView3)) {
                            iVar.h();
                            return;
                        } else {
                            iVar.f60776s = false;
                            iVar.f60775r = true;
                            a8.b("WEB proxy: Base64 bridge ready");
                            iVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public p1(xi.i iVar, wg.p pVar, WebView webView, e5.f fVar) {
        this.f53513a = 2;
        this.f53514b = iVar;
        this.d = pVar;
        this.f53515c = webView;
        this.f53516e = fVar;
    }
}
