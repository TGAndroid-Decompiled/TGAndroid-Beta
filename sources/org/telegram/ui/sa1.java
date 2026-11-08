package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sa1 implements RequestDelegate {
    public final int f49707a;
    public final za1 f49708b;

    public sa1(za1 za1Var, int i7) {
        this.f49707a = i7;
        this.f49708b = za1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f49707a) {
            case 0:
                final za1 za1Var = this.f49708b;
                org.telegram.messenger.g0.h3(new Runnable() {
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
                org.telegram.messenger.g0.h3(new va1(this.f49708b, tL_error, 0));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new va1(this.f49708b, tL_error, 1));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new va1(this.f49708b, tL_error, 2));
                return;
            default:
                final za1 za1Var2 = this.f49708b;
                org.telegram.messenger.g0.h3(new Runnable() {
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
