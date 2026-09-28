package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xi0 implements RequestDelegate {
    public final int f39934a;
    public final dj0 f39935b;

    public xi0(dj0 dj0Var, int i10) {
        this.f39934a = i10;
        this.f39935b = dj0Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39934a) {
            case 0:
                final dj0 dj0Var = this.f39935b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                dj0.U(dj0Var, tL_error, tLObject);
                                return;
                            case 1:
                                dj0.W(dj0Var, tL_error, tLObject);
                                return;
                            default:
                                dj0.V(dj0Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                final dj0 dj0Var2 = this.f39935b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                dj0.U(dj0Var2, tL_error, tLObject);
                                return;
                            case 1:
                                dj0.W(dj0Var2, tL_error, tLObject);
                                return;
                            default:
                                dj0.V(dj0Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final dj0 dj0Var3 = this.f39935b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                dj0.U(dj0Var3, tL_error, tLObject);
                                return;
                            case 1:
                                dj0.W(dj0Var3, tL_error, tLObject);
                                return;
                            default:
                                dj0.V(dj0Var3, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
