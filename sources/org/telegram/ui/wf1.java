package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wf1 implements RequestDelegate {
    public final int f45477a;
    public final dg1 f45478b;

    public wf1(dg1 dg1Var, int i10) {
        this.f45477a = i10;
        this.f45478b = dg1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f45477a) {
            case 0:
                final dg1 dg1Var = this.f45478b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                dg1.c0(dg1Var, tL_error, tLObject);
                                return;
                            default:
                                dg1.i0(dg1Var, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new zf1(this.f45478b, tL_error, 0));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new zf1(this.f45478b, tL_error, 1));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new zf1(this.f45478b, tL_error, 2));
                return;
            default:
                final dg1 dg1Var2 = this.f45478b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                dg1.c0(dg1Var2, tL_error, tLObject);
                                return;
                            default:
                                dg1.i0(dg1Var2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}
