package org.telegram.utils.twidget;
public final class n1 {
    public final d0 f54902a;
    public final o1[] f54903b;
    public final double f54904c;
    public final int d;
    public final int f54905e;
    public final int f54906f;
    public final v1 f54907g;
    public final boolean h;
    public final boolean f54908i;

    public n1(d0 d0Var, o1[] o1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, v1 v1Var, boolean z10, boolean z11) {
        this.f54907g = v1Var;
        this.h = z10;
        this.f54908i = z11;
        this.f54902a = d0Var;
        this.f54903b = o1VarArr;
        this.f54904c = d;
        this.d = i7;
        this.f54905e = i10;
        this.f54906f = i13;
    }

    public final boolean a() {
        if (!this.f54902a.e()) {
            return false;
        }
        for (o1 o1Var : this.f54903b) {
            if (!o1Var.f54916a.e()) {
                return false;
            }
        }
        return true;
    }
}
