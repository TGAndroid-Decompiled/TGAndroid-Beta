package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class xj0 implements Runnable {
    public final int f43610a;
    public final NotificationsCustomSettingsActivity f43611b;
    public final View f43612c;
    public final int d;

    public xj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i10, int i11) {
        this.f43610a = i11;
        this.f43611b = notificationsCustomSettingsActivity;
        this.f43612c = view;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f43610a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43611b;
                ArrayList arrayList = notificationsCustomSettingsActivity.I;
                View view = this.f43612c;
                if (view instanceof org.telegram.ui.Cells.y8) {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList.size()) {
                        ((ck0) arrayList.get(i10)).h = notificationsCustomSettingsActivity.f0();
                    }
                    ((org.telegram.ui.Cells.y8) view).b(notificationsCustomSettingsActivity.f0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    return;
                }
                notificationsCustomSettingsActivity.l0(true);
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f43611b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.I;
                View view2 = this.f43612c;
                if (view2 instanceof org.telegram.ui.Cells.ca) {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList2.size()) {
                        ((ck0) arrayList2.get(i11)).f36385f = notificationsCustomSettingsActivity2.g0();
                    }
                    org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view2;
                    caVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.g0(), true, caVar.h);
                    return;
                }
                notificationsCustomSettingsActivity2.l0(true);
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f43611b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.I;
                View view3 = this.f43612c;
                if (view3 instanceof org.telegram.ui.Cells.ca) {
                    int i12 = this.d;
                    if (i12 >= 0 && i12 < arrayList3.size()) {
                        ((ck0) arrayList3.get(i12)).f36385f = notificationsCustomSettingsActivity3.h0();
                    }
                    org.telegram.ui.Cells.ca caVar2 = (org.telegram.ui.Cells.ca) view3;
                    caVar2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.h0(), true, caVar2.h);
                    return;
                }
                notificationsCustomSettingsActivity3.l0(true);
                return;
        }
    }
}
