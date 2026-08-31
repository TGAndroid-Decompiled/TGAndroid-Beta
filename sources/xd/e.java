package xd;

import android.graphics.RectF;
import k7.o;
public final class e implements Comparable {
    public final Object f50512a;
    public int f50513b;
    public final k f50514c;
    public final k d;
    public final l f50515e;
    public final k f50516f;
    public boolean h = false;

    public e(int i10, Object obj, boolean z4) {
        float f10;
        this.f50512a = obj;
        this.f50513b = i10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f50514c = new k(i10);
        this.f50515e = new l();
        this.f50516f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z4) {
        this.f50514c.c(z4);
        this.d.c(z4);
        this.f50515e.c(z4);
        this.f50516f.c(z4);
        Object obj = this.f50512a;
        if (obj instanceof l) {
            ((l) obj).c(z4);
        }
    }

    public final RectF b() {
        l lVar = this.f50515e;
        RectF rectF = lVar.f50535e;
        rectF.set(lVar.f50532a.f50529a, lVar.f50533b.f50529a, lVar.f50534c.f50529a, lVar.d.f50529a);
        return rectF;
    }

    public final float c() {
        return o.a(this.d.f50529a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f50513b, ((e) obj).f50513b);
    }
}
