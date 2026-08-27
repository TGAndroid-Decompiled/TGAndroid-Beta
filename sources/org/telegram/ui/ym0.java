package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ym0 implements Runnable {

    public final int f44850a;

    public final do0 f44851b;

    public final TLObject f44852c;

    public ym0(do0 do0Var, TLObject tLObject, int i10) {
        this.f44850a = i10;
        this.f44851b = do0Var;
        this.f44852c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f44850a) {
            case 0:
                do0.e0(this.f44851b, this.f44852c);
                break;
            case 1:
                do0 do0Var = this.f44851b;
                Utilities.Callback callback = do0Var.Z0;
                TLObject tLObject = this.f44852c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                do0Var.D0(false);
                do0Var.f37481v0 = true;
                do0Var.H0(true, true);
                org.telegram.ui.Components.hq hqVar = do0Var.f37475r;
                if (hqVar != null) {
                    hqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.v0 v0Var = do0Var.f37470n;
                if (v0Var != null) {
                    v0Var.setEnabled(false);
                    do0Var.f37470n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = do0Var.getParentLayout();
                Activity parentActivity = do0Var.getParentActivity();
                do0Var.getMessagesController().newMessageCallback = new b7(do0Var, parentLayout, parentActivity, 17);
                WebView webView = do0Var.f37482w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = do0Var.f37482w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    do0Var.f37484x = str;
                    webView2.loadUrl(str);
                }
                do0Var.W0 = true;
                do0Var.f37456b1 = 3;
                co0 co0Var = do0Var.V0;
                if (co0Var != null) {
                    co0Var.b(3);
                }
                break;
            default:
                do0.c0(this.f44851b, this.f44852c);
                break;
        }
    }
}
