package qh;

import android.view.ViewGroup;
public final class l0 implements Runnable {
    public final int f45637a;
    public final m0 f45638b;

    public l0(m0 m0Var, int i10) {
        this.f45637a = i10;
        this.f45638b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f45637a) {
            case 0:
                m0 m0Var = this.f45638b;
                if (m0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) m0Var.getParent()).removeView(m0Var);
                    return;
                }
                return;
            default:
                this.f45638b.a();
                return;
        }
    }
}
