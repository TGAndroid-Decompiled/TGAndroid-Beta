package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c1;
public final class c {
    public float f53339a;
    public float f53340b;
    public float f53341c;
    public float d;
    public float f53342e;
    public float f53343f;
    public float f53344g;
    public float h;
    public long f53345i;
    public boolean f53346j;
    public float f53347k;
    public final d f53348l;

    public c(d dVar) {
        this.f53348l = dVar;
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
            dVar = this.f53348l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f53352c.size(); i11++) {
                float f12 = ((c) dVar.f53352c.get(i11)).f53341c - b11;
                float f13 = ((c) dVar.f53352c.get(i11)).d - c11;
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
        if (dVar.f53354f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f53341c = b10;
        if (b10 > dVar.f53351b.width() * f7) {
            this.f53339a = dVar.f53351b.width() * f7;
        } else {
            float width = dVar.f53351b.width() * f7;
            this.f53339a = width;
            if (this.f53341c > width) {
                this.f53341c = width - 0.1f;
            }
        }
        float height = dVar.f53351b.height() * 0.1f;
        this.f53340b = a4.a.e(c1.f(Utilities.fastRandom, 100), 100.0f, height, dVar.f53351b.height() * 0.45f);
        if (dVar.f53354f) {
            float width2 = dVar.f53351b.width() * 0.1f;
            float e7 = a4.a.e(c1.f(Utilities.fastRandom, 100), 100.0f, width2, dVar.f53351b.width() * 0.05f);
            this.f53343f = e7;
            this.f53344g = (((c1.f(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e7;
            float height2 = dVar.f53351b.height() * 0.1f;
            this.d = a4.a.e(c1.f(Utilities.fastRandom, 100), 100.0f, height2, this.f53343f / 2.0f);
            this.f53342e = dVar.f53351b.height() + this.f53343f;
            this.f53345i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f53351b.width() * 0.1f;
            float e10 = a4.a.e(c1.f(Utilities.fastRandom, 100), 100.0f, width3, dVar.f53351b.width() * 0.05f);
            this.f53343f = e10;
            this.f53344g = (((c1.f(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e10;
            this.d = c10;
            this.f53342e = c10 + dVar.f53351b.height();
            this.f53345i = 1800L;
        }
        this.f53345i = ((float) this.f53345i) / 1.75f;
        this.f53346j = Utilities.fastRandom.nextBoolean();
        this.f53347k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f53348l;
        if (dVar.f53354f) {
            float width = dVar.f53351b.width() * 1.5f;
            return a4.a.e(c1.f(Utilities.fastRandom, 100), 100.0f, width, dVar.f53351b.width() * (-0.25f));
        }
        return (c1.f(Utilities.fastRandom, 100) / 100.0f) * dVar.f53351b.width();
    }

    public final float c() {
        return (c1.f(Utilities.fastRandom, 100) / 100.0f) * this.f53348l.f53351b.height() * 0.5f;
    }
}
