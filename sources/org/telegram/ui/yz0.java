package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class yz0 implements View.OnClickListener {
    public final int f46133a;
    public final j01 f46134b;

    public yz0(j01 j01Var, int i10) {
        this.f46133a = i10;
        this.f46134b = j01Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f46133a;
        j01 j01Var = this.f46134b;
        switch (i10) {
            case 0:
                ProfileActivity profileActivity = j01Var.e;
                int i11 = ProfileActivity.R6;
                profileActivity.D4();
                return;
            case 1:
                ProfileActivity profileActivity2 = j01Var.e;
                TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f35979e1));
                MessagesController messagesController = profileActivity2.getMessagesController();
                ProfileActivity profileActivity3 = j01Var.e;
                messagesController.openApp(profileActivity3, user, null, profileActivity3.getClassGuid(), null);
                return;
            default:
                ProfileActivity profileActivity4 = j01Var.e;
                profileActivity4.U4 = !profileActivity4.U4;
                if (!profileActivity4.T4) {
                    profileActivity4.T4 = true;
                }
                profileActivity4.N4();
                view.requestLayout();
                profileActivity4.d.m(profileActivity4.O3);
                int i12 = profileActivity4.f35962b6;
                if (i12 >= 0) {
                    profileActivity4.f35963c.h1(i12, profileActivity4.f35970c6 - profileActivity4.f35948a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
