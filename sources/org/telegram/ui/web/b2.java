package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class b2 implements ValueCallback {
    public final int f38882a;
    public final i2 f38883b;
    public final WebView f38884c;
    public final File d;
    public final a2 e;

    public b2(i2 i2Var, WebView webView, File file, a2 a2Var, int i10) {
        this.f38882a = i10;
        this.f38883b = i2Var;
        this.f38884c = webView;
        this.d = file;
        this.e = a2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f38882a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                i2 i2Var = this.f38883b;
                WebView webView = this.f38884c;
                webView.saveWebArchive(absolutePath, false, new b2(i2Var, webView, file, this.e, 1));
                return;
            default:
                i2 i2Var2 = this.f38883b;
                File file2 = this.d;
                a2 a2Var = this.e;
                String str2 = (String) obj;
                this.f38884c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    ni.f fVar = new ni.f(file2);
                    i2Var2.f38987b = fVar;
                    if (!((ArrayList) fVar.f15258b).isEmpty()) {
                        a2Var.run(((l1) ((ArrayList) i2Var2.f38987b.f15258b).get(0)).a());
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
