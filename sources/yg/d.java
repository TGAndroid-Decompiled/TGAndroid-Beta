package yg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r6;
public final class d {
    public float f46972a;
    public float f46973b;
    public float f46974c;
    public float d;
    public float e;
    public float f46975f;
    public float f46976g;
    public float h;
    public long f46977i;
    public boolean f46978j;
    public float f46979k;
    public final e f46980l;

    public d(e eVar) {
        this.f46980l = eVar;
    }

    public final void a() {
        e eVar;
        float f7;
        float f10 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        int i10 = 0;
        while (true) {
            eVar = this.f46980l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < eVar.f46984c.size(); i11++) {
                float f12 = ((d) eVar.f46984c.get(i11)).f46974c - b11;
                float f13 = ((d) eVar.f46984c.get(i11)).d - c11;
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
        if (eVar.f46985f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f46974c = b10;
        if (b10 > eVar.f46983b.width() * f7) {
            this.f46972a = eVar.f46983b.width() * f7;
        } else {
            float width = eVar.f46983b.width() * f7;
            this.f46972a = width;
            if (this.f46974c > width) {
                this.f46974c = width - 0.1f;
            }
        }
        float height = eVar.f46983b.height() * 0.1f;
        this.f46973b = a4.a.e(r6.c(Utilities.fastRandom, 100), 100.0f, height, eVar.f46983b.height() * 0.45f);
        if (eVar.f46985f) {
            float width2 = eVar.f46983b.width() * 0.1f;
            float e = a4.a.e(r6.c(Utilities.fastRandom, 100), 100.0f, width2, eVar.f46983b.width() * 0.05f);
            this.f46975f = e;
            this.f46976g = (((r6.c(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e;
            float height2 = eVar.f46983b.height() * 0.1f;
            this.d = a4.a.e(r6.c(Utilities.fastRandom, 100), 100.0f, height2, this.f46975f / 2.0f);
            this.e = eVar.f46983b.height() + this.f46975f;
            this.f46977i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = eVar.f46983b.width() * 0.1f;
            float e7 = a4.a.e(r6.c(Utilities.fastRandom, 100), 100.0f, width3, eVar.f46983b.width() * 0.05f);
            this.f46975f = e7;
            this.f46976g = (((r6.c(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e7;
            this.d = c10;
            this.e = c10 + eVar.f46983b.height();
            this.f46977i = 1800L;
        }
        this.f46977i = ((float) this.f46977i) / 1.75f;
        this.f46978j = Utilities.fastRandom.nextBoolean();
        this.f46979k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        e eVar = this.f46980l;
        if (eVar.f46985f) {
            float width = eVar.f46983b.width() * 1.5f;
            return a4.a.e(r6.c(Utilities.fastRandom, 100), 100.0f, width, eVar.f46983b.width() * (-0.25f));
        }
        return (r6.c(Utilities.fastRandom, 100) / 100.0f) * eVar.f46983b.width();
    }

    public final float c() {
        return (r6.c(Utilities.fastRandom, 100) / 100.0f) * this.f46980l.f46983b.height() * 0.5f;
    }
}
