package wh;

import android.view.View;
public final class v2 implements Runnable {
    public final int f50095a;
    public final r3 f50096b;
    public final a f50097c;

    public v2(r3 r3Var, a aVar, int i10) {
        this.f50095a = i10;
        this.f50096b = r3Var;
        this.f50097c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f50095a) {
            case 0:
                View z12 = this.f50096b.z1(this.f50097c);
                if (z12 instanceof v5) {
                    v5 v5Var = (v5) z12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f50096b.d3(this.f50097c);
                return;
            case 2:
                this.f50096b.d3(this.f50097c);
                return;
            case 3:
                this.f50096b.e3(this.f50097c);
                return;
            case 4:
                this.f50096b.d3(this.f50097c);
                return;
            default:
                this.f50096b.d3(this.f50097c);
                return;
        }
    }
}
