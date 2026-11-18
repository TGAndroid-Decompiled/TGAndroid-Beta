package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class xu0 extends v4.u0 {
    public final int f53915a;
    public final ProfileActivity f53916b;

    public xu0(ProfileActivity profileActivity, int i7) {
        this.f53915a = i7;
        this.f53916b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        View m10;
        switch (this.f53915a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f53916b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f53916b;
                boolean z11 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i7 != 2) {
                    profileActivity.G0 = false;
                }
                if (i7 == 0 && !profileActivity.G1 && (m10 = profileActivity.f43524c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.h5 h5Var = profileActivity.U0;
                if (h5Var != null) {
                    if (i7 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f43687z1 = z10;
                    if (z10 || profileActivity.f43622q2) {
                        z11 = false;
                    }
                    h5Var.setEnabled(z11);
                }
                vv0 vv0Var = profileActivity.O;
                boolean z12 = profileActivity.f43508a.J1;
                vv0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f53915a) {
            case 1:
                ProfileActivity profileActivity = this.f53916b;
                hi.m3 m3Var = profileActivity.X;
                boolean z10 = true;
                if (m3Var != null) {
                    m3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f43524c.N0() > profileActivity.f43683y4 - 8) {
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
