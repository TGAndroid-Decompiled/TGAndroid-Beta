package org.telegram.utils.twidget;
public final class f0 {
    public final g f52783a;
    public final g0[] f52784b;
    public final double f52785c;
    public final int d;
    public final int f52786e;
    public final m0 f52787f;
    public final boolean f52788g;
    public final boolean h;

    public f0(g gVar, g0[] g0VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m0 m0Var, boolean z9, boolean z10) {
        this.f52787f = m0Var;
        this.f52788g = z9;
        this.h = z10;
        this.f52783a = gVar;
        this.f52784b = g0VarArr;
        this.f52785c = d;
        this.d = i7;
        this.f52786e = i10;
    }

    public final boolean a() {
        if (!this.f52783a.f()) {
            return false;
        }
        for (g0 g0Var : this.f52784b) {
            if (!g0Var.f52792a.f()) {
                return false;
            }
        }
        return true;
    }
}
