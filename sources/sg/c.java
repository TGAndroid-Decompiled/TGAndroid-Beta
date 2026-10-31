package sg;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class c {
    public float f48297a;
    public float f48298b;
    public float f48299c;
    public float d;
    public float e;
    public float f48300f;
    public float f48301g;
    public float h;
    public long f48302i;
    public boolean f48303j;
    public float f48304k;
    public final d f48305l;

    public c(d dVar) {
        this.f48305l = dVar;
    }

    public final void a() {
        float f7;
        d dVar = this.f48305l;
        boolean z10 = dVar.f48310f;
        ArrayList arrayList = dVar.f48309c;
        Rect rect = dVar.f48308b;
        float f10 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        for (int i10 = 0; i10 < 20; i10++) {
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                float f12 = ((c) arrayList.get(i11)).f48299c - b11;
                float f13 = ((c) arrayList.get(i11)).d - c11;
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
        }
        if (z10) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f48299c = b10;
        if (b10 > rect.width() * f7) {
            this.f48297a = rect.width() * f7;
        } else {
            float width = rect.width() * f7;
            this.f48297a = width;
            if (this.f48299c > width) {
                this.f48299c = width - 0.1f;
            }
        }
        d5.a aVar = Utilities.f14520c;
        this.f48298b = a1.g.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, rect.height() * 0.45f);
        if (z10) {
            float c12 = a1.g.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f48300f = c12;
            this.f48301g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * c12;
            this.d = a1.g.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f48300f / 2.0f);
            this.e = rect.height() + this.f48300f;
            this.f48302i = Math.abs(((int) aVar.nextLong()) % 600) + 1000;
        } else {
            float c13 = a1.g.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f48300f = c13;
            this.f48301g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * c13;
            this.d = c10;
            this.e = c10 + rect.height();
            this.f48302i = 1800L;
        }
        this.f48302i = ((float) this.f48302i) / 1.75f;
        this.f48303j = aVar.nextBoolean();
        this.f48304k = ((((int) aVar.nextLong()) % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f48305l;
        Rect rect = dVar.f48308b;
        if (dVar.f48310f) {
            float width = rect.width() * 1.5f;
            return a1.g.c(Math.abs(((int) Utilities.f14520c.nextLong()) % 100), 100.0f, width, rect.width() * (-0.25f));
        }
        return (Math.abs(((int) Utilities.f14520c.nextLong()) % 100) / 100.0f) * rect.width();
    }

    public final float c() {
        return (Math.abs(((int) Utilities.f14520c.nextLong()) % 100) / 100.0f) * this.f48305l.f48308b.height() * 0.5f;
    }
}
