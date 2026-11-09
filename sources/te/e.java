package te;

import android.graphics.RectF;
import c8.j9;
public final class e implements Comparable {
    public final Object f55508a;
    public int f55509b;
    public final k f55510c;
    public final k d;
    public final l f55511e;
    public final k f55512f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z9) {
        float f10;
        this.f55508a = obj;
        this.f55509b = i7;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f55510c = new k(i7);
        this.f55511e = new l();
        this.f55512f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z9) {
        this.f55510c.c(z9);
        this.d.c(z9);
        this.f55511e.c(z9);
        this.f55512f.c(z9);
        Object obj = this.f55508a;
        if (obj instanceof l) {
            ((l) obj).c(z9);
        }
    }

    public final RectF b() {
        l lVar = this.f55511e;
        RectF rectF = lVar.f55531e;
        rectF.set(lVar.f55528a.f55525a, lVar.f55529b.f55525a, lVar.f55530c.f55525a, lVar.d.f55525a);
        return rectF;
    }

    public final float c() {
        return j9.a(this.d.f55525a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f55509b, ((e) obj).f55509b);
    }
}
