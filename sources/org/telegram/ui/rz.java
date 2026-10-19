package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rz implements RequestDelegate {
    public final int f41299a;
    public final n00 f41300b;

    public rz(n00 n00Var, int i10) {
        this.f41299a = i10;
        this.f41300b = n00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41299a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lt(15, this.f41300b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jq(this.f41300b, tL_error, tLObject, 6));
                return;
        }
    }
}
