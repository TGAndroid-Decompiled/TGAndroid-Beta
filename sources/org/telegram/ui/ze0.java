package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze0 implements RequestDelegate {
    public final int f43728a;
    public final jf0 f43729b;
    public final Bundle f43730c;

    public ze0(jf0 jf0Var, Bundle bundle, int i10) {
        this.f43728a = i10;
        this.f43729b = jf0Var;
        this.f43730c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43728a) {
            case 0:
                jf0 jf0Var = this.f43729b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new xe0(jf0Var, this.f43730c, tLObject, 2));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new b80(23, jf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i90(this.f43729b, tL_error, this.f43730c, tLObject));
                return;
        }
    }
}
