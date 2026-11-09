package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ua1 implements RequestDelegate {
    public final int f50353a;
    public final bb1 f50354b;

    public ua1(bb1 bb1Var, int i7) {
        this.f50353a = i7;
        this.f50354b = bb1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f50353a) {
            case 0:
                final bb1 bb1Var = this.f50354b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                bb1.g0(bb1Var, tL_error, tLObject);
                                return;
                            default:
                                bb1.m0(bb1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                org.telegram.messenger.g0.h3(new xa1(this.f50354b, tL_error, 0));
                return;
            case 2:
                org.telegram.messenger.g0.h3(new xa1(this.f50354b, tL_error, 1));
                return;
            case 3:
                org.telegram.messenger.g0.h3(new xa1(this.f50354b, tL_error, 2));
                return;
            default:
                final bb1 bb1Var2 = this.f50354b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                bb1.g0(bb1Var2, tL_error, tLObject);
                                return;
                            default:
                                bb1.m0(bb1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
