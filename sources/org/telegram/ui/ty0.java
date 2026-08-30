package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class ty0 extends f2.z0 {
    public final int f38778a;
    public final ProfileActivity f38779b;

    public ty0(ProfileActivity profileActivity, int i10) {
        this.f38778a = i10;
        this.f38779b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z4;
        switch (this.f38778a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f38779b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f38779b;
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
                    profileActivity.f32182w1 = z4;
                    w0Var.setEnabled((z4 || profileActivity.f32113m2) ? false : false);
                }
                sz0 sz0Var = profileActivity.L;
                boolean z11 = profileActivity.f32028a.H1;
                sz0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f38778a) {
            case 1:
                ProfileActivity profileActivity = this.f38779b;
                org.telegram.ui.Components.k40 k40Var = profileActivity.U;
                boolean z4 = true;
                if (k40Var != null) {
                    k40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.f32202z1 != null && !profileActivity.A1 && profileActivity.f32043c.N0() > profileActivity.f32160s4 - 8) {
                    profileActivity.R3(false);
                }
                sz0 sz0Var = profileActivity.L;
                if (sz0Var.getY() > 0.0f) {
                    z4 = false;
                }
                sz0Var.setPinnedToTop(z4);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
