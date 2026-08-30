package ph;

import android.view.ViewGroup;
public final class l0 implements Runnable {
    public final int f41872a;
    public final m0 f41873b;

    public l0(m0 m0Var, int i10) {
        this.f41872a = i10;
        this.f41873b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f41872a) {
            case 0:
                m0 m0Var = this.f41873b;
                if (m0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) m0Var.getParent()).removeView(m0Var);
                    return;
                }
                return;
            default:
                this.f41873b.a();
                return;
        }
    }
}
