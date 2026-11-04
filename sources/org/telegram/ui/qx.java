package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qx implements RequestDelegate {
    public final int f48968a;
    public final cy f48969b;

    public qx(cy cyVar, int i3) {
        this.f48968a = i3;
        this.f48969b = cyVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f48968a) {
            case 0:
                final cy cyVar = this.f48969b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        cy cyVar2 = cyVar;
                        switch (i3) {
                            case 0:
                                cyVar2.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750743, org.telegram.ui.Components.fc.a0(cyVar2), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                cy.Z(cyVar2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final cy cyVar2 = this.f48969b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i3 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        cy cyVar22 = cyVar2;
                        switch (i3) {
                            case 0:
                                cyVar22.F = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.k5.o(null, 2131750743, org.telegram.ui.Components.fc.a0(cyVar22), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                cy.Z(cyVar22, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
