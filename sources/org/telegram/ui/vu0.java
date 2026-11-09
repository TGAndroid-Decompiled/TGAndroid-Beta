package org.telegram.ui;

import android.view.View;
public final class vu0 extends v4.b0 {
    public final ProfileActivity I;

    public vu0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f41714c.m(0);
        if (m10 != null && !profileActivity.F0) {
            int top = m10.getTop() - profileActivity.j4();
            boolean z9 = profileActivity.f41792n2;
            boolean z10 = true;
            if (!z9 && top > i7) {
                if (!profileActivity.f41791n0.X0.isEmpty() && profileActivity.f41729e0.getImageReceiver().L() && !org.telegram.messenger.g0.C1() && ((!profileActivity.f41785m2 && !org.telegram.messenger.g0.Q1()) || profileActivity.I0)) {
                    if (profileActivity.I2 != null) {
                        z10 = false;
                    }
                    profileActivity.f41792n2 = z10;
                }
            } else if (z9) {
                if (i7 >= top) {
                    profileActivity.f41792n2 = false;
                } else if (profileActivity.f41698a.getScrollState() == 1 && !profileActivity.f41799o2) {
                    i7 /= 2;
                }
            }
            i7 = top;
        }
        if (profileActivity.N1 && !profileActivity.f41698a.P0) {
            return 0;
        }
        return super.o0(i7, v0Var, a1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f41810q0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void z0(v4.a1 a1Var, int[] iArr) {
        super.z0(a1Var, iArr);
        iArr[0] = Math.max(iArr[0], ProfileActivity.J0(this.I));
    }
}
