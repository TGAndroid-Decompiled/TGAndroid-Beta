package org.telegram.ui.web;

import ai.bb;
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
public final class t0 extends WebViewClient {
    public final WebView f42777a;
    public final u0 f42778b;

    public t0(u0 u0Var, WebView webView) {
        this.f42778b = u0Var;
        this.f42777a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        d6 d6Var;
        Integer valueOf;
        Boolean valueOf2;
        x0 x0Var = this.f42778b.e;
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
                d6Var = null;
            } else {
                d6Var = a1Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
            alertDialog$Builder.f20602a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f20602a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new ki.u(this, 25));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f20602a.setOnDismissListener(new bb(this, 11));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a1 a1Var = this.f42778b.e.Q;
        if (a1Var != null) {
            a1Var.G(Uri.parse(str), null, !a1Var.f42573o0, false, false);
            this.f42777a.destroy();
        }
        return true;
    }
}
