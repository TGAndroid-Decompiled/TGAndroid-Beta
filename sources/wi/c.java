package wi;

import android.content.SharedPreferences;
import org.telegram.ui.Components.jn;
public final class c implements r1.c {
    public final int f59976a;
    public final Object f59977b;

    public c(Object obj, int i7) {
        this.f59976a = i7;
        this.f59977b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f59976a) {
            case 0:
                ((SharedPreferences) jn.m().f36572b).edit().putFloat("x", f10).apply();
                ((h) this.f59977b).f59987a.f60029b.f();
                return;
            case 1:
                ((SharedPreferences) jn.m().f36572b).edit().putFloat("y", f10).apply();
                ((h) this.f59977b).f59987a.f60029b.f();
                return;
            default:
                ((h2.f) this.f59977b).e();
                return;
        }
    }
}
