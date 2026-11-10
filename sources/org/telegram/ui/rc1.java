package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class rc1 extends org.telegram.ui.ActionBar.k {
    public final WallpapersListActivity f49389a;

    public rc1(WallpapersListActivity wallpapersListActivity) {
        this.f49389a = wallpapersListActivity;
    }

    @Override
    public final void b(int i7) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        WallpapersListActivity wallpapersListActivity = this.f49389a;
        LongSparseArray longSparseArray = wallpapersListActivity.f43498e0;
        if (i7 == -1) {
            z4Var = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
            if (z4Var.u()) {
                longSparseArray.clear();
                z4Var2 = ((org.telegram.ui.ActionBar.f2) wallpapersListActivity).simpleActionBar;
                z4Var2.t();
                wallpapersListActivity.I0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i7 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                String G = org.telegram.messenger.id.G(longSparseArray.size(), "DeleteBackground", new Object[0]);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = G;
                u1Var.T = org.telegram.messenger.id.a0("DeleteChatBackgroundsAlert", null, 2131751554, new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new qc1(this));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                wallpapersListActivity.showDialog(u1Var);
                TextView textView = (TextView) u1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
                }
            }
        } else if (i7 == 3) {
            zw zwVar = new zw(org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true));
            zwVar.D2 = new qc1(this);
            wallpapersListActivity.presentFragment(zwVar);
        }
    }
}
