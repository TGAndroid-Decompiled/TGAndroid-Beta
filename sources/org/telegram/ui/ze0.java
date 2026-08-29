package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ze0 implements RequestDelegate {
    public final int f45151a;
    public final if0 f45152b;
    public final Bundle f45153c;

    public ze0(if0 if0Var, Bundle bundle, int i10) {
        this.f45151a = i10;
        this.f45152b = if0Var;
        this.f45153c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45151a) {
            case 0:
                if0 if0Var = this.f45152b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new xe0(if0Var, this.f45153c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new x60(27, if0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new n20(this.f45152b, tL_error, this.f45153c, tLObject, 13));
                return;
        }
    }
}
