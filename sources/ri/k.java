package ri;

import org.telegram.ui.Components.tm0;
public final class k implements Runnable {
    public int f56680a;
    public int f56681b;
    public final tm0 f56682c;
    public final q d;

    public k(q qVar, tm0 tm0Var) {
        this.d = qVar;
        this.f56682c = tm0Var;
    }

    @Override
    public final void run() {
        tm0 tm0Var = this.f56682c;
        int scrollX = tm0Var.getScrollX();
        int scrollY = tm0Var.getScrollY();
        q qVar = this.d;
        qVar.f56702k += scrollX - this.f56680a;
        qVar.f56703l += scrollY - this.f56681b;
        this.f56680a = scrollX;
        this.f56681b = scrollY;
        qVar.f56699g++;
    }
}
