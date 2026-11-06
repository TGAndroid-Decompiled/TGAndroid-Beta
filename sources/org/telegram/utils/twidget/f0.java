package org.telegram.utils.twidget;
public final class f0 {
    public final g f52781a;
    public final g0[] f52782b;
    public final double f52783c;
    public final int d;
    public final int f52784e;
    public final m0 f52785f;
    public final boolean f52786g;
    public final boolean h;

    public f0(g gVar, g0[] g0VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m0 m0Var, boolean z9, boolean z10) {
        this.f52785f = m0Var;
        this.f52786g = z9;
        this.h = z10;
        this.f52781a = gVar;
        this.f52782b = g0VarArr;
        this.f52783c = d;
        this.d = i7;
        this.f52784e = i10;
    }

    public final boolean a() {
        if (!this.f52781a.f()) {
            return false;
        }
        for (g0 g0Var : this.f52782b) {
            if (!g0Var.f52790a.f()) {
                return false;
            }
        }
        return true;
    }
}
