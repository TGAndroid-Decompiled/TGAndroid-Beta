package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qn0 implements Runnable {
    public final int f36861a;
    public final xo0 f36862b;
    public final TLObject f36863c;

    public qn0(xo0 xo0Var, TLObject tLObject, int i10) {
        this.f36861a = i10;
        this.f36862b = xo0Var;
        this.f36863c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f36861a) {
            case 0:
                xo0.e0(this.f36862b, this.f36863c);
                return;
            case 1:
                xo0 xo0Var = this.f36862b;
                Utilities.Callback callback = xo0Var.f39548d1;
                TLObject tLObject = this.f36863c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                xo0Var.D0(false);
                xo0Var.f39578z0 = true;
                xo0Var.H0(true, true);
                org.telegram.ui.Components.tq tqVar = xo0Var.f39565r;
                if (tqVar != null) {
                    tqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = xo0Var.f39560n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    xo0Var.f39560n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = xo0Var.getParentLayout();
                Activity parentActivity = xo0Var.getParentActivity();
                xo0Var.getMessagesController().newMessageCallback = new b7(xo0Var, parentLayout, parentActivity, 17);
                WebView webView = xo0Var.f39572w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = xo0Var.f39572w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    xo0Var.f39574x = str;
                    webView2.loadUrl(str);
                }
                xo0Var.f39540a1 = true;
                xo0Var.f39553f1 = 3;
                wo0 wo0Var = xo0Var.Z0;
                if (wo0Var != null) {
                    wo0Var.a(3);
                    return;
                }
                return;
            default:
                xo0.c0(this.f36862b, this.f36863c);
                return;
        }
    }
}
