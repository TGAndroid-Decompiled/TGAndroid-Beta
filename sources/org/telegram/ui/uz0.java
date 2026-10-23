package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class uz0 implements View.OnClickListener {
    public final int f42546a;
    public final f01 f42547b;

    public uz0(f01 f01Var, int i10) {
        this.f42546a = i10;
        this.f42547b = f01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42546a) {
            case 0:
                f01 f01Var = this.f42547b;
                ProfileActivity profileActivity = f01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33921f1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = f01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f42547b.e;
                profileActivity3.Q4 = !profileActivity3.Q4;
                if (!profileActivity3.P4) {
                    profileActivity3.P4 = true;
                }
                profileActivity3.H4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.P3);
                int i10 = profileActivity3.W5;
                if (i10 >= 0) {
                    profileActivity3.f33897c.h1(i10, profileActivity3.X5 - profileActivity3.f33882a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
