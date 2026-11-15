package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ux implements RequestDelegate {
    public final int f52053a;
    public final hy f52054b;

    public ux(hy hyVar, int i7) {
        this.f52053a = i7;
        this.f52054b = hyVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f52053a) {
            case 0:
                final hy hyVar = this.f52054b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        hy hyVar2 = hyVar;
                        switch (i7) {
                            case 0:
                                hyVar2.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.n(null, 2131750742, org.telegram.ui.Components.cc.a0(hyVar2), 2131623990, 36);
                                    return;
                                }
                                return;
                            default:
                                hy.Z(hyVar2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final hy hyVar2 = this.f52054b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        hy hyVar22 = hyVar2;
                        switch (i7) {
                            case 0:
                                hyVar22.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.n(null, 2131750742, org.telegram.ui.Components.cc.a0(hyVar22), 2131623990, 36);
                                    return;
                                }
                                return;
                            default:
                                hy.Z(hyVar22, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
