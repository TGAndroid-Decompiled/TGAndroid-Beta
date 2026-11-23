package ri;

import org.telegram.ui.Components.wm0;
public final class k implements Runnable {
    public int f56725a;
    public int f56726b;
    public final wm0 f56727c;
    public final q d;

    public k(q qVar, wm0 wm0Var) {
        this.d = qVar;
        this.f56727c = wm0Var;
    }

    @Override
    public final void run() {
        wm0 wm0Var = this.f56727c;
        int scrollX = wm0Var.getScrollX();
        int scrollY = wm0Var.getScrollY();
        q qVar = this.d;
        qVar.f56747k += scrollX - this.f56725a;
        qVar.f56748l += scrollY - this.f56726b;
        this.f56725a = scrollX;
        this.f56726b = scrollY;
        qVar.f56744g++;
    }
}
