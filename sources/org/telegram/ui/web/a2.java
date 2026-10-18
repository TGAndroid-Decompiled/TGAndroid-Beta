package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ay0;
public final class a2 implements ValueCallback {
    public final int f42573a;
    public final Object f42574b;
    public final WebView f42575c;
    public final Object d;
    public final Object e;

    public a2(h2 h2Var, WebView webView, File file, y1 y1Var, int i10) {
        this.f42573a = i10;
        this.f42574b = h2Var;
        this.f42575c = webView;
        this.d = file;
        this.e = y1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42573a) {
            case 0:
                h2 h2Var = (h2) this.f42574b;
                WebView webView = this.f42575c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(h2Var, webView, file, (y1) this.e, 1));
                return;
            case 1:
                h2 h2Var2 = (h2) this.f42574b;
                WebView webView2 = this.f42575c;
                File file2 = (File) this.d;
                y1 y1Var = (y1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    qi.e eVar = new qi.e(file2);
                    h2Var2.f42646b = eVar;
                    if (!((ArrayList) eVar.f44798b).isEmpty()) {
                        y1Var.run(((j1) ((ArrayList) h2Var2.f42646b.f44798b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                y1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.f42574b;
                WebView webView3 = this.f42575c;
                b5.h hVar = (b5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((ay0) this.d);
                synchronized (iVar.f44807a) {
                    if (!iVar.f44824u && iVar.f44818o == webView3 && iVar.f44819p == hVar && !iVar.f44821r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.o();
                            return;
                        } else if (!iVar.h(webView3)) {
                            iVar.f();
                            return;
                        } else {
                            iVar.f44822s = false;
                            iVar.f44821r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            iVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public a2(qi.i iVar, ay0 ay0Var, WebView webView, b5.h hVar) {
        this.f42573a = 2;
        this.f42574b = iVar;
        this.d = ay0Var;
        this.f42575c = webView;
        this.e = hVar;
    }
}
