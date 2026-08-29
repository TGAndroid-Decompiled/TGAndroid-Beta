package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vf1 implements RequestDelegate {
    public final int f43580a;
    public final cg1 f43581b;

    public vf1(cg1 cg1Var, int i10) {
        this.f43580a = i10;
        this.f43581b = cg1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43580a) {
            case 0:
                final cg1 cg1Var = this.f43581b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                cg1.b0(cg1Var, tL_error, tLObject);
                                return;
                            default:
                                cg1.h0(cg1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new yf1(this.f43581b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new yf1(this.f43581b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new yf1(this.f43581b, tL_error, 2));
                return;
            default:
                final cg1 cg1Var2 = this.f43581b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                cg1.b0(cg1Var2, tL_error, tLObject);
                                return;
                            default:
                                cg1.h0(cg1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
