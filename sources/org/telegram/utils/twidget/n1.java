package org.telegram.utils.twidget;
public final class n1 {
    public final d0 f54856a;
    public final o1[] f54857b;
    public final double f54858c;
    public final int d;
    public final int f54859e;
    public final int f54860f;
    public final v1 f54861g;
    public final boolean h;
    public final boolean f54862i;

    public n1(d0 d0Var, o1[] o1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, v1 v1Var, boolean z10, boolean z11) {
        this.f54861g = v1Var;
        this.h = z10;
        this.f54862i = z11;
        this.f54856a = d0Var;
        this.f54857b = o1VarArr;
        this.f54858c = d;
        this.d = i7;
        this.f54859e = i10;
        this.f54860f = i13;
    }

    public final boolean a() {
        if (!this.f54856a.e()) {
            return false;
        }
        for (o1 o1Var : this.f54857b) {
            if (!o1Var.f54870a.e()) {
                return false;
            }
        }
        return true;
    }
}
