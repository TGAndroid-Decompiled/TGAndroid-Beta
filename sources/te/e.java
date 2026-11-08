package te;

import android.graphics.RectF;
import c8.j9;
public final class e implements Comparable {
    public final Object f55496a;
    public int f55497b;
    public final k f55498c;
    public final k d;
    public final l f55499e;
    public final k f55500f;
    public boolean h = false;

    public e(int i7, Object obj, boolean z9) {
        float f10;
        this.f55496a = obj;
        this.f55497b = i7;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.d = new k(f10);
        this.f55498c = new k(i7);
        this.f55499e = new l();
        this.f55500f = new k(0.0f);
        a(false);
    }

    public final void a(boolean z9) {
        this.f55498c.c(z9);
        this.d.c(z9);
        this.f55499e.c(z9);
        this.f55500f.c(z9);
        Object obj = this.f55496a;
        if (obj instanceof l) {
            ((l) obj).c(z9);
        }
    }

    public final RectF b() {
        l lVar = this.f55499e;
        RectF rectF = lVar.f55519e;
        rectF.set(lVar.f55516a.f55513a, lVar.f55517b.f55513a, lVar.f55518c.f55513a, lVar.d.f55513a);
        return rectF;
    }

    public final float c() {
        return j9.a(this.d.f55513a, 0.0f, 1.0f);
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f55497b, ((e) obj).f55497b);
    }
}
