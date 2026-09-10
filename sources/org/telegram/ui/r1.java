package org.telegram.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class r1 extends WebViewClient {
    public final u1 f36167a;

    public r1(u1 u1Var) {
        this.f36167a = u1Var;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null && launchActivity.isFinishing()) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f36167a.getContext(), 0, null);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new mu0(this, 8));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        u1 u1Var = this.f36167a;
        if (u1Var.f37079s) {
            nf.f.s(u1Var.f37081x.L, str);
            return true;
        }
        return false;
    }
}
