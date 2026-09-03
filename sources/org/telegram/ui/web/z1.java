package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class z1 implements ValueCallback {
    public final int f42752a;
    public final h2 f42753b;
    public final WebView f42754c;
    public final File d;
    public final y1 f42755e;

    public z1(h2 h2Var, WebView webView, File file, y1 y1Var, int i10) {
        this.f42752a = i10;
        this.f42753b = h2Var;
        this.f42754c = webView;
        this.d = file;
        this.f42755e = y1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42752a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                h2 h2Var = this.f42753b;
                WebView webView = this.f42754c;
                webView.saveWebArchive(absolutePath, false, new z1(h2Var, webView, file, this.f42755e, 1));
                return;
            default:
                h2 h2Var2 = this.f42753b;
                File file2 = this.d;
                y1 y1Var = this.f42755e;
                String str2 = (String) obj;
                this.f42754c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new g0(1));
                try {
                    com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(file2);
                    h2Var2.f42542b = sVar;
                    if (!((ArrayList) sVar.f4081b).isEmpty()) {
                        y1Var.run(((j1) ((ArrayList) h2Var2.f42542b.f4081b).get(0)).a());
                        return;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                y1Var.run(null);
                return;
        }
    }
}
