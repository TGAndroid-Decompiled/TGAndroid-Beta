package te;

import android.graphics.RectF;
import c8.l9;
public final class e implements Comparable {
    public final Object f57709a;
    public int f57710b;
    public final k f57711c;
    public final k d;
    public final l f57712e;
    public final k f57713f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z10) {
        float f10;
        this.f57709a = obj;
        this.f57710b = i7;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f57711c = new k(i7);
        this.f57712e = new l();
        this.f57713f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f57711c.c(z10);
        this.d.c(z10);
        this.f57712e.c(z10);
        this.f57713f.c(z10);
        Object obj = this.f57709a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.f57712e;
        RectF rectF = lVar.f57732e;
        rectF.set(lVar.f57729a.f57726a, lVar.f57730b.f57726a, lVar.f57731c.f57726a, lVar.d.f57726a);
        return rectF;
    }

    public final float c() {
        return l9.a(this.d.f57726a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f57710b, ((e) obj).f57710b);
    }
}
