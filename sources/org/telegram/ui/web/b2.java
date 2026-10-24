package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ey0;
public final class b2 implements ValueCallback {
    public final int f43067a;
    public final Object f43068b;
    public final WebView f43069c;
    public final Object d;
    public final Object e;

    public b2(i2 i2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f43067a = i10;
        this.f43068b = i2Var;
        this.f43069c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f43067a) {
            case 0:
                i2 i2Var = (i2) this.f43068b;
                WebView webView = this.f43069c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new b2(i2Var, webView, file, (z1) this.e, 1));
                return;
            case 1:
                i2 i2Var2 = (i2) this.f43068b;
                WebView webView2 = this.f43069c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    qi.e eVar = new qi.e(file2);
                    i2Var2.f43141b = eVar;
                    if (!((ArrayList) eVar.f45176b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) i2Var2.f43141b.f45176b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.f43068b;
                WebView webView3 = this.f43069c;
                b5.h hVar = (b5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((ey0) this.d);
                synchronized (iVar.f45185a) {
                    if (!iVar.f45202u && iVar.f45196o == webView3 && iVar.f45197p == hVar && !iVar.f45199r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.o();
                            return;
                        } else if (!iVar.h(webView3)) {
                            iVar.f();
                            return;
                        } else {
                            iVar.f45200s = false;
                            iVar.f45199r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            iVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public b2(qi.i iVar, ey0 ey0Var, WebView webView, b5.h hVar) {
        this.f43067a = 2;
        this.f43068b = iVar;
        this.d = ey0Var;
        this.f43069c = webView;
        this.e = hVar;
    }
}
