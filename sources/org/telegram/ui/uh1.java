package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class uh1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f43260a;

    public uh1(WallpapersListActivity wallpapersListActivity) {
        this.f43260a = wallpapersListActivity;
    }

    @Override
    public final void b(int i9) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        WallpapersListActivity wallpapersListActivity = this.f43260a;
        LongSparseArray longSparseArray = wallpapersListActivity.f36309e0;
        if (i9 == -1) {
            kVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
            if (kVar.s()) {
                longSparseArray.clear();
                kVar2 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
                kVar2.r();
                wallpapersListActivity.C0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i9 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f22702a.P = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new th1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                wallpapersListActivity.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                }
            }
        } else if (i9 == 3) {
            dy dyVar = new dy(org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true));
            dyVar.f37752y2 = new th1(this);
            wallpapersListActivity.presentFragment(dyVar);
        }
    }
}
