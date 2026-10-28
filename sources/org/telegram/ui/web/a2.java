package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oy0;
public final class a2 implements ValueCallback {
    public final int f44700a;
    public final Object f44701b;
    public final WebView f44702c;
    public final Object d;
    public final Object e;

    public a2(h2 h2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f44700a = i10;
        this.f44701b = h2Var;
        this.f44702c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f44700a) {
            case 0:
                h2 h2Var = (h2) this.f44701b;
                WebView webView = this.f44702c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(h2Var, webView, file, (z1) this.e, 1));
                return;
            case 1:
                h2 h2Var2 = (h2) this.f44701b;
                WebView webView2 = this.f44702c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(file2);
                    h2Var2.f44772b = qVar;
                    if (!((ArrayList) qVar.f7758b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) h2Var2.f44772b.f7758b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z1Var.run(null);
                return;
            default:
                ti.j jVar = (ti.j) this.f44701b;
                WebView webView3 = this.f44702c;
                c5.h hVar = (c5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((oy0) this.d);
                synchronized (jVar.f49230a) {
                    if (!jVar.f49247u && jVar.f49241o == webView3 && jVar.f49242p == hVar && !jVar.f49244r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            jVar.o();
                            return;
                        } else if (!jVar.h(webView3)) {
                            jVar.f();
                            return;
                        } else {
                            jVar.f49245s = false;
                            jVar.f49244r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            jVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public a2(ti.j jVar, oy0 oy0Var, WebView webView, c5.h hVar) {
        this.f44700a = 2;
        this.f44701b = jVar;
        this.d = oy0Var;
        this.f44702c = webView;
        this.e = hVar;
    }
}
