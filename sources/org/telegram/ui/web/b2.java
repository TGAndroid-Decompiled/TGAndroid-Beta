package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fy0;
public final class b2 implements ValueCallback {
    public final int f43078a;
    public final Object f43079b;
    public final WebView f43080c;
    public final Object d;
    public final Object e;

    public b2(i2 i2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f43078a = i10;
        this.f43079b = i2Var;
        this.f43080c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f43078a) {
            case 0:
                i2 i2Var = (i2) this.f43079b;
                WebView webView = this.f43080c;
                File file = (File) this.d;
                String str = (String) obj;
                webView.saveWebArchive(file.getAbsolutePath(), false, new b2(i2Var, webView, file, (z1) this.e, 1));
                return;
            case 1:
                i2 i2Var2 = (i2) this.f43079b;
                WebView webView2 = this.f43080c;
                File file2 = (File) this.d;
                z1 z1Var = (z1) this.e;
                String str2 = (String) obj;
                webView2.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    qi.e eVar = new qi.e(file2);
                    i2Var2.f43152b = eVar;
                    if (!((ArrayList) eVar.f45177b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) i2Var2.f43152b.f45177b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z1Var.run(null);
                return;
            default:
                qi.i iVar = (qi.i) this.f43079b;
                WebView webView3 = this.f43080c;
                b5.h hVar = (b5.h) this.e;
                String str3 = (String) obj;
                AndroidUtilities.cancelRunOnUIThread((fy0) this.d);
                synchronized (iVar.f45186a) {
                    if (!iVar.f45203u && iVar.f45197o == webView3 && iVar.f45198p == hVar && !iVar.f45200r) {
                        if (!"true".equals(str3)) {
                            FileLog.e("WEB proxy: Base64 bridge installation failed; transport stopped");
                            iVar.o();
                            return;
                        } else if (!iVar.h(webView3)) {
                            iVar.f();
                            return;
                        } else {
                            iVar.f45201s = false;
                            iVar.f45200r = true;
                            FileLog.d("WEB proxy: Base64 bridge ready");
                            iVar.l(16, 0, new byte[]{1});
                            return;
                        }
                    }
                    return;
                }
        }
    }

    public b2(qi.i iVar, fy0 fy0Var, WebView webView, b5.h hVar) {
        this.f43078a = 2;
        this.f43079b = iVar;
        this.d = fy0Var;
        this.f43080c = webView;
        this.e = hVar;
    }
}
