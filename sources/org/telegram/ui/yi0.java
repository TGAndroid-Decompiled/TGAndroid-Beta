package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yi0 implements RequestDelegate {
    public final int f39831a;
    public final ej0 f39832b;

    public yi0(ej0 ej0Var, int i10) {
        this.f39831a = i10;
        this.f39832b = ej0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39831a) {
            case 0:
                final ej0 ej0Var = this.f39832b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ej0.U(ej0Var, tL_error, tLObject);
                                return;
                            case 1:
                                ej0.W(ej0Var, tL_error, tLObject);
                                return;
                            default:
                                ej0.V(ej0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final ej0 ej0Var2 = this.f39832b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ej0.U(ej0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                ej0.W(ej0Var2, tL_error, tLObject);
                                return;
                            default:
                                ej0.V(ej0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final ej0 ej0Var3 = this.f39832b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ej0.U(ej0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                ej0.W(ej0Var3, tL_error, tLObject);
                                return;
                            default:
                                ej0.V(ej0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
