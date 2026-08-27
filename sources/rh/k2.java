package rh;

import android.view.View;

public final class k2 implements Runnable {

    public final int f47243a;

    public final p3 f47244b;

    public final a f47245c;
    public final int d;

    public k2(p3 p3Var, a aVar, int i10, int i11) {
        this.f47243a = i11;
        this.f47244b = p3Var;
        this.f47245c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View viewZ1;
        View viewZ2;
        switch (this.f47243a) {
            case 0:
                p3 p3Var = this.f47244b;
                a aVar = this.f47245c;
                if (aVar == null) {
                    p3Var.getClass();
                    viewZ1 = null;
                } else {
                    viewZ1 = p3Var.z1(aVar);
                }
                if (viewZ1 instanceof t5) {
                    t5 t5Var = (t5) viewZ1;
                    t5Var.B();
                    t5Var.getEditText().setSelection(Math.min(this.d, t5Var.getEditText().length()));
                }
                break;
            case 1:
                p3 p3Var2 = this.f47244b;
                a aVar2 = this.f47245c;
                if (aVar2 == null) {
                    p3Var2.getClass();
                    viewZ2 = null;
                } else {
                    viewZ2 = p3Var2.z1(aVar2);
                }
                if (viewZ2 instanceof t5) {
                    t5 t5Var2 = (t5) viewZ2;
                    t5Var2.B();
                    t5Var2.getEditText().setSelection(Math.min(this.d, t5Var2.getEditText().length()));
                }
                break;
            case 2:
                View viewZ3 = this.f47244b.z1(this.f47245c);
                if (viewZ3 instanceof t5) {
                    t5 t5Var3 = (t5) viewZ3;
                    t5Var3.B();
                    t5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var3.getEditText().length())));
                }
                break;
            case 3:
                View viewZ4 = this.f47244b.z1(this.f47245c);
                if (viewZ4 instanceof t5) {
                    t5 t5Var4 = (t5) viewZ4;
                    t5Var4.B();
                    t5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var4.getEditText().length())));
                }
                break;
            case 4:
                View viewZ5 = this.f47244b.z1(this.f47245c);
                if (viewZ5 instanceof t5) {
                    t5 t5Var5 = (t5) viewZ5;
                    t5Var5.B();
                    t5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var5.getEditText().length())));
                }
                break;
            default:
                View viewZ6 = this.f47244b.z1(this.f47245c);
                if (viewZ6 instanceof t5) {
                    t5 t5Var6 = (t5) viewZ6;
                    t5Var6.B();
                    t5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, t5Var6.getEditText().length())));
                }
                break;
        }
    }
}
