package te;

import android.graphics.RectF;
import c8.j9;
public final class e implements Comparable {
    public final Object f55379a;
    public int f55380b;
    public final k f55381c;
    public final k d;
    public final l f55382e;
    public final k f55383f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z9) {
        float f10;
        this.f55379a = obj;
        this.f55380b = i7;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f55381c = new k(i7);
        this.f55382e = new l();
        this.f55383f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z9) {
        this.f55381c.c(z9);
        this.d.c(z9);
        this.f55382e.c(z9);
        this.f55383f.c(z9);
        Object obj = this.f55379a;
        if (obj instanceof l) {
            ((l) obj).c(z9);
        }
    }

    public final RectF b() {
        l lVar = this.f55382e;
        RectF rectF = lVar.f55402e;
        rectF.set(lVar.f55399a.f55396a, lVar.f55400b.f55396a, lVar.f55401c.f55396a, lVar.d.f55396a);
        return rectF;
    }

    public final float c() {
        return j9.a(this.d.f55396a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f55380b, ((e) obj).f55380b);
    }
}
