package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class yv implements MessagesStorage.IntCallback {
    public final int f44459a;
    public final ty f44460b;

    public yv(ty tyVar, int i10) {
        this.f44459a = i10;
        this.f44460b = tyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f44459a) {
            case 0:
                ty tyVar = this.f44460b;
                tyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                tyVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", tyVar.U1).apply();
                tyVar.h3(false);
                return;
            default:
                ty tyVar2 = this.f44460b;
                tyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                tyVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", tyVar2.U1).commit();
                tyVar2.h3(false);
                return;
        }
    }
}
