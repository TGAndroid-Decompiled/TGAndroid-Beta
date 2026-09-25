package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class tb0 implements Runnable {
    public final int f38042a;
    public final zb0 f38043b;

    public tb0(zb0 zb0Var, int i10) {
        this.f38042a = i10;
        this.f38043b = zb0Var;
    }

    @Override
    public final void run() {
        switch (this.f38042a) {
            case 0:
                zb0 zb0Var = this.f38043b;
                if (zb0Var.h >= 0) {
                    ConnectionsManager.getInstance(zb0Var.f40436b).cancelRequest(zb0Var.h, true);
                    zb0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f38043b.a();
                return;
        }
    }
}
