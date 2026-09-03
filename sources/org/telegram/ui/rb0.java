package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class rb0 implements Runnable {
    public final int f37792a;
    public final yb0 f37793b;

    public rb0(yb0 yb0Var, int i10) {
        this.f37792a = i10;
        this.f37793b = yb0Var;
    }

    @Override
    public final void run() {
        switch (this.f37792a) {
            case 0:
                yb0 yb0Var = this.f37793b;
                if (yb0Var.h >= 0) {
                    ConnectionsManager.getInstance(yb0Var.f40222b).cancelRequest(yb0Var.h, true);
                    yb0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f37793b.a();
                return;
        }
    }
}
