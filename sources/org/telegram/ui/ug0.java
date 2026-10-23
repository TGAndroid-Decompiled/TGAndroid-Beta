package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug0 implements RequestDelegate {
    public final int f42429a;
    public final mh0 f42430b;

    public ug0(mh0 mh0Var, int i10) {
        this.f42429a = i10;
        this.f42430b = mh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42429a) {
            case 0:
                AndroidUtilities.runOnUIThread(new zg0(this.f42430b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new f80(29, this.f42430b, tL_error));
                return;
        }
    }
}
