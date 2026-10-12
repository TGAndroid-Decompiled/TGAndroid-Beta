package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qn0 implements Runnable {
    public final int f41371a;
    public final xo0 f41372b;
    public final TLObject f41373c;

    public qn0(xo0 xo0Var, TLObject tLObject, int i10) {
        this.f41371a = i10;
        this.f41372b = xo0Var;
        this.f41373c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f41371a) {
            case 0:
                xo0.e0(this.f41372b, this.f41373c);
                return;
            case 1:
                xo0 xo0Var = this.f41372b;
                Utilities.Callback callback = xo0Var.f44095d1;
                TLObject tLObject = this.f41373c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                xo0Var.D0(false);
                xo0Var.f44126z0 = true;
                xo0Var.H0(true, true);
                org.telegram.ui.Components.lr lrVar = xo0Var.f44113r;
                if (lrVar != null) {
                    lrVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = xo0Var.f44108n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    xo0Var.f44108n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = xo0Var.getParentLayout();
                Activity parentActivity = xo0Var.getParentActivity();
                xo0Var.getMessagesController().newMessageCallback = new d7(xo0Var, parentLayout, parentActivity, 17);
                WebView webView = xo0Var.f44120w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = xo0Var.f44120w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    xo0Var.f44122x = str;
                    webView2.loadUrl(str);
                }
                xo0Var.f44087a1 = true;
                xo0Var.f44101f1 = 3;
                wo0 wo0Var = xo0Var.Z0;
                if (wo0Var != null) {
                    wo0Var.a(3);
                    return;
                }
                return;
            default:
                xo0.c0(this.f41372b, this.f41373c);
                return;
        }
    }
}
