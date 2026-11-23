package org.telegram.utils.twidget;
public final class n1 {
    public final d0 f54983a;
    public final o1[] f54984b;
    public final double f54985c;
    public final int d;
    public final int f54986e;
    public final int f54987f;
    public final v1 f54988g;
    public final boolean h;
    public final boolean f54989i;

    public n1(d0 d0Var, o1[] o1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, v1 v1Var, boolean z10, boolean z11) {
        this.f54988g = v1Var;
        this.h = z10;
        this.f54989i = z11;
        this.f54983a = d0Var;
        this.f54984b = o1VarArr;
        this.f54985c = d;
        this.d = i7;
        this.f54986e = i10;
        this.f54987f = i13;
    }

    public final boolean a() {
        if (!this.f54983a.e()) {
            return false;
        }
        for (o1 o1Var : this.f54984b) {
            if (!o1Var.f54997a.e()) {
                return false;
            }
        }
        return true;
    }
}
