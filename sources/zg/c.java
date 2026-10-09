package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c1;
public final class c {
    public float f54475a;
    public float f54476b;
    public float f54477c;
    public float d;
    public float f54478e;
    public float f54479f;
    public float f54480g;
    public float h;
    public long f54481i;
    public boolean f54482j;
    public float f54483k;
    public final d f54484l;

    public c(d dVar) {
        this.f54484l = dVar;
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
            dVar = this.f54484l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f54491c.size(); i11++) {
                float f12 = ((c) dVar.f54491c.get(i11)).f54477c - b11;
                float f13 = ((c) dVar.f54491c.get(i11)).d - c11;
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
        if (dVar.f54493f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f54477c = b10;
        if (b10 > dVar.f54490b.width() * f7) {
            this.f54475a = dVar.f54490b.width() * f7;
        } else {
            float width = dVar.f54490b.width() * f7;
            this.f54475a = width;
            if (this.f54477c > width) {
                this.f54477c = width - 0.1f;
            }
        }
        this.f54476b = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54490b.height() * 0.1f, dVar.f54490b.height() * 0.45f);
        if (dVar.f54493f) {
            float e7 = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54490b.width() * 0.1f, dVar.f54490b.width() * 0.05f);
            this.f54479f = e7;
            this.f54480g = (((c1.d(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e7;
            this.d = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54490b.height() * 0.1f, this.f54479f / 2.0f);
            this.f54478e = dVar.f54490b.height() + this.f54479f;
            this.f54481i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float e10 = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54490b.width() * 0.1f, dVar.f54490b.width() * 0.05f);
            this.f54479f = e10;
            this.f54480g = (((c1.d(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e10;
            this.d = c10;
            this.f54478e = c10 + dVar.f54490b.height();
            this.f54481i = 1800L;
        }
        this.f54481i = ((float) this.f54481i) / 1.75f;
        this.f54482j = Utilities.fastRandom.nextBoolean();
        this.f54483k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f54484l;
        if (dVar.f54493f) {
            float width = dVar.f54490b.width() * 1.5f;
            return a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, width, dVar.f54490b.width() * (-0.25f));
        }
        return (c1.d(Utilities.fastRandom, 100) / 100.0f) * dVar.f54490b.width();
    }

    public final float c() {
        return (c1.d(Utilities.fastRandom, 100) / 100.0f) * this.f54484l.f54490b.height() * 0.5f;
    }
}
