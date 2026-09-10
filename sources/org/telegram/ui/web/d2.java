package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class d2 implements ValueCallback {
    public final int f37920a;
    public final k2 f37921b;
    public final WebView f37922c;
    public final File d;
    public final c2 e;

    public d2(k2 k2Var, WebView webView, File file, c2 c2Var, int i10) {
        this.f37920a = i10;
        this.f37921b = k2Var;
        this.f37922c = webView;
        this.d = file;
        this.e = c2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f37920a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                k2 k2Var = this.f37921b;
                WebView webView = this.f37922c;
                webView.saveWebArchive(absolutePath, false, new d2(k2Var, webView, file, this.e, 1));
                return;
            default:
                k2 k2Var2 = this.f37921b;
                File file2 = this.d;
                c2 c2Var = this.e;
                String str2 = (String) obj;
                this.f37922c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    ki.f fVar = new ki.f(file2);
                    k2Var2.f37995b = fVar;
                    if (!((ArrayList) fVar.f12539b).isEmpty()) {
                        c2Var.run(((l1) ((ArrayList) k2Var2.f37995b.f12539b).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                c2Var.run(null);
                return;
        }
    }
}
