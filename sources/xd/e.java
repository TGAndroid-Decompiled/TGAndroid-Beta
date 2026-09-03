package xd;

import android.graphics.RectF;
import k7.o;
public final class e implements Comparable {
    public final Object f50549a;
    public int f50550b;
    public final k f50551c;
    public final k d;
    public final l f50552e;
    public final k f50553f;
    public boolean h = false;

    public e(int i10, Object obj, boolean z4) {
        float f10;
        this.f50549a = obj;
        this.f50550b = i10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f50551c = new k(i10);
        this.f50552e = new l();
        this.f50553f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z4) {
        this.f50551c.c(z4);
        this.d.c(z4);
        this.f50552e.c(z4);
        this.f50553f.c(z4);
        Object obj = this.f50549a;
        if (obj instanceof l) {
            ((l) obj).c(z4);
        }
    }

    public final RectF b() {
        l lVar = this.f50552e;
        RectF rectF = lVar.f50572e;
        rectF.set(lVar.f50569a.f50566a, lVar.f50570b.f50566a, lVar.f50571c.f50566a, lVar.d.f50566a);
        return rectF;
    }

    public final float c() {
        return o.a(this.d.f50566a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f50550b, ((e) obj).f50550b);
    }
}
