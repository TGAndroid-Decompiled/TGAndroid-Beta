package org.telegram.utils.twidget;
public final class g1 {
    public final c0 f52804a;
    public final h1[] f52805b;
    public final double f52806c;
    public final int d;
    public final int f52807e;
    public final n1 f52808f;
    public final boolean f52809g;
    public final boolean h;

    public g1(c0 c0Var, h1[] h1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, n1 n1Var, boolean z9, boolean z10) {
        this.f52808f = n1Var;
        this.f52809g = z9;
        this.h = z10;
        this.f52804a = c0Var;
        this.f52805b = h1VarArr;
        this.f52806c = d;
        this.d = i7;
        this.f52807e = i10;
    }

    public final boolean a() {
        if (!this.f52804a.e()) {
            return false;
        }
        for (h1 h1Var : this.f52805b) {
            if (!h1Var.f52834a.e()) {
                return false;
            }
        }
        return true;
    }
}
