package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xf0 implements RequestDelegate {
    public final int f52017a;
    public final dg0 f52018b;

    public xf0(dg0 dg0Var, int i3) {
        this.f52017a = i3;
        this.f52018b = dg0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f52017a) {
            case 0:
                final dg0 dg0Var = this.f52018b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                dg0.Z(dg0Var, tL_error, tLObject);
                                return;
                            case 1:
                                dg0.b0(dg0Var, tL_error, tLObject);
                                return;
                            default:
                                dg0.a0(dg0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final dg0 dg0Var2 = this.f52018b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                dg0.Z(dg0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                dg0.b0(dg0Var2, tL_error, tLObject);
                                return;
                            default:
                                dg0.a0(dg0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final dg0 dg0Var3 = this.f52018b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                dg0.Z(dg0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                dg0.b0(dg0Var3, tL_error, tLObject);
                                return;
                            default:
                                dg0.a0(dg0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
