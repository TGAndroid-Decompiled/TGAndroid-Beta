package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vb1 implements RequestDelegate {
    public final int f42196a;
    public final ed1 f42197b;

    public vb1(ed1 ed1Var, int i10) {
        this.f42196a = i10;
        this.f42197b = ed1Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f42196a) {
            case 0:
                final ed1 ed1Var = this.f42197b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ed1.V(ed1Var, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        ed1 ed1Var2 = ed1Var;
                                        ed1Var2.T0 = tL_wallPaper;
                                        ed1Var2.b1(false);
                                        ed1Var2.j1();
                                        ed1Var2.R0.add(0, ed1Var2.T0);
                                        cd1 cd1Var = ed1Var2.N0;
                                        if (cd1Var != null) {
                                            cd1Var.l();
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
                final ed1 ed1Var2 = this.f42197b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                ed1.V(ed1Var2, tLObject);
                                return;
                            default:
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 instanceof TLRPC.TL_wallPaper) {
                                    TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject2;
                                    if (tL_wallPaper.pattern) {
                                        ed1 ed1Var22 = ed1Var2;
                                        ed1Var22.T0 = tL_wallPaper;
                                        ed1Var22.b1(false);
                                        ed1Var22.j1();
                                        ed1Var22.R0.add(0, ed1Var22.T0);
                                        cd1 cd1Var = ed1Var22.N0;
                                        if (cd1Var != null) {
                                            cd1Var.l();
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
