package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wx implements RequestDelegate {
    public final int f53780a;
    public final jy f53781b;

    public wx(jy jyVar, int i7) {
        this.f53780a = i7;
        this.f53781b = jyVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f53780a) {
            case 0:
                final jy jyVar = this.f53781b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        jy jyVar2 = jyVar;
                        switch (i7) {
                            case 0:
                                jyVar2.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.f3.n(null, 2131750730, org.telegram.ui.Components.kc.b0(jyVar2), 2131623990, 36);
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
                final jy jyVar2 = this.f53781b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        jy jyVar22 = jyVar2;
                        switch (i7) {
                            case 0:
                                jyVar22.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.f3.n(null, 2131750730, org.telegram.ui.Components.kc.b0(jyVar22), 2131623990, 36);
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
