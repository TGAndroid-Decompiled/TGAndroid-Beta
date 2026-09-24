package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c1;
public final class c {
    public float f49256a;
    public float f49257b;
    public float f49258c;
    public float d;
    public float e;
    public float f49259f;
    public float f49260g;
    public float h;
    public long f49261i;
    public boolean f49262j;
    public float f49263k;
    public final d f49264l;

    public c(d dVar) {
        this.f49264l = dVar;
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
            dVar = this.f49264l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f49268c.size(); i11++) {
                float f12 = ((c) dVar.f49268c.get(i11)).f49258c - b11;
                float f13 = ((c) dVar.f49268c.get(i11)).d - c11;
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
        if (dVar.f49269f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f49258c = b10;
        if (b10 > dVar.f49267b.width() * f7) {
            this.f49256a = dVar.f49267b.width() * f7;
        } else {
            float width = dVar.f49267b.width() * f7;
            this.f49256a = width;
            if (this.f49258c > width) {
                this.f49258c = width - 0.1f;
            }
        }
        float height = dVar.f49267b.height() * 0.1f;
        this.f49257b = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, height, dVar.f49267b.height() * 0.45f);
        if (dVar.f49269f) {
            float width2 = dVar.f49267b.width() * 0.1f;
            float e = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, width2, dVar.f49267b.width() * 0.05f);
            this.f49259f = e;
            this.f49260g = (((c1.e(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e;
            float height2 = dVar.f49267b.height() * 0.1f;
            this.d = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, height2, this.f49259f / 2.0f);
            this.e = dVar.f49267b.height() + this.f49259f;
            this.f49261i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f49267b.width() * 0.1f;
            float e7 = a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, width3, dVar.f49267b.width() * 0.05f);
            this.f49259f = e7;
            this.f49260g = (((c1.e(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e7;
            this.d = c10;
            this.e = c10 + dVar.f49267b.height();
            this.f49261i = 1800L;
        }
        this.f49261i = ((float) this.f49261i) / 1.75f;
        this.f49262j = Utilities.fastRandom.nextBoolean();
        this.f49263k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f49264l;
        if (dVar.f49269f) {
            float width = dVar.f49267b.width() * 1.5f;
            return a4.a.e(c1.e(Utilities.fastRandom, 100), 100.0f, width, dVar.f49267b.width() * (-0.25f));
        }
        return (c1.e(Utilities.fastRandom, 100) / 100.0f) * dVar.f49267b.width();
    }

    public final float c() {
        return (c1.e(Utilities.fastRandom, 100) / 100.0f) * this.f49264l.f49267b.height() * 0.5f;
    }
}
