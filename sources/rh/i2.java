package rh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.i9;

public final class i2 implements Runnable {

    public final int f47188a;

    public final p3 f47189b;

    public final a f47190c;

    public i2(p3 p3Var, a aVar, int i10) {
        this.f47188a = i10;
        this.f47189b = p3Var;
        this.f47190c = aVar;
    }

    @Override
    public final void run() {
        switch (this.f47188a) {
            case 0:
                this.f47189b.d3(this.f47190c);
                break;
            case 1:
                View viewZ1 = this.f47189b.z1(this.f47190c);
                if (viewZ1 instanceof t5) {
                    t5 t5Var = (t5) viewZ1;
                    t5Var.B();
                    t5Var.getEditText().setSelection(0);
                }
                break;
            case 2:
                this.f47189b.d3(this.f47190c);
                break;
            case 3:
                this.f47189b.c3(this.f47190c, true);
                break;
            case 4:
                this.f47189b.c3(this.f47190c, false);
                break;
            case 5:
                this.f47189b.c3(this.f47190c, true);
                break;
            case 6:
                this.f47189b.d3(this.f47190c);
                break;
            case 7:
                this.f47189b.b3(this.f47190c, false);
                break;
            case 8:
                this.f47189b.b3(this.f47190c, true);
                break;
            case 9:
                this.f47189b.d3(this.f47190c);
                break;
            case 10:
                this.f47189b.b3(this.f47190c, true);
                break;
            case 11:
                this.f47189b.d3(this.f47190c);
                break;
            case 12:
                this.f47189b.c3(this.f47190c, false);
                break;
            case 13:
                this.f47189b.b3(this.f47190c, true);
                break;
            case 14:
                p3 p3Var = this.f47189b;
                KeyEvent.Callback callbackZ1 = p3Var.z1(this.f47190c);
                if (callbackZ1 instanceof i9) {
                    p3Var.f47352j3.c0(0, 0, (i9) callbackZ1);
                }
                break;
            case 15:
                p3 p3Var2 = this.f47189b;
                KeyEvent.Callback callbackZ2 = p3Var2.z1(this.f47190c);
                if (callbackZ2 instanceof i9) {
                    p3Var2.f47352j3.c0(0, callbackZ2 instanceof t5 ? ((t5) callbackZ2).getEditText().length() : 0, (i9) callbackZ2);
                }
                break;
            case 16:
                this.f47189b.f3(this.f47190c);
                break;
            case 17:
                View viewZ2 = this.f47189b.z1(this.f47190c);
                if (viewZ2 instanceof t5) {
                    t5 t5Var2 = (t5) viewZ2;
                    t5Var2.B();
                    t5Var2.getEditText().setSelection(0);
                }
                break;
            case 18:
                View viewZ3 = this.f47189b.z1(this.f47190c);
                if (viewZ3 instanceof t5) {
                    t5 t5Var3 = (t5) viewZ3;
                    t5Var3.B();
                    t5Var3.getEditText().setSelection(t5Var3.getEditText().length());
                } else if (viewZ3 instanceof g5) {
                    g5 g5Var = (g5) viewZ3;
                    if (g5Var.getGrid().getChildCount() > 0) {
                        View childAt = g5Var.getGrid().getChildAt(0);
                        if (childAt instanceof j5) {
                            ((j5) childAt).f47226a.r();
                        }
                    }
                }
                break;
            case 19:
                this.f47189b.e3(this.f47190c);
                break;
            case 20:
                View viewZ4 = this.f47189b.z1(this.f47190c);
                if (viewZ4 instanceof q0) {
                    ((q0) viewZ4).d.r();
                }
                break;
            case 21:
                this.f47189b.e3(this.f47190c);
                break;
            case 22:
                this.f47189b.e3(this.f47190c);
                break;
            case 23:
                View viewZ5 = this.f47189b.z1(this.f47190c);
                if (viewZ5 instanceof t5) {
                    t5 t5Var4 = (t5) viewZ5;
                    t5Var4.B();
                    t5Var4.getEditText().setSelection(0);
                }
                break;
            case 24:
                this.f47189b.d3(this.f47190c);
                break;
            case 25:
                this.f47189b.Z4("", this.f47190c);
                break;
            case 26:
                this.f47189b.d3(this.f47190c);
                break;
            case 27:
                this.f47189b.d3(this.f47190c);
                break;
            case 28:
                this.f47189b.d3(this.f47190c);
                break;
            default:
                this.f47189b.d3(this.f47190c);
                break;
        }
    }
}
