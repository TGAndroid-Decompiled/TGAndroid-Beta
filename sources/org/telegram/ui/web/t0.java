package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bi.cb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.u6;
public final class t0 extends WebViewClient {
    public final WebView f45379a;
    public final u0 f45380b;

    public t0(u0 u0Var, WebView webView) {
        this.f45380b = u0Var;
        this.f45379a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        u6 u6Var;
        Integer valueOf;
        Boolean valueOf2;
        x0 x0Var = this.f45380b.e;
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb2 = new StringBuilder("newWebView.onRenderProcessGone priority=");
            if (renderProcessGoneDetail == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit());
            }
            sb2.append(valueOf);
            sb2.append(" didCrash=");
            if (renderProcessGoneDetail == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(renderProcessGoneDetail.didCrash());
            }
            sb2.append(valueOf2);
            x0Var.c(sb2.toString());
        } else {
            x0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(x0Var.getContext())) {
                return true;
            }
            Context context = x0Var.getContext();
            a1 a1Var = x0Var.Q;
            if (a1Var == null) {
                u6Var = null;
            } else {
                u6Var = a1Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22368a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new k2.c(this, 28));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f22368a.setOnDismissListener(new cb(this, 11));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a1 a1Var = this.f45380b.e.Q;
        if (a1Var != null) {
            a1Var.G(Uri.parse(str), null, !a1Var.f45172o0, false, false);
            this.f45379a.destroy();
        }
        return true;
    }
}
