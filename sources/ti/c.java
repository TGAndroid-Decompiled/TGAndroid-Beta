package ti;

import ab.d0;
public final class c implements r1.c {
    public final int f55952a;
    public final Object f55953b;

    public c(Object obj, int i7) {
        this.f55952a = i7;
        this.f55953b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f55952a) {
            case 0:
                d0.b().f918a.edit().putFloat("x", f10).apply();
                ((i) this.f55953b).f55965a.f56007b.f();
                return;
            case 1:
                d0.b().f918a.edit().putFloat("y", f10).apply();
                ((i) this.f55953b).f55965a.f56007b.f();
                return;
            default:
                ((h2.f) this.f55953b).e();
                return;
        }
    }
}
