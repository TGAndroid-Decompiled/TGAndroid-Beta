package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class a2 implements ValueCallback {
    public final int f39368a;
    public final h2 f39369b;
    public final WebView f39370c;
    public final File d;
    public final z1 e;

    public a2(h2 h2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f39368a = i10;
        this.f39369b = h2Var;
        this.f39370c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f39368a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                h2 h2Var = this.f39369b;
                WebView webView = this.f39370c;
                webView.saveWebArchive(absolutePath, false, new a2(h2Var, webView, file, this.e, 1));
                return;
            default:
                h2 h2Var2 = this.f39369b;
                File file2 = this.d;
                z1 z1Var = this.e;
                String str2 = (String) obj;
                this.f39370c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    com.google.firebase.messaging.r rVar = new com.google.firebase.messaging.r(file2);
                    h2Var2.f39471b = rVar;
                    if (!((ArrayList) rVar.f4005b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) h2Var2.f39471b.f4005b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                z1Var.run(null);
                return;
        }
    }
}
