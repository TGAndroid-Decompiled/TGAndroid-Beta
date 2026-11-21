package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
public final class z31 implements org.telegram.ui.Components.sj0, te.b {
    public final c51 f54396a;

    public z31(c51 c51Var) {
        this.f54396a = c51Var;
    }

    @Override
    public void H(int i7, float f10, float f11, te.c cVar) {
        this.f54396a.t0();
    }

    @Override
    public boolean c(int i7, View view) {
        final c51 c51Var = this.f54396a;
        org.telegram.ui.ActionBar.t1[] t1VarArr = c51Var.f46440h0;
        h41 h41Var = c51Var.X;
        int i10 = h41Var.J;
        if (i7 >= i10 && i7 <= h41Var.K) {
            final org.telegram.messenger.fj fjVar = ((z41) c51Var.f46463z0.get(i7 - i10)).f54433b;
            if (!fjVar.x4()) {
                org.telegram.ui.Components.a70 I = org.telegram.ui.Components.a70.I(c51Var, view);
                I.c(2131232380, org.telegram.messenger.gd.N0(2131743306, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c51 c51Var2 = c51Var;
                                c51Var2.getClass();
                                c51Var2.presentFragment(new og0(fjVar));
                                return;
                            default:
                                c51 c51Var3 = c51Var;
                                c51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", c51Var3.f46430b);
                                bundle.putInt("message_id", fjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                c51Var3.presentFragment(new bn(bundle), false);
                                return;
                        }
                    }
                }, false);
                I.c(2131232257, org.telegram.messenger.gd.N0(2131743307, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c51 c51Var2 = c51Var;
                                c51Var2.getClass();
                                c51Var2.presentFragment(new og0(fjVar));
                                return;
                            default:
                                c51 c51Var3 = c51Var;
                                c51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", c51Var3.f46430b);
                                bundle.putInt("message_id", fjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                c51Var3.presentFragment(new bn(bundle), false);
                                return;
                        }
                    }
                }, false);
                I.X(c51Var.T.U0(view, false));
                I.a0();
                return true;
            }
        } else {
            int i11 = h41Var.V;
            if (i7 >= i11 && i7 <= h41Var.W) {
                ((v41) c51Var.R.get(i7 - i11)).c(c51Var.f46428a, c51Var, t1VarArr, true);
                return true;
            }
            int i12 = h41Var.S;
            if (i7 >= i12 && i7 <= h41Var.T) {
                ((v41) c51Var.P.get(i7 - i12)).c(c51Var.f46428a, c51Var, t1VarArr, true);
                return true;
            }
            int i13 = h41Var.Y;
            if (i7 >= i13 && i7 <= h41Var.Z) {
                ((v41) c51Var.Q.get(i7 - i13)).c(c51Var.f46428a, c51Var, t1VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void D(float f10, int i7) {
    }
}
