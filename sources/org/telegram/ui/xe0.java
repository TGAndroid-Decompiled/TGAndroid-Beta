package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xe0 implements RequestDelegate {
    public final int f43203a;
    public final hf0 f43204b;
    public final Bundle f43205c;

    public xe0(hf0 hf0Var, Bundle bundle, int i10) {
        this.f43203a = i10;
        this.f43204b = hf0Var;
        this.f43205c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43203a) {
            case 0:
                hf0 hf0Var = this.f43204b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ve0(hf0Var, this.f43205c, tLObject, 2));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new z70(23, hf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(this.f43204b, tL_error, this.f43205c, tLObject));
                return;
        }
    }
}
