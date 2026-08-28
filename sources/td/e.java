package td;

import android.graphics.RectF;
import g7.n;
public final class e implements Comparable {
    public final Object f47783a;
    public int f47784b;
    public final k f47785c;
    public final k d;
    public final l f47786e;
    public final k f47787f;
    public boolean h = false;

    public e(int i9, Object obj, boolean z10) {
        float f10;
        this.f47783a = obj;
        this.f47784b = i9;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f47785c = new k(i9);
        this.f47786e = new l();
        this.f47787f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f47785c.c(z10);
        this.d.c(z10);
        this.f47786e.c(z10);
        this.f47787f.c(z10);
        Object obj = this.f47783a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.f47786e;
        RectF rectF = lVar.f47806e;
        rectF.set(lVar.f47803a.f47800a, lVar.f47804b.f47800a, lVar.f47805c.f47800a, lVar.d.f47800a);
        return rectF;
    }

    public final float c() {
        return n.a(this.d.f47800a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f47784b, ((e) obj).f47784b);
    }
}
