package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rn0 implements Runnable {
    public final int f37280a;
    public final yo0 f37281b;
    public final TLObject f37282c;

    public rn0(yo0 yo0Var, TLObject tLObject, int i10) {
        this.f37280a = i10;
        this.f37281b = yo0Var;
        this.f37282c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f37280a) {
            case 0:
                yo0.e0(this.f37281b, this.f37282c);
                return;
            case 1:
                yo0 yo0Var = this.f37281b;
                Utilities.Callback callback = yo0Var.f39954d1;
                TLObject tLObject = this.f37282c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                yo0Var.D0(false);
                yo0Var.f39984z0 = true;
                yo0Var.H0(true, true);
                org.telegram.ui.Components.tq tqVar = yo0Var.f39971r;
                if (tqVar != null) {
                    tqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = yo0Var.f39966n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    yo0Var.f39966n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.e5 parentLayout = yo0Var.getParentLayout();
                Activity parentActivity = yo0Var.getParentActivity();
                yo0Var.getMessagesController().newMessageCallback = new c7(yo0Var, parentLayout, parentActivity, 17);
                WebView webView = yo0Var.f39978w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = yo0Var.f39978w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    yo0Var.f39980x = str;
                    webView2.loadUrl(str);
                }
                yo0Var.f39946a1 = true;
                yo0Var.f39959f1 = 3;
                xo0 xo0Var = yo0Var.Z0;
                if (xo0Var != null) {
                    xo0Var.a(3);
                    return;
                }
                return;
            default:
                yo0.c0(this.f37281b, this.f37282c);
                return;
        }
    }
}
