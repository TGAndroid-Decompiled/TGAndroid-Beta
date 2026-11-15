package wi;

import android.content.SharedPreferences;
public final class c implements r1.c {
    public final int f59370a;
    public final Object f59371b;

    public c(Object obj, int i7) {
        this.f59370a = i7;
        this.f59371b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f59370a) {
            case 0:
                ((SharedPreferences) u7.i.b().f57880a).edit().putFloat("x", f10).apply();
                ((h) this.f59371b).f59381a.f59423b.f();
                return;
            case 1:
                ((SharedPreferences) u7.i.b().f57880a).edit().putFloat("y", f10).apply();
                ((h) this.f59371b).f59381a.f59423b.f();
                return;
            default:
                ((h2.f) this.f59371b).e();
                return;
        }
    }
}
