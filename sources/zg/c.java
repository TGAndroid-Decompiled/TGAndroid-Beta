package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p6;
public final class c {
    public float f49002a;
    public float f49003b;
    public float f49004c;
    public float d;
    public float e;
    public float f49005f;
    public float f49006g;
    public float h;
    public long f49007i;
    public boolean f49008j;
    public float f49009k;
    public final d f49010l;

    public c(d dVar) {
        this.f49010l = dVar;
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
            dVar = this.f49010l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f49036c.size(); i11++) {
                float f12 = ((c) dVar.f49036c.get(i11)).f49004c - b11;
                float f13 = ((c) dVar.f49036c.get(i11)).d - c11;
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
        if (dVar.f49037f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f49004c = b10;
        if (b10 > dVar.f49035b.width() * f7) {
            this.f49002a = dVar.f49035b.width() * f7;
        } else {
            float width = dVar.f49035b.width() * f7;
            this.f49002a = width;
            if (this.f49004c > width) {
                this.f49004c = width - 0.1f;
            }
        }
        float height = dVar.f49035b.height() * 0.1f;
        this.f49003b = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, height, dVar.f49035b.height() * 0.45f);
        if (dVar.f49037f) {
            float width2 = dVar.f49035b.width() * 0.1f;
            float e = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, width2, dVar.f49035b.width() * 0.05f);
            this.f49005f = e;
            this.f49006g = (((p6.c(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e;
            float height2 = dVar.f49035b.height() * 0.1f;
            this.d = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, height2, this.f49005f / 2.0f);
            this.e = dVar.f49035b.height() + this.f49005f;
            this.f49007i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f49035b.width() * 0.1f;
            float e7 = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, width3, dVar.f49035b.width() * 0.05f);
            this.f49005f = e7;
            this.f49006g = (((p6.c(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e7;
            this.d = c10;
            this.e = c10 + dVar.f49035b.height();
            this.f49007i = 1800L;
        }
        this.f49007i = ((float) this.f49007i) / 1.75f;
        this.f49008j = Utilities.fastRandom.nextBoolean();
        this.f49009k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f49010l;
        if (dVar.f49037f) {
            float width = dVar.f49035b.width() * 1.5f;
            return a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, width, dVar.f49035b.width() * (-0.25f));
        }
        return (p6.c(Utilities.fastRandom, 100) / 100.0f) * dVar.f49035b.width();
    }

    public final float c() {
        return (p6.c(Utilities.fastRandom, 100) / 100.0f) * this.f49010l.f49035b.height() * 0.5f;
    }
}
