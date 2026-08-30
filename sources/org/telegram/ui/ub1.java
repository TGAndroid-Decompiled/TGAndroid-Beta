package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ub1 implements RequestDelegate {
    public final int f38900a;
    public final cd1 f38901b;

    public ub1(cd1 cd1Var, int i10) {
        this.f38900a = i10;
        this.f38901b = cd1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38900a) {
            case 0:
                final cd1 cd1Var = this.f38901b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                cd1.V(cd1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        cd1 cd1Var2 = cd1Var;
                                        cd1Var2.T0 = tL_wallPaper;
                                        cd1Var2.b1(false);
                                        cd1Var2.j1();
                                        cd1Var2.R0.add(0, cd1Var2.T0);
                                        ad1 ad1Var = cd1Var2.N0;
                                        if (ad1Var != null) {
                                            ad1Var.l();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final cd1 cd1Var2 = this.f38901b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                cd1.V(cd1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        cd1 cd1Var22 = cd1Var2;
                                        cd1Var22.T0 = tL_wallPaper;
                                        cd1Var22.b1(false);
                                        cd1Var22.j1();
                                        cd1Var22.R0.add(0, cd1Var22.T0);
                                        ad1 ad1Var = cd1Var22.N0;
                                        if (ad1Var != null) {
                                            ad1Var.l();
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
