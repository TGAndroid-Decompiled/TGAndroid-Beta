package org.telegram.ui;

import android.view.View;
public final class tu0 extends v4.c0 {
    public final ProfileActivity I;

    public tu0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f43524c.m(0);
        if (m10 != null && !profileActivity.G0) {
            int top = m10.getTop() - profileActivity.j4();
            boolean z10 = profileActivity.f43615p2;
            boolean z11 = true;
            if (!z10 && top > i7) {
                if (!profileActivity.f43607o0.Y0.isEmpty() && profileActivity.f43547f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1() && ((!profileActivity.f43609o2 && !org.telegram.messenger.g0.Q1()) || profileActivity.J0)) {
                    if (profileActivity.K2 != null) {
                        z11 = false;
                    }
                    profileActivity.f43615p2 = z11;
                }
            } else if (z10) {
                if (i7 >= top) {
                    profileActivity.f43615p2 = false;
                } else if (profileActivity.f43508a.getScrollState() == 1 && !profileActivity.f43622q2) {
                    i7 /= 2;
                }
            }
            i7 = top;
        }
        if (profileActivity.O1 && !profileActivity.f43508a.Q0) {
            return 0;
        }
        return super.o0(i7, x0Var, c1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f43628r0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void z0(v4.c1 c1Var, int[] iArr) {
        super.z0(c1Var, iArr);
        iArr[0] = Math.max(iArr[0], ProfileActivity.J0(this.I));
    }
}
