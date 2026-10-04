package q4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f44811a;
    public final int f44812b;
    public final int f44813c;
    public final int d;
    public final int f44814e;
    public boolean f44815f;
    public int f44816g;
    public int h;
    public float[] f44817i;

    public d(int i10, int i11) {
        this.f44811a = Color.red(i10);
        this.f44812b = Color.green(i10);
        this.f44813c = Color.blue(i10);
        this.d = i10;
        this.f44814e = i11;
    }

    public final void a() {
        int k10;
        int k11;
        if (!this.f44815f) {
            int i10 = this.d;
            int g10 = i0.a.g(4.5f, -1, i10);
            int g11 = i0.a.g(3.0f, -1, i10);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f44816g = i0.a.k(-1, g11);
                this.f44815f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i10);
            int g13 = i0.a.g(3.0f, -16777216, i10);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f44816g = i0.a.k(-16777216, g13);
                this.f44815f = true;
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
            this.f44816g = k11;
            this.f44815f = true;
        }
    }

    public final float[] b() {
        if (this.f44817i == null) {
            this.f44817i = new float[3];
        }
        i0.a.b(this.f44817i, this.f44811a, this.f44812b, this.f44813c);
        return this.f44817i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f44814e == dVar.f44814e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f44814e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f44814e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f44816g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
