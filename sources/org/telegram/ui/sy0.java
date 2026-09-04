package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class sy0 implements e2.h {
    public final int f40571a;
    public final ProfileActivity f40572b;

    public sy0(ProfileActivity profileActivity, int i10) {
        this.f40571a = i10;
        this.f40572b = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f40571a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.c9) {
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    wh.p pVar = c9Var.f21704a;
                    ProfileActivity profileActivity = this.f40572b;
                    pVar.setLoading(profileActivity.f33921i5);
                    c9Var.f21705b.setLoading(profileActivity.f33921i5);
                    return;
                }
                return;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.l4;
                ProfileActivity profileActivity2 = this.f40572b;
                if (z10) {
                    ((org.telegram.ui.Cells.l4) view).setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, profileActivity2.f34031z0));
                } else if (view instanceof org.telegram.ui.Cells.c9) {
                    ((org.telegram.ui.Cells.c9) view).e();
                } else if (view instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.j6.P1.linkColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, ((org.telegram.ui.Cells.j) view).I);
                } else if (view instanceof org.telegram.ui.Cells.i5) {
                    ((org.telegram.ui.Cells.i5) view).getCheckBox().invalidate();
                } else if (view instanceof ig.j1) {
                    ig.j1 j1Var = (ig.j1) view;
                    org.telegram.ui.Components.cq cqVar = j1Var.f12117r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.j6.f20862o6;
                    org.telegram.ui.ActionBar.f6 f6Var = j1Var.f12111a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    j1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    j1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.j6.l1(0.22f, v03);
                    cqVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    j1Var.a(v04);
                    cqVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.g6) {
                    ((org.telegram.ui.Cells.g6) view).d();
                }
                a11 a11Var = profileActivity2.d;
                profileActivity2.f33856a.getClass();
                RecyclerView.R(view);
                a11Var.getClass();
                profileActivity2.d.getClass();
                return;
        }
    }
}
