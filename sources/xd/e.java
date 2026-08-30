package xd;

import android.graphics.RectF;
import k7.n;
public final class e implements Comparable {
    public final Object f46899a;
    public int f46900b;
    public final k f46901c;
    public final k d;
    public final l e;
    public final k f46902f;
    public boolean h = false;

    public e(int i10, Object obj, boolean z4) {
        float f10;
        this.f46899a = obj;
        this.f46900b = i10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f46901c = new k(i10);
        this.e = new l();
        this.f46902f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z4) {
        this.f46901c.c(z4);
        this.d.c(z4);
        this.e.c(z4);
        this.f46902f.c(z4);
        Object obj = this.f46899a;
        if (obj instanceof l) {
            ((l) obj).c(z4);
        }
    }

    public final RectF b() {
        l lVar = this.e;
        RectF rectF = lVar.e;
        rectF.set(lVar.f46916a.f46913a, lVar.f46917b.f46913a, lVar.f46918c.f46913a, lVar.d.f46913a);
        return rectF;
    }

    public final float c() {
        return n.a(this.d.f46913a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f46900b, ((e) obj).f46900b);
    }
}
