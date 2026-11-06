package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ra1 implements RequestDelegate {
    public final int f49439a;
    public final ya1 f49440b;

    public ra1(ya1 ya1Var, int i7) {
        this.f49439a = i7;
        this.f49440b = ya1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f49439a) {
            case 0:
                final ya1 ya1Var = this.f49440b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ya1.g0(ya1Var, tL_error, tLObject);
                                return;
                            default:
                                ya1.m0(ya1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ua1(this.f49440b, tL_error, 0));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ua1(this.f49440b, tL_error, 1));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ua1(this.f49440b, tL_error, 2));
                return;
            default:
                final ya1 ya1Var2 = this.f49440b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ya1.g0(ya1Var2, tL_error, tLObject);
                                return;
                            default:
                                ya1.m0(ya1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
