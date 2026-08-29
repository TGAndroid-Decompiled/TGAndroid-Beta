package th;

import android.view.View;
public final class k2 implements Runnable {
    public final int f48543a;
    public final p3 f48544b;
    public final a f48545c;
    public final int d;

    public k2(p3 p3Var, a aVar, int i10, int i11) {
        this.f48543a = i11;
        this.f48544b = p3Var;
        this.f48545c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View z12;
        View z13;
        switch (this.f48543a) {
            case 0:
                p3 p3Var = this.f48544b;
                a aVar = this.f48545c;
                if (aVar == null) {
                    p3Var.getClass();
                    z12 = null;
                } else {
                    z12 = p3Var.z1(aVar);
                }
                if (z12 instanceof t5) {
                    t5 t5Var = (t5) z12;
                    t5Var.B();
                    t5Var.getEditText().setSelection(Math.min(this.d, t5Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                p3 p3Var2 = this.f48544b;
                a aVar2 = this.f48545c;
                if (aVar2 == null) {
                    p3Var2.getClass();
                    z13 = null;
                } else {
                    z13 = p3Var2.z1(aVar2);
                }
                if (z13 instanceof t5) {
                    t5 t5Var2 = (t5) z13;
                    t5Var2.B();
                    t5Var2.getEditText().setSelection(Math.min(this.d, t5Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View z14 = this.f48544b.z1(this.f48545c);
                if (z14 instanceof t5) {
                    t5 t5Var3 = (t5) z14;
                    t5Var3.B();
                    t5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View z15 = this.f48544b.z1(this.f48545c);
                if (z15 instanceof t5) {
                    t5 t5Var4 = (t5) z15;
                    t5Var4.B();
                    t5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View z16 = this.f48544b.z1(this.f48545c);
                if (z16 instanceof t5) {
                    t5 t5Var5 = (t5) z16;
                    t5Var5.B();
                    t5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View z17 = this.f48544b.z1(this.f48545c);
                if (z17 instanceof t5) {
                    t5 t5Var6 = (t5) z17;
                    t5Var6.B();
                    t5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
