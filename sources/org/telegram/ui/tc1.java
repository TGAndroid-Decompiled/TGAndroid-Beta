package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tc1 implements RequestDelegate {
    public final int f36905a;
    public final ae1 f36906b;

    public tc1(ae1 ae1Var, int i10) {
        this.f36905a = i10;
        this.f36906b = ae1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f36905a) {
            case 0:
                final ae1 ae1Var = this.f36906b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ae1.W(ae1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        ae1 ae1Var2 = ae1Var;
                                        ae1Var2.W0 = tL_wallPaper;
                                        ae1Var2.b1(false);
                                        ae1Var2.j1();
                                        ae1Var2.U0.add(0, ae1Var2.W0);
                                        yd1 yd1Var = ae1Var2.Q0;
                                        if (yd1Var != null) {
                                            yd1Var.l();
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
                final ae1 ae1Var2 = this.f36906b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ae1.W(ae1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        ae1 ae1Var22 = ae1Var2;
                                        ae1Var22.W0 = tL_wallPaper;
                                        ae1Var22.b1(false);
                                        ae1Var22.j1();
                                        ae1Var22.U0.add(0, ae1Var22.W0);
                                        yd1 yd1Var = ae1Var22.Q0;
                                        if (yd1Var != null) {
                                            yd1Var.l();
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
