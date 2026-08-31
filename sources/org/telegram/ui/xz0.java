package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class xz0 implements View.OnClickListener {
    public final int f43505a;
    public final i01 f43506b;

    public xz0(i01 i01Var, int i10) {
        this.f43505a = i10;
        this.f43506b = i01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f43505a) {
            case 0:
                i01 i01Var = this.f43506b;
                ProfileActivity profileActivity = i01Var.f37715e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f34569b1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = i01Var.f37715e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f43506b.f37715e;
                profileActivity3.L4 = !profileActivity3.L4;
                if (!profileActivity3.K4) {
                    profileActivity3.K4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.L3);
                int i10 = profileActivity3.R5;
                if (i10 >= 0) {
                    profileActivity3.f34575c.h1(i10, profileActivity3.S5 - profileActivity3.f34560a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
