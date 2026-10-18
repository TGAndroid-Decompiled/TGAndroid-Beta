package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class qy0 extends s4.r0 {
    public final int f40521a;
    public final ProfileActivity f40522b;

    public qy0(ProfileActivity profileActivity, int i10) {
        this.f40521a = i10;
        this.f40522b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f40521a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f40522b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f40522b;
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
                    if (z10 || profileActivity.f33682q2) {
                        z11 = false;
                    }
                    u0Var.setEnabled(z11);
                }
                pz0 pz0Var = profileActivity.O;
                boolean z12 = profileActivity.f33568a.I1;
                pz0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f40521a) {
            case 1:
                ProfileActivity profileActivity = this.f40522b;
                org.telegram.ui.Components.r40 r40Var = profileActivity.X;
                boolean z10 = true;
                if (r40Var != null) {
                    r40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.D1 != null && !profileActivity.E1 && profileActivity.f33583c.N0() > profileActivity.f33728w4 - 8) {
                    profileActivity.R3(false);
                }
                pz0 pz0Var = profileActivity.O;
                if (pz0Var.getY() > 0.0f) {
                    z10 = false;
                }
                pz0Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
