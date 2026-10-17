package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ym0 implements Runnable {
    public final int f43427a;
    public final fo0 f43428b;
    public final TLObject f43429c;

    public ym0(fo0 fo0Var, TLObject tLObject, int i10) {
        this.f43427a = i10;
        this.f43428b = fo0Var;
        this.f43429c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f43427a) {
            case 0:
                fo0.e0(this.f43428b, this.f43429c);
                return;
            case 1:
                fo0 fo0Var = this.f43428b;
                Utilities.Callback callback = fo0Var.f36980d1;
                TLObject tLObject = this.f43429c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                fo0Var.D0(false);
                fo0Var.f37010z0 = true;
                fo0Var.H0(true, true);
                org.telegram.ui.Components.dr drVar = fo0Var.f36997r;
                if (drVar != null) {
                    drVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = fo0Var.f36992n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    fo0Var.f36992n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = fo0Var.getParentLayout();
                Activity parentActivity = fo0Var.getParentActivity();
                fo0Var.getMessagesController().newMessageCallback = new e7(fo0Var, parentLayout, parentActivity, 17);
                WebView webView = fo0Var.f37004w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = fo0Var.f37004w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    fo0Var.f37006x = str;
                    webView2.loadUrl(str);
                }
                fo0Var.f36972a1 = true;
                fo0Var.f36985f1 = 3;
                eo0 eo0Var = fo0Var.Z0;
                if (eo0Var != null) {
                    eo0Var.c(3);
                    return;
                }
                return;
            default:
                fo0.c0(this.f43428b, this.f43429c);
                return;
        }
    }
}
