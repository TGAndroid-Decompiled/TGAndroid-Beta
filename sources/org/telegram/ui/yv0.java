package org.telegram.ui;

import android.view.View;
public final class yv0 implements View.OnClickListener {
    public final int f54303a;
    public final lw0 f54304b;

    public yv0(lw0 lw0Var, int i7) {
        this.f54303a = i7;
        this.f54304b = lw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f54303a) {
            case 0:
                ProfileActivity profileActivity = this.f54304b.f49718e;
                profileActivity.getMessagesController().E3(profileActivity, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43585e1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f54304b.f49718e;
                profileActivity2.S4 = !profileActivity2.S4;
                if (!profileActivity2.R4) {
                    profileActivity2.R4 = true;
                }
                profileActivity2.W4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i7 = profileActivity2.f43679r6;
                if (i7 >= 0) {
                    profileActivity2.f43569c.h1(i7, profileActivity2.f43686s6 - profileActivity2.f43553a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
