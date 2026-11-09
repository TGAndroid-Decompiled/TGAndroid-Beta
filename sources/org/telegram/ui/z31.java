package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
public final class z31 implements org.telegram.ui.Components.ej0, te.b {
    public final d51 f52416a;

    public z31(d51 d51Var) {
        this.f52416a = d51Var;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f52416a.t0();
    }

    @Override
    public boolean c(int i7, View view) {
        final d51 d51Var = this.f52416a;
        org.telegram.ui.ActionBar.u1[] u1VarArr = d51Var.f44836g0;
        h41 h41Var = d51Var.W;
        int i10 = h41Var.I;
        if (i7 >= i10 && i7 <= h41Var.J) {
            final org.telegram.messenger.ij ijVar = ((a51) d51Var.f44859y0.get(i7 - i10)).f43589b;
            if (!ijVar.x4()) {
                org.telegram.ui.Components.l60 H = org.telegram.ui.Components.l60.H(d51Var, view);
                H.c(2131232378, org.telegram.messenger.id.M0(2131743549, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d51 d51Var2 = d51Var;
                                d51Var2.getClass();
                                d51Var2.presentFragment(new lg0(ijVar));
                                return;
                            default:
                                d51 d51Var3 = d51Var;
                                d51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", d51Var3.f44827b);
                                bundle.putInt("message_id", ijVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                d51Var3.presentFragment(new cn(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(2131232255, org.telegram.messenger.id.M0(2131743550, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                d51 d51Var2 = d51Var;
                                d51Var2.getClass();
                                d51Var2.presentFragment(new lg0(ijVar));
                                return;
                            default:
                                d51 d51Var3 = d51Var;
                                d51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", d51Var3.f44827b);
                                bundle.putInt("message_id", ijVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                d51Var3.presentFragment(new cn(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(d51Var.S.U0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i11 = h41Var.U;
            if (i7 >= i11 && i7 <= h41Var.V) {
                ((w41) d51Var.Q.get(i7 - i11)).c(d51Var.f44825a, d51Var, u1VarArr, true);
                return true;
            }
            int i12 = h41Var.R;
            if (i7 >= i12 && i7 <= h41Var.S) {
                ((w41) d51Var.O.get(i7 - i12)).c(d51Var.f44825a, d51Var, u1VarArr, true);
                return true;
            }
            int i13 = h41Var.X;
            if (i7 >= i13 && i7 <= h41Var.Y) {
                ((w41) d51Var.P.get(i7 - i13)).c(d51Var.f44825a, d51Var, u1VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void F(float f10, int i7) {
    }
}
