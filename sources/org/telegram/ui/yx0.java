package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class yx0 implements Utilities.Callback {
    public final int f43971a;
    public final ProfileActivity f43972b;

    public yx0(ProfileActivity profileActivity, int i10) {
        this.f43971a = i10;
        this.f43972b = profileActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f43971a) {
            case 0:
                View view = (View) obj;
                if (view instanceof org.telegram.ui.Cells.c9) {
                    org.telegram.ui.Cells.c9 c9Var = (org.telegram.ui.Cells.c9) view;
                    wh.n nVar = c9Var.f22216a;
                    ProfileActivity profileActivity = this.f43972b;
                    nVar.setLoading(profileActivity.f33962k5);
                    c9Var.f22217b.setLoading(profileActivity.f33962k5);
                    return;
                }
                return;
            case 1:
                ProfileActivity.m0(this.f43972b, (Boolean) obj);
                return;
            case 2:
                ProfileActivity profileActivity2 = this.f43972b;
                profileActivity2.getClass();
                ArrayList arrayList = new ArrayList(1);
                arrayList.add((TLRPC.InputStickerSet) obj);
                profileActivity2.showDialog(new org.telegram.ui.Components.yv(profileActivity2, profileActivity2.getParentActivity(), profileActivity2.A0, arrayList));
                return;
            default:
                View view2 = (View) obj;
                boolean z10 = view2 instanceof org.telegram.ui.Cells.l4;
                ProfileActivity profileActivity3 = this.f43972b;
                if (z10) {
                    ((org.telegram.ui.Cells.l4) view2).setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L6, profileActivity3.A0));
                } else if (view2 instanceof org.telegram.ui.Cells.c9) {
                    ((org.telegram.ui.Cells.c9) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.r8) {
                    ((org.telegram.ui.Cells.r8) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.j) {
                    ((org.telegram.ui.Cells.j) view2).updateColors();
                } else if (view2 instanceof org.telegram.ui.Cells.i5) {
                    ((org.telegram.ui.Cells.i5) view2).getCheckBox().invalidate();
                } else if (view2 instanceof ig.h1) {
                    ig.h1 h1Var = (ig.h1) view2;
                    org.telegram.ui.Components.lq lqVar = h1Var.f12952r;
                    int dp = AndroidUtilities.dp(8.0f);
                    int i10 = org.telegram.ui.ActionBar.k6.f21387o6;
                    org.telegram.ui.ActionBar.g6 g6Var = h1Var.f12947a;
                    int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                    h1Var.a(w02);
                    int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, w02);
                    int w03 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                    h1Var.a(w03);
                    int o13 = org.telegram.ui.ActionBar.k6.o1(0.22f, w03);
                    lqVar.setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, o12, o13, o13));
                    int w04 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
                    h1Var.a(w04);
                    lqVar.setTextColor(w04);
                } else if (view2 instanceof org.telegram.ui.Cells.h6) {
                    ((org.telegram.ui.Cells.h6) view2).updateColors();
                }
                e01 e01Var = profileActivity3.d;
                profileActivity3.f33884a.getClass();
                RecyclerView.R(view2);
                e01Var.getClass();
                profileActivity3.d.getClass();
                return;
        }
    }
}
