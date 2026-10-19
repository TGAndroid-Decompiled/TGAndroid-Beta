package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.by0;
public final class a2 implements ValueCallback {
    public final int f42590a;
    public final Object f42591b;
    public final WebView f42592c;
    public final Object d;
    public final Object e;

    public a2(h2 h2Var, WebView webView, File file, y1 y1Var, int i10) {
        this.f42590a = i10;
        this.f42591b = h2Var;
        this.f42592c = webView;
        this.d = file;
        this.e = y1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42590a) {
            case 0:
                h2 h2Var = (h2) this.f42591b;
                WebView webView = this.f42592c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(h2Var, webView, file, (y1) this.e, 1));
                return;
            case 1:
                h2 h2Var2 = (h2) this.f42591b;
                WebView webView2 = this.f42592c;
                File file2 = (File) this.d;
                y1 y1Var = (y1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    qi.e eVar = new qi.e(file2);
                    h2Var2.f42663b = eVar;
                    if (!((ArrayList) eVar.f44753b).isEmpty()) {
                        y1Var.run(((j1) ((ArrayList) h2Var2.f42663b.f44753b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                y1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.f42591b;
                WebView webView3 = this.f42592c;
                b5.h hVar = (b5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((by0) this.d);
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

    public a2(qi.i iVar, by0 by0Var, WebView webView, b5.h hVar) {
        this.f42590a = 2;
        this.f42591b = iVar;
        this.d = by0Var;
        this.f42592c = webView;
        this.e = hVar;
    }
}
