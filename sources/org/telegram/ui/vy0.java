package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vy0 extends f2.i0 {
    public final ProfileActivity I;

    public vy0(ProfileActivity profileActivity) {
        this.I = profileActivity;
    }

    @Override
    public final int o0(int i10, af.h hVar, f2.i1 i1Var) {
        ProfileActivity profileActivity = this.I;
        View m9 = profileActivity.f32017c.m(0);
        if (m9 != null && !profileActivity.C0) {
            int top = m9.getTop() - profileActivity.T3();
            boolean z4 = profileActivity.f32081l2;
            boolean z10 = true;
            if (!z4 && top > i10) {
                if (!profileActivity.f32073k0.U0.isEmpty() && profileActivity.f32010b0.getImageReceiver().hasNotThumb() && !AndroidUtilities.isAccessibilityScreenReaderEnabled() && ((!profileActivity.f32075k2 && !AndroidUtilities.isTablet()) || profileActivity.F0)) {
                    if (profileActivity.G2 != null) {
                        z10 = false;
                    }
                    profileActivity.f32081l2 = z10;
                }
            } else if (z4) {
                if (i10 >= top) {
                    profileActivity.f32081l2 = false;
                } else if (profileActivity.f32002a.getScrollState() == 1 && !profileActivity.f32087m2) {
                    i10 /= 2;
                }
            }
            i10 = top;
        }
        if (profileActivity.L1 && !profileActivity.f32002a.L0) {
            return 0;
        }
        return super.o0(i10, hVar, i1Var);
    }

    @Override
    public final boolean y0() {
        if (this.I.f32093n0 != null) {
            return true;
        }
        return false;
    }
}
