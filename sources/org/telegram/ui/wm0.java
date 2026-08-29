package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wm0 implements Runnable {
    public final int f44326a;
    public final bo0 f44327b;
    public final TLObject f44328c;

    public wm0(bo0 bo0Var, TLObject tLObject, int i10) {
        this.f44326a = i10;
        this.f44327b = bo0Var;
        this.f44328c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f44326a) {
            case 0:
                bo0.e0(this.f44327b, this.f44328c);
                return;
            case 1:
                bo0 bo0Var = this.f44327b;
                Utilities.Callback callback = bo0Var.Z0;
                TLObject tLObject = this.f44328c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                bo0Var.D0(false);
                bo0Var.f36868v0 = true;
                bo0Var.H0(true, true);
                org.telegram.ui.Components.nq nqVar = bo0Var.f36862r;
                if (nqVar != null) {
                    nqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = bo0Var.f36857n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    bo0Var.f36857n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = bo0Var.getParentLayout();
                Activity parentActivity = bo0Var.getParentActivity();
                bo0Var.getMessagesController().newMessageCallback = new z6(bo0Var, parentLayout, parentActivity, 17);
                WebView webView = bo0Var.f36869w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = bo0Var.f36869w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    bo0Var.f36871x = str;
                    webView2.loadUrl(str);
                }
                bo0Var.W0 = true;
                bo0Var.f36843b1 = 3;
                ao0 ao0Var = bo0Var.V0;
                if (ao0Var != null) {
                    ao0Var.a(3);
                    return;
                }
                return;
            default:
                bo0.c0(this.f44327b, this.f44328c);
                return;
        }
    }
}
