package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.w5;
public final class r0 extends WebViewClient {
    public final WebView f42981a;
    public final s0 f42982b;

    public r0(s0 s0Var, WebView webView) {
        this.f42982b = s0Var;
        this.f42981a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        p6 p6Var;
        Integer valueOf;
        Boolean valueOf2;
        v0 v0Var = this.f42982b.e;
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
            v0Var.c(sb2.toString());
        } else {
            v0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.i0.M1(v0Var.getContext())) {
                return true;
            }
            Context context = v0Var.getContext();
            z0 z0Var = v0Var.Q;
            if (z0Var == null) {
                p6Var = null;
            } else {
                p6Var = z0Var.e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = dd.L0(2131752104, null);
            x1Var.T = org.telegram.messenger.i0.T2(dd.L0(2131752105, null), new w5(this, 15));
            alertDialog$Builder.k(dd.L0(2131747847, null), null);
            x1Var.setOnDismissListener(new ag.x(this, 10));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e) {
            f8.g(e, true);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        z0 z0Var = this.f42982b.e.Q;
        if (z0Var != null) {
            z0Var.G(Uri.parse(str), null, !z0Var.f43077o0, false, false);
            this.f42981a.destroy();
        }
        return true;
    }
}
