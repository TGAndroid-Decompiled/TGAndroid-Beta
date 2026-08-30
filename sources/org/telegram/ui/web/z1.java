package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class z1 implements ValueCallback {
    public final int f39717a;
    public final g2 f39718b;
    public final WebView f39719c;
    public final File d;
    public final y1 e;

    public z1(g2 g2Var, WebView webView, File file, y1 y1Var, int i10) {
        this.f39717a = i10;
        this.f39718b = g2Var;
        this.f39719c = webView;
        this.d = file;
        this.e = y1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f39717a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                g2 g2Var = this.f39718b;
                WebView webView = this.f39719c;
                webView.saveWebArchive(absolutePath, false, new z1(g2Var, webView, file, this.e, 1));
                return;
            default:
                g2 g2Var2 = this.f39718b;
                File file2 = this.d;
                y1 y1Var = this.e;
                String str2 = (String) obj;
                this.f39719c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new f0(1));
                try {
                    com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(file2);
                    g2Var2.f39510b = rVar;
                    if (!((ArrayList) rVar.f4029c).isEmpty()) {
                        y1Var.run(((i1) ((ArrayList) g2Var2.f39510b.f4029c).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                y1Var.run(null);
                return;
        }
    }
}
