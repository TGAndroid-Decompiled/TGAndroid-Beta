package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yc implements RequestDelegate {
    public final int f44817a;
    public final id f44818b;

    public yc(id idVar, int i9) {
        this.f44817a = i9;
        this.f44818b = idVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f44817a) {
            case 0:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(29, this.f44818b, tLObject));
                return;
            case 1:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new zc(this.f44818b, 3));
                    return;
                }
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(27, this.f44818b, tL_error));
                return;
            default:
                AndroidUtilities.runOnUIThread(new t1(this.f44818b, tL_error, tLObject, 11));
                return;
        }
    }
}
