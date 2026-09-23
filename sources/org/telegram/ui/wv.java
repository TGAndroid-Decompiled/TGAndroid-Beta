package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class wv implements MessagesStorage.IntCallback {
    public final int f39110a;
    public final ry f39111b;

    public wv(ry ryVar, int i10) {
        this.f39110a = i10;
        this.f39111b = ryVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f39110a) {
            case 0:
                ry ryVar = this.f39111b;
                ryVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ryVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", ryVar.U1).apply();
                ryVar.k3(false);
                return;
            default:
                ry ryVar2 = this.f39111b;
                ryVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ryVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", ryVar2.U1).commit();
                ryVar2.k3(false);
                return;
        }
    }
}
