package org.telegram.utils.twidget;
public final class f0 {
    public final g f52757a;
    public final g0[] f52758b;
    public final double f52759c;
    public final int d;
    public final int f52760e;
    public final m0 f52761f;
    public final boolean f52762g;
    public final boolean h;

    public f0(g gVar, g0[] g0VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m0 m0Var, boolean z9, boolean z10) {
        this.f52761f = m0Var;
        this.f52762g = z9;
        this.h = z10;
        this.f52757a = gVar;
        this.f52758b = g0VarArr;
        this.f52759c = d;
        this.d = i7;
        this.f52760e = i10;
    }

    public final boolean a() {
        if (!this.f52757a.f()) {
            return false;
        }
        for (g0 g0Var : this.f52758b) {
            if (!g0Var.f52766a.f()) {
                return false;
            }
        }
        return true;
    }
}
