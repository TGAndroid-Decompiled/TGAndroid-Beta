package t4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f55443a;
    public final int f55444b;
    public final int f55445c;
    public final int d;
    public final int f55446e;
    public boolean f55447f;
    public int f55448g;
    public int h;
    public float[] f55449i;

    public d(int i7, int i10) {
        this.f55443a = Color.red(i7);
        this.f55444b = Color.green(i7);
        this.f55445c = Color.blue(i7);
        this.d = i7;
        this.f55446e = i10;
    }

    public final void a() {
        int o4;
        int o10;
        if (!this.f55447f) {
            int i7 = this.d;
            int i10 = i0.a.i(4.5f, -1, i7);
            int i11 = i0.a.i(3.0f, -1, i7);
            if (i10 != -1 && i11 != -1) {
                this.h = i0.a.o(-1, i10);
                this.f55448g = i0.a.o(-1, i11);
                this.f55447f = true;
                return;
            }
            int i12 = i0.a.i(4.5f, -16777216, i7);
            int i13 = i0.a.i(3.0f, -16777216, i7);
            if (i12 != -1 && i13 != -1) {
                this.h = i0.a.o(-16777216, i12);
                this.f55448g = i0.a.o(-16777216, i13);
                this.f55447f = true;
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
            this.f55448g = o10;
            this.f55447f = true;
        }
    }

    public final float[] b() {
        if (this.f55449i == null) {
            this.f55449i = new float[3];
        }
        i0.a.c(this.f55443a, this.f55444b, this.f55445c, this.f55449i);
        return this.f55449i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55446e == dVar.f55446e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f55446e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f55446e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f55448g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
