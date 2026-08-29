package vd;

import android.graphics.RectF;
import i7.w;
public final class f implements Comparable {
    public final Object f49514a;
    public int f49515b;
    public final l f49516c;
    public final l d;
    public final m f49517e;
    public final l f49518f;
    public boolean h = false;

    public f(int i10, Object obj, boolean z10) {
        float f9;
        this.f49514a = obj;
        this.f49515b = i10;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        this.d = new l(f9);
        this.f49516c = new l(i10);
        this.f49517e = new m();
        this.f49518f = new l(0.0f);
        a(false);
    }

    public final void a(boolean z10) {
        this.f49516c.c(z10);
        this.d.c(z10);
        this.f49517e.c(z10);
        this.f49518f.c(z10);
        Object obj = this.f49514a;
        if (obj instanceof m) {
            ((m) obj).c(z10);
        }
    }

    public final RectF b() {
        m mVar = this.f49517e;
        RectF rectF = mVar.f49537e;
        rectF.set(mVar.f49534a.f49531a, mVar.f49535b.f49531a, mVar.f49536c.f49531a, mVar.d.f49531a);
        return rectF;
    }

    public final float c() {
        return w.a(this.d.f49531a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f49515b, ((f) obj).f49515b);
    }
}
