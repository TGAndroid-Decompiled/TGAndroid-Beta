package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tx implements RequestDelegate {
    public final int f50175a;
    public final gy f50176b;

    public tx(gy gyVar, int i7) {
        this.f50175a = i7;
        this.f50176b = gyVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50175a) {
            case 0:
                final gy gyVar = this.f50176b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gy gyVar2 = gyVar;
                        switch (i7) {
                            case 0:
                                gyVar2.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750743, org.telegram.ui.Components.hc.a0(gyVar2), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                gy.Z(gyVar2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final gy gyVar2 = this.f50176b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gy gyVar22 = gyVar2;
                        switch (i7) {
                            case 0:
                                gyVar22.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750743, org.telegram.ui.Components.hc.a0(gyVar22), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                gy.Z(gyVar22, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
