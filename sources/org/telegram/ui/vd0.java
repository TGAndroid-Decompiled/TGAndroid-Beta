package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vd0 implements RequestDelegate {
    public final int f42831a;
    public final fe0 f42832b;
    public final String f42833c;

    public vd0(fe0 fe0Var, String str, int i10) {
        this.f42831a = i10;
        this.f42832b = fe0Var;
        this.f42833c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42831a) {
            case 0:
                AndroidUtilities.runOnUIThread(new xd0(this.f42832b, tL_error, this.f42833c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new xd0(this.f42832b, tL_error, tLObject, this.f42833c));
                return;
        }
    }
}
