package ri;

import org.telegram.ui.Components.vm0;
public final class k implements Runnable {
    public int f56803a;
    public int f56804b;
    public final vm0 f56805c;
    public final q d;

    public k(q qVar, vm0 vm0Var) {
        this.d = qVar;
        this.f56805c = vm0Var;
    }

    @Override
    public final void run() {
        vm0 vm0Var = this.f56805c;
        int scrollX = vm0Var.getScrollX();
        int scrollY = vm0Var.getScrollY();
        q qVar = this.d;
        qVar.f56825k += scrollX - this.f56803a;
        qVar.f56826l += scrollY - this.f56804b;
        this.f56803a = scrollX;
        this.f56804b = scrollY;
        qVar.f56822g++;
    }
}
