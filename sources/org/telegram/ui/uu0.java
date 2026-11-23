package org.telegram.ui;

import android.view.View;
public final class uu0 extends v4.b0 {
    public final ProfileActivity I;

    public uu0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i7, v4.w0 w0Var, v4.b1 b1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f43534c.m(0);
        if (m10 != null && !profileActivity.G0) {
            int top = m10.getTop() - profileActivity.j4();
            boolean z10 = profileActivity.f43625p2;
            boolean z11 = true;
            if (!z10 && top > i7) {
                if (!profileActivity.f43617o0.Y0.isEmpty() && profileActivity.f43557f0.getImageReceiver().L() && !org.telegram.messenger.g0.C1() && ((!profileActivity.f43619o2 && !org.telegram.messenger.g0.Q1()) || profileActivity.J0)) {
                    if (profileActivity.K2 != null) {
                        z11 = false;
                    }
                    profileActivity.f43625p2 = z11;
                }
            } else if (z10) {
                if (i7 >= top) {
                    profileActivity.f43625p2 = false;
                } else if (profileActivity.f43518a.getScrollState() == 1 && !profileActivity.f43632q2) {
                    i7 /= 2;
                }
            }
            i7 = top;
        }
        if (profileActivity.O1 && !profileActivity.f43518a.Q0) {
            return 0;
        }
        return super.o0(i7, w0Var, b1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f43638r0 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void z0(v4.b1 b1Var, int[] iArr) {
        super.z0(b1Var, iArr);
        iArr[0] = Math.max(iArr[0], ProfileActivity.J0(this.I));
    }
}
