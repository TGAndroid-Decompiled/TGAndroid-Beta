package th;

import org.telegram.messenger.at;
public final class u4 implements Runnable {
    public final int f49528a;
    public final x4 f49529b;

    public u4(x4 x4Var, int i10) {
        this.f49528a = i10;
        this.f49529b = x4Var;
    }

    @Override
    public final void run() {
        int i10 = this.f49528a;
        x4 x4Var = this.f49529b;
        switch (i10) {
            case 0:
                at.f(x4Var.f49647c).k(326, x4Var);
                return;
            case 1:
                x4Var.f49662u = false;
                x4Var.f49663w = true;
                at.f(x4Var.f49647c).k(326, x4Var, Boolean.FALSE);
                return;
            case 2:
                x4Var.f49666z = false;
                return;
            default:
                x4Var.f49652k.clear();
                x4Var.d(true);
                return;
        }
    }
}
