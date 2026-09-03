package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class xv implements MessagesStorage.IntCallback {
    public final int f40080a;
    public final qy f40081b;

    public xv(qy qyVar, int i10) {
        this.f40080a = i10;
        this.f40081b = qyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z4;
        boolean z10;
        switch (this.f40080a) {
            case 0:
                qy qyVar = this.f40081b;
                qyVar.getClass();
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                qyVar.R1 = z4;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", qyVar.R1).apply();
                qyVar.k3(false);
                return;
            default:
                qy qyVar2 = this.f40081b;
                qyVar2.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qyVar2.R1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", qyVar2.R1).commit();
                qyVar2.k3(false);
                return;
        }
    }
}
