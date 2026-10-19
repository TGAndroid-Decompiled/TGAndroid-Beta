package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rz implements RequestDelegate {
    public final int f41297a;
    public final n00 f41298b;

    public rz(n00 n00Var, int i10) {
        this.f41297a = i10;
        this.f41298b = n00Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41297a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lt(15, this.f41298b, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jq(this.f41298b, tL_error, tLObject, 6));
                return;
        }
    }
}
