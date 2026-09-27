package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class wb0 implements Runnable {
    public final int f38904a;
    public final cc0 f38905b;

    public wb0(cc0 cc0Var, int i10) {
        this.f38904a = i10;
        this.f38905b = cc0Var;
    }

    @Override
    public final void run() {
        switch (this.f38904a) {
            case 0:
                cc0 cc0Var = this.f38905b;
                if (cc0Var.h >= 0) {
                    ConnectionsManager.getInstance(cc0Var.f32655b).cancelRequest(cc0Var.h, true);
                    cc0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f38905b.a();
                return;
        }
    }
}
