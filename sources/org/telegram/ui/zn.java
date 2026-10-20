package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zn implements RequestDelegate {
    public final int f43780a;
    public final io f43781b;

    public zn(io ioVar, int i10) {
        this.f43780a = i10;
        this.f43781b = ioVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f43780a) {
            case 0:
                AndroidUtilities.runOnUIThread(new t1(this.f43781b, tL_error, tLObject, 27));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new bo(this.f43781b, 1));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bo(this.f43781b, 4));
                return;
        }
    }
}
