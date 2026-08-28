package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class w1 implements ValueCallback {
    public final int f44058a;
    public final d2 f44059b;
    public final WebView f44060c;
    public final File d;
    public final v1 f44061e;

    public w1(d2 d2Var, WebView webView, File file, v1 v1Var, int i9) {
        this.f44058a = i9;
        this.f44059b = d2Var;
        this.f44060c = webView;
        this.d = file;
        this.f44061e = v1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f44058a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                d2 d2Var = this.f44059b;
                WebView webView = this.f44060c;
                webView.saveWebArchive(absolutePath, false, new w1(d2Var, webView, file, this.f44061e, 1));
                return;
            default:
                d2 d2Var2 = this.f44059b;
                File file2 = this.d;
                v1 v1Var = this.f44061e;
                String str2 = (String) obj;
                this.f44060c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new f0(1));
                try {
                    com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(file2);
                    d2Var2.f43838b = tVar;
                    if (!((ArrayList) tVar.f4178c).isEmpty()) {
                        v1Var.run(((g1) ((ArrayList) d2Var2.f43838b.f4178c).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                v1Var.run(null);
                return;
        }
    }
}
