package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wm0 implements Runnable {
    public final int f42899a;
    public final eo0 f42900b;
    public final TLObject f42901c;

    public wm0(eo0 eo0Var, TLObject tLObject, int i10) {
        this.f42899a = i10;
        this.f42900b = eo0Var;
        this.f42901c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f42899a) {
            case 0:
                eo0.e0(this.f42900b, this.f42901c);
                return;
            case 1:
                eo0 eo0Var = this.f42900b;
                Utilities.Callback callback = eo0Var.f36708d1;
                TLObject tLObject = this.f42901c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                eo0Var.D0(false);
                eo0Var.f36738z0 = true;
                eo0Var.H0(true, true);
                org.telegram.ui.Components.dr drVar = eo0Var.f36725r;
                if (drVar != null) {
                    drVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = eo0Var.f36720n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    eo0Var.f36720n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = eo0Var.getParentLayout();
                Activity parentActivity = eo0Var.getParentActivity();
                eo0Var.getMessagesController().newMessageCallback = new e7(eo0Var, parentLayout, parentActivity, 17);
                WebView webView = eo0Var.f36732w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = eo0Var.f36732w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    eo0Var.f36734x = str;
                    webView2.loadUrl(str);
                }
                eo0Var.f36700a1 = true;
                eo0Var.f36713f1 = 3;
                do0 do0Var = eo0Var.Z0;
                if (do0Var != null) {
                    do0Var.c(3);
                    return;
                }
                return;
            default:
                eo0.c0(this.f42900b, this.f42901c);
                return;
        }
    }
}
