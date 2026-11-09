package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tc implements RequestDelegate {
    public final int f50154a;
    public final bd f50155b;

    public tc(bd bdVar, int i7) {
        this.f50154a = i7;
        this.f50155b = bdVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50154a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(26, this.f50155b, tLObject));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.p(24, this.f50155b, tL_error));
                return;
            case 2:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new sc(this.f50155b, 3));
                    return;
                }
                return;
            default:
                org.telegram.messenger.g0.h3(new o1(this.f50155b, tL_error, tLObject, 11));
                return;
        }
    }
}
