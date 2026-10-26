package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ry0 extends s4.c0 {
    public final ProfileActivity I;

    public ry0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, rf.e eVar, s4.b1 b1Var) {
        ProfileActivity profileActivity = this.I;
        View m10 = profileActivity.f35963c.m(0);
        if (m10 != null && !profileActivity.F0) {
            int top = m10.getTop() - profileActivity.c4();
            boolean z10 = profileActivity.f36049o2;
            boolean z11 = true;
            if (!z10 && top > i10) {
                if (!profileActivity.f36040n0.X0.isEmpty() && profileActivity.f35978e0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f36042n2 && !AndroidUtilities.isTablet()) || profileActivity.I0)) {
                    if (profileActivity.J2 != null) {
                        z11 = false;
                    }
                    profileActivity.f36049o2 = z11;
                }
            } else if (z10) {
                if (i10 >= top) {
                    profileActivity.f36049o2 = false;
                } else if (profileActivity.f35948a.getScrollState() == 1 && !profileActivity.f36056p2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.O1 && !profileActivity.f35948a.P0) {
            return 0;
        }
        return super.o0(i10, eVar, b1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f36061q0 != null) {
            return true;
        }
        return false;
    }
}
