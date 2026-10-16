package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vc1 implements RequestDelegate {
    public final int f40675a;
    public final ce1 f40676b;

    public vc1(ce1 ce1Var, int i10) {
        this.f40675a = i10;
        this.f40676b = ce1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f40675a) {
            case 0:
                final ce1 ce1Var = this.f40676b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ce1.W(ce1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        ce1 ce1Var2 = ce1Var;
                                        ce1Var2.W0 = tL_wallPaper;
                                        ce1Var2.b1(false);
                                        ce1Var2.j1();
                                        ce1Var2.U0.add(0, ce1Var2.W0);
                                        ae1 ae1Var = ce1Var2.Q0;
                                        if (ae1Var != null) {
                                            ae1Var.l();
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
                final ce1 ce1Var2 = this.f40676b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ce1.W(ce1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        ce1 ce1Var22 = ce1Var2;
                                        ce1Var22.W0 = tL_wallPaper;
                                        ce1Var22.b1(false);
                                        ce1Var22.j1();
                                        ce1Var22.U0.add(0, ce1Var22.W0);
                                        ae1 ae1Var = ce1Var22.Q0;
                                        if (ae1Var != null) {
                                            ae1Var.l();
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
