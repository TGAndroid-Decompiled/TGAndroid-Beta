package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class zb0 implements Runnable {
    public final int f43364a;
    public final fc0 f43365b;

    public zb0(fc0 fc0Var, int i10) {
        this.f43364a = i10;
        this.f43365b = fc0Var;
    }

    @Override
    public final void run() {
        switch (this.f43364a) {
            case 0:
                fc0 fc0Var = this.f43365b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.f36369b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f43365b.a();
                return;
        }
    }
}
