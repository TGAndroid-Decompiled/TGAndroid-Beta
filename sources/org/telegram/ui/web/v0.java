package org.telegram.ui.web;

import ai.f5;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d6;
public final class v0 extends WebViewClient {
    public final WebView f42370a;
    public final w0 f42371b;

    public v0(w0 w0Var, WebView webView) {
        this.f42371b = w0Var;
        this.f42370a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        d6 d6Var;
        Integer valueOf;
        Boolean valueOf2;
        z0 z0Var = this.f42371b.f42412e;
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
            z0Var.c(sb2.toString());
        } else {
            z0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(z0Var.getContext())) {
                return true;
            }
            Context context = z0Var.getContext();
            c1 c1Var = z0Var.Q;
            if (c1Var == null) {
                d6Var = null;
            } else {
                d6Var = c1Var.f42133e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20372a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new u0(this, 0));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f20372a.setOnDismissListener(new f5(this, 8));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        c1 c1Var = this.f42371b.f42412e.Q;
        if (c1Var != null) {
            c1Var.H(Uri.parse(str), null, !c1Var.f42145o0, false, false);
            this.f42370a.destroy();
        }
        return true;
    }
}
