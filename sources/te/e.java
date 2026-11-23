package te;

import android.graphics.RectF;
import c8.m9;
public final class e implements Comparable {
    public final Object f57788a;
    public int f57789b;
    public final k f57790c;
    public final k d;
    public final l f57791e;
    public final k f57792f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z10) {
        float f10;
        this.f57788a = obj;
        this.f57789b = i7;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f57790c = new k(i7);
        this.f57791e = new l();
        this.f57792f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f57790c.c(z10);
        this.d.c(z10);
        this.f57791e.c(z10);
        this.f57792f.c(z10);
        Object obj = this.f57788a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.f57791e;
        RectF rectF = lVar.f57811e;
        rectF.set(lVar.f57808a.f57805a, lVar.f57809b.f57805a, lVar.f57810c.f57805a, lVar.d.f57805a);
        return rectF;
    }

    public final float c() {
        return m9.a(this.d.f57805a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f57789b, ((e) obj).f57789b);
    }
}
