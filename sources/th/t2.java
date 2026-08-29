package th;

import android.view.View;
public final class t2 implements Runnable {
    public final int f48762a;
    public final p3 f48763b;
    public final a f48764c;

    public t2(p3 p3Var, a aVar, int i10) {
        this.f48762a = i10;
        this.f48763b = p3Var;
        this.f48764c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f48762a) {
            case 0:
                View z12 = this.f48763b.z1(this.f48764c);
                if (z12 instanceof t5) {
                    t5 t5Var = (t5) z12;
                    t5Var.B();
                    t5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f48763b.d3(this.f48764c);
                return;
            case 2:
                this.f48763b.d3(this.f48764c);
                return;
            case 3:
                this.f48763b.e3(this.f48764c);
                return;
            case 4:
                this.f48763b.d3(this.f48764c);
                return;
            default:
                this.f48763b.d3(this.f48764c);
                return;
        }
    }
}
