package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class xb0 implements Runnable {
    public final int f42831a;
    public final dc0 f42832b;

    public xb0(dc0 dc0Var, int i10) {
        this.f42831a = i10;
        this.f42832b = dc0Var;
    }

    @Override
    public final void run() {
        switch (this.f42831a) {
            case 0:
                dc0 dc0Var = this.f42832b;
                if (dc0Var.h >= 0) {
                    ConnectionsManager.getInstance(dc0Var.f35741b).cancelRequest(dc0Var.h, true);
                    dc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f42832b.a();
                return;
        }
    }
}
