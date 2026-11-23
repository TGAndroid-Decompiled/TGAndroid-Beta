package wi;

import android.content.SharedPreferences;
import org.telegram.ui.Components.jn;
public final class c implements r1.c {
    public final int f59945a;
    public final Object f59946b;

    public c(Object obj, int i7) {
        this.f59945a = i7;
        this.f59946b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f59945a) {
            case 0:
                ((SharedPreferences) jn.m().f36522b).edit().putFloat("x", f10).apply();
                ((h) this.f59946b).f59956a.f59998b.f();
                return;
            case 1:
                ((SharedPreferences) jn.m().f36522b).edit().putFloat("y", f10).apply();
                ((h) this.f59946b).f59956a.f59998b.f();
                return;
            default:
                ((h2.f) this.f59946b).e();
                return;
        }
    }
}
