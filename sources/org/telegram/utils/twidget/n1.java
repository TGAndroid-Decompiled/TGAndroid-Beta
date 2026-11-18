package org.telegram.utils.twidget;
public final class n1 {
    public final d0 f54857a;
    public final o1[] f54858b;
    public final double f54859c;
    public final int d;
    public final int f54860e;
    public final int f54861f;
    public final v1 f54862g;
    public final boolean h;
    public final boolean f54863i;

    public n1(d0 d0Var, o1[] o1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, v1 v1Var, boolean z10, boolean z11) {
        this.f54862g = v1Var;
        this.h = z10;
        this.f54863i = z11;
        this.f54857a = d0Var;
        this.f54858b = o1VarArr;
        this.f54859c = d;
        this.d = i7;
        this.f54860e = i10;
        this.f54861f = i13;
    }

    public final boolean a() {
        if (!this.f54857a.e()) {
            return false;
        }
        for (o1 o1Var : this.f54858b) {
            if (!o1Var.f54871a.e()) {
                return false;
            }
        }
        return true;
    }
}
