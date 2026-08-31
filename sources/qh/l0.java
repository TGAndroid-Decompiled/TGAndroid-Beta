package qh;

import android.view.ViewGroup;
public final class l0 implements Runnable {
    public final int f45620a;
    public final m0 f45621b;

    public l0(m0 m0Var, int i10) {
        this.f45620a = i10;
        this.f45621b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f45620a) {
            case 0:
                m0 m0Var = this.f45621b;
                if (m0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) m0Var.getParent()).removeView(m0Var);
                    return;
                }
                return;
            default:
                this.f45621b.a();
                return;
        }
    }
}
