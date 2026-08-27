package rh;

import android.view.KeyEvent;
import android.view.View;

public final class f3 extends h7.j0 {

    public final n3 f47140a;

    public final p3 f47141b;

    public f3(p3 p3Var, n3 n3Var) {
        this.f47141b = p3Var;
        this.f47140a = n3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f47140a.h0();
        p3 p3Var = this.f47141b;
        if (z10) {
            d3 d3Var = p3Var.f47352j3;
            p3Var.f47356l3 = d3Var.G0;
            p3Var.f47358m3 = d3Var.H0;
            p3Var.f47360n3 = d3Var.I0;
            p3Var.setEditTextsLocked(true);
            p3Var.n3();
            p3Var.V2();
            return;
        }
        final int i10 = p3Var.f47356l3;
        final int i11 = p3Var.f47358m3;
        final int i12 = p3Var.f47360n3;
        p3Var.f47356l3 = -1;
        p3Var.f47358m3 = -1;
        p3Var.f47360n3 = 0;
        boolean z11 = p3Var.f47362o3;
        final float f10 = p3Var.f47363p3;
        final float f11 = p3Var.f47364q3;
        p3Var.f47362o3 = false;
        p3Var.setEditTextsLocked(false);
        p3Var.V2();
        if (z11) {
            p3Var.post(new Runnable() {
                @Override
                public final void run() {
                    p3 p3Var2 = this.f47123a.f47141b;
                    for (int i13 = 0; i13 < p3Var2.getChildCount(); i13++) {
                        KeyEvent.Callback childAt = p3Var2.getChildAt(i13);
                        boolean z12 = childAt instanceof t5;
                        float f12 = f10;
                        float f13 = f11;
                        if (z12) {
                            t5 t5Var = (t5) childAt;
                            if (p3.h4(t5Var.getEditText(), f12, f13)) {
                                return;
                            }
                            if (t5Var.n() && p3.h4(t5Var.getAuthorEditText(), f12, f13)) {
                                return;
                            }
                        } else if (childAt instanceof i0) {
                            if (p3.h4(((i0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof q0) && p3.h4(((q0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i14 = i10;
                    if (i14 >= 0) {
                        p3.K1(p3Var2, i14, i12, i11);
                    }
                }
            });
            return;
        }
        if (i10 >= 0) {
            p3Var.post(new lh.c0(this, i10, i12, i11, 3));
            return;
        }
        View viewFindFocus = p3Var.findFocus();
        if (viewFindFocus instanceof d1) {
            p3Var.post(new y0((d1) viewFindFocus, 2));
        }
    }
}
