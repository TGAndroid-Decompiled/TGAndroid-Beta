package org.telegram.utils.twidget;
public final class f1 {
    public final c0 f52786a;
    public final g1[] f52787b;
    public final double f52788c;
    public final int d;
    public final int f52789e;
    public final m1 f52790f;
    public final boolean f52791g;
    public final boolean h;

    public f1(c0 c0Var, g1[] g1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m1 m1Var, boolean z9, boolean z10) {
        this.f52790f = m1Var;
        this.f52791g = z9;
        this.h = z10;
        this.f52786a = c0Var;
        this.f52787b = g1VarArr;
        this.f52788c = d;
        this.d = i7;
        this.f52789e = i10;
    }

    public final boolean a() {
        if (!this.f52786a.e()) {
            return false;
        }
        for (g1 g1Var : this.f52787b) {
            if (!g1Var.f52795a.e()) {
                return false;
            }
        }
        return true;
    }
}
