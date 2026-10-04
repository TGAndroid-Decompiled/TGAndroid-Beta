package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ug1 implements RequestDelegate {
    public final int f41229a;
    public final bh1 f41230b;

    public ug1(bh1 bh1Var, int i10) {
        this.f41229a = i10;
        this.f41230b = bh1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41229a) {
            case 0:
                final bh1 bh1Var = this.f41230b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                bh1.b0(bh1Var, tL_error, tLObject);
                                return;
                            default:
                                bh1.h0(bh1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xg1(this.f41230b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xg1(this.f41230b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new xg1(this.f41230b, tL_error, 2));
                return;
            default:
                final bh1 bh1Var2 = this.f41230b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                bh1.b0(bh1Var2, tL_error, tLObject);
                                return;
                            default:
                                bh1.h0(bh1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
