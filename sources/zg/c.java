package zg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.c1;
public final class c {
    public float f54477a;
    public float f54478b;
    public float f54479c;
    public float d;
    public float f54480e;
    public float f54481f;
    public float f54482g;
    public float h;
    public long f54483i;
    public boolean f54484j;
    public float f54485k;
    public final d f54486l;

    public c(d dVar) {
        this.f54486l = dVar;
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
            dVar = this.f54486l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f54493c.size(); i11++) {
                float f12 = ((c) dVar.f54493c.get(i11)).f54479c - b11;
                float f13 = ((c) dVar.f54493c.get(i11)).d - c11;
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
        if (dVar.f54495f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f54479c = b10;
        if (b10 > dVar.f54492b.width() * f7) {
            this.f54477a = dVar.f54492b.width() * f7;
        } else {
            float width = dVar.f54492b.width() * f7;
            this.f54477a = width;
            if (this.f54479c > width) {
                this.f54479c = width - 0.1f;
            }
        }
        this.f54478b = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54492b.height() * 0.1f, dVar.f54492b.height() * 0.45f);
        if (dVar.f54495f) {
            float e7 = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54492b.width() * 0.1f, dVar.f54492b.width() * 0.05f);
            this.f54481f = e7;
            this.f54482g = (((c1.d(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e7;
            this.d = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54492b.height() * 0.1f, this.f54481f / 2.0f);
            this.f54480e = dVar.f54492b.height() + this.f54481f;
            this.f54483i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float e10 = a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, dVar.f54492b.width() * 0.1f, dVar.f54492b.width() * 0.05f);
            this.f54481f = e10;
            this.f54482g = (((c1.d(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e10;
            this.d = c10;
            this.f54480e = c10 + dVar.f54492b.height();
            this.f54483i = 1800L;
        }
        this.f54483i = ((float) this.f54483i) / 1.75f;
        this.f54484j = Utilities.fastRandom.nextBoolean();
        this.f54485k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f54486l;
        if (dVar.f54495f) {
            float width = dVar.f54492b.width() * 1.5f;
            return a1.g.e(c1.d(Utilities.fastRandom, 100), 100.0f, width, dVar.f54492b.width() * (-0.25f));
        }
        return (c1.d(Utilities.fastRandom, 100) / 100.0f) * dVar.f54492b.width();
    }

    public final float c() {
        return (c1.d(Utilities.fastRandom, 100) / 100.0f) * this.f54486l.f54492b.height() * 0.5f;
    }
}
