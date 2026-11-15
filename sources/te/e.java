package te;

import android.graphics.RectF;
import c8.i9;
public final class e implements Comparable {
    public final Object f57090a;
    public int f57091b;
    public final k f57092c;
    public final k d;
    public final l f57093e;
    public final k f57094f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z10) {
        float f10;
        this.f57090a = obj;
        this.f57091b = i7;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f57092c = new k(i7);
        this.f57093e = new l();
        this.f57094f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f57092c.c(z10);
        this.d.c(z10);
        this.f57093e.c(z10);
        this.f57094f.c(z10);
        Object obj = this.f57090a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.f57093e;
        RectF rectF = lVar.f57113e;
        rectF.set(lVar.f57110a.f57107a, lVar.f57111b.f57107a, lVar.f57112c.f57107a, lVar.d.f57107a);
        return rectF;
    }

    public final float c() {
        return i9.a(this.d.f57107a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f57091b, ((e) obj).f57091b);
    }
}
