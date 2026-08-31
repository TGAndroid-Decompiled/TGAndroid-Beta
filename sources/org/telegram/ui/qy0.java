package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class qy0 extends f2.j0 {
    public final ProfileActivity I;

    public qy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, bf.f fVar, f2.j1 j1Var) {
        ProfileActivity profileActivity = this.I;
        View m9 = profileActivity.f34575c.m(0);
        if (m9 != null && !profileActivity.C0) {
            int top = m9.getTop() - profileActivity.T3();
            boolean z4 = profileActivity.f34640l2;
            boolean z10 = true;
            if (!z4 && top > i10) {
                if (!profileActivity.f34632k0.U0.isEmpty() && profileActivity.f34568b0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f34634k2 && !AndroidUtilities.isTablet()) || profileActivity.F0)) {
                    if (profileActivity.G2 != null) {
                        z10 = false;
                    }
                    profileActivity.f34640l2 = z10;
                }
            } else if (z4) {
                if (i10 >= top) {
                    profileActivity.f34640l2 = false;
                } else if (profileActivity.f34560a.getScrollState() == 1 && !profileActivity.f34646m2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.L1 && !profileActivity.f34560a.L0) {
            return 0;
        }
        return super.o0(i10, fVar, j1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f34652n0 != null) {
            return true;
        }
        return false;
    }
}
