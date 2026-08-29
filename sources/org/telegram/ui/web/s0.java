package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import nh.m6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
public final class s0 extends WebViewClient {
    public final WebView f44195a;
    public final t0 f44196b;

    public s0(t0 t0Var, WebView webView) {
        this.f44196b = t0Var;
        this.f44195a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        c6 c6Var;
        Integer valueOf;
        Boolean valueOf2;
        w0 w0Var = this.f44196b.f44205e;
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
            w0Var.c(sb2.toString());
        } else {
            w0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(w0Var.getContext())) {
                return true;
            }
            Context context = w0Var.getContext();
            z0 z0Var = w0Var.M;
            if (z0Var == null) {
                c6Var = null;
            } else {
                c6Var = z0Var.f44267e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22714a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new m6(this, 26));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f22714a.setOnDismissListener(new cg.d0(this, 10));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        z0 z0Var = this.f44196b.f44205e.M;
        if (z0Var != null) {
            z0Var.D(Uri.parse(str), null, !z0Var.f44275k0, false, false);
            this.f44195a.destroy();
        }
        return true;
    }
}
