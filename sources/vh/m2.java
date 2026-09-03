package vh;

import android.view.View;
public final class m2 implements Runnable {
    public final int f46097a;
    public final s3 f46098b;
    public final a f46099c;
    public final int d;

    public m2(s3 s3Var, a aVar, int i10, int i11) {
        this.f46097a = i11;
        this.f46098b = s3Var;
        this.f46099c = aVar;
        this.d = i10;
    }

    @Override
    public final void run() {
        View y12;
        View y13;
        switch (this.f46097a) {
            case 0:
                s3 s3Var = this.f46098b;
                a aVar = this.f46099c;
                if (aVar == null) {
                    s3Var.getClass();
                    y12 = null;
                } else {
                    y12 = s3Var.y1(aVar);
                }
                if (y12 instanceof w5) {
                    w5 w5Var = (w5) y12;
                    w5Var.B();
                    w5Var.getEditText().setSelection(Math.min(this.d, w5Var.getEditText().length()));
                    return;
                }
                return;
            case 1:
                s3 s3Var2 = this.f46098b;
                a aVar2 = this.f46099c;
                if (aVar2 == null) {
                    s3Var2.getClass();
                    y13 = null;
                } else {
                    y13 = s3Var2.y1(aVar2);
                }
                if (y13 instanceof w5) {
                    w5 w5Var2 = (w5) y13;
                    w5Var2.B();
                    w5Var2.getEditText().setSelection(Math.min(this.d, w5Var2.getEditText().length()));
                    return;
                }
                return;
            case 2:
                View y14 = this.f46098b.y1(this.f46099c);
                if (y14 instanceof w5) {
                    w5 w5Var3 = (w5) y14;
                    w5Var3.B();
                    w5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, w5Var3.getEditText().length())));
                    return;
                }
                return;
            case 3:
                View y15 = this.f46098b.y1(this.f46099c);
                if (y15 instanceof w5) {
                    w5 w5Var4 = (w5) y15;
                    w5Var4.B();
                    w5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, w5Var4.getEditText().length())));
                    return;
                }
                return;
            case 4:
                View y16 = this.f46098b.y1(this.f46099c);
                if (y16 instanceof w5) {
                    w5 w5Var5 = (w5) y16;
                    w5Var5.B();
                    w5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, w5Var5.getEditText().length())));
                    return;
                }
                return;
            default:
                View y17 = this.f46098b.y1(this.f46099c);
                if (y17 instanceof w5) {
                    w5 w5Var6 = (w5) y17;
                    w5Var6.B();
                    w5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, w5Var6.getEditText().length())));
                    return;
                }
                return;
        }
    }
}
