package org.telegram.ui;

import android.view.View;
public final class yv0 implements View.OnClickListener {
    public final int f52343a;
    public final jw0 f52344b;

    public yv0(jw0 jw0Var, int i7) {
        this.f52343a = i7;
        this.f52344b = jw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52343a) {
            case 0:
                ProfileActivity profileActivity = this.f52344b.f47050e;
                profileActivity.getMessagesController().x3(profileActivity, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41713d1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f52344b.f47050e;
                profileActivity2.O4 = !profileActivity2.O4;
                if (!profileActivity2.N4) {
                    profileActivity2.N4 = true;
                }
                profileActivity2.T4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.N3);
                int i7 = profileActivity2.f41767k6;
                if (i7 >= 0) {
                    profileActivity2.f41704c.h1(i7, profileActivity2.f41773l6 - profileActivity2.f41688a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
