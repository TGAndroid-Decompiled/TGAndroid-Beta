package org.telegram.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class t1 extends WebViewClient {
    public final w1 f42522a;

    public t1(w1 w1Var) {
        this.f42522a = w1Var;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null && launchActivity.isFinishing()) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f42522a.getContext(), 0, null);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new it0(this, 8));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        w1 w1Var = this.f42522a;
        if (w1Var.f43817s) {
            ye.d.s(w1Var.f43819x.H, str);
            return true;
        }
        return false;
    }
}
