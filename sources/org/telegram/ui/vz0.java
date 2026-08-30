package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class vz0 implements View.OnClickListener {
    public final int f39287a;
    public final g01 f39288b;

    public vz0(g01 g01Var, int i10) {
        this.f39287a = i10;
        this.f39288b = g01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39287a) {
            case 0:
                g01 g01Var = this.f39288b;
                ProfileActivity profileActivity = g01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32037b1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = g01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f39288b.e;
                profileActivity3.L4 = !profileActivity3.L4;
                if (!profileActivity3.K4) {
                    profileActivity3.K4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.L3);
                int i10 = profileActivity3.R5;
                if (i10 >= 0) {
                    profileActivity3.f32043c.h1(i10, profileActivity3.S5 - profileActivity3.f32028a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
