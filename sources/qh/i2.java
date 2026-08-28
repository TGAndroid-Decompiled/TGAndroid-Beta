package qh;

import android.view.View;
import org.telegram.ui.Cells.m9;
public final class i2 implements Runnable {
    public final int f46442a;
    public final o3 f46443b;
    public final a f46444c;

    public i2(o3 o3Var, a aVar, int i9) {
        this.f46442a = i9;
        this.f46443b = o3Var;
        this.f46444c = aVar;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f46442a) {
            case 0:
                this.f46443b.d3(this.f46444c);
                return;
            case 1:
                View z12 = this.f46443b.z1(this.f46444c);
                if (z12 instanceof s5) {
                    s5 s5Var = (s5) z12;
                    s5Var.B();
                    s5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f46443b.d3(this.f46444c);
                return;
            case 3:
                this.f46443b.c3(this.f46444c, true);
                return;
            case 4:
                this.f46443b.c3(this.f46444c, false);
                return;
            case 5:
                this.f46443b.c3(this.f46444c, true);
                return;
            case 6:
                this.f46443b.d3(this.f46444c);
                return;
            case 7:
                this.f46443b.b3(this.f46444c, false);
                return;
            case 8:
                this.f46443b.b3(this.f46444c, true);
                return;
            case 9:
                this.f46443b.d3(this.f46444c);
                return;
            case 10:
                this.f46443b.b3(this.f46444c, true);
                return;
            case 11:
                this.f46443b.d3(this.f46444c);
                return;
            case 12:
                this.f46443b.c3(this.f46444c, false);
                return;
            case 13:
                this.f46443b.b3(this.f46444c, true);
                return;
            case 14:
                o3 o3Var = this.f46443b;
                View z13 = o3Var.z1(this.f46444c);
                if (z13 instanceof m9) {
                    o3Var.f46577j3.c0(0, 0, (m9) z13);
                    return;
                }
                return;
            case 15:
                o3 o3Var2 = this.f46443b;
                View z14 = o3Var2.z1(this.f46444c);
                if (z14 instanceof m9) {
                    if (z14 instanceof s5) {
                        i9 = ((s5) z14).getEditText().length();
                    } else {
                        i9 = 0;
                    }
                    o3Var2.f46577j3.c0(0, i9, (m9) z14);
                    return;
                }
                return;
            case 16:
                this.f46443b.f3(this.f46444c);
                return;
            case 17:
                View z15 = this.f46443b.z1(this.f46444c);
                if (z15 instanceof s5) {
                    s5 s5Var2 = (s5) z15;
                    s5Var2.B();
                    s5Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View z16 = this.f46443b.z1(this.f46444c);
                if (z16 instanceof s5) {
                    s5 s5Var3 = (s5) z16;
                    s5Var3.B();
                    s5Var3.getEditText().setSelection(s5Var3.getEditText().length());
                    return;
                } else if (z16 instanceof f5) {
                    f5 f5Var = (f5) z16;
                    if (f5Var.getGrid().getChildCount() > 0) {
                        View childAt = f5Var.getGrid().getChildAt(0);
                        if (childAt instanceof i5) {
                            ((i5) childAt).f46448a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f46443b.e3(this.f46444c);
                return;
            case 20:
                View z17 = this.f46443b.z1(this.f46444c);
                if (z17 instanceof q0) {
                    ((q0) z17).d.r();
                    return;
                }
                return;
            case 21:
                this.f46443b.e3(this.f46444c);
                return;
            case 22:
                this.f46443b.e3(this.f46444c);
                return;
            case 23:
                View z18 = this.f46443b.z1(this.f46444c);
                if (z18 instanceof s5) {
                    s5 s5Var4 = (s5) z18;
                    s5Var4.B();
                    s5Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f46443b.d3(this.f46444c);
                return;
            case 25:
                this.f46443b.Z4("", this.f46444c);
                return;
            case 26:
                this.f46443b.d3(this.f46444c);
                return;
            case 27:
                this.f46443b.d3(this.f46444c);
                return;
            case 28:
                this.f46443b.d3(this.f46444c);
                return;
            default:
                this.f46443b.d3(this.f46444c);
                return;
        }
    }
}
