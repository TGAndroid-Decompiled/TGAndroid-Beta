package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class s81 implements org.telegram.ui.Components.bm0, oe.d {
    public final w91 f43415a;

    public s81(w91 w91Var) {
        this.f43415a = w91Var;
    }

    @Override
    public void E(int i10, float f7, float f10, oe.e eVar) {
        this.f43415a.p0();
    }

    @Override
    public boolean c(int i10, View view) {
        final w91 w91Var = this.f43415a;
        org.telegram.ui.ActionBar.e2[] e2VarArr = w91Var.f45030g0;
        b91 b91Var = w91Var.W;
        int i11 = b91Var.I;
        if (i10 >= i11 && i10 <= b91Var.J) {
            final MessageObject messageObject = ((t91) w91Var.f45053y0.get(i10 - i11)).f43706b;
            if (!messageObject.isStory()) {
                org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(w91Var, view);
                H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w91 w91Var2 = w91Var;
                                w91Var2.getClass();
                                w91Var2.presentFragment(new vi0(messageObject));
                                return;
                            default:
                                w91 w91Var3 = w91Var;
                                w91Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", w91Var3.f45022b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                w91Var3.presentFragment(new un(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                w91 w91Var2 = w91Var;
                                w91Var2.getClass();
                                w91Var2.presentFragment(new vi0(messageObject));
                                return;
                            default:
                                w91 w91Var3 = w91Var;
                                w91Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", w91Var3.f45022b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                w91Var3.presentFragment(new un(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(w91Var.S.V0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i12 = b91Var.U;
            if (i10 >= i12 && i10 <= b91Var.V) {
                ((p91) w91Var.Q.get(i10 - i12)).c(w91Var.f45020a, w91Var, e2VarArr, true);
                return true;
            }
            int i13 = b91Var.R;
            if (i10 >= i13 && i10 <= b91Var.S) {
                ((p91) w91Var.O.get(i10 - i13)).c(w91Var.f45020a, w91Var, e2VarArr, true);
                return true;
            }
            int i14 = b91Var.X;
            if (i10 >= i14 && i10 <= b91Var.Y) {
                ((p91) w91Var.P.get(i10 - i14)).c(w91Var.f45020a, w91Var, e2VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void z(float f7, int i10) {
    }
}
