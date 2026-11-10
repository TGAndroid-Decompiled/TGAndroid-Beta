package te;

import android.graphics.RectF;
import c8.j9;
public final class e implements Comparable {
    public final Object f55507a;
    public int f55508b;
    public final k f55509c;
    public final k d;
    public final l f55510e;
    public final k f55511f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z9) {
        float f10;
        this.f55507a = obj;
        this.f55508b = i7;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f55509c = new k(i7);
        this.f55510e = new l();
        this.f55511f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z9) {
        this.f55509c.c(z9);
        this.d.c(z9);
        this.f55510e.c(z9);
        this.f55511f.c(z9);
        Object obj = this.f55507a;
        if (obj instanceof l) {
            ((l) obj).c(z9);
        }
    }

    public final RectF b() {
        l lVar = this.f55510e;
        RectF rectF = lVar.f55530e;
        rectF.set(lVar.f55527a.f55524a, lVar.f55528b.f55524a, lVar.f55529c.f55524a, lVar.d.f55524a);
        return rectF;
    }

    public final float c() {
        return j9.a(this.d.f55524a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f55508b, ((e) obj).f55508b);
    }
}
