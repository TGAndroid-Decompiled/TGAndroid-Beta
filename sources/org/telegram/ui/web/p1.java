package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.lv0;
public final class p1 implements ValueCallback {
    public final int f52751a;
    public final Object f52752b;
    public final WebView f52753c;
    public final Object d;
    public final Object f52754e;

    public p1(v1 v1Var, WebView webView, File file, o1 o1Var, int i7) {
        this.f52751a = i7;
        this.f52752b = v1Var;
        this.f52753c = webView;
        this.d = file;
        this.f52754e = o1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f52751a) {
            case 0:
                v1 v1Var = (v1) this.f52752b;
                WebView webView = this.f52753c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new p1(v1Var, webView, file, (o1) this.f52754e, 1));
                return;
            case 1:
                v1 v1Var2 = (v1) this.f52752b;
                WebView webView2 = this.f52753c;
                File file2 = (File) this.d;
                o1 o1Var = (o1) this.f52754e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(org.telegram.messenger.g0.y2(null, 2131624110).replace("$OPEN$", "false"), new d0(1));
                try {
                    xi.e eVar = new xi.e(file2);
                    v1Var2.f52853b = eVar;
                    if (!((ArrayList) eVar.f60056b).isEmpty()) {
                        o1Var.a(((a1) ((ArrayList) v1Var2.f52853b.f60056b).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                o1Var.a(null);
                return;
            default:
                xi.i iVar = (xi.i) this.f52752b;
                WebView webView3 = this.f52753c;
                e5.f fVar = (e5.f) this.f52754e;
                String str3 = (String) obj;
                org.telegram.messenger.g0.r((lv0) this.d);
                synchronized (iVar.f60066a) {
                    if (!iVar.f60084u && iVar.f60078o == webView3 && iVar.f60079p == fVar && !iVar.f60081r) {
                        if (!"true".equals(str3)) {
                            a8.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.q();
                            return;
                        } else if (!iVar.j(webView3)) {
                            iVar.h();
                            return;
                        } else {
                            iVar.f60082s = false;
                            iVar.f60081r = true;
                            a8.b("WEB proxy: Base64 bridge ready");
                            iVar.n(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public p1(xi.i iVar, lv0 lv0Var, WebView webView, e5.f fVar) {
        this.f52751a = 2;
        this.f52752b = iVar;
        this.d = lv0Var;
        this.f52753c = webView;
        this.f52754e = fVar;
    }
}
