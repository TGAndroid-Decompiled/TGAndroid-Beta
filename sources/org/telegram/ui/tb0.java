package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class tb0 implements Runnable {
    public final int f38151a;
    public final zb0 f38152b;

    public tb0(zb0 zb0Var, int i10) {
        this.f38151a = i10;
        this.f38152b = zb0Var;
    }

    @Override
    public final void run() {
        switch (this.f38151a) {
            case 0:
                zb0 zb0Var = this.f38152b;
                if (zb0Var.h >= 0) {
                    ConnectionsManager.getInstance(zb0Var.f40545b).cancelRequest(zb0Var.h, true);
                    zb0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f38152b.a();
                return;
        }
    }
}
