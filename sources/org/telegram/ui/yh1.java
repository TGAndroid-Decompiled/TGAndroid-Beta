package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yh1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f46068a;

    public yh1(WallpapersListActivity wallpapersListActivity) {
        this.f46068a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        WallpapersListActivity wallpapersListActivity = this.f46068a;
        LongSparseArray longSparseArray = wallpapersListActivity.f37591e0;
        if (i10 == -1) {
            r5Var = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).simpleActionBar;
            if (r5Var.o()) {
                longSparseArray.clear();
                r5Var2 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).simpleActionBar;
                r5Var2.n();
                wallpapersListActivity.E0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i10 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f22366a.R = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f22366a.T = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new xh1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                wallpapersListActivity.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, null);
                }
            }
        } else if (i10 == 3) {
            cy cyVar = new cy(org.telegram.messenger.vh.c(3, "onlySelect", "dialogsType", true));
            cyVar.C2 = new xh1(this);
            wallpapersListActivity.presentFragment(cyVar);
        }
    }
}
