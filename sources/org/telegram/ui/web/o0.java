package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import di.t9;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i6;
public final class o0 extends WebViewClient {
    public final WebView f53266a;
    public final p0 f53267b;

    public o0(p0 p0Var, WebView webView) {
        this.f53267b = p0Var;
        this.f53266a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        i6 i6Var;
        Integer valueOf;
        Boolean valueOf2;
        s0 s0Var = this.f53267b.f53279e;
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
            s0Var.c(sb2.toString());
        } else {
            s0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.g0.M1(s0Var.getContext())) {
                return true;
            }
            Context context = s0Var.getContext();
            v0 v0Var = s0Var.R;
            if (v0Var == null) {
                i6Var = null;
            } else {
                i6Var = v0Var.f53350e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = gd.M0(2131752093, null);
            u1Var.U = org.telegram.messenger.g0.T2(gd.M0(2131752094, null), new oi.a2(this, 28));
            alertDialog$Builder.k(gd.M0(2131747638, null), null);
            u1Var.setOnDismissListener(new t9(this, 12));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        v0 v0Var = this.f53267b.f53279e.R;
        if (v0Var != null) {
            v0Var.H(Uri.parse(str), null, !v0Var.f53363p0, false, false);
            this.f53266a.destroy();
        }
        return true;
    }
}
