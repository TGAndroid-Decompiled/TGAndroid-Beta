package org.telegram.ui;

import android.view.View;
public final class xv0 implements View.OnClickListener {
    public final int f54087a;
    public final jw0 f54088b;

    public xv0(jw0 jw0Var, int i7) {
        this.f54087a = i7;
        this.f54088b = jw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f54087a) {
            case 0:
                ProfileActivity profileActivity = this.f54088b.f49218e;
                profileActivity.getMessagesController().E3(profileActivity, profileActivity.getMessagesController().c2(Long.valueOf(profileActivity.f43666e1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f54088b.f49218e;
                profileActivity2.S4 = !profileActivity2.S4;
                if (!profileActivity2.R4) {
                    profileActivity2.R4 = true;
                }
                profileActivity2.W4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i7 = profileActivity2.f43760r6;
                if (i7 >= 0) {
                    profileActivity2.f43650c.h1(i7, profileActivity2.f43767s6 - profileActivity2.f43634a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
