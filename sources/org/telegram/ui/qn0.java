package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qn0 implements RequestDelegate {
    public final int f36479a;
    public final qo0 f36480b;

    public qn0(qo0 qo0Var, int i10) {
        this.f36479a = i10;
        this.f36480b = qo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36479a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gl0(7, this.f36480b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new pn0(this.f36480b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new jn0(this.f36480b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new jn0(this.f36480b, tLObject, 0));
                return;
        }
    }
}
