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
import org.telegram.ui.ActionBar.g6;
public final class t0 extends WebViewClient {
    public final WebView f42697a;
    public final u0 f42698b;

    public t0(u0 u0Var, WebView webView) {
        this.f42698b = u0Var;
        this.f42697a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        g6 g6Var;
        Integer valueOf;
        Boolean valueOf2;
        x0 x0Var = this.f42698b.f42738e;
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb = new StringBuilder("newWebView.onRenderProcessGone priority=");
            if (renderProcessGoneDetail == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit());
            }
            sb.append(valueOf);
            sb.append(" didCrash=");
            if (renderProcessGoneDetail == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(renderProcessGoneDetail.didCrash());
            }
            sb.append(valueOf2);
            x0Var.c(sb.toString());
        } else {
            x0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(x0Var.getContext())) {
                return true;
            }
            Context context = x0Var.getContext();
            a1 a1Var = x0Var.N;
            if (a1Var == null) {
                g6Var = null;
            } else {
                g6Var = a1Var.f42472e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
            alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new s0(this, 0));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f21166a.setOnDismissListener(new fg.d0(this, 10));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a1 a1Var = this.f42698b.f42738e.N;
        if (a1Var != null) {
            a1Var.D(Uri.parse(str), null, !a1Var.f42481l0, false, false);
            this.f42697a.destroy();
        }
        return true;
    }
}
