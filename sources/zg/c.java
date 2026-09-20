package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c1;
public final class c {
    public float f49294a;
    public float f49295b;
    public float f49296c;
    public float d;
    public float e;
    public float f49297f;
    public float f49298g;
    public float h;
    public long f49299i;
    public boolean f49300j;
    public float f49301k;
    public final d f49302l;

    public c(d dVar) {
        this.f49302l = dVar;
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
            dVar = this.f49302l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f49306c.size(); i11++) {
                float f12 = ((c) dVar.f49306c.get(i11)).f49296c - b11;
                float f13 = ((c) dVar.f49306c.get(i11)).d - c11;
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
        if (dVar.f49307f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f49296c = b10;
        if (b10 > dVar.f49305b.width() * f7) {
            this.f49294a = dVar.f49305b.width() * f7;
        } else {
            float width = dVar.f49305b.width() * f7;
            this.f49294a = width;
            if (this.f49296c > width) {
                this.f49296c = width - 0.1f;
            }
        }
        float height = dVar.f49305b.height() * 0.1f;
        this.f49295b = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, height, dVar.f49305b.height() * 0.45f);
        if (dVar.f49307f) {
            float width2 = dVar.f49305b.width() * 0.1f;
            float e = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, width2, dVar.f49305b.width() * 0.05f);
            this.f49297f = e;
            this.f49298g = (((c1.e(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e;
            float height2 = dVar.f49305b.height() * 0.1f;
            this.d = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, height2, this.f49297f / 2.0f);
            this.e = dVar.f49305b.height() + this.f49297f;
            this.f49299i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f49305b.width() * 0.1f;
            float e7 = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, width3, dVar.f49305b.width() * 0.05f);
            this.f49297f = e7;
            this.f49298g = (((c1.e(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e7;
            this.d = c10;
            this.e = c10 + dVar.f49305b.height();
            this.f49299i = 1800L;
        }
        this.f49299i = ((float) this.f49299i) / 1.75f;
        this.f49300j = Utilities.fastRandom.nextBoolean();
        this.f49301k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f49302l;
        if (dVar.f49307f) {
            float width = dVar.f49305b.width() * 1.5f;
            return a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, width, dVar.f49305b.width() * (-0.25f));
        }
        return (c1.e(Utilities.fastRandom, 100) / 100.0f) * dVar.f49305b.width();
    }

    public final float c() {
        return (c1.e(Utilities.fastRandom, 100) / 100.0f) * this.f49302l.f49305b.height() * 0.5f;
    }
}
