package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
public final class w31 implements org.telegram.ui.Components.ij0, te.b {
    public final z41 f52392a;

    public w31(z41 z41Var) {
        this.f52392a = z41Var;
    }

    @Override
    public void G(int i7, float f10, float f11, te.c cVar) {
        this.f52392a.t0();
    }

    @Override
    public boolean b(int i7, View view) {
        final z41 z41Var = this.f52392a;
        org.telegram.ui.ActionBar.t1[] t1VarArr = z41Var.f53819h0;
        e41 e41Var = z41Var.X;
        int i10 = e41Var.J;
        if (i7 >= i10 && i7 <= e41Var.K) {
            final org.telegram.messenger.gj gjVar = ((w41) z41Var.f53842z0.get(i7 - i10)).f52434b;
            if (!gjVar.x4()) {
                org.telegram.ui.Components.m60 H = org.telegram.ui.Components.m60.H(z41Var, view);
                H.c(2131232379, org.telegram.messenger.hd.M0(2131743549, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                z41 z41Var2 = z41Var;
                                z41Var2.getClass();
                                z41Var2.presentFragment(new jg0(gjVar));
                                return;
                            default:
                                z41 z41Var3 = z41Var;
                                z41Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", z41Var3.f53809b);
                                bundle.putInt("message_id", gjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                z41Var3.presentFragment(new an(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(2131232256, org.telegram.messenger.hd.M0(2131743550, null), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                z41 z41Var2 = z41Var;
                                z41Var2.getClass();
                                z41Var2.presentFragment(new jg0(gjVar));
                                return;
                            default:
                                z41 z41Var3 = z41Var;
                                z41Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", z41Var3.f53809b);
                                bundle.putInt("message_id", gjVar.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                z41Var3.presentFragment(new an(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(z41Var.T.U0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i11 = e41Var.V;
            if (i7 >= i11 && i7 <= e41Var.W) {
                ((s41) z41Var.R.get(i7 - i11)).c(z41Var.f53807a, z41Var, t1VarArr, true);
                return true;
            }
            int i12 = e41Var.S;
            if (i7 >= i12 && i7 <= e41Var.T) {
                ((s41) z41Var.P.get(i7 - i12)).c(z41Var.f53807a, z41Var, t1VarArr, true);
                return true;
            }
            int i13 = e41Var.Y;
            if (i7 >= i13 && i7 <= e41Var.Z) {
                ((s41) z41Var.Q.get(i7 - i13)).c(z41Var.f53807a, z41Var, t1VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void E(float f10, int i7) {
    }
}
