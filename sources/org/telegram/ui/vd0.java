package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vd0 implements RequestDelegate {
    public final int f42736a;
    public final xd0 f42737b;
    public final String f42738c;
    public final String d;

    public vd0(xd0 xd0Var, String str, String str2, int i10) {
        this.f42736a = i10;
        this.f42737b = xd0Var;
        this.f42738c = str;
        this.d = str2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42736a) {
            case 0:
                AndroidUtilities.runOnUIThread(new sd0(this.f42737b, tL_error, this.f42738c, this.d, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sd0(this.f42737b, tL_error, tLObject, this.f42738c, this.d));
                return;
        }
    }
}
