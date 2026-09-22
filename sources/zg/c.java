package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.q3;
public final class c {
    public float f48967a;
    public float f48968b;
    public float f48969c;
    public float d;
    public float e;
    public float f48970f;
    public float f48971g;
    public float h;
    public long f48972i;
    public boolean f48973j;
    public float f48974k;
    public final d f48975l;

    public c(d dVar) {
        this.f48975l = dVar;
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
            dVar = this.f48975l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f49001c.size(); i11++) {
                float f12 = ((c) dVar.f49001c.get(i11)).f48969c - b11;
                float f13 = ((c) dVar.f49001c.get(i11)).d - c11;
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
        if (dVar.f49002f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f48969c = b10;
        if (b10 > dVar.f49000b.width() * f7) {
            this.f48967a = dVar.f49000b.width() * f7;
        } else {
            float width = dVar.f49000b.width() * f7;
            this.f48967a = width;
            if (this.f48969c > width) {
                this.f48969c = width - 0.1f;
            }
        }
        float height = dVar.f49000b.height() * 0.1f;
        this.f48968b = a4.a.e(q3.c(Utilities.fastRandom, 100), 100.0f, height, dVar.f49000b.height() * 0.45f);
        if (dVar.f49002f) {
            float width2 = dVar.f49000b.width() * 0.1f;
            float e = a4.a.e(q3.c(Utilities.fastRandom, 100), 100.0f, width2, dVar.f49000b.width() * 0.05f);
            this.f48970f = e;
            this.f48971g = (((q3.c(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e;
            float height2 = dVar.f49000b.height() * 0.1f;
            this.d = a4.a.e(q3.c(Utilities.fastRandom, 100), 100.0f, height2, this.f48970f / 2.0f);
            this.e = dVar.f49000b.height() + this.f48970f;
            this.f48972i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f49000b.width() * 0.1f;
            float e7 = a4.a.e(q3.c(Utilities.fastRandom, 100), 100.0f, width3, dVar.f49000b.width() * 0.05f);
            this.f48970f = e7;
            this.f48971g = (((q3.c(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e7;
            this.d = c10;
            this.e = c10 + dVar.f49000b.height();
            this.f48972i = 1800L;
        }
        this.f48972i = ((float) this.f48972i) / 1.75f;
        this.f48973j = Utilities.fastRandom.nextBoolean();
        this.f48974k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f48975l;
        if (dVar.f49002f) {
            float width = dVar.f49000b.width() * 1.5f;
            return a4.a.e(q3.c(Utilities.fastRandom, 100), 100.0f, width, dVar.f49000b.width() * (-0.25f));
        }
        return (q3.c(Utilities.fastRandom, 100) / 100.0f) * dVar.f49000b.width();
    }

    public final float c() {
        return (q3.c(Utilities.fastRandom, 100) / 100.0f) * this.f48975l.f49000b.height() * 0.5f;
    }
}
