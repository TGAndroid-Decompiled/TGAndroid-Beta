package org.telegram.ui;

import android.util.LongSparseArray;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vh1 extends org.telegram.ui.ActionBar.j {
    public final WallpapersListActivity f42748a;

    public vh1(WallpapersListActivity wallpapersListActivity) {
        this.f42748a = wallpapersListActivity;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        WallpapersListActivity wallpapersListActivity = this.f42748a;
        LongSparseArray longSparseArray = wallpapersListActivity.f35533i0;
        if (i10 == -1) {
            kVar = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
            if (kVar.s()) {
                longSparseArray.clear();
                kVar2 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).actionBar;
                kVar2.r();
                wallpapersListActivity.D0();
                return;
            }
            wallpapersListActivity.finishFragment();
        } else if (i10 == 4) {
            if (wallpapersListActivity.getParentActivity() != null) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wallpapersListActivity.getParentActivity());
                alertDialog$Builder.f20679a.R = LocaleController.formatPluralString("DeleteBackground", longSparseArray.size(), new Object[0]);
                alertDialog$Builder.f20679a.T = LocaleController.formatString("DeleteChatBackgroundsAlert", R.string.DeleteChatBackgroundsAlert, new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new uh1(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                wallpapersListActivity.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                }
            }
        } else if (i10 == 3) {
            ey eyVar = new ey(org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true));
            eyVar.C2 = new uh1(this);
            wallpapersListActivity.presentFragment(eyVar);
        }
    }
}
