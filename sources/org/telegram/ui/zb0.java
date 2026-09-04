package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class zb0 implements Runnable {
    public final int f43363a;
    public final fc0 f43364b;

    public zb0(fc0 fc0Var, int i10) {
        this.f43363a = i10;
        this.f43364b = fc0Var;
    }

    @Override
    public final void run() {
        switch (this.f43363a) {
            case 0:
                fc0 fc0Var = this.f43364b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.f36368b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f43364b.a();
                return;
        }
    }
}
