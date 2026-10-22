package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xe0 implements RequestDelegate {
    public final int f43202a;
    public final hf0 f43203b;
    public final Bundle f43204c;

    public xe0(hf0 hf0Var, Bundle bundle, int i10) {
        this.f43202a = i10;
        this.f43203b = hf0Var;
        this.f43204c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43202a) {
            case 0:
                hf0 hf0Var = this.f43203b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new ve0(hf0Var, this.f43204c, tLObject, 2));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new z70(23, hf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(this.f43203b, tL_error, this.f43204c, tLObject));
                return;
        }
    }
}
