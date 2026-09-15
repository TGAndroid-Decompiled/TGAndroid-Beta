package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class zb0 implements Runnable {
    public final int f40130a;
    public final fc0 f40131b;

    public zb0(fc0 fc0Var, int i10) {
        this.f40130a = i10;
        this.f40131b = fc0Var;
    }

    @Override
    public final void run() {
        switch (this.f40130a) {
            case 0:
                fc0 fc0Var = this.f40131b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.f33535b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f40131b.a();
                return;
        }
    }
}
