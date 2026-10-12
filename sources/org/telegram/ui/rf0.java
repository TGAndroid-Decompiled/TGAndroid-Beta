package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf0 implements RequestDelegate {
    public final int f41626a;
    public final zf0 f41627b;
    public final Bundle f41628c;

    public rf0(zf0 zf0Var, Bundle bundle, int i10) {
        this.f41626a = i10;
        this.f41627b = zf0Var;
        this.f41628c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41626a) {
            case 0:
                zf0 zf0Var = this.f41627b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new pf0(zf0Var, this.f41628c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new q70(27, zf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uo0(this.f41627b, tL_error, this.f41628c, tLObject, 20));
                return;
        }
    }
}
