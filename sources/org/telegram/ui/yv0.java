package org.telegram.ui;

import android.view.View;
public final class yv0 implements View.OnClickListener {
    public final int f52321a;
    public final jw0 f52322b;

    public yv0(jw0 jw0Var, int i7) {
        this.f52321a = i7;
        this.f52322b = jw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f52321a) {
            case 0:
                ProfileActivity profileActivity = this.f52322b.f47047e;
                profileActivity.getMessagesController().x3(profileActivity, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f41716d1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f52322b.f47047e;
                profileActivity2.O4 = !profileActivity2.O4;
                if (!profileActivity2.N4) {
                    profileActivity2.N4 = true;
                }
                profileActivity2.T4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.N3);
                int i7 = profileActivity2.f41770k6;
                if (i7 >= 0) {
                    profileActivity2.f41707c.h1(i7, profileActivity2.f41776l6 - profileActivity2.f41691a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
