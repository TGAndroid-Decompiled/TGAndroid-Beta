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
    public final int f42174a;
    public final Object f42175b;
    public final WebView f42176c;
    public final Object d;
    public final Object f42177e;

    public c2(j2 j2Var, WebView webView, File file, b2 b2Var, int i10) {
        this.f42174a = i10;
        this.f42175b = j2Var;
        this.f42176c = webView;
        this.d = file;
        this.f42177e = b2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42174a) {
            case 0:
                j2 j2Var = (j2) this.f42175b;
                WebView webView = this.f42176c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new c2(j2Var, webView, file, (b2) this.f42177e, 1));
                return;
            case 1:
                j2 j2Var2 = (j2) this.f42175b;
                WebView webView2 = this.f42176c;
                File file2 = (File) this.d;
                b2 b2Var = (b2) this.f42177e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    qi.f fVar = new qi.f(file2);
                    j2Var2.f42261b = fVar;
                    if (!((ArrayList) fVar.f45542b).isEmpty()) {
                        b2Var.run(((l1) ((ArrayList) j2Var2.f42261b.f45542b).get(0)).a());
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                b2Var.run(null);
                return;
            default:
                qi.j jVar = (qi.j) this.f42175b;
                WebView webView3 = this.f42176c;
                b5.h hVar = (b5.h) this.f42177e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((in0) this.d);
                synchronized (jVar.f45552a) {
                    if (!jVar.f45570u && jVar.f45564o == webView3 && jVar.f45565p == hVar && !jVar.f45567r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            jVar.o();
                            return;
                        } else if (!jVar.h(webView3)) {
                            jVar.f();
                            return;
                        } else {
                            jVar.f45568s = false;
                            jVar.f45567r = true;
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
        this.f42174a = 2;
        this.f42175b = jVar;
        this.d = in0Var;
        this.f42176c = webView;
        this.f42177e = hVar;
    }
}
