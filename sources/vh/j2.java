package vh;

import android.view.View;
import org.telegram.ui.Cells.l9;
public final class j2 implements Runnable {
    public final int f45956a;
    public final r3 f45957b;
    public final a f45958c;

    public j2(r3 r3Var, a aVar, int i10) {
        this.f45956a = i10;
        this.f45957b = r3Var;
        this.f45958c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f45956a) {
            case 0:
                this.f45957b.d3(this.f45958c);
                return;
            case 1:
                View z12 = this.f45957b.z1(this.f45958c);
                if (z12 instanceof v5) {
                    v5 v5Var = (v5) z12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f45957b.d3(this.f45958c);
                return;
            case 3:
                this.f45957b.c3(this.f45958c, true);
                return;
            case 4:
                this.f45957b.c3(this.f45958c, false);
                return;
            case 5:
                this.f45957b.c3(this.f45958c, true);
                return;
            case 6:
                this.f45957b.d3(this.f45958c);
                return;
            case 7:
                this.f45957b.b3(this.f45958c, false);
                return;
            case 8:
                this.f45957b.b3(this.f45958c, true);
                return;
            case 9:
                this.f45957b.d3(this.f45958c);
                return;
            case 10:
                this.f45957b.b3(this.f45958c, true);
                return;
            case 11:
                this.f45957b.d3(this.f45958c);
                return;
            case 12:
                this.f45957b.c3(this.f45958c, false);
                return;
            case 13:
                this.f45957b.b3(this.f45958c, true);
                return;
            case 14:
                r3 r3Var = this.f45957b;
                View z13 = r3Var.z1(this.f45958c);
                if (z13 instanceof l9) {
                    r3Var.f46124k3.c0(0, 0, (l9) z13);
                    return;
                }
                return;
            case 15:
                r3 r3Var2 = this.f45957b;
                View z14 = r3Var2.z1(this.f45958c);
                if (z14 instanceof l9) {
                    if (z14 instanceof v5) {
                        i10 = ((v5) z14).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    r3Var2.f46124k3.c0(0, i10, (l9) z14);
                    return;
                }
                return;
            case 16:
                this.f45957b.f3(this.f45958c);
                return;
            case 17:
                View z15 = this.f45957b.z1(this.f45958c);
                if (z15 instanceof v5) {
                    v5 v5Var2 = (v5) z15;
                    v5Var2.B();
                    v5Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View z16 = this.f45957b.z1(this.f45958c);
                if (z16 instanceof v5) {
                    v5 v5Var3 = (v5) z16;
                    v5Var3.B();
                    v5Var3.getEditText().setSelection(v5Var3.getEditText().length());
                    return;
                } else if (z16 instanceof i5) {
                    i5 i5Var = (i5) z16;
                    if (i5Var.getGrid().getChildCount() > 0) {
                        View childAt = i5Var.getGrid().getChildAt(0);
                        if (childAt instanceof l5) {
                            ((l5) childAt).f46006a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f45957b.e3(this.f45958c);
                return;
            case 20:
                View z17 = this.f45957b.z1(this.f45958c);
                if (z17 instanceof q0) {
                    ((q0) z17).d.r();
                    return;
                }
                return;
            case 21:
                this.f45957b.e3(this.f45958c);
                return;
            case 22:
                this.f45957b.e3(this.f45958c);
                return;
            case 23:
                View z18 = this.f45957b.z1(this.f45958c);
                if (z18 instanceof v5) {
                    v5 v5Var4 = (v5) z18;
                    v5Var4.B();
                    v5Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f45957b.d3(this.f45958c);
                return;
            case 25:
                this.f45957b.Z4("", this.f45958c);
                return;
            case 26:
                this.f45957b.d3(this.f45958c);
                return;
            case 27:
                this.f45957b.d3(this.f45958c);
                return;
            case 28:
                this.f45957b.d3(this.f45958c);
                return;
            default:
                this.f45957b.d3(this.f45958c);
                return;
        }
    }
}
