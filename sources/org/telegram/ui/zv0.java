package org.telegram.ui;

import android.view.View;
public final class zv0 implements View.OnClickListener {
    public final int f54605a;
    public final lw0 f54606b;

    public zv0(lw0 lw0Var, int i7) {
        this.f54605a = i7;
        this.f54606b = lw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f54605a) {
            case 0:
                ProfileActivity profileActivity = this.f54606b.f49684e;
                profileActivity.getMessagesController().E3(profileActivity, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43550e1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f54606b.f49684e;
                profileActivity2.S4 = !profileActivity2.S4;
                if (!profileActivity2.R4) {
                    profileActivity2.R4 = true;
                }
                profileActivity2.W4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i7 = profileActivity2.f43644r6;
                if (i7 >= 0) {
                    profileActivity2.f43534c.h1(i7, profileActivity2.f43651s6 - profileActivity2.f43518a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
