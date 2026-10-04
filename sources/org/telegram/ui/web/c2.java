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
    public final int f42154a;
    public final Object f42155b;
    public final WebView f42156c;
    public final Object d;
    public final Object f42157e;

    public c2(j2 j2Var, WebView webView, File file, b2 b2Var, int i10) {
        this.f42154a = i10;
        this.f42155b = j2Var;
        this.f42156c = webView;
        this.d = file;
        this.f42157e = b2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42154a) {
            case 0:
                j2 j2Var = (j2) this.f42155b;
                WebView webView = this.f42156c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new c2(j2Var, webView, file, (b2) this.f42157e, 1));
                return;
            case 1:
                j2 j2Var2 = (j2) this.f42155b;
                WebView webView2 = this.f42156c;
                File file2 = (File) this.d;
                b2 b2Var = (b2) this.f42157e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    qi.f fVar = new qi.f(file2);
                    j2Var2.f42241b = fVar;
                    if (!((ArrayList) fVar.f45527b).isEmpty()) {
                        b2Var.run(((l1) ((ArrayList) j2Var2.f42241b.f45527b).get(0)).a());
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                b2Var.run(null);
                return;
            default:
                qi.j jVar = (qi.j) this.f42155b;
                WebView webView3 = this.f42156c;
                b5.h hVar = (b5.h) this.f42157e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((in0) this.d);
                synchronized (jVar.f45537a) {
                    if (!jVar.f45555u && jVar.f45549o == webView3 && jVar.f45550p == hVar && !jVar.f45552r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            jVar.o();
                            return;
                        } else if (!jVar.h(webView3)) {
                            jVar.f();
                            return;
                        } else {
                            jVar.f45553s = false;
                            jVar.f45552r = true;
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
        this.f42154a = 2;
        this.f42155b = jVar;
        this.d = in0Var;
        this.f42156c = webView;
        this.f42157e = hVar;
    }
}
