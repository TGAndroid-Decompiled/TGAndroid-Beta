package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tf1 implements RequestDelegate {
    public final int f42043a;
    public final ag1 f42044b;

    public tf1(ag1 ag1Var, int i10) {
        this.f42043a = i10;
        this.f42044b = ag1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f42043a) {
            case 0:
                final ag1 ag1Var = this.f42044b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ag1.b0(ag1Var, tL_error, tLObject);
                                return;
                            default:
                                ag1.h0(ag1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wf1(this.f42044b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new wf1(this.f42044b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new wf1(this.f42044b, tL_error, 2));
                return;
            default:
                final ag1 ag1Var2 = this.f42044b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                ag1.b0(ag1Var2, tL_error, tLObject);
                                return;
                            default:
                                ag1.h0(ag1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
