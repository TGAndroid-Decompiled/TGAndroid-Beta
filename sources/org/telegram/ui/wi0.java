package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wi0 implements RequestDelegate {
    public final int f39710a;
    public final cj0 f39711b;

    public wi0(cj0 cj0Var, int i10) {
        this.f39710a = i10;
        this.f39711b = cj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39710a) {
            case 0:
                final cj0 cj0Var = this.f39711b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                cj0.U(cj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                cj0.W(cj0Var, tL_error, tLObject);
                                return;
                            default:
                                cj0.V(cj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final cj0 cj0Var2 = this.f39711b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                cj0.U(cj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                cj0.W(cj0Var2, tL_error, tLObject);
                                return;
                            default:
                                cj0.V(cj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final cj0 cj0Var3 = this.f39711b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                cj0.U(cj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                cj0.W(cj0Var3, tL_error, tLObject);
                                return;
                            default:
                                cj0.V(cj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
