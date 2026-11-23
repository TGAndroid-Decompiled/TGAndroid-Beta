package wi;

import android.content.SharedPreferences;
import org.telegram.ui.Cells.aa;
public final class c implements r1.c {
    public final int f60063a;
    public final Object f60064b;

    public c(Object obj, int i7) {
        this.f60063a = i7;
        this.f60064b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f60063a) {
            case 0:
                ((SharedPreferences) aa.F2().f30491b).edit().putFloat("x", f10).apply();
                ((h) this.f60064b).f60074a.f60116b.f();
                return;
            case 1:
                ((SharedPreferences) aa.F2().f30491b).edit().putFloat("y", f10).apply();
                ((h) this.f60064b).f60074a.f60116b.f();
                return;
            default:
                ((h2.f) this.f60064b).e();
                return;
        }
    }
}
