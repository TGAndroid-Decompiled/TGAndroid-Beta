package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sg1 implements RequestDelegate {
    public final int f37764a;
    public final zg1 f37765b;

    public sg1(zg1 zg1Var, int i10) {
        this.f37764a = i10;
        this.f37765b = zg1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37764a) {
            case 0:
                final zg1 zg1Var = this.f37765b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                zg1.b0(zg1Var, tL_error, tLObject);
                                return;
                            default:
                                zg1.h0(zg1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new vg1(this.f37765b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new vg1(this.f37765b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new vg1(this.f37765b, tL_error, 2));
                return;
            default:
                final zg1 zg1Var2 = this.f37765b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                zg1.b0(zg1Var2, tL_error, tLObject);
                                return;
                            default:
                                zg1.h0(zg1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
