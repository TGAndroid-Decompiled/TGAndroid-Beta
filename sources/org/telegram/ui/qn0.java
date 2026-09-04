package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qn0 implements Runnable {
    public final int f39921a;
    public final xo0 f39922b;
    public final TLObject f39923c;

    public qn0(xo0 xo0Var, TLObject tLObject, int i10) {
        this.f39921a = i10;
        this.f39922b = xo0Var;
        this.f39923c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f39921a) {
            case 0:
                xo0.e0(this.f39922b, this.f39923c);
                return;
            case 1:
                xo0 xo0Var = this.f39922b;
                Utilities.Callback callback = xo0Var.f42815d1;
                TLObject tLObject = this.f39923c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                xo0Var.D0(false);
                xo0Var.f42846z0 = true;
                xo0Var.H0(true, true);
                org.telegram.ui.Components.sq sqVar = xo0Var.f42833r;
                if (sqVar != null) {
                    sqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = xo0Var.f42828n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    xo0Var.f42828n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = xo0Var.getParentLayout();
                Activity parentActivity = xo0Var.getParentActivity();
                xo0Var.getMessagesController().newMessageCallback = new b7(xo0Var, parentLayout, parentActivity, 17);
                WebView webView = xo0Var.f42840w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = xo0Var.f42840w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    xo0Var.f42842x = str;
                    webView2.loadUrl(str);
                }
                xo0Var.f42807a1 = true;
                xo0Var.f42821f1 = 3;
                wo0 wo0Var = xo0Var.Z0;
                if (wo0Var != null) {
                    wo0Var.a(3);
                    return;
                }
                return;
            default:
                xo0.c0(this.f39922b, this.f39923c);
                return;
        }
    }
}
