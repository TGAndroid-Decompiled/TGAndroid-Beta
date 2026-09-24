package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class vv implements MessagesStorage.IntCallback {
    public final int f38820a;
    public final qy f38821b;

    public vv(qy qyVar, int i10) {
        this.f38820a = i10;
        this.f38821b = qyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f38820a) {
            case 0:
                qy qyVar = this.f38821b;
                qyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qyVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", qyVar.U1).apply();
                qyVar.k3(false);
                return;
            default:
                qy qyVar2 = this.f38821b;
                qyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qyVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", qyVar2.U1).commit();
                qyVar2.k3(false);
                return;
        }
    }
}
