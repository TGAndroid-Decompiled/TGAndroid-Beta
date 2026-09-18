package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class c2 implements ValueCallback {
    public final int f38844a;
    public final j2 f38845b;
    public final WebView f38846c;
    public final File d;
    public final b2 e;

    public c2(j2 j2Var, WebView webView, File file, b2 b2Var, int i10) {
        this.f38844a = i10;
        this.f38845b = j2Var;
        this.f38846c = webView;
        this.d = file;
        this.e = b2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f38844a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                j2 j2Var = this.f38845b;
                WebView webView = this.f38846c;
                webView.saveWebArchive(absolutePath, false, new c2(j2Var, webView, file, this.e, 1));
                return;
            default:
                j2 j2Var2 = this.f38845b;
                File file2 = this.d;
                b2 b2Var = this.e;
                String str2 = (String) obj;
                this.f38846c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    oi.f fVar = new oi.f(file2);
                    j2Var2.f38954b = fVar;
                    if (!((ArrayList) fVar.f15717b).isEmpty()) {
                        b2Var.run(((l1) ((ArrayList) j2Var2.f38954b.f15717b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                b2Var.run(null);
                return;
        }
    }
}
