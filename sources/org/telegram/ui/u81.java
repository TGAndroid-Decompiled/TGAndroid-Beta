package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class u81 implements org.telegram.ui.Components.cm0, oe.d {
    public final y91 f43933a;

    public u81(y91 y91Var) {
        this.f43933a = y91Var;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.f43933a.p0();
    }

    @Override
    public boolean c(int i10, View view) {
        final y91 y91Var = this.f43933a;
        org.telegram.ui.ActionBar.e2[] e2VarArr = y91Var.f45918g0;
        d91 d91Var = y91Var.W;
        int i11 = d91Var.I;
        if (i10 >= i11 && i10 <= d91Var.J) {
            final MessageObject messageObject = ((v91) y91Var.f45941y0.get(i10 - i11)).f44217b;
            if (!messageObject.isStory()) {
                org.telegram.ui.Components.l80 H = org.telegram.ui.Components.l80.H(y91Var, view);
                H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                y91 y91Var2 = y91Var;
                                y91Var2.getClass();
                                y91Var2.presentFragment(new xi0(messageObject));
                                return;
                            default:
                                y91 y91Var3 = y91Var;
                                y91Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", y91Var3.f45910b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                y91Var3.presentFragment(new wn(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                y91 y91Var2 = y91Var;
                                y91Var2.getClass();
                                y91Var2.presentFragment(new xi0(messageObject));
                                return;
                            default:
                                y91 y91Var3 = y91Var;
                                y91Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", y91Var3.f45910b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                y91Var3.presentFragment(new wn(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(y91Var.S.V0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i12 = d91Var.U;
            if (i10 >= i12 && i10 <= d91Var.V) {
                ((r91) y91Var.Q.get(i10 - i12)).c(y91Var.f45908a, y91Var, e2VarArr, true);
                return true;
            }
            int i13 = d91Var.R;
            if (i10 >= i13 && i10 <= d91Var.S) {
                ((r91) y91Var.O.get(i10 - i13)).c(y91Var.f45908a, y91Var, e2VarArr, true);
                return true;
            }
            int i14 = d91Var.X;
            if (i10 >= i14 && i10 <= d91Var.Y) {
                ((r91) y91Var.P.get(i10 - i14)).c(y91Var.f45908a, y91Var, e2VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void z(float f7, int i10) {
    }
}
