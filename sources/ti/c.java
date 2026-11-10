package ti;

import ab.d0;
public final class c implements r1.c {
    public final int f56080a;
    public final Object f56081b;

    public c(Object obj, int i7) {
        this.f56080a = i7;
        this.f56081b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f56080a) {
            case 0:
                d0.b().f918a.edit().putFloat("x", f10).apply();
                ((i) this.f56081b).f56093a.f56135b.f();
                return;
            case 1:
                d0.b().f918a.edit().putFloat("y", f10).apply();
                ((i) this.f56081b).f56093a.f56135b.f();
                return;
            default:
                ((h2.f) this.f56081b).e();
                return;
        }
    }
}
