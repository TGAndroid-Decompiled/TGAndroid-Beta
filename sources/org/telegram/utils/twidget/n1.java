package org.telegram.utils.twidget;
public final class n1 {
    public final d0 f54898a;
    public final o1[] f54899b;
    public final double f54900c;
    public final int d;
    public final int f54901e;
    public final int f54902f;
    public final v1 f54903g;
    public final boolean h;
    public final boolean f54904i;

    public n1(d0 d0Var, o1[] o1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, v1 v1Var, boolean z10, boolean z11) {
        this.f54903g = v1Var;
        this.h = z10;
        this.f54904i = z11;
        this.f54898a = d0Var;
        this.f54899b = o1VarArr;
        this.f54900c = d;
        this.d = i7;
        this.f54901e = i10;
        this.f54902f = i13;
    }

    public final boolean a() {
        if (!this.f54898a.e()) {
            return false;
        }
        for (o1 o1Var : this.f54899b) {
            if (!o1Var.f54912a.e()) {
                return false;
            }
        }
        return true;
    }
}
