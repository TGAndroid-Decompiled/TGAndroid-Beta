package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sc1 implements RequestDelegate {
    public final int f41896a;
    public final zd1 f41897b;

    public sc1(zd1 zd1Var, int i10) {
        this.f41896a = i10;
        this.f41897b = zd1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41896a) {
            case 0:
                final zd1 zd1Var = this.f41897b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                zd1.W(zd1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        zd1 zd1Var2 = zd1Var;
                                        zd1Var2.W0 = tL_wallPaper;
                                        zd1Var2.b1(false);
                                        zd1Var2.j1();
                                        zd1Var2.U0.add(0, zd1Var2.W0);
                                        xd1 xd1Var = zd1Var2.Q0;
                                        if (xd1Var != null) {
                                            xd1Var.l();
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
                final zd1 zd1Var2 = this.f41897b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                zd1.W(zd1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        zd1 zd1Var22 = zd1Var2;
                                        zd1Var22.W0 = tL_wallPaper;
                                        zd1Var22.b1(false);
                                        zd1Var22.j1();
                                        zd1Var22.U0.add(0, zd1Var22.W0);
                                        xd1 xd1Var = zd1Var22.Q0;
                                        if (xd1Var != null) {
                                            xd1Var.l();
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
