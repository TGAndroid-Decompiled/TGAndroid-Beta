package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class qz0 implements View.OnClickListener {
    public final int f41024a;
    public final b01 f41025b;

    public qz0(b01 b01Var, int i10) {
        this.f41024a = i10;
        this.f41025b = b01Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41024a) {
            case 0:
                b01 b01Var = this.f41025b;
                ProfileActivity profileActivity = b01Var.e;
                TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(profileActivity.f33623f1));
                MessagesController messagesController = profileActivity.getMessagesController();
                ProfileActivity profileActivity2 = b01Var.e;
                messagesController.openApp(profileActivity2, user, null, profileActivity2.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity3 = this.f41025b.e;
                profileActivity3.Q4 = !profileActivity3.Q4;
                if (!profileActivity3.P4) {
                    profileActivity3.P4 = true;
                }
                profileActivity3.F4();
                view.requestLayout();
                profileActivity3.d.m(profileActivity3.P3);
                int i10 = profileActivity3.W5;
                if (i10 >= 0) {
                    profileActivity3.f33599c.h1(i10, profileActivity3.X5 - profileActivity3.f33584a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
