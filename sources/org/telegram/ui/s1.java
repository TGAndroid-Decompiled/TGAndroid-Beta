package org.telegram.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class s1 extends WebViewClient {
    public final v1 f39918a;

    public s1(v1 v1Var) {
        this.f39918a = v1Var;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null && launchActivity.isFinishing()) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39918a.getContext(), 0, null);
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19548a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new tu0(this, 8));
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
        v1 v1Var = this.f39918a;
        if (v1Var.f40853s) {
            pf.d.s(v1Var.f40855x.L, str);
            return true;
        }
        return false;
    }
}
