package org.telegram.ui.web;

import ai.g5;
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
import org.telegram.ui.ActionBar.e6;
public final class u0 extends WebViewClient {
    public final WebView f43518a;
    public final v0 f43519b;

    public u0(v0 v0Var, WebView webView) {
        this.f43519b = v0Var;
        this.f43518a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        e6 e6Var;
        Integer valueOf;
        Boolean valueOf2;
        y0 y0Var = this.f43519b.f43564e;
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
            y0Var.c(sb2.toString());
        } else {
            y0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(y0Var.getContext())) {
                return true;
            }
            Context context = y0Var.getContext();
            b1 b1Var = y0Var.Q;
            if (b1Var == null) {
                e6Var = null;
            } else {
                e6Var = b1Var.f43288e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, e6Var);
            alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20378a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new q0(this, 1));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f20378a.setOnDismissListener(new g5(this, 8));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        b1 b1Var = this.f43519b.f43564e.Q;
        if (b1Var != null) {
            b1Var.G(Uri.parse(str), null, !b1Var.f43300o0, false, false);
            this.f43518a.destroy();
        }
        return true;
    }
}
