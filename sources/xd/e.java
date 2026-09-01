package xd;

import android.graphics.RectF;
import k7.o;
public final class e implements Comparable {
    public final Object f50513a;
    public int f50514b;
    public final k f50515c;
    public final k d;
    public final l f50516e;
    public final k f50517f;
    public boolean h = false;

    public e(int i10, Object obj, boolean z4) {
        float f10;
        this.f50513a = obj;
        this.f50514b = i10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f50515c = new k(i10);
        this.f50516e = new l();
        this.f50517f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z4) {
        this.f50515c.c(z4);
        this.d.c(z4);
        this.f50516e.c(z4);
        this.f50517f.c(z4);
        Object obj = this.f50513a;
        if (obj instanceof l) {
            ((l) obj).c(z4);
        }
    }

    public final RectF b() {
        l lVar = this.f50516e;
        RectF rectF = lVar.f50536e;
        rectF.set(lVar.f50533a.f50530a, lVar.f50534b.f50530a, lVar.f50535c.f50530a, lVar.d.f50530a);
        return rectF;
    }

    public final float c() {
        return o.a(this.d.f50530a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f50514b, ((e) obj).f50514b);
    }
}
