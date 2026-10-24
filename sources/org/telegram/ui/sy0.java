package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sy0 extends s4.r0 {
    public final int f41826a;
    public final ProfileActivity f41827b;

    public sy0(ProfileActivity profileActivity, int i10) {
        this.f41826a = i10;
        this.f41827b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f41826a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f41827b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f41827b;
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
                    if (z10 || profileActivity.f33998q2) {
                        z11 = false;
                    }
                    u0Var.setEnabled(z11);
                }
                qz0 qz0Var = profileActivity.O;
                boolean z12 = profileActivity.f33884a.I1;
                qz0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f41826a) {
            case 1:
                ProfileActivity profileActivity = this.f41827b;
                org.telegram.ui.Components.p40 p40Var = profileActivity.X;
                boolean z10 = true;
                if (p40Var != null) {
                    p40Var.b(true);
                }
                profileActivity.C3();
                if (profileActivity.D1 != null && !profileActivity.E1 && profileActivity.f33899c.N0() > profileActivity.f34044w4 - 8) {
                    profileActivity.T3(false);
                }
                qz0 qz0Var = profileActivity.O;
                if (qz0Var.getY() > 0.0f) {
                    z10 = false;
                }
                qz0Var.setPinnedToTop(z10);
                profileActivity.Y4();
                return;
            default:
                return;
        }
    }
}
