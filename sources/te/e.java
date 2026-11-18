package te;

import android.graphics.RectF;
import c8.l9;
public final class e implements Comparable {
    public final Object f57666a;
    public int f57667b;
    public final k f57668c;
    public final k d;
    public final l f57669e;
    public final k f57670f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z10) {
        float f10;
        this.f57666a = obj;
        this.f57667b = i7;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f57668c = new k(i7);
        this.f57669e = new l();
        this.f57670f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f57668c.c(z10);
        this.d.c(z10);
        this.f57669e.c(z10);
        this.f57670f.c(z10);
        Object obj = this.f57666a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.f57669e;
        RectF rectF = lVar.f57689e;
        rectF.set(lVar.f57686a.f57683a, lVar.f57687b.f57683a, lVar.f57688c.f57683a, lVar.d.f57683a);
        return rectF;
    }

    public final float c() {
        return l9.a(this.d.f57683a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f57667b, ((e) obj).f57667b);
    }
}
