package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class rz0 extends s4.r0 {
    public final int f39631a;
    public final ProfileActivity f39632b;

    public rz0(ProfileActivity profileActivity, int i10) {
        this.f39631a = i10;
        this.f39632b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f39631a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f39632b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f39632b;
                boolean z11 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i10 != 2) {
                    profileActivity.F0 = false;
                }
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                if (u0Var != null) {
                    if (i10 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f32406z1 = z10;
                    if (z10 || profileActivity.f32338p2) {
                        z11 = false;
                    }
                    u0Var.setEnabled(z11);
                }
                q01 q01Var = profileActivity.O;
                boolean z12 = profileActivity.f32230a.I1;
                q01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f39631a) {
            case 1:
                ProfileActivity profileActivity = this.f39632b;
                org.telegram.ui.Components.v40 v40Var = profileActivity.X;
                boolean z10 = true;
                if (v40Var != null) {
                    v40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f32245c.N0() > profileActivity.f32382v4 - 8) {
                    profileActivity.R3(false);
                }
                q01 q01Var = profileActivity.O;
                if (q01Var.getY() > 0.0f) {
                    z10 = false;
                }
                q01Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
