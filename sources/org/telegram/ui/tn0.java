package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tn0 implements Runnable {
    public final int f40153a;
    public final ap0 f40154b;
    public final TLObject f40155c;

    public tn0(ap0 ap0Var, TLObject tLObject, int i10) {
        this.f40153a = i10;
        this.f40154b = ap0Var;
        this.f40155c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f40153a) {
            case 0:
                ap0.e0(this.f40154b, this.f40155c);
                return;
            case 1:
                ap0 ap0Var = this.f40154b;
                Utilities.Callback callback = ap0Var.f34017d1;
                TLObject tLObject = this.f40155c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                ap0Var.D0(false);
                ap0Var.f34047z0 = true;
                ap0Var.H0(true, true);
                org.telegram.ui.Components.gr grVar = ap0Var.f34034r;
                if (grVar != null) {
                    grVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.u0 u0Var = ap0Var.f34029n;
                if (u0Var != null) {
                    u0Var.setEnabled(false);
                    ap0Var.f34029n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = ap0Var.getParentLayout();
                Activity parentActivity = ap0Var.getParentActivity();
                ap0Var.getMessagesController().newMessageCallback = new f7(ap0Var, parentLayout, parentActivity, 17);
                WebView webView = ap0Var.f34041w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = ap0Var.f34041w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    ap0Var.f34043x = str;
                    webView2.loadUrl(str);
                }
                ap0Var.f34009a1 = true;
                ap0Var.f34022f1 = 3;
                zo0 zo0Var = ap0Var.Z0;
                if (zo0Var != null) {
                    zo0Var.a(3);
                    return;
                }
                return;
            default:
                ap0.c0(this.f40154b, this.f40155c);
                return;
        }
    }
}
