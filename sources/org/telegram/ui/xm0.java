package org.telegram.ui;

import android.app.Activity;
import android.webkit.WebView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xm0 implements Runnable {
    public final int f44545a;
    public final co0 f44546b;
    public final TLObject f44547c;

    public xm0(co0 co0Var, TLObject tLObject, int i9) {
        this.f44545a = i9;
        this.f44546b = co0Var;
        this.f44547c = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f44545a) {
            case 0:
                co0.d0(this.f44546b, this.f44547c);
                return;
            case 1:
                co0 co0Var = this.f44546b;
                Utilities.Callback callback = co0Var.Z0;
                TLObject tLObject = this.f44547c;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
                }
                co0Var.C0(false);
                co0Var.f37275v0 = true;
                co0Var.G0(true, true);
                org.telegram.ui.Components.jq jqVar = co0Var.f37269r;
                if (jqVar != null) {
                    jqVar.setVisibility(0);
                }
                org.telegram.ui.ActionBar.w0 w0Var = co0Var.f37264n;
                if (w0Var != null) {
                    w0Var.setEnabled(false);
                    co0Var.f37264n.getContentView().setVisibility(4);
                }
                org.telegram.ui.ActionBar.b5 parentLayout = co0Var.getParentLayout();
                Activity parentActivity = co0Var.getParentActivity();
                co0Var.getMessagesController().newMessageCallback = new a7(co0Var, parentLayout, parentActivity, 17);
                WebView webView = co0Var.f37276w;
                if (webView != null) {
                    webView.setVisibility(0);
                    WebView webView2 = co0Var.f37276w;
                    String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
                    co0Var.f37278x = str;
                    webView2.loadUrl(str);
                }
                co0Var.W0 = true;
                co0Var.f37250b1 = 3;
                bo0 bo0Var = co0Var.V0;
                if (bo0Var != null) {
                    bo0Var.b(3);
                    return;
                }
                return;
            default:
                co0.b0(this.f44546b, this.f44547c);
                return;
        }
    }
}
