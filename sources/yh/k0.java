package yh;

import android.os.Build;
public final class k0 implements Runnable {
    public final int f51502a;
    public final s0 f51503b;

    public k0(s0 s0Var, int i10) {
        this.f51502a = i10;
        this.f51503b = s0Var;
    }

    @Override
    public final void run() {
        switch (this.f51502a) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31) {
                    s0 s0Var = this.f51503b;
                    if (s0Var.f51945s0 != null) {
                        s0Var.O(2);
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f51503b.onBackPressed();
                return;
        }
    }
}
