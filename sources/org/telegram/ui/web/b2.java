package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class b2 implements ValueCallback {
    public final int f39031a;
    public final i2 f39032b;
    public final WebView f39033c;
    public final File d;
    public final a2 e;

    public b2(i2 i2Var, WebView webView, File file, a2 a2Var, int i10) {
        this.f39031a = i10;
        this.f39032b = i2Var;
        this.f39033c = webView;
        this.d = file;
        this.e = a2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f39031a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                i2 i2Var = this.f39032b;
                WebView webView = this.f39033c;
                webView.saveWebArchive(absolutePath, false, new b2(i2Var, webView, file, this.e, 1));
                return;
            default:
                i2 i2Var2 = this.f39032b;
                File file2 = this.d;
                a2 a2Var = this.e;
                String str2 = (String) obj;
                this.f39033c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    oi.f fVar = new oi.f(file2);
                    i2Var2.f39104b = fVar;
                    if (!((ArrayList) fVar.f15760b).isEmpty()) {
                        a2Var.run(((k1) ((ArrayList) i2Var2.f39104b.f15760b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                a2Var.run(null);
                return;
        }
    }
}
