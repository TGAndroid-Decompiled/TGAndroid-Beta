package ud;

import android.graphics.RectF;
import h7.n;

public final class e implements Comparable {

    public final Object f48505a;

    public int f48506b;

    public final k f48507c;
    public final k d;

    public final l f48508e;

    public final k f48509f;
    public boolean h = false;

    public e(int i10, Object obj, boolean z10) {
        this.f48505a = obj;
        this.f48506b = i10;
        this.d = new k(z10 ? 1.0f : 0.0f);
        this.f48507c = new k(i10);
        this.f48508e = new l();
        this.f48509f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f48507c.c(z10);
        this.d.c(z10);
        this.f48508e.c(z10);
        this.f48509f.c(z10);
        Object obj = this.f48505a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.f48508e;
        RectF rectF = lVar.f48528e;
        rectF.set(lVar.f48525a.f48522a, lVar.f48526b.f48522a, lVar.f48527c.f48522a, lVar.d.f48522a);
        return rectF;
    }

    public final float c() {
        return n.a(this.d.f48522a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f48506b, ((e) obj).f48506b);
    }
}
