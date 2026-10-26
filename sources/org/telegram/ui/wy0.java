package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class wy0 extends s4.u0 {
    public final int f45589a;
    public final ProfileActivity f45590b;

    public wy0(ProfileActivity profileActivity, int i10) {
        this.f45589a = i10;
        this.f45590b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f45589a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f45590b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f45590b;
                boolean z11 = true;
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(profileActivity.getParentActivity().getCurrentFocus());
                }
                if (profileActivity.F0 && i10 != 2) {
                    profileActivity.F0 = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var = profileActivity.U0;
                if (w0Var != null) {
                    if (i10 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    profileActivity.f36127z1 = z10;
                    if (z10 || profileActivity.f36056p2) {
                        z11 = false;
                    }
                    w0Var.setEnabled(z11);
                }
                vz0 vz0Var = profileActivity.N;
                boolean z12 = profileActivity.f35948a.I1;
                vz0Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f45589a) {
            case 1:
                ProfileActivity profileActivity = this.f45590b;
                org.telegram.ui.Components.t40 t40Var = profileActivity.W;
                boolean z10 = true;
                if (t40Var != null) {
                    t40Var.b(true);
                }
                profileActivity.I3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f35963c.N0() > profileActivity.A4 - 8) {
                    profileActivity.a4(false);
                }
                vz0 vz0Var = profileActivity.N;
                if (vz0Var.getY() > 0.0f) {
                    z10 = false;
                }
                vz0Var.setPinnedToTop(z10);
                profileActivity.g5();
                return;
            default:
                return;
        }
    }
}
