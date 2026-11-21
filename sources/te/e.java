package te;

import android.graphics.RectF;
import c8.l9;
public final class e implements Comparable {
    public final Object f57705a;
    public int f57706b;
    public final k f57707c;
    public final k d;
    public final l f57708e;
    public final k f57709f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z10) {
        float f10;
        this.f57705a = obj;
        this.f57706b = i7;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f57707c = new k(i7);
        this.f57708e = new l();
        this.f57709f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f57707c.c(z10);
        this.d.c(z10);
        this.f57708e.c(z10);
        this.f57709f.c(z10);
        Object obj = this.f57705a;
        if (obj instanceof l) {
            ((l) obj).c(z10);
        }
    }

    public final RectF b() {
        l lVar = this.f57708e;
        RectF rectF = lVar.f57728e;
        rectF.set(lVar.f57725a.f57722a, lVar.f57726b.f57722a, lVar.f57727c.f57722a, lVar.d.f57722a);
        return rectF;
    }

    public final float c() {
        return l9.a(this.d.f57722a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f57706b, ((e) obj).f57706b);
    }
}
