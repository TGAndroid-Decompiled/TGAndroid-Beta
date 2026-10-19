package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sj0 implements Runnable {
    public final int f41480a;
    public final NotificationsCustomSettingsActivity f41481b;
    public final View f41482c;
    public final int d;

    public sj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f41480a = i11;
        this.f41481b = notificationsCustomSettingsActivity;
        this.f41482c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f41480a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f41481b;
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                View view = this.f41482c;
                if (view instanceof org.telegram.ui.Cells.x8) {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((xj0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((org.telegram.ui.Cells.x8) view).b(notificationsCustomSettingsActivity.f0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    return;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f41481b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
                View view2 = this.f41482c;
                if (view2 instanceof org.telegram.ui.Cells.ba) {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((xj0) arrayList2.get(i11)).f43218f = notificationsCustomSettingsActivity2.g0();
                    }
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view2;
                    baVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.g0(), true, baVar.h);
                    return;
                }
                notificationsCustomSettingsActivity2.l0(true);
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f41481b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.I;
                View view3 = this.f41482c;
                if (view3 instanceof org.telegram.ui.Cells.ba) {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((xj0) arrayList3.get(i12)).f43218f = notificationsCustomSettingsActivity3.h0();
                    }
                    org.telegram.ui.Cells.ba baVar2 = (org.telegram.ui.Cells.ba) view3;
                    baVar2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.h0(), true, baVar2.h);
                    return;
                }
                notificationsCustomSettingsActivity3.l0(true);
                return;
        }
    }
}
