package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
public final class y31 implements org.telegram.ui.Components.dj0, te.b {
    public final c51 f52048a;

    public y31(c51 c51Var) {
        this.f52048a = c51Var;
    }

    @Override
    public void Y(int i7, float f10, float f11, te.c cVar) {
        this.f52048a.t0();
    }

    @Override
    public boolean c(int i7, View view) {
        final c51 c51Var = this.f52048a;
        org.telegram.ui.ActionBar.u1[] u1VarArr = c51Var.f44654g0;
        g41 g41Var = c51Var.W;
        int i10 = g41Var.I;
        if (i7 >= i10 && i7 <= g41Var.J) {
            final org.telegram.messenger.ij ijVar = ((z41) c51Var.f44677y0.get(i7 - i10)).f52467b;
            if (!ijVar.y4()) {
                org.telegram.ui.Components.k60 H = org.telegram.ui.Components.k60.H(c51Var, view);
                H.c(2131232378, org.telegram.messenger.hd.M0(2131743550, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c51 c51Var2 = c51Var;
                                c51Var2.getClass();
                                c51Var2.presentFragment(new jg0(ijVar));
                                return;
                            default:
                                c51 c51Var3 = c51Var;
                                c51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", c51Var3.f44645b);
                                bundle.putInt("message_id", ijVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                c51Var3.presentFragment(new an(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(2131232255, org.telegram.messenger.hd.M0(2131743551, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                c51 c51Var2 = c51Var;
                                c51Var2.getClass();
                                c51Var2.presentFragment(new jg0(ijVar));
                                return;
                            default:
                                c51 c51Var3 = c51Var;
                                c51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", c51Var3.f44645b);
                                bundle.putInt("message_id", ijVar.f1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                c51Var3.presentFragment(new an(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(c51Var.S.U0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i11 = g41Var.U;
            if (i7 >= i11 && i7 <= g41Var.V) {
                ((v41) c51Var.Q.get(i7 - i11)).c(c51Var.f44643a, c51Var, u1VarArr, true);
                return true;
            }
            int i12 = g41Var.R;
            if (i7 >= i12 && i7 <= g41Var.S) {
                ((v41) c51Var.O.get(i7 - i12)).c(c51Var.f44643a, c51Var, u1VarArr, true);
                return true;
            }
            int i13 = g41Var.X;
            if (i7 >= i13 && i7 <= g41Var.Y) {
                ((v41) c51Var.P.get(i7 - i13)).c(c51Var.f44643a, c51Var, u1VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void F(float f10, int i7) {
    }
}
