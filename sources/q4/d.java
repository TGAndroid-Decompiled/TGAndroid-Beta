package q4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f45979a;
    public final int f45980b;
    public final int f45981c;
    public final int d;
    public final int f45982e;
    public boolean f45983f;
    public int f45984g;
    public int h;
    public float[] f45985i;

    public d(int i10, int i11) {
        this.f45979a = Color.red(i10);
        this.f45980b = Color.green(i10);
        this.f45981c = Color.blue(i10);
        this.d = i10;
        this.f45982e = i11;
    }

    public final void a() {
        int k10;
        int k11;
        if (!this.f45983f) {
            int i10 = this.d;
            int g10 = i0.a.g(4.5f, -1, i10);
            int g11 = i0.a.g(3.0f, -1, i10);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f45984g = i0.a.k(-1, g11);
                this.f45983f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i10);
            int g13 = i0.a.g(3.0f, -16777216, i10);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f45984g = i0.a.k(-16777216, g13);
                this.f45983f = true;
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
            this.f45984g = k11;
            this.f45983f = true;
        }
    }

    public final float[] b() {
        if (this.f45985i == null) {
            this.f45985i = new float[3];
        }
        i0.a.b(this.f45985i, this.f45979a, this.f45980b, this.f45981c);
        return this.f45985i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f45982e == dVar.f45982e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f45982e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f45982e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f45984g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
