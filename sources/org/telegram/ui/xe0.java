package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xe0 implements RequestDelegate {
    public final int f43194a;
    public final gf0 f43195b;
    public final Bundle f43196c;

    public xe0(gf0 gf0Var, Bundle bundle, int i10) {
        this.f43194a = i10;
        this.f43195b = gf0Var;
        this.f43196c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43194a) {
            case 0:
                gf0 gf0Var = this.f43195b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ve0(gf0Var, this.f43196c, tLObject, 2));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new z70(23, gf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(this.f43195b, tL_error, this.f43196c, tLObject));
                return;
        }
    }
}
