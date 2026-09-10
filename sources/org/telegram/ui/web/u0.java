package org.telegram.ui.web;

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
import org.telegram.ui.ActionBar.f6;
public final class u0 extends WebViewClient {
    public final WebView f38087a;
    public final v0 f38088b;

    public u0(v0 v0Var, WebView webView) {
        this.f38088b = v0Var;
        this.f38087a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        f6 f6Var;
        Integer valueOf;
        Boolean valueOf2;
        y0 y0Var = this.f38088b.e;
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
            c1 c1Var = y0Var.Q;
            if (c1Var == null) {
                f6Var = null;
            } else {
                f6Var = c1Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f17528a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new org.telegram.ui.Components.voip.x(this, 12));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f17528a.setOnDismissListener(new gg.o(this, 6));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        c1 c1Var = this.f38088b.e.Q;
        if (c1Var != null) {
            c1Var.H(Uri.parse(str), null, !c1Var.f37894o0, false, false);
            this.f38087a.destroy();
        }
        return true;
    }
}
