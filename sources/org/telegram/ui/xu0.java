package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xu0 extends v4.s0 {
    public final int f51989a;
    public final ProfileActivity f51990b;

    public xu0(ProfileActivity profileActivity, int i7) {
        this.f51989a = i7;
        this.f51990b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z9;
        View m10;
        switch (this.f51989a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f51990b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f51990b;
                boolean z10 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i7 != 2) {
                    profileActivity.F0 = false;
                }
                if (i7 == 0 && !profileActivity.F1 && (m10 = profileActivity.f41704c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.f5 f5Var = profileActivity.T0;
                if (f5Var != null) {
                    if (i7 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    profileActivity.f41860y1 = z9;
                    if (z9 || profileActivity.f41789o2) {
                        z10 = false;
                    }
                    f5Var.setEnabled(z10);
                }
                vv0 vv0Var = profileActivity.N;
                boolean z11 = profileActivity.f41688a.I1;
                vv0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f51989a) {
            case 1:
                ProfileActivity profileActivity = this.f51990b;
                fi.m3 m3Var = profileActivity.W;
                boolean z9 = true;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.B1 != null && !profileActivity.C1 && profileActivity.f41704c.N0() > profileActivity.f41832u4 - 8) {
                    profileActivity.h4(false);
                }
                vv0 vv0Var = profileActivity.N;
                if (vv0Var.getY() > 0.0f) {
                    z9 = false;
                }
                vv0Var.setPinnedToTop(z9);
                profileActivity.p5();
                return;
            default:
                return;
        }
    }
}
