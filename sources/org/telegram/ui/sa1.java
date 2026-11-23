package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sa1 implements RequestDelegate {
    public final int f52032a;
    public final za1 f52033b;

    public sa1(za1 za1Var, int i7) {
        this.f52032a = i7;
        this.f52033b = za1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f52032a) {
            case 0:
                final za1 za1Var = this.f52033b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                za1.g0(za1Var, tL_error, tLObject);
                                return;
                            default:
                                za1.m0(za1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                org.telegram.messenger.g0.g3(new va1(this.f52033b, tL_error, 0));
                return;
            case 2:
                org.telegram.messenger.g0.g3(new va1(this.f52033b, tL_error, 1));
                return;
            case 3:
                org.telegram.messenger.g0.g3(new va1(this.f52033b, tL_error, 2));
                return;
            default:
                final za1 za1Var2 = this.f52033b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                za1.g0(za1Var2, tL_error, tLObject);
                                return;
                            default:
                                za1.m0(za1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
