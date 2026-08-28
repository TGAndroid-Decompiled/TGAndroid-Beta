package zf;

import android.widget.FrameLayout;
public final class q1 implements Runnable {
    public final int f50672a;
    public final FrameLayout f50673b;

    public q1(int i9, FrameLayout frameLayout) {
        this.f50672a = i9;
        this.f50673b = frameLayout;
    }

    @Override
    public final void run() {
        switch (this.f50672a) {
            case 0:
                ((r1) this.f50673b).invalidate();
                return;
            default:
                ((z1) this.f50673b).a();
                return;
        }
    }
}
