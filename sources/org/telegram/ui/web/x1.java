package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

public final class x1 implements ValueCallback {

    public final int f44045a;

    public final e2 f44046b;

    public final WebView f44047c;
    public final File d;

    public final w1 f44048e;

    public x1(e2 e2Var, WebView webView, File file, w1 w1Var, int i10) {
        this.f44045a = i10;
        this.f44046b = e2Var;
        this.f44047c = webView;
        this.d = file;
        this.f44048e = w1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f44045a) {
            case 0:
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                e2 e2Var = this.f44046b;
                WebView webView = this.f44047c;
                webView.saveWebArchive(absolutePath, false, new x1(e2Var, webView, file, this.f44048e, 1));
                break;
            default:
                e2 e2Var2 = this.f44046b;
                File file2 = this.d;
                w1 w1Var = this.f44048e;
                this.f44047c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new g0(1));
                try {
                    com.google.firebase.messaging.t tVar = new com.google.firebase.messaging.t(file2);
                    e2Var2.f43825b = tVar;
                    if (!((ArrayList) tVar.f4620c).isEmpty()) {
                        w1Var.run(((h1) ((ArrayList) e2Var2.f43825b.f4620c).get(0)).a());
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                w1Var.run(null);
                break;
        }
    }
}
