package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class xy0 implements Utilities.Callback {
    public final int f41990a;
    public final ProfileActivity f41991b;

    public xy0(ProfileActivity profileActivity, int i10) {
        this.f41990a = i10;
        this.f41991b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f41990a) {
            case 0:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.c9) {
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    wh.n nVar = c9Var.f21034a;
                    ProfileActivity profileActivity = this.f41991b;
                    nVar.setLoading(profileActivity.f32592i5);
                    c9Var.f21035b.setLoading(profileActivity.f32592i5);
                    return;
                }
                return;
            case 1:
                ProfileActivity profileActivity2 = this.f41991b;
                profileActivity2.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity2.showDialog(new org.telegram.ui.Components.ew(profileActivity2, profileActivity2.getParentActivity(), profileActivity2.f32703z0, arrayList));
                return;
            case 2:
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.m4;
                ProfileActivity profileActivity3 = this.f41991b;
                if (z10) {
                    ((org.telegram.ui.Cells.m4) view2).setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L6, profileActivity3.f32703z0));
                } else if (view2 instanceof org.telegram.ui.Cells.c9) {
                    ((org.telegram.ui.Cells.c9) view2).e();
                } else if (view2 instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view2).v();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    org.telegram.ui.ActionBar.g6.P1.linkColor = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, ((org.telegram.ui.Cells.j) view2).I);
                } else if (view2 instanceof org.telegram.ui.Cells.j5) {
                    ((org.telegram.ui.Cells.j5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof ig.j1) {
                    ig.j1 j1Var = (ig.j1) view2;
                    org.telegram.ui.Components.qq qqVar = j1Var.f11546r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.g6.f20104o6;
                    org.telegram.ui.ActionBar.c6 c6Var = j1Var.f11541a;
                    int w02 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
                    j1Var.a(w02);
                    int m12 = org.telegram.ui.ActionBar.g6.m1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
                    j1Var.a(w03);
                    int m13 = org.telegram.ui.ActionBar.g6.m1(0.22f, w03);
                    qqVar.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, m12, m13, m13));
                    int w04 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
                    j1Var.a(w04);
                    qqVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) view2).d();
                }
                f11 f11Var = profileActivity3.d;
                profileActivity3.f32528a.getClass();
                RecyclerView.R(view2);
                f11Var.getClass();
                profileActivity3.d.getClass();
                return;
            default:
                ProfileActivity.e0(this.f41991b, (Boolean) obj);
                return;
        }
    }
}
