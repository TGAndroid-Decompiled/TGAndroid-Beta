package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sy0 implements e2.h {
    public final int f37594a;
    public final ProfileActivity f37595b;

    public sy0(ProfileActivity profileActivity, int i10) {
        this.f37594a = i10;
        this.f37595b = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f37594a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.d9) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    vh.n nVar = d9Var.f20155a;
                    ProfileActivity profileActivity = this.f37595b;
                    nVar.setLoading(profileActivity.f31607i5);
                    d9Var.f20156b.setLoading(profileActivity.f31607i5);
                    return;
                }
                return;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.n4;
                ProfileActivity profileActivity2 = this.f37595b;
                if (z10) {
                    ((org.telegram.ui.Cells.n4) view).setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, profileActivity2.f31717z0));
                } else if (view instanceof org.telegram.ui.Cells.d9) {
                    ((org.telegram.ui.Cells.d9) view).e();
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.j6.P1.linkColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, ((org.telegram.ui.Cells.j) view).I);
                } else if (view instanceof org.telegram.ui.Cells.k5) {
                    ((org.telegram.ui.Cells.k5) view).getCheckBox().invalidate();
                } else if (view instanceof hg.j1) {
                    hg.j1 j1Var = (hg.j1) view;
                    org.telegram.ui.Components.dq dqVar = j1Var.f10334r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.j6.f19311o6;
                    org.telegram.ui.ActionBar.f6 f6Var = j1Var.f10329a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    j1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    j1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.j6.l1(0.22f, v03);
                    dqVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    j1Var.a(v04);
                    dqVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.i6) {
                    ((org.telegram.ui.Cells.i6) view).e();
                }
                z01 z01Var = profileActivity2.d;
                profileActivity2.f31543a.getClass();
                RecyclerView.S(view);
                z01Var.getClass();
                profileActivity2.d.getClass();
                return;
        }
    }
}
