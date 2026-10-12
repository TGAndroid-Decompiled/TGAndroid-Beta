package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qn0 implements Runnable {
    public final int f41375a;
    public final xo0 f41376b;
    public final TLObject f41377c;

    public qn0(xo0 xo0Var, TLObject tLObject, int i10) {
        this.f41375a = i10;
        this.f41376b = xo0Var;
        this.f41377c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f41375a) {
            case 0:
                xo0.e0(this.f41376b, this.f41377c);
                return;
            case 1:
                xo0 xo0Var = this.f41376b;
                Utilities.Callback callback = xo0Var.f44100d1;
                TLObject tLObject = this.f41377c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                xo0Var.D0(false);
                xo0Var.f44131z0 = true;
                xo0Var.H0(true, true);
                org.telegram.ui.Components.lr lrVar = xo0Var.f44118r;
                if (lrVar != null) {
                    lrVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = xo0Var.f44113n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    xo0Var.f44113n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = xo0Var.getParentLayout();
                Activity parentActivity = xo0Var.getParentActivity();
                xo0Var.getMessagesController().newMessageCallback = new d7(xo0Var, parentLayout, parentActivity, 17);
                WebView webView = xo0Var.f44125w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = xo0Var.f44125w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    xo0Var.f44127x = str;
                    webView2.loadUrl(str);
                }
                xo0Var.f44092a1 = true;
                xo0Var.f44106f1 = 3;
                wo0 wo0Var = xo0Var.Z0;
                if (wo0Var != null) {
                    wo0Var.a(3);
                    return;
                }
                return;
            default:
                xo0.c0(this.f41376b, this.f41377c);
                return;
        }
    }
}
