package th;

import android.view.View;
import org.telegram.ui.Cells.j9;
public final class i2 implements Runnable {
    public final int f48488a;
    public final p3 f48489b;
    public final a f48490c;

    public i2(p3 p3Var, a aVar, int i10) {
        this.f48488a = i10;
        this.f48489b = p3Var;
        this.f48490c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f48488a) {
            case 0:
                this.f48489b.d3(this.f48490c);
                return;
            case 1:
                View z12 = this.f48489b.z1(this.f48490c);
                if (z12 instanceof t5) {
                    t5 t5Var = (t5) z12;
                    t5Var.B();
                    t5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f48489b.d3(this.f48490c);
                return;
            case 3:
                this.f48489b.c3(this.f48490c, true);
                return;
            case 4:
                this.f48489b.c3(this.f48490c, false);
                return;
            case 5:
                this.f48489b.c3(this.f48490c, true);
                return;
            case 6:
                this.f48489b.d3(this.f48490c);
                return;
            case 7:
                this.f48489b.b3(this.f48490c, false);
                return;
            case 8:
                this.f48489b.b3(this.f48490c, true);
                return;
            case 9:
                this.f48489b.d3(this.f48490c);
                return;
            case 10:
                this.f48489b.b3(this.f48490c, true);
                return;
            case 11:
                this.f48489b.d3(this.f48490c);
                return;
            case 12:
                this.f48489b.c3(this.f48490c, false);
                return;
            case 13:
                this.f48489b.b3(this.f48490c, true);
                return;
            case 14:
                p3 p3Var = this.f48489b;
                View z13 = p3Var.z1(this.f48490c);
                if (z13 instanceof j9) {
                    p3Var.f48650j3.c0(0, 0, (j9) z13);
                    return;
                }
                return;
            case 15:
                p3 p3Var2 = this.f48489b;
                View z14 = p3Var2.z1(this.f48490c);
                if (z14 instanceof j9) {
                    if (z14 instanceof t5) {
                        i10 = ((t5) z14).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    p3Var2.f48650j3.c0(0, i10, (j9) z14);
                    return;
                }
                return;
            case 16:
                this.f48489b.f3(this.f48490c);
                return;
            case 17:
                View z15 = this.f48489b.z1(this.f48490c);
                if (z15 instanceof t5) {
                    t5 t5Var2 = (t5) z15;
                    t5Var2.B();
                    t5Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View z16 = this.f48489b.z1(this.f48490c);
                if (z16 instanceof t5) {
                    t5 t5Var3 = (t5) z16;
                    t5Var3.B();
                    t5Var3.getEditText().setSelection(t5Var3.getEditText().length());
                    return;
                } else if (z16 instanceof g5) {
                    g5 g5Var = (g5) z16;
                    if (g5Var.getGrid().getChildCount() > 0) {
                        View childAt = g5Var.getGrid().getChildAt(0);
                        if (childAt instanceof j5) {
                            ((j5) childAt).f48526a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f48489b.e3(this.f48490c);
                return;
            case 20:
                View z17 = this.f48489b.z1(this.f48490c);
                if (z17 instanceof q0) {
                    ((q0) z17).d.r();
                    return;
                }
                return;
            case 21:
                this.f48489b.e3(this.f48490c);
                return;
            case 22:
                this.f48489b.e3(this.f48490c);
                return;
            case 23:
                View z18 = this.f48489b.z1(this.f48490c);
                if (z18 instanceof t5) {
                    t5 t5Var4 = (t5) z18;
                    t5Var4.B();
                    t5Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f48489b.d3(this.f48490c);
                return;
            case 25:
                this.f48489b.Z4("", this.f48490c);
                return;
            case 26:
                this.f48489b.d3(this.f48490c);
                return;
            case 27:
                this.f48489b.d3(this.f48490c);
                return;
            case 28:
                this.f48489b.d3(this.f48490c);
                return;
            default:
                this.f48489b.d3(this.f48490c);
                return;
        }
    }
}
