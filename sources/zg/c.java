package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c1;
public final class c {
    public float f54521a;
    public float f54522b;
    public float f54523c;
    public float d;
    public float f54524e;
    public float f54525f;
    public float f54526g;
    public float h;
    public long f54527i;
    public boolean f54528j;
    public float f54529k;
    public final d f54530l;

    public c(d dVar) {
        this.f54530l = dVar;
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
            dVar = this.f54530l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f54537c.size(); i11++) {
                float f12 = ((c) dVar.f54537c.get(i11)).f54523c - b11;
                float f13 = ((c) dVar.f54537c.get(i11)).d - c11;
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
        if (dVar.f54539f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f54523c = b10;
        if (b10 > dVar.f54536b.width() * f7) {
            this.f54521a = dVar.f54536b.width() * f7;
        } else {
            float width = dVar.f54536b.width() * f7;
            this.f54521a = width;
            if (this.f54523c > width) {
                this.f54523c = width - 0.1f;
            }
        }
        this.f54522b = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54536b.height() * 0.1f, dVar.f54536b.height() * 0.45f);
        if (dVar.f54539f) {
            float e7 = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54536b.width() * 0.1f, dVar.f54536b.width() * 0.05f);
            this.f54525f = e7;
            this.f54526g = (((c1.d(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e7;
            this.d = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54536b.height() * 0.1f, this.f54525f / 2.0f);
            this.f54524e = dVar.f54536b.height() + this.f54525f;
            this.f54527i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float e10 = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54536b.width() * 0.1f, dVar.f54536b.width() * 0.05f);
            this.f54525f = e10;
            this.f54526g = (((c1.d(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e10;
            this.d = c10;
            this.f54524e = c10 + dVar.f54536b.height();
            this.f54527i = 1800L;
        }
        this.f54527i = ((float) this.f54527i) / 1.75f;
        this.f54528j = Utilities.fastRandom.nextBoolean();
        this.f54529k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f54530l;
        if (dVar.f54539f) {
            float width = dVar.f54536b.width() * 1.5f;
            return a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, width, dVar.f54536b.width() * (-0.25f));
        }
        return (c1.d(Utilities.fastRandom, 100) / 100.0f) * dVar.f54536b.width();
    }

    public final float c() {
        return (c1.d(Utilities.fastRandom, 100) / 100.0f) * this.f54530l.f54536b.height() * 0.5f;
    }
}
