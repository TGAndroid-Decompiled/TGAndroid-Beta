package org.telegram.ui;

import android.view.View;
public final class xv0 implements View.OnClickListener {
    public final int f53333a;
    public final iw0 f53334b;

    public xv0(iw0 iw0Var, int i7) {
        this.f53333a = i7;
        this.f53334b = iw0Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f53333a) {
            case 0:
                ProfileActivity profileActivity = this.f53334b.f48123e;
                profileActivity.getMessagesController().x3(profileActivity, profileActivity.getMessagesController().a2(Long.valueOf(profileActivity.f43094e1)), null, profileActivity.getClassGuid(), null, false, false);
                return;
            default:
                ProfileActivity profileActivity2 = this.f53334b.f48123e;
                profileActivity2.Q4 = !profileActivity2.Q4;
                if (!profileActivity2.P4) {
                    profileActivity2.P4 = true;
                }
                profileActivity2.V4();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i7 = profileActivity2.f43173p6;
                if (i7 >= 0) {
                    profileActivity2.f43078c.h1(i7, profileActivity2.f43180q6 - profileActivity2.f43062a.getPaddingTop());
                    return;
                }
                return;
        }
    }
}
