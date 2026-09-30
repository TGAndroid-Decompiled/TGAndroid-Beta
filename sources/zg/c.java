package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c1;
public final class c {
    public float f49375a;
    public float f49376b;
    public float f49377c;
    public float d;
    public float e;
    public float f49378f;
    public float f49379g;
    public float h;
    public long f49380i;
    public boolean f49381j;
    public float f49382k;
    public final d f49383l;

    public c(d dVar) {
        this.f49383l = dVar;
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
            dVar = this.f49383l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f49387c.size(); i11++) {
                float f12 = ((c) dVar.f49387c.get(i11)).f49377c - b11;
                float f13 = ((c) dVar.f49387c.get(i11)).d - c11;
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
        if (dVar.f49388f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f49377c = b10;
        if (b10 > dVar.f49386b.width() * f7) {
            this.f49375a = dVar.f49386b.width() * f7;
        } else {
            float width = dVar.f49386b.width() * f7;
            this.f49375a = width;
            if (this.f49377c > width) {
                this.f49377c = width - 0.1f;
            }
        }
        float height = dVar.f49386b.height() * 0.1f;
        this.f49376b = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, height, dVar.f49386b.height() * 0.45f);
        if (dVar.f49388f) {
            float width2 = dVar.f49386b.width() * 0.1f;
            float e = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, width2, dVar.f49386b.width() * 0.05f);
            this.f49378f = e;
            this.f49379g = (((c1.e(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e;
            float height2 = dVar.f49386b.height() * 0.1f;
            this.d = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, height2, this.f49378f / 2.0f);
            this.e = dVar.f49386b.height() + this.f49378f;
            this.f49380i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f49386b.width() * 0.1f;
            float e7 = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, width3, dVar.f49386b.width() * 0.05f);
            this.f49378f = e7;
            this.f49379g = (((c1.e(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e7;
            this.d = c10;
            this.e = c10 + dVar.f49386b.height();
            this.f49380i = 1800L;
        }
        this.f49380i = ((float) this.f49380i) / 1.75f;
        this.f49381j = Utilities.fastRandom.nextBoolean();
        this.f49382k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f49383l;
        if (dVar.f49388f) {
            float width = dVar.f49386b.width() * 1.5f;
            return a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, width, dVar.f49386b.width() * (-0.25f));
        }
        return (c1.e(Utilities.fastRandom, 100) / 100.0f) * dVar.f49386b.width();
    }

    public final float c() {
        return (c1.e(Utilities.fastRandom, 100) / 100.0f) * this.f49383l.f49386b.height() * 0.5f;
    }
}
