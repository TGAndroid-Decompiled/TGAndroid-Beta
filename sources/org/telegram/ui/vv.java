package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class vv implements MessagesStorage.IntCallback {
    public final int f38835a;
    public final qy f38836b;

    public vv(qy qyVar, int i10) {
        this.f38835a = i10;
        this.f38836b = qyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f38835a) {
            case 0:
                qy qyVar = this.f38836b;
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
                qy qyVar2 = this.f38836b;
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
