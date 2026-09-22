package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class zb0 implements Runnable {
    public final int f40146a;
    public final fc0 f40147b;

    public zb0(fc0 fc0Var, int i10) {
        this.f40146a = i10;
        this.f40147b = fc0Var;
    }

    @Override
    public final void run() {
        switch (this.f40146a) {
            case 0:
                fc0 fc0Var = this.f40147b;
                if (fc0Var.h >= 0) {
                    ConnectionsManager.getInstance(fc0Var.f33564b).cancelRequest(fc0Var.h, true);
                    fc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f40147b.a();
                return;
        }
    }
}
