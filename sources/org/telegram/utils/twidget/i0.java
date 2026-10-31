package org.telegram.utils.twidget;
public final class i0 {
    public final g f44353a;
    public final j0[] f44354b;
    public final double f44355c;
    public final int d;
    public final int e;
    public final int f44356f;
    public final q0 f44357g;
    public final boolean h;
    public final boolean f44358i;

    public i0(g gVar, j0[] j0VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, q0 q0Var, boolean z10, boolean z11) {
        this.f44357g = q0Var;
        this.h = z10;
        this.f44358i = z11;
        this.f44353a = gVar;
        this.f44354b = j0VarArr;
        this.f44355c = d;
        this.d = i10;
        this.e = i11;
        this.f44356f = i14;
    }

    public final boolean a() {
        if (!this.f44353a.f()) {
            return false;
        }
        for (j0 j0Var : this.f44354b) {
            if (!j0Var.f44360a.f()) {
                return false;
            }
        }
        return true;
    }
}
