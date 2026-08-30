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
public final class s0 extends WebViewClient {
    public final WebView f39625a;
    public final t0 f39626b;

    public s0(t0 t0Var, WebView webView) {
        this.f39626b = t0Var;
        this.f39625a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        f6 f6Var;
        Integer valueOf;
        Boolean valueOf2;
        w0 w0Var = this.f39626b.e;
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
            w0Var.c(sb.toString());
        } else {
            w0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(w0Var.getContext())) {
                return true;
            }
            Context context = w0Var.getContext();
            a1 a1Var = w0Var.N;
            if (a1Var == null) {
                f6Var = null;
            } else {
                f6Var = a1Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new o0(this, 1));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f19503a.setOnDismissListener(new eg.d0(this, 10));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a1 a1Var = this.f39626b.e.N;
        if (a1Var != null) {
            a1Var.D(Uri.parse(str), null, !a1Var.f39435l0, false, false);
            this.f39625a.destroy();
        }
        return true;
    }
}
