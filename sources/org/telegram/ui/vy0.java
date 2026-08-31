package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vy0 extends f2.a1 {
    public final int f42319a;
    public final ProfileActivity f42320b;

    public vy0(ProfileActivity profileActivity, int i10) {
        this.f42319a = i10;
        this.f42320b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        switch (this.f42319a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f42320b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f42320b;
                boolean z10 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.C0 && i10 != 2) {
                    profileActivity.C0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                if (w0Var != null) {
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    profileActivity.f34715w1 = z4;
                    w0Var.setEnabled((z4 || profileActivity.f34646m2) ? false : false);
                }
                uz0 uz0Var = profileActivity.L;
                boolean z11 = profileActivity.f34560a.H1;
                uz0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f42319a) {
            case 1:
                ProfileActivity profileActivity = this.f42320b;
                org.telegram.ui.Components.m40 m40Var = profileActivity.U;
                boolean z4 = true;
                if (m40Var != null) {
                    m40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.f34735z1 != null && !profileActivity.A1 && profileActivity.f34575c.N0() > profileActivity.f34693s4 - 8) {
                    profileActivity.R3(false);
                }
                uz0 uz0Var = profileActivity.L;
                if (uz0Var.getY() > 0.0f) {
                    z4 = false;
                }
                uz0Var.setPinnedToTop(z4);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
