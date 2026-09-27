package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class b2 implements ValueCallback {
    public final int f38951a;
    public final j2 f38952b;
    public final WebView f38953c;
    public final File d;
    public final a2 e;

    public b2(j2 j2Var, WebView webView, File file, a2 a2Var, int i10) {
        this.f38951a = i10;
        this.f38952b = j2Var;
        this.f38953c = webView;
        this.d = file;
        this.e = a2Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f38951a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                j2 j2Var = this.f38952b;
                WebView webView = this.f38953c;
                webView.saveWebArchive(absolutePath, false, new b2(j2Var, webView, file, this.e, 1));
                return;
            default:
                j2 j2Var2 = this.f38952b;
                File file2 = this.d;
                a2 a2Var = this.e;
                String str2 = (String) obj;
                this.f38953c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new i0(1));
                try {
                    pi.f fVar = new pi.f(file2);
                    j2Var2.f39068b = fVar;
                    if (!((ArrayList) fVar.f41366b).isEmpty()) {
                        a2Var.run(((l1) ((ArrayList) j2Var2.f39068b.f41366b).get(0)).a());
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
