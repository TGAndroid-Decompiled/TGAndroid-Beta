package qe;

import android.graphics.RectF;
import b8.be;
public final class e implements Comparable {
    public final Object f53849a;
    public int f53850b;
    public final k f53851c;
    public final k d;
    public final l f53852e;
    public final k f53853f;
    public boolean h = false;

    public e(int i3, Object obj, boolean z10) {
        float f10;
        this.f53849a = obj;
        this.f53850b = i3;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f53851c = new k(i3);
        this.f53852e = new l();
        this.f53853f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f53851c.c(z10);
        this.d.c(z10);
        this.f53852e.c(z10);
        this.f53853f.c(z10);
        Object obj = this.f53849a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.f53852e;
        RectF rectF = lVar.f53872e;
        rectF.set(lVar.f53869a.f53866a, lVar.f53870b.f53866a, lVar.f53871c.f53866a, lVar.d.f53866a);
        return rectF;
    }

    public final float c() {
        return be.a(this.d.f53866a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f53850b, ((e) obj).f53850b);
    }
}
