package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tf0 implements RequestDelegate {
    public final int f37746a;
    public final bg0 f37747b;
    public final Bundle f37748c;

    public tf0(bg0 bg0Var, Bundle bundle, int i10) {
        this.f37746a = i10;
        this.f37747b = bg0Var;
        this.f37748c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37746a) {
            case 0:
                bg0 bg0Var = this.f37747b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new rf0(bg0Var, this.f37748c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new r80(24, bg0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0(this.f37747b, tL_error, this.f37748c, tLObject, 20));
                return;
        }
    }
}
