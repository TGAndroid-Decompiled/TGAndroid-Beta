package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yd0 implements RequestDelegate {
    public final int f39888a;
    public final ie0 f39889b;
    public final String f39890c;

    public yd0(ie0 ie0Var, String str, int i10) {
        this.f39888a = i10;
        this.f39889b = ie0Var;
        this.f39890c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39888a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ae0(this.f39889b, tL_error, this.f39890c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ae0(this.f39889b, tL_error, tLObject, this.f39890c));
                return;
        }
    }
}
