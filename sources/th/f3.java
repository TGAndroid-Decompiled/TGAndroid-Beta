package th;

import android.view.View;
import i7.b6;
public final class f3 extends b6 {
    public final n3 f48440a;
    public final p3 f48441b;

    public f3(p3 p3Var, n3 n3Var) {
        this.f48441b = p3Var;
        this.f48440a = n3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f48440a.b0();
        p3 p3Var = this.f48441b;
        if (z10) {
            d3 d3Var = p3Var.f48650j3;
            p3Var.f48654l3 = d3Var.G0;
            p3Var.f48656m3 = d3Var.H0;
            p3Var.f48658n3 = d3Var.I0;
            p3Var.setEditTextsLocked(true);
            p3Var.n3();
            p3Var.V2();
            return;
        }
        final int i10 = p3Var.f48654l3;
        final int i11 = p3Var.f48656m3;
        final int i12 = p3Var.f48658n3;
        p3Var.f48654l3 = -1;
        p3Var.f48656m3 = -1;
        p3Var.f48658n3 = 0;
        boolean z11 = p3Var.f48660o3;
        final float f9 = p3Var.f48661p3;
        final float f10 = p3Var.f48662q3;
        p3Var.f48660o3 = false;
        p3Var.setEditTextsLocked(false);
        p3Var.V2();
        if (z11) {
            p3Var.post(new Runnable() {
                @Override
                public final void run() {
                    p3 p3Var2 = f3.this.f48441b;
                    for (int i13 = 0; i13 < p3Var2.getChildCount(); i13++) {
                        View childAt = p3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof t5;
                        float f11 = f9;
                        float f12 = f10;
                        if (z12) {
                            t5 t5Var = (t5) childAt;
                            if (!p3.h4(t5Var.getEditText(), f11, f12)) {
                                if (t5Var.n() && p3.h4(t5Var.getAuthorEditText(), f11, f12)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof i0) {
                            if (p3.h4(((i0) childAt).getCaptionEditText(), f11, f12)) {
                                return;
                            }
                        } else if ((childAt instanceof q0) && p3.h4(((q0) childAt).getEditText(), f11, f12)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        p3.K1(p3Var2, i14, i12, i11);
                    }
                }
            });
        } else if (i10 >= 0) {
            p3Var.post(new nh.c0(this, i10, i12, i11, 3));
        } else {
            View findFocus = p3Var.findFocus();
            if (findFocus instanceof d1) {
                p3Var.post(new y0((d1) findFocus, 2));
            }
        }
    }
}
