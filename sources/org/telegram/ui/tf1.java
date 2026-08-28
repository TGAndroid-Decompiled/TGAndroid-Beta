package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tf1 implements RequestDelegate {
    public final int f42987a;
    public final ag1 f42988b;

    public tf1(ag1 ag1Var, int i9) {
        this.f42987a = i9;
        this.f42988b = ag1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42987a) {
            case 0:
                final ag1 ag1Var = this.f42988b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ag1.a0(ag1Var, tL_error, tLObject);
                                return;
                            default:
                                ag1.g0(ag1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wf1(this.f42988b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new wf1(this.f42988b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new wf1(this.f42988b, tL_error, 2));
                return;
            default:
                final ag1 ag1Var2 = this.f42988b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ag1.a0(ag1Var2, tL_error, tLObject);
                                return;
                            default:
                                ag1.g0(ag1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
