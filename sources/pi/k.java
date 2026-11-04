package pi;

import org.telegram.ui.Components.km0;
public final class k implements Runnable {
    public int f53588a;
    public int f53589b;
    public final km0 f53590c;
    public final q d;

    public k(q qVar, km0 km0Var) {
        this.d = qVar;
        this.f53590c = km0Var;
    }

    @Override
    public final void run() {
        km0 km0Var = this.f53590c;
        int scrollX = km0Var.getScrollX();
        int scrollY = km0Var.getScrollY();
        q qVar = this.d;
        qVar.f53610k += scrollX - this.f53588a;
        qVar.f53611l += scrollY - this.f53589b;
        this.f53588a = scrollX;
        this.f53589b = scrollY;
        qVar.f53607g++;
    }
}
