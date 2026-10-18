package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rg0 implements RequestDelegate {
    public final int f40723a;
    public final jh0 f40724b;

    public rg0(jh0 jh0Var, int i10) {
        this.f40723a = i10;
        this.f40724b = jh0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40723a) {
            case 0:
                AndroidUtilities.runOnUIThread(new wg0(this.f40724b, tL_error, tLObject, 0));
                return;
            default:
                AndroidUtilities.runOnUIThread(new b80(29, this.f40724b, tL_error));
                return;
        }
    }
}
