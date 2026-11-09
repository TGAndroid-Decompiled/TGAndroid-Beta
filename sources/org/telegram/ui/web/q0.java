package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bi.eb;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o5;
public final class q0 extends WebViewClient {
    public final WebView f51262a;
    public final r0 f51263b;

    public q0(r0 r0Var, WebView webView) {
        this.f51263b = r0Var;
        this.f51262a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        g6 g6Var;
        Integer valueOf;
        Boolean valueOf2;
        u0 u0Var = this.f51263b.f51274e;
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
            u0Var.c(sb2.toString());
        } else {
            u0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.g0.M1(u0Var.getContext())) {
                return true;
            }
            Context context = u0Var.getContext();
            x0 x0Var = u0Var.Q;
            if (x0Var == null) {
                g6Var = null;
            } else {
                g6Var = x0Var.f51348e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = id.M0(2131752104, null);
            u1Var.T = org.telegram.messenger.g0.U2(id.M0(2131752105, null), new o5(this, 12));
            alertDialog$Builder.k(id.M0(2131747831, null), null);
            u1Var.setOnDismissListener(new eb(this, 12));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        x0 x0Var = this.f51263b.f51274e.Q;
        if (x0Var != null) {
            x0Var.H(Uri.parse(str), null, !x0Var.f51360o0, false, false);
            this.f51262a.destroy();
        }
        return true;
    }
}
