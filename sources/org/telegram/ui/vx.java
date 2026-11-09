package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vx implements RequestDelegate {
    public final int f50797a;
    public final iy f50798b;

    public vx(iy iyVar, int i7) {
        this.f50797a = i7;
        this.f50798b = iyVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50797a) {
            case 0:
                final iy iyVar = this.f50798b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        iy iyVar2 = iyVar;
                        switch (i7) {
                            case 0:
                                iyVar2.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750742, org.telegram.ui.Components.hc.a0(iyVar2), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                iy.Z(iyVar2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final iy iyVar2 = this.f50798b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        iy iyVar22 = iyVar2;
                        switch (i7) {
                            case 0:
                                iyVar22.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750742, org.telegram.ui.Components.hc.a0(iyVar22), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                iy.Z(iyVar22, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
