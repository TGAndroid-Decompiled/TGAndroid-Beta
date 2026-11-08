package ti;

import ab.d0;
public final class c implements r1.c {
    public final int f56068a;
    public final Object f56069b;

    public c(Object obj, int i7) {
        this.f56068a = i7;
        this.f56069b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.f56068a) {
            case 0:
                d0.b().f918a.edit().putFloat("x", f10).apply();
                ((i) this.f56069b).f56081a.f56123b.f();
                return;
            case 1:
                d0.b().f918a.edit().putFloat("y", f10).apply();
                ((i) this.f56069b).f56081a.f56123b.f();
                return;
            default:
                ((h2.f) this.f56069b).e();
                return;
        }
    }
}
