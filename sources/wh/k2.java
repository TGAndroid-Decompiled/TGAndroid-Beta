package wh;

import android.view.View;
import org.telegram.ui.Cells.l9;
public final class k2 implements Runnable {
    public final int f49861a;
    public final r3 f49862b;
    public final a f49863c;

    public k2(r3 r3Var, a aVar, int i10) {
        this.f49861a = i10;
        this.f49862b = r3Var;
        this.f49863c = aVar;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f49861a) {
            case 0:
                this.f49862b.c3(this.f49863c);
                return;
            case 1:
                View y12 = this.f49862b.y1(this.f49863c);
                if (y12 instanceof v5) {
                    v5 v5Var = (v5) y12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
                    return;
                }
                return;
            case 2:
                this.f49862b.c3(this.f49863c);
                return;
            case 3:
                this.f49862b.b3(this.f49863c, true);
                return;
            case 4:
                this.f49862b.b3(this.f49863c, false);
                return;
            case 5:
                this.f49862b.b3(this.f49863c, true);
                return;
            case 6:
                this.f49862b.c3(this.f49863c);
                return;
            case 7:
                this.f49862b.a3(this.f49863c, false);
                return;
            case 8:
                this.f49862b.a3(this.f49863c, true);
                return;
            case 9:
                this.f49862b.c3(this.f49863c);
                return;
            case 10:
                this.f49862b.a3(this.f49863c, true);
                return;
            case 11:
                this.f49862b.c3(this.f49863c);
                return;
            case 12:
                this.f49862b.b3(this.f49863c, false);
                return;
            case 13:
                this.f49862b.a3(this.f49863c, true);
                return;
            case 14:
                r3 r3Var = this.f49862b;
                View y13 = r3Var.y1(this.f49863c);
                if (y13 instanceof l9) {
                    r3Var.f50028k3.c0(0, 0, (l9) y13);
                    return;
                }
                return;
            case 15:
                r3 r3Var2 = this.f49862b;
                View y14 = r3Var2.y1(this.f49863c);
                if (y14 instanceof l9) {
                    if (y14 instanceof v5) {
                        i10 = ((v5) y14).getEditText().length();
                    } else {
                        i10 = 0;
                    }
                    r3Var2.f50028k3.c0(0, i10, (l9) y14);
                    return;
                }
                return;
            case 16:
                this.f49862b.e3(this.f49863c);
                return;
            case 17:
                View y15 = this.f49862b.y1(this.f49863c);
                if (y15 instanceof v5) {
                    v5 v5Var2 = (v5) y15;
                    v5Var2.B();
                    v5Var2.getEditText().setSelection(0);
                    return;
                }
                return;
            case 18:
                View y16 = this.f49862b.y1(this.f49863c);
                if (y16 instanceof v5) {
                    v5 v5Var3 = (v5) y16;
                    v5Var3.B();
                    v5Var3.getEditText().setSelection(v5Var3.getEditText().length());
                    return;
                } else if (y16 instanceof i5) {
                    i5 i5Var = (i5) y16;
                    if (i5Var.getGrid().getChildCount() > 0) {
                        View childAt = i5Var.getGrid().getChildAt(0);
                        if (childAt instanceof l5) {
                            ((l5) childAt).f49903a.r();
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 19:
                this.f49862b.d3(this.f49863c);
                return;
            case 20:
                View y17 = this.f49862b.y1(this.f49863c);
                if (y17 instanceof r0) {
                    ((r0) y17).d.r();
                    return;
                }
                return;
            case 21:
                this.f49862b.d3(this.f49863c);
                return;
            case 22:
                this.f49862b.d3(this.f49863c);
                return;
            case 23:
                View y18 = this.f49862b.y1(this.f49863c);
                if (y18 instanceof v5) {
                    v5 v5Var4 = (v5) y18;
                    v5Var4.B();
                    v5Var4.getEditText().setSelection(0);
                    return;
                }
                return;
            case 24:
                this.f49862b.c3(this.f49863c);
                return;
            case 25:
                this.f49862b.Y4("", this.f49863c);
                return;
            case 26:
                this.f49862b.c3(this.f49863c);
                return;
            case 27:
                this.f49862b.c3(this.f49863c);
                return;
            case 28:
                this.f49862b.c3(this.f49863c);
                return;
            default:
                this.f49862b.c3(this.f49863c);
                return;
        }
    }
}
