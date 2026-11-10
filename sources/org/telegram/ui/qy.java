package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qy implements RequestDelegate {
    public final int f49175a;
    public final jz f49176b;

    public qy(jz jzVar, int i7) {
        this.f49175a = i7;
        this.f49176b = jzVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f49175a) {
            case 0:
                org.telegram.messenger.g0.h3(new org.telegram.ui.Components.h41(24, this.f49176b, tLObject));
                return;
            default:
                org.telegram.messenger.g0.h3(new tp(this.f49176b, tL_error, tLObject, 6));
                return;
        }
    }
}
