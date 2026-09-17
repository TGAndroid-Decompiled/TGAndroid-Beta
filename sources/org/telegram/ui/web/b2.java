package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class b2 implements ValueCallback {
    public final int f38725a;
    public final i2 f38726b;
    public final WebView f38727c;
    public final File d;
    public final a2 e;

    public b2(i2 i2Var, WebView webView, File file, a2 a2Var, int i10) {
        this.f38725a = i10;
        this.f38726b = i2Var;
        this.f38727c = webView;
        this.d = file;
        this.e = a2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f38725a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                i2 i2Var = this.f38726b;
                WebView webView = this.f38727c;
                webView.saveWebArchive(absolutePath, false, new b2(i2Var, webView, file, this.e, 1));
                return;
            default:
                i2 i2Var2 = this.f38726b;
                File file2 = this.d;
                a2 a2Var = this.e;
                String str2 = (String) obj;
                this.f38727c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    ni.f fVar = new ni.f(file2);
                    i2Var2.f38830b = fVar;
                    if (!((ArrayList) fVar.f15268b).isEmpty()) {
                        a2Var.run(((l1) ((ArrayList) i2Var2.f38830b.f15268b).get(0)).a());
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
