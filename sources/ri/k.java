package ri;

import org.telegram.ui.Components.lm0;
public final class k implements Runnable {
    public int f56106a;
    public int f56107b;
    public final lm0 f56108c;
    public final q d;

    public k(q qVar, lm0 lm0Var) {
        this.d = qVar;
        this.f56108c = lm0Var;
    }

    @Override
    public final void run() {
        lm0 lm0Var = this.f56108c;
        int scrollX = lm0Var.getScrollX();
        int scrollY = lm0Var.getScrollY();
        q qVar = this.d;
        qVar.f56128k += scrollX - this.f56106a;
        qVar.f56129l += scrollY - this.f56107b;
        this.f56106a = scrollX;
        this.f56107b = scrollY;
        qVar.f56125g++;
    }
}
