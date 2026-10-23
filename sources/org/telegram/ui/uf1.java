package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uf1 implements RequestDelegate {
    public final int f42421a;
    public final bg1 f42422b;

    public uf1(bg1 bg1Var, int i10) {
        this.f42421a = i10;
        this.f42422b = bg1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42421a) {
            case 0:
                final bg1 bg1Var = this.f42422b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                bg1.b0(bg1Var, tL_error, tLObject);
                                return;
                            default:
                                bg1.h0(bg1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xf1(this.f42422b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new xf1(this.f42422b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new xf1(this.f42422b, tL_error, 2));
                return;
            default:
                final bg1 bg1Var2 = this.f42422b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                bg1.b0(bg1Var2, tL_error, tLObject);
                                return;
                            default:
                                bg1.h0(bg1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
