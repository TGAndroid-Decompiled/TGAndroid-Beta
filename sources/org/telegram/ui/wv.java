package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class wv implements MessagesStorage.IntCallback {
    public final int f42893a;
    public final py f42894b;

    public wv(py pyVar, int i10) {
        this.f42893a = i10;
        this.f42894b = pyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z4;
        boolean z10;
        switch (this.f42893a) {
            case 0:
                py pyVar = this.f42894b;
                pyVar.getClass();
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                pyVar.R1 = z4;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", pyVar.R1).apply();
                pyVar.k3(false);
                return;
            default:
                py pyVar2 = this.f42894b;
                pyVar2.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pyVar2.R1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", pyVar2.R1).commit();
                pyVar2.k3(false);
                return;
        }
    }
}
