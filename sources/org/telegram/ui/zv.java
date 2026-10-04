package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class zv implements MessagesStorage.IntCallback {
    public final int f43910a;
    public final uy f43911b;

    public zv(uy uyVar, int i10) {
        this.f43910a = i10;
        this.f43911b = uyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f43910a) {
            case 0:
                uy uyVar = this.f43911b;
                uyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                uyVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", uyVar.U1).apply();
                uyVar.u3(false);
                return;
            default:
                uy uyVar2 = this.f43911b;
                uyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                uyVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", uyVar2.U1).commit();
                uyVar2.u3(false);
                return;
        }
    }
}
