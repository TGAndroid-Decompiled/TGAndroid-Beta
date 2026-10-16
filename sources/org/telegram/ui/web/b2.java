package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class b2 implements ValueCallback {
    public final int f40974a;
    public final Object f40975b;
    public final WebView f40976c;
    public final Object d;
    public final Object e;

    public b2(i2 i2Var, WebView webView, File file, a2 a2Var, int i10) {
        this.f40974a = i10;
        this.f40975b = i2Var;
        this.f40976c = webView;
        this.d = file;
        this.e = a2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f40974a) {
            case 0:
                i2 i2Var = (i2) this.f40975b;
                WebView webView = this.f40976c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new b2(i2Var, webView, file, (a2) this.e, 1));
                return;
            case 1:
                i2 i2Var2 = (i2) this.f40975b;
                WebView webView2 = this.f40976c;
                File file2 = (File) this.d;
                a2 a2Var = (a2) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    pi.e eVar = new pi.e(file2);
                    i2Var2.f41079b = eVar;
                    if (!((ArrayList) eVar.f42945b).isEmpty()) {
                        a2Var.run(((l1) ((ArrayList) i2Var2.f41079b.f42945b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                a2Var.run(null);
                return;
            default:
                pi.j jVar = (pi.j) this.f40975b;
                WebView webView3 = this.f40976c;
                b5.h hVar = (b5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((pi.g) this.d);
                synchronized (jVar.f42957a) {
                    if (!jVar.f42974u && jVar.f42968o == webView3 && jVar.f42969p == hVar && !jVar.f42971r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            jVar.o();
                            return;
                        } else if (!jVar.h(webView3)) {
                            jVar.f();
                            return;
                        } else {
                            jVar.f42972s = false;
                            jVar.f42971r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            jVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public b2(pi.j jVar, pi.g gVar, WebView webView, b5.h hVar) {
        this.f40974a = 2;
        this.f40975b = jVar;
        this.d = gVar;
        this.f40976c = webView;
        this.e = hVar;
    }
}
