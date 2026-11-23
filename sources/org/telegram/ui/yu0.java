package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class yu0 extends v4.t0 {
    public final int f54260a;
    public final ProfileActivity f54261b;

    public yu0(ProfileActivity profileActivity, int i7) {
        this.f54260a = i7;
        this.f54261b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        View m10;
        switch (this.f54260a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f54261b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f54261b;
                boolean z11 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i7 != 2) {
                    profileActivity.G0 = false;
                }
                if (i7 == 0 && !profileActivity.G1 && (m10 = profileActivity.f43534c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                if (g5Var != null) {
                    if (i7 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f43697z1 = z10;
                    if (z10 || profileActivity.f43632q2) {
                        z11 = false;
                    }
                    g5Var.setEnabled(z11);
                }
                wv0 wv0Var = profileActivity.O;
                boolean z12 = profileActivity.f43518a.J1;
                wv0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f54260a) {
            case 1:
                ProfileActivity profileActivity = this.f54261b;
                hi.l3 l3Var = profileActivity.X;
                boolean z10 = true;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                profileActivity.O3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f43534c.N0() > profileActivity.f43693y4 - 8) {
                    profileActivity.h4(false);
                }
                wv0 wv0Var = profileActivity.O;
                if (wv0Var.getY() > 0.0f) {
                    z10 = false;
                }
                wv0Var.setPinnedToTop(z10);
                profileActivity.s5();
                return;
            default:
                return;
        }
    }
}
