package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ty0 extends s4.r0 {
    public final int f42097a;
    public final ProfileActivity f42098b;

    public ty0(ProfileActivity profileActivity, int i10) {
        this.f42097a = i10;
        this.f42098b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f42097a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f42098b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f42098b;
                boolean z11 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.G0 && i10 != 2) {
                    profileActivity.G0 = false;
                }
                org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                if (u0Var != null) {
                    if (i10 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.A1 = z10;
                    if (z10 || profileActivity.f33996q2) {
                        z11 = false;
                    }
                    u0Var.setEnabled(z11);
                }
                rz0 rz0Var = profileActivity.O;
                boolean z12 = profileActivity.f33882a.I1;
                rz0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f42097a) {
            case 1:
                ProfileActivity profileActivity = this.f42098b;
                org.telegram.ui.Components.r40 r40Var = profileActivity.X;
                boolean z10 = true;
                if (r40Var != null) {
                    r40Var.b(true);
                }
                profileActivity.C3();
                if (profileActivity.D1 != null && !profileActivity.E1 && profileActivity.f33897c.N0() > profileActivity.f34042w4 - 8) {
                    profileActivity.T3(false);
                }
                rz0 rz0Var = profileActivity.O;
                if (rz0Var.getY() > 0.0f) {
                    z10 = false;
                }
                rz0Var.setPinnedToTop(z10);
                profileActivity.Y4();
                return;
            default:
                return;
        }
    }
}
