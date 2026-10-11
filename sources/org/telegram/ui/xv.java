package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class xv implements MessagesStorage.IntCallback {
    public final int f44188a;
    public final sy f44189b;

    public xv(sy syVar, int i10) {
        this.f44188a = i10;
        this.f44189b = syVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f44188a) {
            case 0:
                sy syVar = this.f44189b;
                syVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                syVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", syVar.U1).apply();
                syVar.h3(false);
                return;
            default:
                sy syVar2 = this.f44189b;
                syVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                syVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", syVar2.U1).commit();
                syVar2.h3(false);
                return;
        }
    }
}
