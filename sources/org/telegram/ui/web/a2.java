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
    public final int f42596a;
    public final Object f42597b;
    public final WebView f42598c;
    public final Object d;
    public final Object e;

    public a2(h2 h2Var, WebView webView, File file, y1 y1Var, int i10) {
        this.f42596a = i10;
        this.f42597b = h2Var;
        this.f42598c = webView;
        this.d = file;
        this.e = y1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42596a) {
            case 0:
                h2 h2Var = (h2) this.f42597b;
                WebView webView = this.f42598c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(h2Var, webView, file, (y1) this.e, 1));
                return;
            case 1:
                h2 h2Var2 = (h2) this.f42597b;
                WebView webView2 = this.f42598c;
                File file2 = (File) this.d;
                y1 y1Var = (y1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    qi.e eVar = new qi.e(file2);
                    h2Var2.f42669b = eVar;
                    if (!((ArrayList) eVar.f44761b).isEmpty()) {
                        y1Var.run(((j1) ((ArrayList) h2Var2.f42669b.f44761b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                y1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.f42597b;
                WebView webView3 = this.f42598c;
                b5.h hVar = (b5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((cy0) this.d);
                synchronized (iVar.f44770a) {
                    if (!iVar.f44787u && iVar.f44781o == webView3 && iVar.f44782p == hVar && !iVar.f44784r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.o();
                            return;
                        } else if (!iVar.h(webView3)) {
                            iVar.f();
                            return;
                        } else {
                            iVar.f44785s = false;
                            iVar.f44784r = true;
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
        this.f42596a = 2;
        this.f42597b = iVar;
        this.d = cy0Var;
        this.f42598c = webView;
        this.e = hVar;
    }
}
