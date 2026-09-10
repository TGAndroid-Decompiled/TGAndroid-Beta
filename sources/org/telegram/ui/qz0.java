package org.telegram.ui;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class qz0 extends s4.s0 {
    public final int f36159a;
    public final ProfileActivity f36160b;

    public qz0(ProfileActivity profileActivity, int i10) {
        this.f36159a = i10;
        this.f36160b = profileActivity;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i10) {
        boolean z10;
        switch (this.f36159a) {
            case 0:
                if (i10 == 1) {
                    AndroidUtilities.hideKeyboard(this.f36160b.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity = this.f36160b;
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
                    profileActivity.f30525z1 = z10;
                    w0Var.setEnabled((z10 || profileActivity.f30457p2) ? false : false);
                }
                r01 r01Var = profileActivity.O;
                boolean z12 = profileActivity.f30350a.K1;
                r01Var.getClass();
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i10, int i11) {
        switch (this.f36159a) {
            case 1:
                ProfileActivity profileActivity = this.f36160b;
                org.telegram.ui.Components.s40 s40Var = profileActivity.X;
                boolean z10 = true;
                if (s40Var != null) {
                    s40Var.b(true);
                }
                profileActivity.A3();
                if (profileActivity.C1 != null && !profileActivity.D1 && profileActivity.f30365c.N0() > profileActivity.f30501v4 - 8) {
                    profileActivity.R3(false);
                }
                r01 r01Var = profileActivity.O;
                if (r01Var.getY() > 0.0f) {
                    z10 = false;
                }
                r01Var.setPinnedToTop(z10);
                profileActivity.U4();
                return;
            default:
                return;
        }
    }
}
