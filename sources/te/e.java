package te;

import android.graphics.RectF;
import c8.j9;
public final class e implements Comparable {
    public final Object f55495a;
    public int f55496b;
    public final k f55497c;
    public final k d;
    public final l f55498e;
    public final k f55499f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z9) {
        float f10;
        this.f55495a = obj;
        this.f55496b = i7;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f55497c = new k(i7);
        this.f55498e = new l();
        this.f55499f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z9) {
        this.f55497c.c(z9);
        this.d.c(z9);
        this.f55498e.c(z9);
        this.f55499f.c(z9);
        Object obj = this.f55495a;
        if (obj instanceof l) {
            ((l) obj).c(z9);
        }
    }

    public final RectF b() {
        l lVar = this.f55498e;
        RectF rectF = lVar.f55518e;
        rectF.set(lVar.f55515a.f55512a, lVar.f55516b.f55512a, lVar.f55517c.f55512a, lVar.d.f55512a);
        return rectF;
    }

    public final float c() {
        return j9.a(this.d.f55512a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f55496b, ((e) obj).f55496b);
    }
}
