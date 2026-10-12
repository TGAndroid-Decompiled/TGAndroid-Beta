package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class a2 implements ValueCallback {
    public final int f41273a;
    public final Object f41274b;
    public final WebView f41275c;
    public final Object d;
    public final Object e;

    public a2(h2 h2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f41273a = i10;
        this.f41274b = h2Var;
        this.f41275c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f41273a) {
            case 0:
                h2 h2Var = (h2) this.f41274b;
                WebView webView = this.f41275c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(h2Var, webView, file, (z1) this.e, 1));
                return;
            case 1:
                h2 h2Var2 = (h2) this.f41274b;
                WebView webView2 = this.f41275c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    qi.e eVar = new qi.e(file2);
                    h2Var2.f41378b = eVar;
                    if (!((ArrayList) eVar.f43663b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) h2Var2.f41378b.f43663b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.f41274b;
                WebView webView3 = this.f41275c;
                b5.h hVar = (b5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((org.webrtc.i) this.d);
                synchronized (iVar.f43672a) {
                    if (!iVar.f43689u && iVar.f43683o == webView3 && iVar.f43684p == hVar && !iVar.f43686r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.o();
                            return;
                        } else if (!iVar.h(webView3)) {
                            iVar.f();
                            return;
                        } else {
                            iVar.f43687s = false;
                            iVar.f43686r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            iVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public a2(qi.i iVar, org.webrtc.i iVar2, WebView webView, b5.h hVar) {
        this.f41273a = 2;
        this.f41274b = iVar;
        this.d = iVar2;
        this.f41275c = webView;
        this.e = hVar;
    }
}
