package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd0 implements RequestDelegate {
    public final int f38844a;
    public final ge0 f38845b;
    public final String f38846c;

    public wd0(ge0 ge0Var, String str, int i10) {
        this.f38844a = i10;
        this.f38845b = ge0Var;
        this.f38846c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38844a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yd0(this.f38845b, tL_error, this.f38846c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yd0(this.f38845b, tL_error, tLObject, this.f38846c));
                return;
        }
    }
}
