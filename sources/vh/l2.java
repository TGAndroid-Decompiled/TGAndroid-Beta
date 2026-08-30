package vh;

import android.view.View;
public final class l2 implements Runnable {
    public final int f46000a;
    public final r3 f46001b;
    public final a f46002c;
    public final int d;

    public l2(r3 r3Var, a aVar, int i10, int i11) {
        this.f46000a = i11;
        this.f46001b = r3Var;
        this.f46002c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View z12;
        View z13;
        switch (this.f46000a) {
            case 0:
                r3 r3Var = this.f46001b;
                a aVar = this.f46002c;
                if (aVar == null) {
                    r3Var.getClass();
                    z12 = null;
                } else {
                    z12 = r3Var.z1(aVar);
                }
                if (z12 instanceof v5) {
                    v5 v5Var = (v5) z12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(Math.min(this.d, v5Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                r3 r3Var2 = this.f46001b;
                a aVar2 = this.f46002c;
                if (aVar2 == null) {
                    r3Var2.getClass();
                    z13 = null;
                } else {
                    z13 = r3Var2.z1(aVar2);
                }
                if (z13 instanceof v5) {
                    v5 v5Var2 = (v5) z13;
                    v5Var2.B();
                    v5Var2.getEditText().setSelection(Math.min(this.d, v5Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View z14 = this.f46001b.z1(this.f46002c);
                if (z14 instanceof v5) {
                    v5 v5Var3 = (v5) z14;
                    v5Var3.B();
                    v5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View z15 = this.f46001b.z1(this.f46002c);
                if (z15 instanceof v5) {
                    v5 v5Var4 = (v5) z15;
                    v5Var4.B();
                    v5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View z16 = this.f46001b.z1(this.f46002c);
                if (z16 instanceof v5) {
                    v5 v5Var5 = (v5) z16;
                    v5Var5.B();
                    v5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View z17 = this.f46001b.z1(this.f46002c);
                if (z17 instanceof v5) {
                    v5 v5Var6 = (v5) z17;
                    v5Var6.B();
                    v5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, v5Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
