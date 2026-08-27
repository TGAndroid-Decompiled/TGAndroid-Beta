package rh;

import android.view.View;

public final class t2 implements Runnable {

    public final int f47464a;

    public final p3 f47465b;

    public final a f47466c;

    public t2(p3 p3Var, a aVar, int i10) {
        this.f47464a = i10;
        this.f47465b = p3Var;
        this.f47466c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f47464a) {
            case 0:
                View viewZ1 = this.f47465b.z1(this.f47466c);
                if (viewZ1 instanceof t5) {
                    t5 t5Var = (t5) viewZ1;
                    t5Var.B();
                    t5Var.getEditText().setSelection(0);
                }
                break;
            case 1:
                this.f47465b.d3(this.f47466c);
                break;
            case 2:
                this.f47465b.d3(this.f47466c);
                break;
            case 3:
                this.f47465b.e3(this.f47466c);
                break;
            case 4:
                this.f47465b.d3(this.f47466c);
                break;
            default:
                this.f47465b.d3(this.f47466c);
                break;
        }
    }
}
