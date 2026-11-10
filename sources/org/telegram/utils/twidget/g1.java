package org.telegram.utils.twidget;
public final class g1 {
    public final c0 f52803a;
    public final h1[] f52804b;
    public final double f52805c;
    public final int d;
    public final int f52806e;
    public final n1 f52807f;
    public final boolean f52808g;
    public final boolean h;

    public g1(c0 c0Var, h1[] h1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, n1 n1Var, boolean z9, boolean z10) {
        this.f52807f = n1Var;
        this.f52808g = z9;
        this.h = z10;
        this.f52803a = c0Var;
        this.f52804b = h1VarArr;
        this.f52805c = d;
        this.d = i7;
        this.f52806e = i10;
    }

    public final boolean a() {
        if (!this.f52803a.e()) {
            return false;
        }
        for (h1 h1Var : this.f52804b) {
            if (!h1Var.f52833a.e()) {
                return false;
            }
        }
        return true;
    }
}
