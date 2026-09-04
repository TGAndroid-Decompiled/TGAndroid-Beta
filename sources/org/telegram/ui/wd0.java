package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd0 implements RequestDelegate {
    public final int f41911a;
    public final ge0 f41912b;
    public final String f41913c;

    public wd0(ge0 ge0Var, String str, int i10) {
        this.f41911a = i10;
        this.f41912b = ge0Var;
        this.f41913c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41911a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yd0(this.f41912b, tL_error, this.f41913c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yd0(this.f41912b, tL_error, tLObject, this.f41913c));
                return;
        }
    }
}
