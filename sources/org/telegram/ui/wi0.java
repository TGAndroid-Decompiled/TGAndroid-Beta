package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wi0 implements RequestDelegate {
    public final int f51384a;
    public final ek0 f51385b;

    public wi0(ek0 ek0Var, int i7) {
        this.f51384a = i7;
        this.f51385b = ek0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f51384a) {
            case 0:
                org.telegram.messenger.g0.h3(new pc0(this.f51385b, tL_error, tLObject, 12));
                return;
            case 1:
                org.telegram.messenger.g0.h3(new tc0(22, this.f51385b, tL_error));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new si0(this.f51385b, 5));
                return;
            default:
                org.telegram.messenger.g0.h3(new tc0(21, this.f51385b, tLObject));
                return;
        }
    }
}
