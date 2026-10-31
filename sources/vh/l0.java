package vh;

import android.view.ViewGroup;
public final class l0 implements Runnable {
    public final int f51443a;
    public final m0 f51444b;

    public l0(m0 m0Var, int i10) {
        this.f51443a = i10;
        this.f51444b = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f51443a) {
            case 0:
                m0 m0Var = this.f51444b;
                if (m0Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) m0Var.getParent()).removeView(m0Var);
                    return;
                }
                return;
            default:
                this.f51444b.a();
                return;
        }
    }
}
