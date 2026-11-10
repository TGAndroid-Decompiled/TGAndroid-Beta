package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wx implements RequestDelegate {
    public final int f51463a;
    public final jy f51464b;

    public wx(jy jyVar, int i7) {
        this.f51463a = i7;
        this.f51464b = jyVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f51463a) {
            case 0:
                final jy jyVar = this.f51464b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        jy jyVar2 = jyVar;
                        switch (i7) {
                            case 0:
                                jyVar2.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750742, org.telegram.ui.Components.gc.a0(jyVar2), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                jy.Z(jyVar2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final jy jyVar2 = this.f51464b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        jy jyVar22 = jyVar2;
                        switch (i7) {
                            case 0:
                                jyVar22.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750742, org.telegram.ui.Components.gc.a0(jyVar22), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                jy.Z(jyVar22, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
