package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ny0;
public final class a2 implements ValueCallback {
    public final int f45186a;
    public final Object f45187b;
    public final WebView f45188c;
    public final Object d;
    public final Object e;

    public a2(h2 h2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f45186a = i10;
        this.f45187b = h2Var;
        this.f45188c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f45186a) {
            case 0:
                h2 h2Var = (h2) this.f45187b;
                WebView webView = this.f45188c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(h2Var, webView, file, (z1) this.e, 1));
                return;
            case 1:
                h2 h2Var2 = (h2) this.f45187b;
                WebView webView2 = this.f45188c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    com.google.firebase.messaging.q qVar = new com.google.firebase.messaging.q(file2);
                    h2Var2.f45258b = qVar;
                    if (!((ArrayList) qVar.f7758b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) h2Var2.f45258b.f7758b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z1Var.run(null);
                return;
            default:
                ti.j jVar = (ti.j) this.f45187b;
                WebView webView3 = this.f45188c;
                c5.h hVar = (c5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((ny0) this.d);
                synchronized (jVar.f49192a) {
                    if (!jVar.f49209u && jVar.f49203o == webView3 && jVar.f49204p == hVar && !jVar.f49206r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            jVar.o();
                            return;
                        } else if (!jVar.h(webView3)) {
                            jVar.f();
                            return;
                        } else {
                            jVar.f49207s = false;
                            jVar.f49206r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            jVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public a2(ti.j jVar, ny0 ny0Var, WebView webView, c5.h hVar) {
        this.f45186a = 2;
        this.f45187b = jVar;
        this.d = ny0Var;
        this.f45188c = webView;
        this.e = hVar;
    }
}
