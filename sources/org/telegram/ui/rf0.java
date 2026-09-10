package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf0 implements RequestDelegate {
    public final int f36355a;
    public final zf0 f36356b;
    public final Bundle f36357c;

    public rf0(zf0 zf0Var, Bundle bundle, int i10) {
        this.f36355a = i10;
        this.f36356b = zf0Var;
        this.f36357c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36355a) {
            case 0:
                zf0 zf0Var = this.f36356b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new pf0(zf0Var, this.f36357c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new h90(21, zf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.q01(this.f36356b, tL_error, this.f36357c, tLObject));
                return;
        }
    }
}
