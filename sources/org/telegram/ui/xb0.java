package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class xb0 implements Runnable {
    public final int f42824a;
    public final dc0 f42825b;

    public xb0(dc0 dc0Var, int i10) {
        this.f42824a = i10;
        this.f42825b = dc0Var;
    }

    @Override
    public final void run() {
        switch (this.f42824a) {
            case 0:
                dc0 dc0Var = this.f42825b;
                if (dc0Var.h >= 0) {
                    ConnectionsManager.getInstance(dc0Var.f35736b).cancelRequest(dc0Var.h, true);
                    dc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f42825b.a();
                return;
        }
    }
}
