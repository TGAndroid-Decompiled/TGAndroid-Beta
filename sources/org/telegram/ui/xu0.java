package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xu0 extends v4.u0 {
    public final int f53968a;
    public final ProfileActivity f53969b;

    public xu0(ProfileActivity profileActivity, int i7) {
        this.f53968a = i7;
        this.f53969b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        View m10;
        switch (this.f53968a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f53969b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f53969b;
                boolean z11 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i7 != 2) {
                    profileActivity.G0 = false;
                }
                if (i7 == 0 && !profileActivity.G1 && (m10 = profileActivity.f43569c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                if (g5Var != null) {
                    if (i7 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f43732z1 = z10;
                    if (z10 || profileActivity.f43667q2) {
                        z11 = false;
                    }
                    g5Var.setEnabled(z11);
                }
                vv0 vv0Var = profileActivity.O;
                boolean z12 = profileActivity.f43553a.J1;
                vv0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f53968a) {
            case 1:
                ProfileActivity profileActivity = this.f53969b;
                hi.l3 l3Var = profileActivity.X;
                boolean z10 = true;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f43569c.N0() > profileActivity.f43728y4 - 8) {
                    profileActivity.h4(false);
                }
                vv0 vv0Var = profileActivity.O;
                if (vv0Var.getY() > 0.0f) {
                    z10 = false;
                }
                vv0Var.setPinnedToTop(z10);
                profileActivity.s5();
                return;
            default:
                return;
        }
    }
}
