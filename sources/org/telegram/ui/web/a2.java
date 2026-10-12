package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class a2 implements ValueCallback {
    public final int f43170a;
    public final Object f43171b;
    public final WebView f43172c;
    public final Object d;
    public final Object f43173e;

    public a2(oi.k kVar, gg.t tVar, WebView webView, b5.h hVar) {
        this.f43170a = 2;
        this.f43171b = kVar;
        this.d = tVar;
        this.f43172c = webView;
        this.f43173e = hVar;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f43170a) {
            case 0:
                i2 i2Var = (i2) this.f43171b;
                WebView webView = this.f43172c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new a2(i2Var, webView, file, (z1) this.f43173e, 1));
                return;
            case 1:
                i2 i2Var2 = (i2) this.f43171b;
                WebView webView2 = this.f43172c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.f43173e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    oi.f fVar = new oi.f(file2);
                    i2Var2.f43298b = fVar;
                    if (!((ArrayList) fVar.f16928b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) i2Var2.f43298b.f16928b).get(0)).a());
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                z1Var.run(null);
                return;
            default:
                oi.k kVar = (oi.k) this.f43171b;
                WebView webView3 = this.f43172c;
                b5.h hVar = (b5.h) this.f43173e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((gg.t) this.d);
                synchronized (kVar.f16940a) {
                    if (!kVar.f16958u && kVar.f16952o == webView3 && kVar.f16953p == hVar && !kVar.f16955r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            kVar.o();
                            return;
                        } else if (!kVar.h(webView3)) {
                            kVar.f();
                            return;
                        } else {
                            kVar.f16956s = false;
                            kVar.f16955r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            kVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public a2(i2 i2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f43170a = i10;
        this.f43171b = i2Var;
        this.f43172c = webView;
        this.d = file;
        this.f43173e = z1Var;
    }
}
