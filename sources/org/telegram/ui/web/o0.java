package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import di.u9;
import oi.c2;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h6;
public final class o0 extends WebViewClient {
    public final WebView f53264a;
    public final p0 f53265b;

    public o0(p0 p0Var, WebView webView) {
        this.f53265b = p0Var;
        this.f53264a = webView;
    }

    @Override
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        h6 h6Var;
        Integer valueOf;
        Boolean valueOf2;
        s0 s0Var = this.f53265b.f53277e;
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
                h6Var = null;
            } else {
                h6Var = v0Var.f53348e;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = hd.N0(2131752092, null);
            t1Var.U = org.telegram.messenger.g0.T2(hd.N0(2131752093, null), new c2(this, 28));
            alertDialog$Builder.k(hd.N0(2131747637, null), null);
            t1Var.setOnDismissListener(new u9(this, 12));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    @Override
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        v0 v0Var = this.f53265b.f53277e.R;
        if (v0Var != null) {
            v0Var.H(Uri.parse(str), null, !v0Var.f53361p0, false, false);
            this.f53264a.destroy();
        }
        return true;
    }
}
