package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qy0 implements Utilities.Callback {
    public final int f41317a;
    public final ProfileActivity f41318b;

    public qy0(ProfileActivity profileActivity, int i10) {
        this.f41317a = i10;
        this.f41318b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41317a) {
            case 0:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.c9) {
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    vh.n nVar = c9Var.f21959a;
                    ProfileActivity profileActivity = this.f41318b;
                    nVar.setLoading(profileActivity.f34338i5);
                    c9Var.f21960b.setLoading(profileActivity.f34338i5);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f41318b;
                profileActivity2.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity2.showDialog(new org.telegram.ui.Components.jw(profileActivity2, profileActivity2.getParentActivity(), profileActivity2.f34448z0, arrayList));
                return;
            case 2:
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity3 = this.f41318b;
                if (z10) {
                    ((org.telegram.ui.Cells.m4) view2).setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L6, profileActivity3.f34448z0));
                } else if (view2 instanceof org.telegram.ui.Cells.c9) {
                    ((org.telegram.ui.Cells.c9) view2).e();
                } else if (view2 instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view2).v();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.h6.P1.linkColor = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, ((org.telegram.ui.Cells.j) view2).I);
                } else if (view2 instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof hg.j1) {
                    hg.j1 j1Var = (hg.j1) view2;
                    org.telegram.ui.Components.tq tqVar = j1Var.f11285r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.h6.f21025o6;
                    org.telegram.ui.ActionBar.d6 d6Var = j1Var.f11279a;
                    int w02 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    j1Var.a(w02);
                    int m12 = org.telegram.ui.ActionBar.h6.m1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    j1Var.a(w03);
                    int m13 = org.telegram.ui.ActionBar.h6.m1(0.22f, w03);
                    tqVar.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, m12, m13, m13));
                    int w04 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
                    j1Var.a(w04);
                    tqVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) view2).e();
                }
                x01 x01Var = profileActivity3.d;
                profileActivity3.f34273a.getClass();
                RecyclerView.R(view2);
                x01Var.getClass();
                profileActivity3.d.getClass();
                return;
            default:
                ProfileActivity.e0(this.f41318b, (Boolean) obj);
                return;
        }
    }
}
