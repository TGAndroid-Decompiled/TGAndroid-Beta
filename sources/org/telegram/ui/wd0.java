package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wd0 implements RequestDelegate {
    public final int f37833a;
    public final ge0 f37834b;
    public final String f37835c;

    public wd0(ge0 ge0Var, String str, int i10) {
        this.f37833a = i10;
        this.f37834b = ge0Var;
        this.f37835c = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37833a) {
            case 0:
                AndroidUtilities.runOnUIThread(new yd0(this.f37834b, tL_error, this.f37835c, tLObject));
                return;
            default:
                AndroidUtilities.runOnUIThread(new yd0(this.f37834b, tL_error, tLObject, this.f37835c));
                return;
        }
    }
}
