package xd;

import android.graphics.RectF;
import k7.n;
public final class e implements Comparable {
    public final Object f46967a;
    public int f46968b;
    public final k f46969c;
    public final k d;
    public final l e;
    public final k f46970f;
    public boolean h = false;

    public e(int i10, Object obj, boolean z4) {
        float f10;
        this.f46967a = obj;
        this.f46968b = i10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f46969c = new k(i10);
        this.e = new l();
        this.f46970f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z4) {
        this.f46969c.c(z4);
        this.d.c(z4);
        this.e.c(z4);
        this.f46970f.c(z4);
        Object obj = this.f46967a;
        if (obj instanceof l) {
            ((l) obj).c(z4);
        }
    }

    public final RectF b() {
        l lVar = this.e;
        RectF rectF = lVar.e;
        rectF.set(lVar.f46984a.f46981a, lVar.f46985b.f46981a, lVar.f46986c.f46981a, lVar.d.f46981a);
        return rectF;
    }

    public final float c() {
        return n.a(this.d.f46981a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f46968b, ((e) obj).f46968b);
    }
}
