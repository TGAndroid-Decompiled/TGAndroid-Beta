package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ri0 implements RequestDelegate {
    public final int f43054a;
    public final xi0 f43055b;

    public ri0(xi0 xi0Var, int i10) {
        this.f43054a = i10;
        this.f43055b = xi0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43054a) {
            case 0:
                final xi0 xi0Var = this.f43055b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xi0.V(xi0Var, tL_error, tLObject);
                                return;
                            case 1:
                                xi0.X(xi0Var, tL_error, tLObject);
                                return;
                            default:
                                xi0.W(xi0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final xi0 xi0Var2 = this.f43055b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xi0.V(xi0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                xi0.X(xi0Var2, tL_error, tLObject);
                                return;
                            default:
                                xi0.W(xi0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final xi0 xi0Var3 = this.f43055b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                xi0.V(xi0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                xi0.X(xi0Var3, tL_error, tLObject);
                                return;
                            default:
                                xi0.W(xi0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
