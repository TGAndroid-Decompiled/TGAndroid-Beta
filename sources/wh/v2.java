package wh;

import android.view.View;
public final class v2 implements Runnable {
    public final int f50132a;
    public final r3 f50133b;
    public final a f50134c;

    public v2(r3 r3Var, a aVar, int i10) {
        this.f50132a = i10;
        this.f50133b = r3Var;
        this.f50134c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f50132a) {
            case 0:
                View y12 = this.f50133b.y1(this.f50134c);
                if (y12 instanceof v5) {
                    v5 v5Var = (v5) y12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f50133b.c3(this.f50134c);
                return;
            case 2:
                this.f50133b.c3(this.f50134c);
                return;
            case 3:
                this.f50133b.d3(this.f50134c);
                return;
            case 4:
                this.f50133b.c3(this.f50134c);
                return;
            default:
                this.f50133b.c3(this.f50134c);
                return;
        }
    }
}
