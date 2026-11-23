package org.telegram.utils.twidget;
public final class n1 {
    public final d0 f54867a;
    public final o1[] f54868b;
    public final double f54869c;
    public final int d;
    public final int f54870e;
    public final int f54871f;
    public final v1 f54872g;
    public final boolean h;
    public final boolean f54873i;

    public n1(d0 d0Var, o1[] o1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, v1 v1Var, boolean z10, boolean z11) {
        this.f54872g = v1Var;
        this.h = z10;
        this.f54873i = z11;
        this.f54867a = d0Var;
        this.f54868b = o1VarArr;
        this.f54869c = d;
        this.d = i7;
        this.f54870e = i10;
        this.f54871f = i13;
    }

    public final boolean a() {
        if (!this.f54867a.e()) {
            return false;
        }
        for (o1 o1Var : this.f54868b) {
            if (!o1Var.f54881a.e()) {
                return false;
            }
        }
        return true;
    }
}
