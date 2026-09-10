package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wn0 implements RequestDelegate {
    public final int f38250a;
    public final wo0 f38251b;

    public wn0(wo0 wo0Var, int i10) {
        this.f38250a = i10;
        this.f38251b = wo0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38250a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ak0(10, this.f38251b, tL_error));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new vn0(this.f38251b, tL_error, tLObject, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new pn0(this.f38251b, tLObject, 2));
                return;
            default:
                AndroidUtilities.runOnUIThread(new pn0(this.f38251b, tLObject, 0));
                return;
        }
    }
}
