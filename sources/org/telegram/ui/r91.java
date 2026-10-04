package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
public final class r91 implements org.telegram.ui.Components.ol0, le.d {
    public final va1 f39954a;

    public r91(va1 va1Var) {
        this.f39954a = va1Var;
    }

    @Override
    public void a0(int i10, float f7, float f10, le.e eVar) {
        this.f39954a.n0();
    }

    @Override
    public boolean d(int i10, View view) {
        final va1 va1Var = this.f39954a;
        org.telegram.ui.ActionBar.b2[] b2VarArr = va1Var.f41648g0;
        aa1 aa1Var = va1Var.W;
        int i11 = aa1Var.I;
        if (i10 >= i11 && i10 <= aa1Var.J) {
            final MessageObject messageObject = ((sa1) va1Var.f41671y0.get(i10 - i11)).f40437b;
            if (!messageObject.isStory()) {
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(va1Var, view);
                H.c(R.drawable.msg_stats, LocaleController.getString(R.string.ViewMessageStatistic), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                va1 va1Var2 = va1Var;
                                va1Var2.getClass();
                                va1Var2.presentFragment(new hj0(messageObject));
                                return;
                            default:
                                va1 va1Var3 = va1Var;
                                va1Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", va1Var3.f41639b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                va1Var3.presentFragment(new yn(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.c(R.drawable.msg_msgbubble3, LocaleController.getString(R.string.ViewMessage), new Runnable() {
                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                va1 va1Var2 = va1Var;
                                va1Var2.getClass();
                                va1Var2.presentFragment(new hj0(messageObject));
                                return;
                            default:
                                va1 va1Var3 = va1Var;
                                va1Var3.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", va1Var3.f41639b);
                                bundle.putInt("message_id", messageObject.getId());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                va1Var3.presentFragment(new yn(bundle), false);
                                return;
                        }
                    }
                }, false);
                H.W(va1Var.S.W0(view, false));
                H.Z();
                return true;
            }
        } else {
            int i12 = aa1Var.U;
            if (i10 >= i12 && i10 <= aa1Var.V) {
                ((oa1) va1Var.Q.get(i10 - i12)).c(va1Var.f41637a, va1Var, b2VarArr, true);
                return true;
            }
            int i13 = aa1Var.R;
            if (i10 >= i13 && i10 <= aa1Var.S) {
                ((oa1) va1Var.O.get(i10 - i13)).c(va1Var.f41637a, va1Var, b2VarArr, true);
                return true;
            }
            int i14 = aa1Var.X;
            if (i10 >= i14 && i10 <= aa1Var.Y) {
                ((oa1) va1Var.P.get(i10 - i14)).c(va1Var.f41637a, va1Var, b2VarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public void V(float f7, int i10) {
    }
}
