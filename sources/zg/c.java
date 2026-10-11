package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c1;
public final class c {
    public float f54564a;
    public float f54565b;
    public float f54566c;
    public float d;
    public float f54567e;
    public float f54568f;
    public float f54569g;
    public float h;
    public long f54570i;
    public boolean f54571j;
    public float f54572k;
    public final d f54573l;

    public c(d dVar) {
        this.f54573l = dVar;
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
            dVar = this.f54573l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f54580c.size(); i11++) {
                float f12 = ((c) dVar.f54580c.get(i11)).f54566c - b11;
                float f13 = ((c) dVar.f54580c.get(i11)).d - c11;
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
        if (dVar.f54582f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f54566c = b10;
        if (b10 > dVar.f54579b.width() * f7) {
            this.f54564a = dVar.f54579b.width() * f7;
        } else {
            float width = dVar.f54579b.width() * f7;
            this.f54564a = width;
            if (this.f54566c > width) {
                this.f54566c = width - 0.1f;
            }
        }
        this.f54565b = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54579b.height() * 0.1f, dVar.f54579b.height() * 0.45f);
        if (dVar.f54582f) {
            float e7 = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54579b.width() * 0.1f, dVar.f54579b.width() * 0.05f);
            this.f54568f = e7;
            this.f54569g = (((c1.d(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e7;
            this.d = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54579b.height() * 0.1f, this.f54568f / 2.0f);
            this.f54567e = dVar.f54579b.height() + this.f54568f;
            this.f54570i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float e10 = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54579b.width() * 0.1f, dVar.f54579b.width() * 0.05f);
            this.f54568f = e10;
            this.f54569g = (((c1.d(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e10;
            this.d = c10;
            this.f54567e = c10 + dVar.f54579b.height();
            this.f54570i = 1800L;
        }
        this.f54570i = ((float) this.f54570i) / 1.75f;
        this.f54571j = Utilities.fastRandom.nextBoolean();
        this.f54572k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f54573l;
        if (dVar.f54582f) {
            float width = dVar.f54579b.width() * 1.5f;
            return a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, width, dVar.f54579b.width() * (-0.25f));
        }
        return (c1.d(Utilities.fastRandom, 100) / 100.0f) * dVar.f54579b.width();
    }

    public final float c() {
        return (c1.d(Utilities.fastRandom, 100) / 100.0f) * this.f54573l.f54579b.height() * 0.5f;
    }
}
