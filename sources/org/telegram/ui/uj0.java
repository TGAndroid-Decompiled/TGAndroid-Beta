package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class uj0 implements Runnable {

    public final int f43241a;

    public final NotificationsCustomSettingsActivity f43242b;

    public final View f43243c;
    public final int d;

    public uj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f43241a = i11;
        this.f43242b = notificationsCustomSettingsActivity;
        this.f43243c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f43241a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43242b;
                ArrayList arrayList = notificationsCustomSettingsActivity.E;
                View view = this.f43243c;
                if (!(view instanceof org.telegram.ui.Cells.r8)) {
                    notificationsCustomSettingsActivity.l0(true);
                } else {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((zj0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((org.telegram.ui.Cells.r8) view).b(notificationsCustomSettingsActivity.f0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                }
                break;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f43242b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.E;
                View view2 = this.f43243c;
                if (!(view2 instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity2.l0(true);
                } else {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((zj0) arrayList2.get(i11)).f45192f = notificationsCustomSettingsActivity2.g0();
                    }
                    org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view2;
                    x9Var.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.g0(), true, x9Var.h);
                }
                break;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f43242b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.E;
                View view3 = this.f43243c;
                if (!(view3 instanceof org.telegram.ui.Cells.x9)) {
                    notificationsCustomSettingsActivity3.l0(true);
                } else {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((zj0) arrayList3.get(i12)).f45192f = notificationsCustomSettingsActivity3.h0();
                    }
                    org.telegram.ui.Cells.x9 x9Var2 = (org.telegram.ui.Cells.x9) view3;
                    x9Var2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.h0(), true, x9Var2.h);
                }
                break;
        }
    }
}
