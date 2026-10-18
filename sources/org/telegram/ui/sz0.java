package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class sz0 implements View.OnClickListener {
    public final int f41539a;
    public final d01 f41540b;

    public sz0(d01 d01Var, int i10) {
        this.f41539a = i10;
        this.f41540b = d01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41539a) {
            case 0:
                d01 d01Var = this.f41540b;
                ProfileActivity profileActivity = d01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33607f1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = d01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f41540b.e;
                profileActivity3.Q4 = !profileActivity3.Q4;
                if (!profileActivity3.P4) {
                    profileActivity3.P4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.P3);
                int i10 = profileActivity3.W5;
                if (i10 >= 0) {
                    profileActivity3.f33583c.h1(i10, profileActivity3.X5 - profileActivity3.f33568a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
