package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class yc implements RequestDelegate {

    public final int f44766a;

    public final id f44767b;

    public yc(id idVar, int i10) {
        this.f44766a = i10;
        this.f44767b = idVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44766a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(29, this.f44767b, tLObject));
                break;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new zc(this.f44767b, 3));
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(27, this.f44767b, tL_error));
                break;
            default:
                AndroidUtilities.runOnUIThread(new u1(this.f44767b, tL_error, tLObject, 11));
                break;
        }
    }
}
