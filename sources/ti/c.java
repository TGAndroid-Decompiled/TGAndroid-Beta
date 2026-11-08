package ti;

import ab.d0;
public final class c implements r1.c {
    public final int f56069a;
    public final Object f56070b;

    public c(Object obj, int i7) {
        this.f56069a = i7;
        this.f56070b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f56069a) {
            case 0:
                d0.b().f918a.edit().putFloat("x", f10).apply();
                ((i) this.f56070b).f56082a.f56124b.f();
                return;
            case 1:
                d0.b().f918a.edit().putFloat("y", f10).apply();
                ((i) this.f56070b).f56082a.f56124b.f();
                return;
            default:
                ((h2.f) this.f56070b).e();
                return;
        }
    }
}
