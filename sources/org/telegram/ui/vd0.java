package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vd0 implements RequestDelegate {
    public final int f42829a;
    public final fe0 f42830b;
    public final String f42831c;

    public vd0(fe0 fe0Var, String str, int i10) {
        this.f42829a = i10;
        this.f42830b = fe0Var;
        this.f42831c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42829a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xd0(this.f42830b, tL_error, this.f42831c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xd0(this.f42830b, tL_error, tLObject, this.f42831c));
                return;
        }
    }
}
