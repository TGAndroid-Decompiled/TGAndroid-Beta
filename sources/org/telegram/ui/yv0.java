package org.telegram.ui;

import android.view.View;
public final class yv0 implements View.OnClickListener {
    public final int f54299a;
    public final lw0 f54300b;

    public yv0(lw0 lw0Var, int i7) {
        this.f54299a = i7;
        this.f54300b = lw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f54299a) {
            case 0:
                ProfileActivity profileActivity = this.f54300b.f49714e;
                profileActivity.getMessagesController().E3(profileActivity, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43581e1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f54300b.f49714e;
                profileActivity2.S4 = !profileActivity2.S4;
                if (!profileActivity2.R4) {
                    profileActivity2.R4 = true;
                }
                profileActivity2.W4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i7 = profileActivity2.f43675r6;
                if (i7 >= 0) {
                    profileActivity2.f43565c.h1(i7, profileActivity2.f43682s6 - profileActivity2.f43549a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
