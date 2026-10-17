package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xx0 implements Utilities.Callback {
    public final int f43286a;
    public final ProfileActivity f43287b;

    public xx0(ProfileActivity profileActivity, int i10) {
        this.f43286a = i10;
        this.f43287b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43286a) {
            case 0:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.b9) {
                    org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                    wh.n nVar = b9Var.f22056a;
                    ProfileActivity profileActivity = this.f43287b;
                    nVar.setLoading(profileActivity.f33646k5);
                    b9Var.f22057b.setLoading(profileActivity.f33646k5);
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.l4;
                ProfileActivity profileActivity2 = this.f43287b;
                if (z10) {
                    ((org.telegram.ui.Cells.l4) view2).setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, profileActivity2.A0));
                } else if (view2 instanceof org.telegram.ui.Cells.b9) {
                    ((org.telegram.ui.Cells.b9) view2).e();
                } else if (view2 instanceof org.telegram.ui.Cells.q8) {
                    ((org.telegram.ui.Cells.q8) view2).v();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.h6.P1.linkColor = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, ((org.telegram.ui.Cells.j) view2).I);
                } else if (view2 instanceof org.telegram.ui.Cells.i5) {
                    ((org.telegram.ui.Cells.i5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof ig.g1) {
                    ig.g1 g1Var = (ig.g1) view2;
                    org.telegram.ui.Components.nq nqVar = g1Var.f12913r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.h6.f21189o6;
                    org.telegram.ui.ActionBar.d6 d6Var = g1Var.f12908a;
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    g1Var.a(w02);
                    int m12 = org.telegram.ui.ActionBar.h6.m1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    g1Var.a(w03);
                    int m13 = org.telegram.ui.ActionBar.h6.m1(0.22f, w03);
                    nqVar.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, m12, m13, m13));
                    int w04 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    g1Var.a(w04);
                    nqVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.g6) {
                    ((org.telegram.ui.Cells.g6) view2).d();
                }
                d01 d01Var = profileActivity2.d;
                profileActivity2.f33568a.getClass();
                RecyclerView.R(view2);
                d01Var.getClass();
                profileActivity2.d.getClass();
                return;
            case 2:
                ProfileActivity.m0(this.f43287b, (Boolean) obj);
                return;
            default:
                ProfileActivity profileActivity3 = this.f43287b;
                profileActivity3.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity3.showDialog(new org.telegram.ui.Components.aw(profileActivity3, profileActivity3.getParentActivity(), profileActivity3.A0, arrayList));
                return;
        }
    }
}
