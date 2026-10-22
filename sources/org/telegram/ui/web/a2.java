package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cy0;
public final class a2 implements ValueCallback {
    public final int f42599a;
    public final Object f42600b;
    public final WebView f42601c;
    public final Object d;
    public final Object e;

    public a2(h2 h2Var, WebView webView, File file, y1 y1Var, int i10) {
        this.f42599a = i10;
        this.f42600b = h2Var;
        this.f42601c = webView;
        this.d = file;
        this.e = y1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42599a) {
            case 0:
                h2 h2Var = (h2) this.f42600b;
                WebView webView = this.f42601c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(h2Var, webView, file, (y1) this.e, 1));
                return;
            case 1:
                h2 h2Var2 = (h2) this.f42600b;
                WebView webView2 = this.f42601c;
                File file2 = (File) this.d;
                y1 y1Var = (y1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    qi.e eVar = new qi.e(file2);
                    h2Var2.f42672b = eVar;
                    if (!((ArrayList) eVar.f44764b).isEmpty()) {
                        y1Var.run(((j1) ((ArrayList) h2Var2.f42672b.f44764b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                y1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.f42600b;
                WebView webView3 = this.f42601c;
                b5.h hVar = (b5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((cy0) this.d);
                synchronized (iVar.f44773a) {
                    if (!iVar.f44790u && iVar.f44784o == webView3 && iVar.f44785p == hVar && !iVar.f44787r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.o();
                            return;
                        } else if (!iVar.h(webView3)) {
                            iVar.f();
                            return;
                        } else {
                            iVar.f44788s = false;
                            iVar.f44787r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            iVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public a2(qi.i iVar, cy0 cy0Var, WebView webView, b5.h hVar) {
        this.f42599a = 2;
        this.f42600b = iVar;
        this.d = cy0Var;
        this.f42601c = webView;
        this.e = hVar;
    }
}
