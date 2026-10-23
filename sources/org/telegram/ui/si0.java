package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class si0 implements RequestDelegate {
    public final int f41425a;
    public final yi0 f41426b;

    public si0(yi0 yi0Var, int i10) {
        this.f41425a = i10;
        this.f41426b = yi0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f41425a) {
            case 0:
                final yi0 yi0Var = this.f41426b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                yi0.U(yi0Var, tL_error, tLObject);
                                return;
                            case 1:
                                yi0.W(yi0Var, tL_error, tLObject);
                                return;
                            default:
                                yi0.V(yi0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final yi0 yi0Var2 = this.f41426b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                yi0.U(yi0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                yi0.W(yi0Var2, tL_error, tLObject);
                                return;
                            default:
                                yi0.V(yi0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final yi0 yi0Var3 = this.f41426b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                yi0.U(yi0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                yi0.W(yi0Var3, tL_error, tLObject);
                                return;
                            default:
                                yi0.V(yi0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
