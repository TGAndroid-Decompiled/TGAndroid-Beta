package q4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f43051a;
    public final int f43052b;
    public final int f43053c;
    public final int d;
    public final int e;
    public boolean f43054f;
    public int f43055g;
    public int h;
    public float[] f43056i;

    public d(int i10, int i11) {
        this.f43051a = Color.red(i10);
        this.f43052b = Color.green(i10);
        this.f43053c = Color.blue(i10);
        this.d = i10;
        this.e = i11;
    }

    public final void a() {
        int k10;
        int k11;
        if (!this.f43054f) {
            int i10 = this.d;
            int g10 = i0.a.g(4.5f, -1, i10);
            int g11 = i0.a.g(3.0f, -1, i10);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f43055g = i0.a.k(-1, g11);
                this.f43054f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i10);
            int g13 = i0.a.g(3.0f, -16777216, i10);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f43055g = i0.a.k(-16777216, g13);
                this.f43054f = true;
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
            this.f43055g = k11;
            this.f43054f = true;
        }
    }

    public final float[] b() {
        if (this.f43056i == null) {
            this.f43056i = new float[3];
        }
        i0.a.b(this.f43056i, this.f43051a, this.f43052b, this.f43053c);
        return this.f43056i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.e == dVar.e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f43055g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
