package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class b2 implements ValueCallback {
    public final int f43317a;
    public final Object f43318b;
    public final WebView f43319c;
    public final Object d;
    public final Object f43320e;

    public b2(oi.k kVar, gg.t tVar, WebView webView, b5.h hVar) {
        this.f43317a = 2;
        this.f43318b = kVar;
        this.d = tVar;
        this.f43319c = webView;
        this.f43320e = hVar;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f43317a) {
            case 0:
                i2 i2Var = (i2) this.f43318b;
                WebView webView = this.f43319c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new b2(i2Var, webView, file, (a2) this.f43320e, 1));
                return;
            case 1:
                i2 i2Var2 = (i2) this.f43318b;
                WebView webView2 = this.f43319c;
                File file2 = (File) this.d;
                a2 a2Var = (a2) this.f43320e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    oi.f fVar = new oi.f(file2);
                    i2Var2.f43399b = fVar;
                    if (!((ArrayList) fVar.f17180b).isEmpty()) {
                        a2Var.run(((k1) ((ArrayList) i2Var2.f43399b.f17180b).get(0)).a());
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                a2Var.run(null);
                return;
            default:
                oi.k kVar = (oi.k) this.f43318b;
                WebView webView3 = this.f43319c;
                b5.h hVar = (b5.h) this.f43320e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((gg.t) this.d);
                synchronized (kVar.f17192a) {
                    if (!kVar.f17210u && kVar.f17204o == webView3 && kVar.f17205p == hVar && !kVar.f17207r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            kVar.o();
                            return;
                        } else if (!kVar.h(webView3)) {
                            kVar.f();
                            return;
                        } else {
                            kVar.f17208s = false;
                            kVar.f17207r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            kVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public b2(i2 i2Var, WebView webView, File file, a2 a2Var, int i10) {
        this.f43317a = i10;
        this.f43318b = i2Var;
        this.f43319c = webView;
        this.d = file;
        this.f43320e = a2Var;
    }
}
