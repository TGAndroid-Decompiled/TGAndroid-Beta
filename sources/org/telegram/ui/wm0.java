package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wm0 implements Runnable {
    public final int f42893a;
    public final eo0 f42894b;
    public final TLObject f42895c;

    public wm0(eo0 eo0Var, TLObject tLObject, int i10) {
        this.f42893a = i10;
        this.f42894b = eo0Var;
        this.f42895c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42893a) {
            case 0:
                eo0.e0(this.f42894b, this.f42895c);
                return;
            case 1:
                eo0 eo0Var = this.f42894b;
                Utilities.Callback callback = eo0Var.f36702d1;
                TLObject tLObject = this.f42895c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                eo0Var.D0(false);
                eo0Var.f36732z0 = true;
                eo0Var.H0(true, true);
                org.telegram.ui.Components.dr drVar = eo0Var.f36719r;
                if (drVar != null) {
                    drVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = eo0Var.f36714n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    eo0Var.f36714n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = eo0Var.getParentLayout();
                Activity parentActivity = eo0Var.getParentActivity();
                eo0Var.getMessagesController().newMessageCallback = new e7(eo0Var, parentLayout, parentActivity, 17);
                WebView webView = eo0Var.f36726w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = eo0Var.f36726w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    eo0Var.f36728x = str;
                    webView2.loadUrl(str);
                }
                eo0Var.f36694a1 = true;
                eo0Var.f36707f1 = 3;
                do0 do0Var = eo0Var.Z0;
                if (do0Var != null) {
                    do0Var.c(3);
                    return;
                }
                return;
            default:
                eo0.c0(this.f42894b, this.f42895c);
                return;
        }
    }
}
