package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class c2 implements ValueCallback {
    public final int f42053a;
    public final j2 f42054b;
    public final WebView f42055c;
    public final File d;
    public final b2 f42056e;

    public c2(j2 j2Var, WebView webView, File file, b2 b2Var, int i10) {
        this.f42053a = i10;
        this.f42054b = j2Var;
        this.f42055c = webView;
        this.d = file;
        this.f42056e = b2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f42053a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                j2 j2Var = this.f42054b;
                WebView webView = this.f42055c;
                webView.saveWebArchive(absolutePath, false, new c2(j2Var, webView, file, this.f42056e, 1));
                return;
            default:
                j2 j2Var2 = this.f42054b;
                File file2 = this.d;
                b2 b2Var = this.f42056e;
                String str2 = (String) obj;
                this.f42055c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new j0(1));
                try {
                    fg.f fVar = new fg.f(file2);
                    j2Var2.f42172b = fVar;
                    if (!((ArrayList) fVar.f9521b).isEmpty()) {
                        b2Var.run(((m1) ((ArrayList) j2Var2.f42172b.f9521b).get(0)).a());
                        return;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                b2Var.run(null);
                return;
        }
    }
}
