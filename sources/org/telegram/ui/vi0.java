package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vi0 implements RequestDelegate {
    public final int f42150a;
    public final bj0 f42151b;

    public vi0(bj0 bj0Var, int i10) {
        this.f42150a = i10;
        this.f42151b = bj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42150a) {
            case 0:
                final bj0 bj0Var = this.f42151b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                bj0.U(bj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                bj0.W(bj0Var, tL_error, tLObject);
                                return;
                            default:
                                bj0.V(bj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final bj0 bj0Var2 = this.f42151b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                bj0.U(bj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                bj0.W(bj0Var2, tL_error, tLObject);
                                return;
                            default:
                                bj0.V(bj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final bj0 bj0Var3 = this.f42151b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                bj0.U(bj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                bj0.W(bj0Var3, tL_error, tLObject);
                                return;
                            default:
                                bj0.V(bj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
