package vh;

import android.view.View;
public final class u2 implements Runnable {
    public final int f46198a;
    public final r3 f46199b;
    public final a f46200c;

    public u2(r3 r3Var, a aVar, int i10) {
        this.f46198a = i10;
        this.f46199b = r3Var;
        this.f46200c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f46198a) {
            case 0:
                View z12 = this.f46199b.z1(this.f46200c);
                if (z12 instanceof v5) {
                    v5 v5Var = (v5) z12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f46199b.d3(this.f46200c);
                return;
            case 2:
                this.f46199b.d3(this.f46200c);
                return;
            case 3:
                this.f46199b.e3(this.f46200c);
                return;
            case 4:
                this.f46199b.d3(this.f46200c);
                return;
            default:
                this.f46199b.d3(this.f46200c);
                return;
        }
    }
}
