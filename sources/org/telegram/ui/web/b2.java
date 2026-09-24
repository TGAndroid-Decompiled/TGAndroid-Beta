package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class b2 implements ValueCallback {
    public final int f39017a;
    public final i2 f39018b;
    public final WebView f39019c;
    public final File d;
    public final a2 e;

    public b2(i2 i2Var, WebView webView, File file, a2 a2Var, int i10) {
        this.f39017a = i10;
        this.f39018b = i2Var;
        this.f39019c = webView;
        this.d = file;
        this.e = a2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f39017a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                i2 i2Var = this.f39018b;
                WebView webView = this.f39019c;
                webView.saveWebArchive(absolutePath, false, new b2(i2Var, webView, file, this.e, 1));
                return;
            default:
                i2 i2Var2 = this.f39018b;
                File file2 = this.d;
                a2 a2Var = this.e;
                String str2 = (String) obj;
                this.f39019c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    oi.f fVar = new oi.f(file2);
                    i2Var2.f39090b = fVar;
                    if (!((ArrayList) fVar.f15745b).isEmpty()) {
                        a2Var.run(((l1) ((ArrayList) i2Var2.f39090b.f15745b).get(0)).a());
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
