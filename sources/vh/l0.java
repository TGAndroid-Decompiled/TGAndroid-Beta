package vh;

import android.view.ViewGroup;
public final class l0 implements Runnable {
    public final int f51458a;
    public final m0 f51459b;

    public l0(m0 m0Var, int i10) {
        this.f51458a = i10;
        this.f51459b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f51458a) {
            case 0:
                m0 m0Var = this.f51459b;
                if (m0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) m0Var.getParent()).removeView(m0Var);
                    return;
                }
                return;
            default:
                this.f51459b.a();
                return;
        }
    }
}
