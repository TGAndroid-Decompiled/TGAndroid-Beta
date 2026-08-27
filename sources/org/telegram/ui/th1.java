package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class th1 extends org.telegram.ui.ActionBar.j {

    public final WallpapersListActivity f42949a;

    public th1(WallpapersListActivity wallpapersListActivity) {
        this.f42949a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        WallpapersListActivity wallpapersListActivity = this.f42949a;
        LongSparseArray longSparseArray = wallpapersListActivity.f36312e0;
        if (i10 == -1) {
            if (!((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar.t()) {
                wallpapersListActivity.finishFragment();
                return;
            }
            longSparseArray.clear();
            ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).actionBar.s();
            wallpapersListActivity.D0();
            return;
        }
        if (i10 != 4) {
            if (i10 == 3) {
                gy gyVar = new gy(org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true));
                gyVar.f38621y2 = new sh1(this);
                wallpapersListActivity.presentFragment(gyVar);
                return;
            }
            return;
        }
        if (wallpapersListActivity.getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
        alertDialog$Builder.f22702a.P = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new sh1(this));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        wallpapersListActivity.showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
        }
    }
}
