package vh;

import android.view.View;
import org.telegram.ui.Cells.k9;
public final class k2 implements Runnable {
    public final int f46053a;
    public final s3 f46054b;
    public final a f46055c;

    public k2(s3 s3Var, a aVar, int i10) {
        this.f46053a = i10;
        this.f46054b = s3Var;
        this.f46055c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f46053a) {
            case 0:
                this.f46054b.c3(this.f46055c);
                return;
            case 1:
                View y12 = this.f46054b.y1(this.f46055c);
                if (y12 instanceof w5) {
                    w5 w5Var = (w5) y12;
                    w5Var.B();
                    w5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f46054b.c3(this.f46055c);
                return;
            case 3:
                this.f46054b.b3(this.f46055c, true);
                return;
            case 4:
                this.f46054b.b3(this.f46055c, false);
                return;
            case 5:
                this.f46054b.b3(this.f46055c, true);
                return;
            case 6:
                this.f46054b.c3(this.f46055c);
                return;
            case 7:
                this.f46054b.a3(this.f46055c, false);
                return;
            case 8:
                this.f46054b.a3(this.f46055c, true);
                return;
            case 9:
                this.f46054b.c3(this.f46055c);
                return;
            case 10:
                this.f46054b.a3(this.f46055c, true);
                return;
            case 11:
                this.f46054b.c3(this.f46055c);
                return;
            case 12:
                this.f46054b.b3(this.f46055c, false);
                return;
            case 13:
                this.f46054b.a3(this.f46055c, true);
                return;
            case 14:
                s3 s3Var = this.f46054b;
                View y13 = s3Var.y1(this.f46055c);
                if (y13 instanceof k9) {
                    s3Var.f46221k3.c0(0, 0, (k9) y13);
                    return;
                }
                return;
            case 15:
                s3 s3Var2 = this.f46054b;
                View y14 = s3Var2.y1(this.f46055c);
                if (y14 instanceof k9) {
                    if (y14 instanceof w5) {
                        i10 = ((w5) y14).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    s3Var2.f46221k3.c0(0, i10, (k9) y14);
                    return;
                }
                return;
            case 16:
                this.f46054b.e3(this.f46055c);
                return;
            case 17:
                View y15 = this.f46054b.y1(this.f46055c);
                if (y15 instanceof w5) {
                    w5 w5Var2 = (w5) y15;
                    w5Var2.B();
                    w5Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View y16 = this.f46054b.y1(this.f46055c);
                if (y16 instanceof w5) {
                    w5 w5Var3 = (w5) y16;
                    w5Var3.B();
                    w5Var3.getEditText().setSelection(w5Var3.getEditText().length());
                    return;
                } else if (y16 instanceof j5) {
                    j5 j5Var = (j5) y16;
                    if (j5Var.getGrid().getChildCount() > 0) {
                        View childAt = j5Var.getGrid().getChildAt(0);
                        if (childAt instanceof m5) {
                            ((m5) childAt).f46103a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f46054b.d3(this.f46055c);
                return;
            case 20:
                View y17 = this.f46054b.y1(this.f46055c);
                if (y17 instanceof r0) {
                    ((r0) y17).d.r();
                    return;
                }
                return;
            case 21:
                this.f46054b.d3(this.f46055c);
                return;
            case 22:
                this.f46054b.d3(this.f46055c);
                return;
            case 23:
                View y18 = this.f46054b.y1(this.f46055c);
                if (y18 instanceof w5) {
                    w5 w5Var4 = (w5) y18;
                    w5Var4.B();
                    w5Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f46054b.c3(this.f46055c);
                return;
            case 25:
                this.f46054b.Y4("", this.f46055c);
                return;
            case 26:
                this.f46054b.c3(this.f46055c);
                return;
            case 27:
                this.f46054b.c3(this.f46055c);
                return;
            case 28:
                this.f46054b.c3(this.f46055c);
                return;
            default:
                this.f46054b.c3(this.f46055c);
                return;
        }
    }
}
