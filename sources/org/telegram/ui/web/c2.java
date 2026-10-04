package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.in0;
public final class c2 implements ValueCallback {
    public final int f42155a;
    public final Object f42156b;
    public final WebView f42157c;
    public final Object d;
    public final Object f42158e;

    public c2(j2 j2Var, WebView webView, File file, b2 b2Var, int i10) {
        this.f42155a = i10;
        this.f42156b = j2Var;
        this.f42157c = webView;
        this.d = file;
        this.f42158e = b2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42155a) {
            case 0:
                j2 j2Var = (j2) this.f42156b;
                WebView webView = this.f42157c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new c2(j2Var, webView, file, (b2) this.f42158e, 1));
                return;
            case 1:
                j2 j2Var2 = (j2) this.f42156b;
                WebView webView2 = this.f42157c;
                File file2 = (File) this.d;
                b2 b2Var = (b2) this.f42158e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    qi.f fVar = new qi.f(file2);
                    j2Var2.f42242b = fVar;
                    if (!((ArrayList) fVar.f45528b).isEmpty()) {
                        b2Var.run(((l1) ((ArrayList) j2Var2.f42242b.f45528b).get(0)).a());
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                b2Var.run(null);
                return;
            default:
                qi.j jVar = (qi.j) this.f42156b;
                WebView webView3 = this.f42157c;
                b5.h hVar = (b5.h) this.f42158e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((in0) this.d);
                synchronized (jVar.f45538a) {
                    if (!jVar.f45556u && jVar.f45550o == webView3 && jVar.f45551p == hVar && !jVar.f45553r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            jVar.o();
                            return;
                        } else if (!jVar.h(webView3)) {
                            jVar.f();
                            return;
                        } else {
                            jVar.f45554s = false;
                            jVar.f45553r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            jVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public c2(qi.j jVar, in0 in0Var, WebView webView, b5.h hVar) {
        this.f42155a = 2;
        this.f42156b = jVar;
        this.d = in0Var;
        this.f42157c = webView;
        this.f42158e = hVar;
    }
}
