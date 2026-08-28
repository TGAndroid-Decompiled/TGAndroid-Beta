package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tj0 implements Runnable {
    public final int f43022a;
    public final NotificationsCustomSettingsActivity f43023b;
    public final View f43024c;
    public final int d;

    public tj0(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, View view, int i9, int i10) {
        this.f43022a = i10;
        this.f43023b = notificationsCustomSettingsActivity;
        this.f43024c = view;
        this.d = i9;
    }

    @Override
    public final void run() {
        switch (this.f43022a) {
            case 0:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = this.f43023b;
                ArrayList arrayList = notificationsCustomSettingsActivity.E;
                View view = this.f43024c;
                if (view instanceof org.telegram.ui.Cells.v8) {
                    int i9 = this.d;
                    if (i9 >= 0 && i9 < arrayList.size()) {
                        ((yj0) arrayList.get(i9)).h = notificationsCustomSettingsActivity.e0();
                    }
                    ((org.telegram.ui.Cells.v8) view).b(notificationsCustomSettingsActivity.e0(), LocaleController.getString("LedColor", R.string.LedColor), true);
                    return;
                }
                notificationsCustomSettingsActivity.k0(true);
                return;
            case 1:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = this.f43023b;
                ArrayList arrayList2 = notificationsCustomSettingsActivity2.E;
                View view2 = this.f43024c;
                if (view2 instanceof org.telegram.ui.Cells.ba) {
                    int i10 = this.d;
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        ((yj0) arrayList2.get(i10)).f44888f = notificationsCustomSettingsActivity2.f0();
                    }
                    org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view2;
                    baVar.c(LocaleController.getString("PopupNotification", R.string.PopupNotification), notificationsCustomSettingsActivity2.f0(), true, baVar.h);
                    return;
                }
                notificationsCustomSettingsActivity2.k0(true);
                return;
            default:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity3 = this.f43023b;
                ArrayList arrayList3 = notificationsCustomSettingsActivity3.E;
                View view3 = this.f43024c;
                if (view3 instanceof org.telegram.ui.Cells.ba) {
                    int i11 = this.d;
                    if (i11 >= 0 && i11 < arrayList3.size()) {
                        ((yj0) arrayList3.get(i11)).f44888f = notificationsCustomSettingsActivity3.g0();
                    }
                    org.telegram.ui.Cells.ba baVar2 = (org.telegram.ui.Cells.ba) view3;
                    baVar2.c(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), notificationsCustomSettingsActivity3.g0(), true, baVar2.h);
                    return;
                }
                notificationsCustomSettingsActivity3.k0(true);
                return;
        }
    }
}
