package qh;

import android.view.View;
import g7.a6;
public final class e3 extends a6 {
    public final m3 f46365a;
    public final o3 f46366b;

    public e3(o3 o3Var, m3 m3Var) {
        this.f46366b = o3Var;
        this.f46365a = m3Var;
    }

    @Override
    public final void a(boolean z10) {
        this.f46365a.h0();
        o3 o3Var = this.f46366b;
        if (z10) {
            c3 c3Var = o3Var.f46577j3;
            o3Var.f46581l3 = c3Var.G0;
            o3Var.f46583m3 = c3Var.H0;
            o3Var.f46585n3 = c3Var.I0;
            o3Var.setEditTextsLocked(true);
            o3Var.n3();
            o3Var.V2();
            return;
        }
        final int i9 = o3Var.f46581l3;
        final int i10 = o3Var.f46583m3;
        final int i11 = o3Var.f46585n3;
        o3Var.f46581l3 = -1;
        o3Var.f46583m3 = -1;
        o3Var.f46585n3 = 0;
        boolean z11 = o3Var.f46587o3;
        final float f10 = o3Var.f46588p3;
        final float f11 = o3Var.f46589q3;
        o3Var.f46587o3 = false;
        o3Var.setEditTextsLocked(false);
        o3Var.V2();
        if (z11) {
            o3Var.post(new Runnable() {
                @Override
                public final void run() {
                    o3 o3Var2 = e3.this.f46366b;
                    for (int i12 = 0; i12 < o3Var2.getChildCount(); i12++) {
                        View childAt = o3Var2.getChildAt(i12);
                        boolean z12 = childAt instanceof s5;
                        float f12 = f10;
                        float f13 = f11;
                        if (z12) {
                            s5 s5Var = (s5) childAt;
                            if (!o3.h4(s5Var.getEditText(), f12, f13)) {
                                if (s5Var.n() && o3.h4(s5Var.getAuthorEditText(), f12, f13)) {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else if (childAt instanceof i0) {
                            if (o3.h4(((i0) childAt).getCaptionEditText(), f12, f13)) {
                                return;
                            }
                        } else if ((childAt instanceof q0) && o3.h4(((q0) childAt).getEditText(), f12, f13)) {
                            return;
                        }
                    }
                    int i13 = i9;
                    if (i13 >= 0) {
                        o3.K1(o3Var2, i13, i11, i10);
                    }
                }
            });
        } else if (i9 >= 0) {
            o3Var.post(new kh.c0(this, i9, i11, i10, 3));
        } else {
            View findFocus = o3Var.findFocus();
            if (findFocus instanceof d1) {
                o3Var.post(new y0((d1) findFocus, 2));
            }
        }
    }
}
