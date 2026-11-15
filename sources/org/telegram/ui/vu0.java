package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class vu0 extends v4.t0 {
    public final int f52299a;
    public final ProfileActivity f52300b;

    public vu0(ProfileActivity profileActivity, int i7) {
        this.f52299a = i7;
        this.f52300b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        View m10;
        switch (this.f52299a) {
            case 0:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(this.f52300b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f52300b;
                boolean z11 = true;
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i7 != 2) {
                    profileActivity.G0 = false;
                }
                if (i7 == 0 && !profileActivity.G1 && (m10 = profileActivity.f43078c.m(0)) != null) {
                    ProfileActivity.R0(profileActivity, m10, 0.0f);
                }
                org.telegram.ui.ActionBar.d5 d5Var = profileActivity.U0;
                if (d5Var != null) {
                    if (i7 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f43241z1 = z10;
                    if (z10 || profileActivity.f43176q2) {
                        z11 = false;
                    }
                    d5Var.setEnabled(z11);
                }
                uv0 uv0Var = profileActivity.O;
                boolean z12 = profileActivity.f43062a.J1;
                uv0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f52299a) {
            case 1:
                ProfileActivity profileActivity = this.f52300b;
                hi.l3 l3Var = profileActivity.X;
                boolean z10 = true;
                if (l3Var != null) {
                    l3Var.f(true);
                }
                profileActivity.N3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f43078c.N0() > profileActivity.f43221w4 - 8) {
                    profileActivity.g4(false);
                }
                uv0 uv0Var = profileActivity.O;
                if (uv0Var.getY() > 0.0f) {
                    z10 = false;
                }
                uv0Var.setPinnedToTop(z10);
                profileActivity.r5();
                return;
            default:
                return;
        }
    }
}
