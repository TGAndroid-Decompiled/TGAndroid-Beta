package ri;

import org.telegram.ui.Components.vm0;
public final class k implements Runnable {
    public int f56690a;
    public int f56691b;
    public final vm0 f56692c;
    public final q d;

    public k(q qVar, vm0 vm0Var) {
        this.d = qVar;
        this.f56692c = vm0Var;
    }

    @Override
    public final void run() {
        vm0 vm0Var = this.f56692c;
        int scrollX = vm0Var.getScrollX();
        int scrollY = vm0Var.getScrollY();
        q qVar = this.d;
        qVar.f56712k += scrollX - this.f56690a;
        qVar.f56713l += scrollY - this.f56691b;
        this.f56690a = scrollX;
        this.f56691b = scrollY;
        qVar.f56709g++;
    }
}
