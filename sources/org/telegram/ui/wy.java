package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wy implements RequestDelegate {
    public final int f43395a;
    public final iz f43396b;

    public wy(iz izVar, int i10) {
        this.f43395a = i10;
        this.f43396b = izVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43395a) {
            case 0:
                final iz izVar = this.f43396b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        iz izVar2 = izVar;
                        switch (i10) {
                            case 0:
                                izVar2.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.m5.n(null, 2131750743, org.telegram.ui.Components.cc.a0(izVar2), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                iz.Y(izVar2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final iz izVar2 = this.f43396b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        iz izVar22 = izVar2;
                        switch (i10) {
                            case 0:
                                izVar22.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.m5.n(null, 2131750743, org.telegram.ui.Components.cc.a0(izVar22), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                iz.Y(izVar22, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
