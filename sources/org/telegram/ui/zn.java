package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zn implements RequestDelegate {
    public final int f45188a;
    public final ho f45189b;

    public zn(ho hoVar, int i9) {
        this.f45188a = i9;
        this.f45189b = hoVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f45188a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.f45189b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new bo(this.f45189b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bo(this.f45189b, 4));
                return;
        }
    }
}
