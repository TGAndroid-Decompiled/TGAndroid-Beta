package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class vv implements MessagesStorage.IntCallback {
    public final int f39271a;
    public final oy f39272b;

    public vv(oy oyVar, int i10) {
        this.f39271a = i10;
        this.f39272b = oyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z4;
        boolean z10;
        switch (this.f39271a) {
            case 0:
                oy oyVar = this.f39272b;
                oyVar.getClass();
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                oyVar.R1 = z4;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", oyVar.R1).apply();
                oyVar.k3(false);
                return;
            default:
                oy oyVar2 = this.f39272b;
                oyVar2.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                oyVar2.R1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", oyVar2.R1).commit();
                oyVar2.k3(false);
                return;
        }
    }
}
