package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
public final class r51 implements org.telegram.ui.Components.ik0, fe.e {
    public final u61 f41135a;

    public r51(u61 u61Var) {
        this.f41135a = u61Var;
    }

    @Override
    public boolean f(int i10, View view) {
        final u61 u61Var = this.f41135a;
        org.telegram.ui.ActionBar.x1[] x1VarArr = u61Var.f42033g0;
        z51 z51Var = u61Var.W;
        int i11 = z51Var.I;
        if (i10 >= i11 && i10 <= z51Var.J) {
            final org.telegram.messenger.jj jjVar = ((r61) u61Var.f42056y0.get(i10 - i11)).f41150b;
            if (!jjVar.x4()) {
                org.telegram.ui.Components.z60 H = org.telegram.ui.Components.z60.H(u61Var, view);
                H.c(2131232377, org.telegram.messenger.cd.L0(2131743575, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u61 u61Var2 = u61Var;
                                u61Var2.getClass();
                                u61Var2.presentFragment(new sh0(jjVar));
                                return;
                            default:
                                u61 u61Var3 = u61Var;
                                u61Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", u61Var3.f42025b);
                                bundle.putInt("message_id", jjVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                u61Var3.presentFragment(new un(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(2131232254, org.telegram.messenger.cd.L0(2131743576, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                u61 u61Var2 = u61Var;
                                u61Var2.getClass();
                                u61Var2.presentFragment(new sh0(jjVar));
                                return;
                            default:
                                u61 u61Var3 = u61Var;
                                u61Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", u61Var3.f42025b);
                                bundle.putInt("message_id", jjVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                u61Var3.presentFragment(new un(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(u61Var.S.U0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i12 = z51Var.U;
            if (i10 >= i12 && i10 <= z51Var.V) {
                ((n61) u61Var.Q.get(i10 - i12)).c(u61Var.f42023a, u61Var, x1VarArr, true);
                return true;
            }
            int i13 = z51Var.R;
            if (i10 >= i13 && i10 <= z51Var.S) {
                ((n61) u61Var.O.get(i10 - i13)).c(u61Var.f42023a, u61Var, x1VarArr, true);
                return true;
            }
            int i14 = z51Var.X;
            if (i10 >= i14 && i10 <= z51Var.Y) {
                ((n61) u61Var.P.get(i10 - i14)).c(u61Var.f42023a, u61Var, x1VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        this.f41135a.s0();
    }

    @Override
    public void E(float f7, int i10) {
    }
}
