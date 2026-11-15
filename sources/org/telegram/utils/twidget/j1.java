package org.telegram.utils.twidget;
public final class j1 {
    public final c0 f54259a;
    public final k1[] f54260b;
    public final double f54261c;
    public final int d;
    public final int f54262e;
    public final q1 f54263f;
    public final boolean f54264g;
    public final boolean h;

    public j1(c0 c0Var, k1[] k1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, q1 q1Var, boolean z10, boolean z11) {
        this.f54263f = q1Var;
        this.f54264g = z10;
        this.h = z11;
        this.f54259a = c0Var;
        this.f54260b = k1VarArr;
        this.f54261c = d;
        this.d = i7;
        this.f54262e = i10;
    }

    public final boolean a() {
        if (!this.f54259a.e()) {
            return false;
        }
        for (k1 k1Var : this.f54260b) {
            if (!k1Var.f54289a.e()) {
                return false;
            }
        }
        return true;
    }
}
