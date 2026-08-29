package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class y1 implements ValueCallback {
    public final int f44253a;
    public final f2 f44254b;
    public final WebView f44255c;
    public final File d;
    public final x1 f44256e;

    public y1(f2 f2Var, WebView webView, File file, x1 x1Var, int i10) {
        this.f44253a = i10;
        this.f44254b = f2Var;
        this.f44255c = webView;
        this.d = file;
        this.f44256e = x1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f44253a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                f2 f2Var = this.f44254b;
                WebView webView = this.f44255c;
                webView.saveWebArchive(absolutePath, false, new y1(f2Var, webView, file, this.f44256e, 1));
                return;
            default:
                f2 f2Var2 = this.f44254b;
                File file2 = this.d;
                x1 x1Var = this.f44256e;
                String str2 = (String) obj;
                this.f44255c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new g0(1));
                try {
                    com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(file2);
                    f2Var2.f44035b = sVar;
                    if (!((ArrayList) sVar.f5186c).isEmpty()) {
                        x1Var.run(((h1) ((ArrayList) f2Var2.f44035b.f5186c).get(0)).a());
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                x1Var.run(null);
                return;
        }
    }
}
