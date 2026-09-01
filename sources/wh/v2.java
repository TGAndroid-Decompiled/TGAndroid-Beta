package wh;

import android.view.View;
public final class v2 implements Runnable {
    public final int f50096a;
    public final r3 f50097b;
    public final a f50098c;

    public v2(r3 r3Var, a aVar, int i10) {
        this.f50096a = i10;
        this.f50097b = r3Var;
        this.f50098c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f50096a) {
            case 0:
                View z12 = this.f50097b.z1(this.f50098c);
                if (z12 instanceof v5) {
                    v5 v5Var = (v5) z12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 1:
                this.f50097b.d3(this.f50098c);
                return;
            case 2:
                this.f50097b.d3(this.f50098c);
                return;
            case 3:
                this.f50097b.e3(this.f50098c);
                return;
            case 4:
                this.f50097b.d3(this.f50098c);
                return;
            default:
                this.f50097b.d3(this.f50098c);
                return;
        }
    }
}
