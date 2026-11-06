package org.telegram.ui;

import android.view.View;
public final class yv0 implements View.OnClickListener {
    public final int f52336a;
    public final jw0 f52337b;

    public yv0(jw0 jw0Var, int i7) {
        this.f52336a = i7;
        this.f52337b = jw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52336a) {
            case 0:
                ProfileActivity profileActivity = this.f52337b.f47027e;
                profileActivity.getMessagesController().x3(profileActivity, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41688d1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f52337b.f47027e;
                profileActivity2.O4 = !profileActivity2.O4;
                if (!profileActivity2.N4) {
                    profileActivity2.N4 = true;
                }
                profileActivity2.T4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.N3);
                int i7 = profileActivity2.f41742k6;
                if (i7 >= 0) {
                    profileActivity2.f41679c.h1(i7, profileActivity2.f41748l6 - profileActivity2.f41663a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
