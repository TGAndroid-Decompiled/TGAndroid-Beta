package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xx implements RequestDelegate {
    public final int f53955a;
    public final ky f53956b;

    public xx(ky kyVar, int i7) {
        this.f53955a = i7;
        this.f53956b = kyVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f53955a) {
            case 0:
                final ky kyVar = this.f53956b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ky kyVar2 = kyVar;
                        switch (i7) {
                            case 0:
                                kyVar2.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.f3.n(null, 2131750730, org.telegram.ui.Components.lc.b0(kyVar2), 2131623990, 36);
                                    return;
                                }
                                return;
                            default:
                                ky.Z(kyVar2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final ky kyVar2 = this.f53956b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        ky kyVar22 = kyVar2;
                        switch (i7) {
                            case 0:
                                kyVar22.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.f3.n(null, 2131750730, org.telegram.ui.Components.lc.b0(kyVar22), 2131623990, 36);
                                    return;
                                }
                                return;
                            default:
                                ky.Z(kyVar22, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
