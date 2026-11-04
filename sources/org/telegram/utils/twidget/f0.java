package org.telegram.utils.twidget;
public final class f0 {
    public final g f52848a;
    public final g0[] f52849b;
    public final double f52850c;
    public final int d;
    public final int f52851e;
    public final m0 f52852f;
    public final boolean f52853g;
    public final boolean h;

    public f0(g gVar, g0[] g0VarArr, double d, int i3, int i10, float f10, float f11, int i11, int i12, int i13, m0 m0Var, boolean z10, boolean z11) {
        this.f52852f = m0Var;
        this.f52853g = z10;
        this.h = z11;
        this.f52848a = gVar;
        this.f52849b = g0VarArr;
        this.f52850c = d;
        this.d = i3;
        this.f52851e = i10;
    }

    public final boolean a() {
        if (!this.f52848a.f()) {
            return false;
        }
        for (g0 g0Var : this.f52849b) {
            if (!g0Var.f52857a.f()) {
                return false;
            }
        }
        return true;
    }
}
