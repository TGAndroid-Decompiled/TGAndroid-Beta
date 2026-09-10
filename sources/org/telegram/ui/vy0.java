package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
public final class vy0 implements e2.h {
    public final int f37655a;
    public final ProfileActivity f37656b;

    public vy0(ProfileActivity profileActivity, int i10) {
        this.f37655a = i10;
        this.f37656b = profileActivity;
    }

    @Override
    public final void accept(Object obj) {
        View view = (View) obj;
        switch (this.f37655a) {
            case 0:
                if (view instanceof org.telegram.ui.Cells.d9) {
                    org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                    uh.o oVar = d9Var.f19011a;
                    ProfileActivity profileActivity = this.f37656b;
                    oVar.setLoading(profileActivity.f30414i5);
                    d9Var.f19012b.setLoading(profileActivity.f30414i5);
                    return;
                }
                return;
            default:
                boolean z10 = view instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity2 = this.f37656b;
                if (z10) {
                    ((org.telegram.ui.Cells.m4) view).setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L6, profileActivity2.f30524z0));
                } else if (view instanceof org.telegram.ui.Cells.d9) {
                    ((org.telegram.ui.Cells.d9) view).e();
                } else if (view instanceof org.telegram.ui.Cells.s8) {
                    ((org.telegram.ui.Cells.s8) view).v();
                } else if (view instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.j6.P1.linkColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, ((org.telegram.ui.Cells.j) view).I);
                } else if (view instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view).getCheckBox().invalidate();
                } else if (view instanceof gg.p1) {
                    gg.p1 p1Var = (gg.p1) view;
                    org.telegram.ui.Components.jq jqVar = p1Var.f9007r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.j6.f18126o6;
                    org.telegram.ui.ActionBar.f6 f6Var = p1Var.f9002a;
                    int v02 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    p1Var.a(v02);
                    int l1 = org.telegram.ui.ActionBar.j6.l1(0.1f, v02);
                    int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    p1Var.a(v03);
                    int l12 = org.telegram.ui.ActionBar.j6.l1(0.22f, v03);
                    jqVar.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
                    int v04 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
                    p1Var.a(v04);
                    jqVar.setTextColor(v04);
                } else if (view instanceof org.telegram.ui.Cells.i6) {
                    ((org.telegram.ui.Cells.i6) view).e();
                }
                f11 f11Var = profileActivity2.d;
                profileActivity2.f30350a.getClass();
                RecyclerView.R(view);
                f11Var.getClass();
                profileActivity2.d.getClass();
                return;
        }
    }
}
