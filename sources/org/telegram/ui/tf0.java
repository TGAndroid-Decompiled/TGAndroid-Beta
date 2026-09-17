package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tf0 implements RequestDelegate {
    public final int f37734a;
    public final bg0 f37735b;
    public final Bundle f37736c;

    public tf0(bg0 bg0Var, Bundle bundle, int i10) {
        this.f37734a = i10;
        this.f37735b = bg0Var;
        this.f37736c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37734a) {
            case 0:
                bg0 bg0Var = this.f37735b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new rf0(bg0Var, this.f37736c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new oa0(18, bg0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kn0(this.f37735b, tL_error, this.f37736c, tLObject, 20));
                return;
        }
    }
}
