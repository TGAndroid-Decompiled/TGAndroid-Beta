package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ri0 implements RequestDelegate {
    public final int f41169a;
    public final xi0 f41170b;

    public ri0(xi0 xi0Var, int i10) {
        this.f41169a = i10;
        this.f41170b = xi0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41169a) {
            case 0:
                final xi0 xi0Var = this.f41170b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xi0.U(xi0Var, tL_error, tLObject);
                                return;
                            case 1:
                                xi0.W(xi0Var, tL_error, tLObject);
                                return;
                            default:
                                xi0.V(xi0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final xi0 xi0Var2 = this.f41170b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xi0.U(xi0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                xi0.W(xi0Var2, tL_error, tLObject);
                                return;
                            default:
                                xi0.V(xi0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final xi0 xi0Var3 = this.f41170b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xi0.U(xi0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                xi0.W(xi0Var3, tL_error, tLObject);
                                return;
                            default:
                                xi0.V(xi0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
