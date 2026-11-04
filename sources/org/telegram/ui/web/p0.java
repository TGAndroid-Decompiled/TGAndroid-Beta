package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ci.ba;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.e6;
public final class p0 extends WebViewClient {
    public final WebView f50985a;
    public final q0 f50986b;

    public p0(q0 q0Var, WebView webView) {
        this.f50986b = q0Var;
        this.f50985a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        e6 e6Var;
        Integer valueOf;
        Boolean valueOf2;
        t0 t0Var = this.f50986b.f50996e;
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
            t0Var.c(sb2.toString());
        } else {
            t0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.g0.M1(t0Var.getContext())) {
                return true;
            }
            Context context = t0Var.getContext();
            w0 w0Var = t0Var.R;
            if (w0Var == null) {
                e6Var = null;
            } else {
                e6Var = w0Var.f51067e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = bd.M0(2131752104, null);
            s1Var.U = org.telegram.messenger.g0.U2(bd.M0(2131752105, null), new d4(this, 19));
            alertDialog$Builder.k(bd.M0(2131747839, null), null);
            s1Var.setOnDismissListener(new ba(this, 12));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        w0 w0Var = this.f50986b.f50996e.R;
        if (w0Var != null) {
            w0Var.G(Uri.parse(str), null, !w0Var.f51080p0, false, false);
            this.f50985a.destroy();
        }
        return true;
    }
}
