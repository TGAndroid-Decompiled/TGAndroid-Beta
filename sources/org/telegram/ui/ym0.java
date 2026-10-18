package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ym0 implements Runnable {
    public final int f43451a;
    public final go0 f43452b;
    public final TLObject f43453c;

    public ym0(go0 go0Var, TLObject tLObject, int i10) {
        this.f43451a = i10;
        this.f43452b = go0Var;
        this.f43453c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f43451a) {
            case 0:
                go0.e0(this.f43452b, this.f43453c);
                return;
            case 1:
                go0 go0Var = this.f43452b;
                Utilities.Callback callback = go0Var.f37263d1;
                TLObject tLObject = this.f43453c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                go0Var.D0(false);
                go0Var.f37293z0 = true;
                go0Var.H0(true, true);
                org.telegram.ui.Components.dr drVar = go0Var.f37280r;
                if (drVar != null) {
                    drVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = go0Var.f37275n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    go0Var.f37275n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.d5 parentLayout = go0Var.getParentLayout();
                Activity parentActivity = go0Var.getParentActivity();
                go0Var.getMessagesController().newMessageCallback = new e7(go0Var, parentLayout, parentActivity, 17);
                WebView webView = go0Var.f37287w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = go0Var.f37287w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    go0Var.f37289x = str;
                    webView2.loadUrl(str);
                }
                go0Var.f37255a1 = true;
                go0Var.f37268f1 = 3;
                fo0 fo0Var = go0Var.Z0;
                if (fo0Var != null) {
                    fo0Var.c(3);
                    return;
                }
                return;
            default:
                go0.c0(this.f43452b, this.f43453c);
                return;
        }
    }
}
