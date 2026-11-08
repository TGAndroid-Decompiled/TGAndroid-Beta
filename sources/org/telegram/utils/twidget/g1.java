package org.telegram.utils.twidget;
public final class g1 {
    public final c0 f52790a;
    public final h1[] f52791b;
    public final double f52792c;
    public final int d;
    public final int f52793e;
    public final n1 f52794f;
    public final boolean f52795g;
    public final boolean h;

    public g1(c0 c0Var, h1[] h1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, n1 n1Var, boolean z9, boolean z10) {
        this.f52794f = n1Var;
        this.f52795g = z9;
        this.h = z10;
        this.f52790a = c0Var;
        this.f52791b = h1VarArr;
        this.f52792c = d;
        this.d = i7;
        this.f52793e = i10;
    }

    public final boolean a() {
        if (!this.f52790a.e()) {
            return false;
        }
        for (h1 h1Var : this.f52791b) {
            if (!h1Var.f52820a.e()) {
                return false;
            }
        }
        return true;
    }
}
