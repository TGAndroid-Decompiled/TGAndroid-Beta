package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sy0 implements e2.h {
    public final int f37499a;
    public final ProfileActivity f37500b;

    public sy0(ProfileActivity profileActivity, int i10) {
        this.f37499a = i10;
        this.f37500b = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f37499a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.c9) {
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    vh.o oVar = c9Var.f19880a;
                    ProfileActivity profileActivity = this.f37500b;
                    oVar.setLoading(profileActivity.f31302i5);
                    c9Var.f19881b.setLoading(profileActivity.f31302i5);
                    return;
                }
                return;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.l4;
                ProfileActivity profileActivity2 = this.f37500b;
                if (z10) {
                    ((org.telegram.ui.Cells.l4) view).setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L6, profileActivity2.f31412z0));
                } else if (view instanceof org.telegram.ui.Cells.c9) {
                    ((org.telegram.ui.Cells.c9) view).e();
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.i6.P1.linkColor = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, ((org.telegram.ui.Cells.j) view).I);
                } else if (view instanceof org.telegram.ui.Cells.i5) {
                    ((org.telegram.ui.Cells.i5) view).getCheckBox().invalidate();
                } else if (view instanceof hg.j1) {
                    hg.j1 j1Var = (hg.j1) view;
                    org.telegram.ui.Components.dq dqVar = j1Var.f10328r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.i6.f19038o6;
                    org.telegram.ui.ActionBar.e6 e6Var = j1Var.f10323a;
                    int v02 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
                    j1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.i6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
                    j1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.i6.l1(0.22f, v03);
                    dqVar.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.i6.v0(i10, e6Var);
                    j1Var.a(v04);
                    dqVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.g6) {
                    ((org.telegram.ui.Cells.g6) view).e();
                }
                z01 z01Var = profileActivity2.d;
                profileActivity2.f31238a.getClass();
                RecyclerView.R(view);
                z01Var.getClass();
                profileActivity2.d.getClass();
                return;
        }
    }
}
