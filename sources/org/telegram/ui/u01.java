package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class u01 implements View.OnClickListener {
    public final int f40513a;
    public final f11 f40514b;

    public u01(f11 f11Var, int i10) {
        this.f40513a = i10;
        this.f40514b = f11Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40513a) {
            case 0:
                f11 f11Var = this.f40514b;
                ProfileActivity profileActivity = f11Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f32559e1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = f11Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f40514b.e;
                profileActivity3.O4 = !profileActivity3.O4;
                if (!profileActivity3.N4) {
                    profileActivity3.N4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.O3);
                int i10 = profileActivity3.U5;
                if (i10 >= 0) {
                    profileActivity3.f32543c.h1(i10, profileActivity3.V5 - profileActivity3.f32528a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
