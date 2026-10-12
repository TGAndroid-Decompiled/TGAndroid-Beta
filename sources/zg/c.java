package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c1;
public final class c {
    public float f54701a;
    public float f54702b;
    public float f54703c;
    public float d;
    public float f54704e;
    public float f54705f;
    public float f54706g;
    public float h;
    public long f54707i;
    public boolean f54708j;
    public float f54709k;
    public final d f54710l;

    public c(d dVar) {
        this.f54710l = dVar;
    }

    public final void a() {
        d dVar;
        float f7;
        float f10 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        int i10 = 0;
        while (true) {
            dVar = this.f54710l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f54717c.size(); i11++) {
                float f12 = ((c) dVar.f54717c.get(i11)).f54703c - b11;
                float f13 = ((c) dVar.f54717c.get(i11)).d - c11;
                float f14 = (f13 * f13) + (f12 * f12);
                if (f14 < f11) {
                    f11 = f14;
                }
            }
            if (f11 > f10) {
                b10 = b11;
                c10 = c11;
                f10 = f11;
            }
            i10++;
        }
        if (dVar.f54719f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f54703c = b10;
        if (b10 > dVar.f54716b.width() * f7) {
            this.f54701a = dVar.f54716b.width() * f7;
        } else {
            float width = dVar.f54716b.width() * f7;
            this.f54701a = width;
            if (this.f54703c > width) {
                this.f54703c = width - 0.1f;
            }
        }
        this.f54702b = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54716b.height() * 0.1f, dVar.f54716b.height() * 0.45f);
        if (dVar.f54719f) {
            float e7 = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54716b.width() * 0.1f, dVar.f54716b.width() * 0.05f);
            this.f54705f = e7;
            this.f54706g = (((c1.d(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e7;
            this.d = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54716b.height() * 0.1f, this.f54705f / 2.0f);
            this.f54704e = dVar.f54716b.height() + this.f54705f;
            this.f54707i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float e10 = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54716b.width() * 0.1f, dVar.f54716b.width() * 0.05f);
            this.f54705f = e10;
            this.f54706g = (((c1.d(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e10;
            this.d = c10;
            this.f54704e = c10 + dVar.f54716b.height();
            this.f54707i = 1800L;
        }
        this.f54707i = ((float) this.f54707i) / 1.75f;
        this.f54708j = Utilities.fastRandom.nextBoolean();
        this.f54709k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f54710l;
        if (dVar.f54719f) {
            float width = dVar.f54716b.width() * 1.5f;
            return a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, width, dVar.f54716b.width() * (-0.25f));
        }
        return (c1.d(Utilities.fastRandom, 100) / 100.0f) * dVar.f54716b.width();
    }

    public final float c() {
        return (c1.d(Utilities.fastRandom, 100) / 100.0f) * this.f54710l.f54716b.height() * 0.5f;
    }
}
