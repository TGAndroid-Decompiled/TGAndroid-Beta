package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vn0 implements Runnable {
    public final int f41048a;
    public final cp0 f41049b;
    public final TLObject f41050c;

    public vn0(cp0 cp0Var, TLObject tLObject, int i10) {
        this.f41048a = i10;
        this.f41049b = cp0Var;
        this.f41050c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f41048a) {
            case 0:
                cp0.e0(this.f41049b, this.f41050c);
                return;
            case 1:
                cp0 cp0Var = this.f41049b;
                Utilities.Callback callback = cp0Var.f35005d1;
                TLObject tLObject = this.f41050c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                cp0Var.D0(false);
                cp0Var.f35035z0 = true;
                cp0Var.H0(true, true);
                org.telegram.ui.Components.gr grVar = cp0Var.f35022r;
                if (grVar != null) {
                    grVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = cp0Var.f35017n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    cp0Var.f35017n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = cp0Var.getParentLayout();
                Activity parentActivity = cp0Var.getParentActivity();
                cp0Var.getMessagesController().newMessageCallback = new f7(cp0Var, parentLayout, parentActivity, 17);
                WebView webView = cp0Var.f35029w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = cp0Var.f35029w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    cp0Var.f35031x = str;
                    webView2.loadUrl(str);
                }
                cp0Var.f34997a1 = true;
                cp0Var.f35010f1 = 3;
                bp0 bp0Var = cp0Var.Z0;
                if (bp0Var != null) {
                    bp0Var.a(3);
                    return;
                }
                return;
            default:
                cp0.c0(this.f41049b, this.f41050c);
                return;
        }
    }
}
