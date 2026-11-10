package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class va1 implements RequestDelegate {
    public final int f50688a;
    public final cb1 f50689b;

    public va1(cb1 cb1Var, int i7) {
        this.f50688a = i7;
        this.f50689b = cb1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50688a) {
            case 0:
                final cb1 cb1Var = this.f50689b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                cb1.g0(cb1Var, tL_error, tLObject);
                                return;
                            default:
                                cb1.m0(cb1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                org.telegram.messenger.g0.h3(new ya1(this.f50689b, tL_error, 0));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new ya1(this.f50689b, tL_error, 1));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ya1(this.f50689b, tL_error, 2));
                return;
            default:
                final cb1 cb1Var2 = this.f50689b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                cb1.g0(cb1Var2, tL_error, tLObject);
                                return;
                            default:
                                cb1.m0(cb1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
