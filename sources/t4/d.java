package t4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f57609a;
    public final int f57610b;
    public final int f57611c;
    public final int d;
    public final int f57612e;
    public boolean f57613f;
    public int f57614g;
    public int h;
    public float[] f57615i;

    public d(int i7, int i10) {
        this.f57609a = Color.red(i7);
        this.f57610b = Color.green(i7);
        this.f57611c = Color.blue(i7);
        this.d = i7;
        this.f57612e = i10;
    }

    public final void a() {
        int o4;
        int o10;
        if (!this.f57613f) {
            int i7 = this.d;
            int i10 = i0.a.i(4.5f, -1, i7);
            int i11 = i0.a.i(3.0f, -1, i7);
            if (i10 != -1 && i11 != -1) {
                this.h = i0.a.o(-1, i10);
                this.f57614g = i0.a.o(-1, i11);
                this.f57613f = true;
                return;
            }
            int i12 = i0.a.i(4.5f, -16777216, i7);
            int i13 = i0.a.i(3.0f, -16777216, i7);
            if (i12 != -1 && i13 != -1) {
                this.h = i0.a.o(-16777216, i12);
                this.f57614g = i0.a.o(-16777216, i13);
                this.f57613f = true;
                return;
            }
            if (i10 != -1) {
                o4 = i0.a.o(-1, i10);
            } else {
                o4 = i0.a.o(-16777216, i12);
            }
            this.h = o4;
            if (i11 != -1) {
                o10 = i0.a.o(-1, i11);
            } else {
                o10 = i0.a.o(-16777216, i13);
            }
            this.f57614g = o10;
            this.f57613f = true;
        }
    }

    public final float[] b() {
        if (this.f57615i == null) {
            this.f57615i = new float[3];
        }
        i0.a.c(this.f57609a, this.f57610b, this.f57611c, this.f57615i);
        return this.f57615i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f57612e == dVar.f57612e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f57612e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f57612e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f57614g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
