package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vy implements RequestDelegate {
    public final int f42633a;
    public final hz f42634b;

    public vy(hz hzVar, int i10) {
        this.f42633a = i10;
        this.f42634b = hzVar;
    }

    @Override
    public final void run(TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42633a) {
            case 0:
                final hz hzVar = this.f42634b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        hz hzVar2 = hzVar;
                        switch (i10) {
                            case 0:
                                hzVar2.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.m5.n(null, 2131750743, org.telegram.ui.Components.cc.a0(hzVar2), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                hz.Z(hzVar2, tL_error2);
                                return;
                        }
                    }
                });
                return;
            default:
                final hz hzVar2 = this.f42634b;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10 = r3;
                        TLRPC.TL_error tL_error2 = tL_error;
                        hz hzVar22 = hzVar2;
                        switch (i10) {
                            case 0:
                                hzVar22.E = 0;
                                if (tL_error2 == null) {
                                    org.telegram.messenger.m5.n(null, 2131750743, org.telegram.ui.Components.cc.a0(hzVar22), 2131623989, 36);
                                    return;
                                }
                                return;
                            default:
                                hz.Z(hzVar22, tL_error2);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
