package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class yx0 implements h5.d {
    public final int f40598a;
    public final ProfileActivity f40599b;

    public yx0(ProfileActivity profileActivity, int i10) {
        this.f40598a = i10;
        this.f40599b = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f40598a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.y8) {
                    org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                    ih.s sVar = y8Var.f22622a;
                    ProfileActivity profileActivity = this.f40599b;
                    sVar.setLoading(profileActivity.f32069f5);
                    y8Var.f22623b.setLoading(profileActivity.f32069f5);
                    return;
                }
                return;
            default:
                boolean z4 = view instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity2 = this.f40599b;
                if (z4) {
                    ((org.telegram.ui.Cells.m4) view).setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, profileActivity2.f32181w0));
                } else if (view instanceof org.telegram.ui.Cells.y8) {
                    ((org.telegram.ui.Cells.y8) view).e();
                } else if (view instanceof org.telegram.ui.Cells.o8) {
                    ((org.telegram.ui.Cells.o8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.j6.P1.linkColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19966gc, ((org.telegram.ui.Cells.j) view).F);
                } else if (view instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view).getCheckBox().invalidate();
                } else if (view instanceof uf.a1) {
                    uf.a1 a1Var = (uf.a1) view;
                    org.telegram.ui.Components.bq bqVar = a1Var.f45246r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.j6.f20103o6;
                    org.telegram.ui.ActionBar.f6 f6Var = a1Var.f45241a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.j6.l1(0.22f, v03);
                    bqVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    a1Var.a(v04);
                    bqVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.g6) {
                    ((org.telegram.ui.Cells.g6) view).e();
                }
                g01 g01Var = profileActivity2.d;
                profileActivity2.f32028a.getClass();
                RecyclerView.R(view);
                g01Var.getClass();
                profileActivity2.d.getClass();
                return;
        }
    }
}
