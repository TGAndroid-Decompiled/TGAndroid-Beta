package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class zb0 implements Runnable {
    public final int f39253a;
    public final fc0 f39254b;

    public zb0(fc0 fc0Var, int i10) {
        this.f39253a = i10;
        this.f39254b = fc0Var;
    }

    @Override
    public final void run() {
        switch (this.f39253a) {
            case 0:
                fc0 fc0Var = this.f39254b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.f32779b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f39254b.a();
                return;
        }
    }
}
