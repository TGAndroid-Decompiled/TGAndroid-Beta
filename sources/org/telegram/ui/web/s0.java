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

public final class s0 extends WebViewClient {

    public final WebView f43992a;

    public final t0 f43993b;

    public s0(t0 t0Var, WebView webView) {
        this.f43993b = t0Var;
        this.f43992a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        w0 w0Var = this.f43993b.f44002e;
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb2 = new StringBuilder("newWebView.onRenderProcessGone priority=");
            sb2.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb2.append(" didCrash=");
            sb2.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
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
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, z0Var == null ? null : z0Var.f44064e);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.f22702a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new nh.f0(this, 23));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.f22702a.setOnDismissListener(new ag.j0(this, 10));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e9) {
            FileLog.e(e9);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        z0 z0Var = this.f43993b.f44002e.M;
        if (z0Var != null) {
            z0Var.D(Uri.parse(str), null, !z0Var.f44072k0, false, false);
            this.f43992a.destroy();
        }
        return true;
    }
}
