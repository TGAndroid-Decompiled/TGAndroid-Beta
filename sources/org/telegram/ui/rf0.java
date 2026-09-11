package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf0 implements RequestDelegate {
    public final int f40164a;
    public final zf0 f40165b;
    public final Bundle f40166c;

    public rf0(zf0 zf0Var, Bundle bundle, int i10) {
        this.f40164a = i10;
        this.f40165b = zf0Var;
        this.f40166c = bundle;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40164a) {
            case 0:
                zf0 zf0Var = this.f40165b;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new pf0(zf0Var, this.f40166c, tLObject, 1));
                    return;
                } else if (tL_error != null && tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new r80(24, zf0Var, tL_error));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.in0(this.f40165b, tL_error, this.f40166c, tLObject, 20));
                return;
        }
    }
}
