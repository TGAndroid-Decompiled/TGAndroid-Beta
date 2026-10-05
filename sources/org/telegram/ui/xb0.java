package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class xb0 implements Runnable {
    public final int f42883a;
    public final dc0 f42884b;

    public xb0(dc0 dc0Var, int i10) {
        this.f42883a = i10;
        this.f42884b = dc0Var;
    }

    @Override
    public final void run() {
        switch (this.f42883a) {
            case 0:
                dc0 dc0Var = this.f42884b;
                if (dc0Var.h >= 0) {
                    ConnectionsManager.getInstance(dc0Var.f35778b).cancelRequest(dc0Var.h, true);
                    dc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f42884b.a();
                return;
        }
    }
}
