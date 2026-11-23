package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
public final class y31 implements org.telegram.ui.Components.sj0, te.b {
    public final b51 f54183a;

    public y31(b51 b51Var) {
        this.f54183a = b51Var;
    }

    @Override
    public void K(int i7, float f10, float f11, te.c cVar) {
        this.f54183a.t0();
    }

    @Override
    public boolean b(int i7, View view) {
        final b51 b51Var = this.f54183a;
        org.telegram.ui.ActionBar.t1[] t1VarArr = b51Var.f45936h0;
        g41 g41Var = b51Var.X;
        int i10 = g41Var.J;
        if (i7 >= i10 && i7 <= g41Var.K) {
            final org.telegram.messenger.fj fjVar = ((y41) b51Var.f45959z0.get(i7 - i10)).f54223b;
            if (!fjVar.x4()) {
                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(b51Var, view);
                I.c(2131232383, org.telegram.messenger.gd.N0(2131743299, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                b51 b51Var2 = b51Var;
                                b51Var2.getClass();
                                b51Var2.presentFragment(new mg0(fjVar));
                                return;
                            default:
                                b51 b51Var3 = b51Var;
                                b51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", b51Var3.f45926b);
                                bundle.putInt("message_id", fjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                b51Var3.presentFragment(new bn(bundle), false);
                                return;
                        }
                    }
                }, false);
                I.c(2131232260, org.telegram.messenger.gd.N0(2131743300, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                b51 b51Var2 = b51Var;
                                b51Var2.getClass();
                                b51Var2.presentFragment(new mg0(fjVar));
                                return;
                            default:
                                b51 b51Var3 = b51Var;
                                b51Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", b51Var3.f45926b);
                                bundle.putInt("message_id", fjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                b51Var3.presentFragment(new bn(bundle), false);
                                return;
                        }
                    }
                }, false);
                I.X(b51Var.T.U0(view, false));
                I.a0();
                return true;
            }
        } else {
            int i11 = g41Var.V;
            if (i7 >= i11 && i7 <= g41Var.W) {
                ((u41) b51Var.R.get(i7 - i11)).c(b51Var.f45924a, b51Var, t1VarArr, true);
                return true;
            }
            int i12 = g41Var.S;
            if (i7 >= i12 && i7 <= g41Var.T) {
                ((u41) b51Var.P.get(i7 - i12)).c(b51Var.f45924a, b51Var, t1VarArr, true);
                return true;
            }
            int i13 = g41Var.Y;
            if (i7 >= i13 && i7 <= g41Var.Z) {
                ((u41) b51Var.Q.get(i7 - i13)).c(b51Var.f45924a, b51Var, t1VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void G(float f10, int i7) {
    }
}
