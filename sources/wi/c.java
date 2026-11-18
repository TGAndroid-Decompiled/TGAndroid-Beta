package wi;

import android.content.SharedPreferences;
import org.telegram.ui.Components.hn;
public final class c implements r1.c {
    public final int f59935a;
    public final Object f59936b;

    public c(Object obj, int i7) {
        this.f59935a = i7;
        this.f59936b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f59935a) {
            case 0:
                ((SharedPreferences) hn.m().f35933b).edit().putFloat("x", f10).apply();
                ((h) this.f59936b).f59946a.f59988b.f();
                return;
            case 1:
                ((SharedPreferences) hn.m().f35933b).edit().putFloat("y", f10).apply();
                ((h) this.f59936b).f59946a.f59988b.f();
                return;
            default:
                ((h2.f) this.f59936b).e();
                return;
        }
    }
}
