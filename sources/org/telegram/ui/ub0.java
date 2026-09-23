package org.telegram.ui;

import org.telegram.tgnet.ConnectionsManager;
public final class ub0 implements Runnable {
    public final int f38044a;
    public final ac0 f38045b;

    public ub0(ac0 ac0Var, int i10) {
        this.f38044a = i10;
        this.f38045b = ac0Var;
    }

    @Override
    public final void run() {
        switch (this.f38044a) {
            case 0:
                ac0 ac0Var = this.f38045b;
                if (ac0Var.h >= 0) {
                    ConnectionsManager.getInstance(ac0Var.f31732b).cancelRequest(ac0Var.h, true);
                    ac0Var.h = -1;
                    return;
                }
                return;
            default:
                this.f38045b.a();
                return;
        }
    }
}
