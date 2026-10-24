package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class tz0 implements View.OnClickListener {
    public final int f42164a;
    public final e01 f42165b;

    public tz0(e01 e01Var, int i10) {
        this.f42164a = i10;
        this.f42165b = e01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42164a) {
            case 0:
                e01 e01Var = this.f42165b;
                ProfileActivity profileActivity = e01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33923f1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = e01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f42165b.e;
                profileActivity3.Q4 = !profileActivity3.Q4;
                if (!profileActivity3.P4) {
                    profileActivity3.P4 = true;
                }
                profileActivity3.H4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.P3);
                int i10 = profileActivity3.W5;
                if (i10 >= 0) {
                    profileActivity3.f33899c.h1(i10, profileActivity3.X5 - profileActivity3.f33884a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
