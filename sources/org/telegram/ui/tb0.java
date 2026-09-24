package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class tb0 implements Runnable {
    public final int f38024a;
    public final zb0 f38025b;

    public tb0(zb0 zb0Var, int i10) {
        this.f38024a = i10;
        this.f38025b = zb0Var;
    }

    @Override
    public final void run() {
        switch (this.f38024a) {
            case 0:
                zb0 zb0Var = this.f38025b;
                if (zb0Var.h >= 0) {
                    ConnectionsManager.getInstance(zb0Var.f40419b).cancelRequest(zb0Var.h, true);
                    zb0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f38025b.a();
                return;
        }
    }
}
