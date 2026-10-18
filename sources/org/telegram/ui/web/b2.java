package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ay0;
public final class b2 implements ValueCallback {
    public final int f42554a;
    public final Object f42555b;
    public final WebView f42556c;
    public final Object d;
    public final Object e;

    public b2(j2 j2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f42554a = i10;
        this.f42555b = j2Var;
        this.f42556c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42554a) {
            case 0:
                j2 j2Var = (j2) this.f42555b;
                WebView webView = this.f42556c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new b2(j2Var, webView, file, (z1) this.e, 1));
                return;
            case 1:
                j2 j2Var2 = (j2) this.f42555b;
                WebView webView2 = this.f42556c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    qi.e eVar = new qi.e(file2);
                    j2Var2.f42639b = eVar;
                    if (!((ArrayList) eVar.f44753b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) j2Var2.f42639b.f44753b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.f42555b;
                WebView webView3 = this.f42556c;
                b5.h hVar = (b5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((ay0) this.d);
                synchronized (iVar.f44762a) {
                    if (!iVar.f44779u && iVar.f44773o == webView3 && iVar.f44774p == hVar && !iVar.f44776r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.o();
                            return;
                        } else if (!iVar.h(webView3)) {
                            iVar.f();
                            return;
                        } else {
                            iVar.f44777s = false;
                            iVar.f44776r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            iVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public b2(qi.i iVar, ay0 ay0Var, WebView webView, b5.h hVar) {
        this.f42554a = 2;
        this.f42555b = iVar;
        this.d = ay0Var;
        this.f42556c = webView;
        this.e = hVar;
    }
}
