package org.telegram.utils.twidget;
public final class i0 {
    public final g f44364a;
    public final j0[] f44365b;
    public final double f44366c;
    public final int d;
    public final int e;
    public final int f44367f;
    public final q0 f44368g;
    public final boolean h;
    public final boolean f44369i;

    public i0(g gVar, j0[] j0VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, q0 q0Var, boolean z10, boolean z11) {
        this.f44368g = q0Var;
        this.h = z10;
        this.f44369i = z11;
        this.f44364a = gVar;
        this.f44365b = j0VarArr;
        this.f44366c = d;
        this.d = i10;
        this.e = i11;
        this.f44367f = i14;
    }

    public final boolean a() {
        if (!this.f44364a.f()) {
            return false;
        }
        for (j0 j0Var : this.f44365b) {
            if (!j0Var.f44371a.f()) {
                return false;
            }
        }
        return true;
    }
}
