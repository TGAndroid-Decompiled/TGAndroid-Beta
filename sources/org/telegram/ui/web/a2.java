package org.telegram.ui.web;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
public final class a2 implements ValueCallback {
    public final int f38620a;
    public final h2 f38621b;
    public final WebView f38622c;
    public final File d;
    public final z1 e;

    public a2(h2 h2Var, WebView webView, File file, z1 z1Var, int i10) {
        this.f38620a = i10;
        this.f38621b = h2Var;
        this.f38622c = webView;
        this.d = file;
        this.e = z1Var;
    }

    @Override
    public final void onReceiveValue(Object obj) {
        switch (this.f38620a) {
            case 0:
                String str = (String) obj;
                File file = this.d;
                String absolutePath = file.getAbsolutePath();
                h2 h2Var = this.f38621b;
                WebView webView = this.f38622c;
                webView.saveWebArchive(absolutePath, false, new a2(h2Var, webView, file, this.e, 1));
                return;
            default:
                h2 h2Var2 = this.f38621b;
                File file2 = this.d;
                z1 z1Var = this.e;
                String str2 = (String) obj;
                this.f38622c.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new h0(1));
                try {
                    ni.f fVar = new ni.f(file2);
                    h2Var2.f38723b = fVar;
                    if (!((ArrayList) fVar.f15233b).isEmpty()) {
                        z1Var.run(((k1) ((ArrayList) h2Var2.f38723b.f15233b).get(0)).a());
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
