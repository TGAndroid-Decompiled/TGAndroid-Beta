package te;

import android.graphics.RectF;
import c8.m9;
public final class e implements Comparable {
    public final Object f57674a;
    public int f57675b;
    public final k f57676c;
    public final k d;
    public final l f57677e;
    public final k f57678f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z10) {
        float f10;
        this.f57674a = obj;
        this.f57675b = i7;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f57676c = new k(i7);
        this.f57677e = new l();
        this.f57678f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f57676c.c(z10);
        this.d.c(z10);
        this.f57677e.c(z10);
        this.f57678f.c(z10);
        Object obj = this.f57674a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.f57677e;
        RectF rectF = lVar.f57697e;
        rectF.set(lVar.f57694a.f57691a, lVar.f57695b.f57691a, lVar.f57696c.f57691a, lVar.d.f57691a);
        return rectF;
    }

    public final float c() {
        return m9.a(this.d.f57691a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f57675b, ((e) obj).f57675b);
    }
}
