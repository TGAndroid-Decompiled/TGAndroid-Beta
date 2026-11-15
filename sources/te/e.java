package te;

import android.graphics.RectF;
import c8.i9;
public final class e implements Comparable {
    public final Object f57094a;
    public int f57095b;
    public final k f57096c;
    public final k d;
    public final l f57097e;
    public final k f57098f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z10) {
        float f10;
        this.f57094a = obj;
        this.f57095b = i7;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f57096c = new k(i7);
        this.f57097e = new l();
        this.f57098f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f57096c.c(z10);
        this.d.c(z10);
        this.f57097e.c(z10);
        this.f57098f.c(z10);
        Object obj = this.f57094a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.f57097e;
        RectF rectF = lVar.f57117e;
        rectF.set(lVar.f57114a.f57111a, lVar.f57115b.f57111a, lVar.f57116c.f57111a, lVar.d.f57111a);
        return rectF;
    }

    public final float c() {
        return i9.a(this.d.f57111a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f57095b, ((e) obj).f57095b);
    }
}
