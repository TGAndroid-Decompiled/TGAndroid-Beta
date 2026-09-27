package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ti1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f37828a;

    public ti1(WallpapersListActivity wallpapersListActivity) {
        this.f37828a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        WallpapersListActivity wallpapersListActivity = this.f37828a;
        LongSparseArray longSparseArray = wallpapersListActivity.f31920g0;
        if (i10 == -1) {
            lVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
            if (lVar.t()) {
                longSparseArray.clear();
                lVar2 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
                lVar2.s();
                wallpapersListActivity.D0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i10 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f18655a.R = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f18655a.T = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new ri1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                wallpapersListActivity.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19297q7, false));
                }
            }
        } else if (i10 == 3) {
            ty tyVar = new ty(org.telegram.messenger.qk.e(3, "onlySelect", "dialogsType", true));
            tyVar.C2 = new ri1(this);
            wallpapersListActivity.presentFragment(tyVar);
        }
    }
}
