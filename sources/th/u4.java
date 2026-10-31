package th;

import org.telegram.messenger.zs;
public final class u4 implements Runnable {
    public final int f49514a;
    public final x4 f49515b;

    public u4(x4 x4Var, int i10) {
        this.f49514a = i10;
        this.f49515b = x4Var;
    }

    @Override
    public final void run() {
        int i10 = this.f49514a;
        x4 x4Var = this.f49515b;
        switch (i10) {
            case 0:
                zs.f(x4Var.f49633c).k(326, x4Var);
                return;
            case 1:
                x4Var.f49648u = false;
                x4Var.f49649w = true;
                zs.f(x4Var.f49633c).k(326, x4Var, Boolean.FALSE);
                return;
            case 2:
                x4Var.f49652z = false;
                return;
            default:
                x4Var.f49638k.clear();
                x4Var.d(true);
                return;
        }
    }
}
