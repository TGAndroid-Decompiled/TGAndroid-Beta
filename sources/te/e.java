package te;

import android.graphics.RectF;
import c8.j9;
public final class e implements Comparable {
    public final Object f55403a;
    public int f55404b;
    public final k f55405c;
    public final k d;
    public final l f55406e;
    public final k f55407f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z9) {
        float f10;
        this.f55403a = obj;
        this.f55404b = i7;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f55405c = new k(i7);
        this.f55406e = new l();
        this.f55407f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z9) {
        this.f55405c.c(z9);
        this.d.c(z9);
        this.f55406e.c(z9);
        this.f55407f.c(z9);
        Object obj = this.f55403a;
        if (obj instanceof l) {
            ((l) obj).c(z9);
        }
    }

    public final RectF b() {
        l lVar = this.f55406e;
        RectF rectF = lVar.f55426e;
        rectF.set(lVar.f55423a.f55420a, lVar.f55424b.f55420a, lVar.f55425c.f55420a, lVar.d.f55420a);
        return rectF;
    }

    public final float c() {
        return j9.a(this.d.f55420a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f55404b, ((e) obj).f55404b);
    }
}
