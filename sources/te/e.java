package te;

import android.graphics.RectF;
import c8.j9;
public final class e implements Comparable {
    public final Object f55404a;
    public int f55405b;
    public final k f55406c;
    public final k d;
    public final l f55407e;
    public final k f55408f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z9) {
        float f10;
        this.f55404a = obj;
        this.f55405b = i7;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f55406c = new k(i7);
        this.f55407e = new l();
        this.f55408f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z9) {
        this.f55406c.c(z9);
        this.d.c(z9);
        this.f55407e.c(z9);
        this.f55408f.c(z9);
        Object obj = this.f55404a;
        if (obj instanceof l) {
            ((l) obj).c(z9);
        }
    }

    public final RectF b() {
        l lVar = this.f55407e;
        RectF rectF = lVar.f55427e;
        rectF.set(lVar.f55424a.f55421a, lVar.f55425b.f55421a, lVar.f55426c.f55421a, lVar.d.f55421a);
        return rectF;
    }

    public final float c() {
        return j9.a(this.d.f55421a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f55405b, ((e) obj).f55405b);
    }
}
