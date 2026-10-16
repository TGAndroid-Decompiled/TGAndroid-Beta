package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vf0 implements RequestDelegate {
    public final int f40692a;
    public final dg0 f40693b;
    public final Bundle f40694c;

    public vf0(dg0 dg0Var, Bundle bundle, int i10) {
        this.f40692a = i10;
        this.f40693b = dg0Var;
        this.f40694c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40692a) {
            case 0:
                dg0 dg0Var = this.f40693b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new tf0(dg0Var, this.f40694c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new se0(5, dg0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ey0(this.f40693b, tL_error, this.f40694c, tLObject));
                return;
        }
    }
}
