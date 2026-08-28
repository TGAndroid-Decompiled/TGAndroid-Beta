package qh;

import android.view.View;
public final class k2 implements Runnable {
    public final int f46486a;
    public final o3 f46487b;
    public final a f46488c;
    public final int d;

    public k2(o3 o3Var, a aVar, int i9, int i10) {
        this.f46486a = i10;
        this.f46487b = o3Var;
        this.f46488c = aVar;
        this.d = i9;
    }

    @Override
    public final void run() {
        View z12;
        View z13;
        switch (this.f46486a) {
            case 0:
                o3 o3Var = this.f46487b;
                a aVar = this.f46488c;
                if (aVar == null) {
                    o3Var.getClass();
                    z12 = null;
                } else {
                    z12 = o3Var.z1(aVar);
                }
                if (z12 instanceof s5) {
                    s5 s5Var = (s5) z12;
                    s5Var.B();
                    s5Var.getEditText().setSelection(Math.min(this.d, s5Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                o3 o3Var2 = this.f46487b;
                a aVar2 = this.f46488c;
                if (aVar2 == null) {
                    o3Var2.getClass();
                    z13 = null;
                } else {
                    z13 = o3Var2.z1(aVar2);
                }
                if (z13 instanceof s5) {
                    s5 s5Var2 = (s5) z13;
                    s5Var2.B();
                    s5Var2.getEditText().setSelection(Math.min(this.d, s5Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View z14 = this.f46487b.z1(this.f46488c);
                if (z14 instanceof s5) {
                    s5 s5Var3 = (s5) z14;
                    s5Var3.B();
                    s5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, s5Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View z15 = this.f46487b.z1(this.f46488c);
                if (z15 instanceof s5) {
                    s5 s5Var4 = (s5) z15;
                    s5Var4.B();
                    s5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, s5Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View z16 = this.f46487b.z1(this.f46488c);
                if (z16 instanceof s5) {
                    s5 s5Var5 = (s5) z16;
                    s5Var5.B();
                    s5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, s5Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View z17 = this.f46487b.z1(this.f46488c);
                if (z17 instanceof s5) {
                    s5 s5Var6 = (s5) z17;
                    s5Var6.B();
                    s5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, s5Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
