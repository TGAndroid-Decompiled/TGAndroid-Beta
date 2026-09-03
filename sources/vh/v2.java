package vh;

import android.view.View;
public final class v2 implements Runnable {
    public final int f46297a;
    public final s3 f46298b;
    public final a f46299c;

    public v2(s3 s3Var, a aVar, int i10) {
        this.f46297a = i10;
        this.f46298b = s3Var;
        this.f46299c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f46297a) {
            case 0:
                View y12 = this.f46298b.y1(this.f46299c);
                if (y12 instanceof w5) {
                    w5 w5Var = (w5) y12;
                    w5Var.B();
                    w5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f46298b.c3(this.f46299c);
                return;
            case 2:
                this.f46298b.c3(this.f46299c);
                return;
            case 3:
                this.f46298b.d3(this.f46299c);
                return;
            case 4:
                this.f46298b.c3(this.f46299c);
                return;
            default:
                this.f46298b.c3(this.f46299c);
                return;
        }
    }
}
