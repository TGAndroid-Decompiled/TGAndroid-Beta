package ri;

import org.telegram.ui.Components.wm0;
public final class k implements Runnable {
    public int f56721a;
    public int f56722b;
    public final wm0 f56723c;
    public final q d;

    public k(q qVar, wm0 wm0Var) {
        this.d = qVar;
        this.f56723c = wm0Var;
    }

    @Override
    public final void run() {
        wm0 wm0Var = this.f56723c;
        int scrollX = wm0Var.getScrollX();
        int scrollY = wm0Var.getScrollY();
        q qVar = this.d;
        qVar.f56743k += scrollX - this.f56721a;
        qVar.f56744l += scrollY - this.f56722b;
        this.f56721a = scrollX;
        this.f56722b = scrollY;
        qVar.f56740g++;
    }
}
