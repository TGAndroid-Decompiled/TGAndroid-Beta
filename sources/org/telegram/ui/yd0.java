package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yd0 implements RequestDelegate {
    public final int f39908a;
    public final ie0 f39909b;
    public final String f39910c;

    public yd0(ie0 ie0Var, String str, int i10) {
        this.f39908a = i10;
        this.f39909b = ie0Var;
        this.f39910c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39908a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ae0(this.f39909b, tL_error, this.f39910c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new ae0(this.f39909b, tL_error, tLObject, this.f39910c));
                return;
        }
    }
}
