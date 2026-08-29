package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wh1 extends org.telegram.ui.ActionBar.k {
    public final WallpapersListActivity f44310a;

    public wh1(WallpapersListActivity wallpapersListActivity) {
        this.f44310a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        WallpapersListActivity wallpapersListActivity = this.f44310a;
        LongSparseArray longSparseArray = wallpapersListActivity.f36374e0;
        if (i10 == -1) {
            lVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
            if (lVar.s()) {
                longSparseArray.clear();
                lVar2 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
                lVar2.r();
                wallpapersListActivity.D0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i10 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f22714a.P = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new vh1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                wallpapersListActivity.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                }
            }
        } else if (i10 == 3) {
            fy fyVar = new fy(org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true));
            fyVar.f38379y2 = new vh1(this);
            wallpapersListActivity.presentFragment(fyVar);
        }
    }
}
