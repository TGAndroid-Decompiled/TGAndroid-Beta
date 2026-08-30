package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ui0 implements RequestDelegate {
    public final int f38951a;
    public final aj0 f38952b;

    public ui0(aj0 aj0Var, int i10) {
        this.f38951a = i10;
        this.f38952b = aj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f38951a) {
            case 0:
                final aj0 aj0Var = this.f38952b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                aj0.U(aj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                aj0.W(aj0Var, tL_error, tLObject);
                                return;
                            default:
                                aj0.V(aj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final aj0 aj0Var2 = this.f38952b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                aj0.U(aj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                aj0.W(aj0Var2, tL_error, tLObject);
                                return;
                            default:
                                aj0.V(aj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final aj0 aj0Var3 = this.f38952b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                aj0.U(aj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                aj0.W(aj0Var3, tL_error, tLObject);
                                return;
                            default:
                                aj0.V(aj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
