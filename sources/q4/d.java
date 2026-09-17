package q4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f44212a;
    public final int f44213b;
    public final int f44214c;
    public final int d;
    public final int f44215e;
    public boolean f44216f;
    public int f44217g;
    public int h;
    public float[] f44218i;

    public d(int i10, int i11) {
        this.f44212a = Color.red(i10);
        this.f44213b = Color.green(i10);
        this.f44214c = Color.blue(i10);
        this.d = i10;
        this.f44215e = i11;
    }

    public final void a() {
        int k10;
        int k11;
        if (!this.f44216f) {
            int i10 = this.d;
            int g10 = i0.a.g(4.5f, -1, i10);
            int g11 = i0.a.g(3.0f, -1, i10);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f44217g = i0.a.k(-1, g11);
                this.f44216f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i10);
            int g13 = i0.a.g(3.0f, -16777216, i10);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f44217g = i0.a.k(-16777216, g13);
                this.f44216f = true;
                return;
            }
            if (g10 != -1) {
                k10 = i0.a.k(-1, g10);
            } else {
                k10 = i0.a.k(-16777216, g12);
            }
            this.h = k10;
            if (g11 != -1) {
                k11 = i0.a.k(-1, g11);
            } else {
                k11 = i0.a.k(-16777216, g13);
            }
            this.f44217g = k11;
            this.f44216f = true;
        }
    }

    public final float[] b() {
        if (this.f44218i == null) {
            this.f44218i = new float[3];
        }
        i0.a.b(this.f44218i, this.f44212a, this.f44213b, this.f44214c);
        return this.f44218i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44215e == dVar.f44215e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f44215e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f44215e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f44217g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
