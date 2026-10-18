package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze0 implements RequestDelegate {
    public final int f43719a;
    public final if0 f43720b;
    public final Bundle f43721c;

    public ze0(if0 if0Var, Bundle bundle, int i10) {
        this.f43719a = i10;
        this.f43720b = if0Var;
        this.f43721c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43719a) {
            case 0:
                if0 if0Var = this.f43720b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new xe0(if0Var, this.f43721c, tLObject, 2));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new b80(23, if0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(this.f43720b, tL_error, this.f43721c, tLObject));
                return;
        }
    }
}
