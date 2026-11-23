package wi;

import android.content.SharedPreferences;
import org.telegram.ui.Components.jn;
public final class c implements r1.c {
    public final int f59980a;
    public final Object f59981b;

    public c(Object obj, int i7) {
        this.f59980a = i7;
        this.f59981b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f59980a) {
            case 0:
                ((SharedPreferences) jn.m().f36567b).edit().putFloat("x", f10).apply();
                ((h) this.f59981b).f59991a.f60033b.f();
                return;
            case 1:
                ((SharedPreferences) jn.m().f36567b).edit().putFloat("y", f10).apply();
                ((h) this.f59981b).f59991a.f60033b.f();
                return;
            default:
                ((h2.f) this.f59981b).e();
                return;
        }
    }
}
