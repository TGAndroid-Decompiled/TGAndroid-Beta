package q4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f46025a;
    public final int f46026b;
    public final int f46027c;
    public final int d;
    public final int f46028e;
    public boolean f46029f;
    public int f46030g;
    public int h;
    public float[] f46031i;

    public d(int i10, int i11) {
        this.f46025a = Color.red(i10);
        this.f46026b = Color.green(i10);
        this.f46027c = Color.blue(i10);
        this.d = i10;
        this.f46028e = i11;
    }

    public final void a() {
        int k10;
        int k11;
        if (!this.f46029f) {
            int i10 = this.d;
            int g10 = i0.a.g(4.5f, -1, i10);
            int g11 = i0.a.g(3.0f, -1, i10);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f46030g = i0.a.k(-1, g11);
                this.f46029f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i10);
            int g13 = i0.a.g(3.0f, -16777216, i10);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f46030g = i0.a.k(-16777216, g13);
                this.f46029f = true;
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
            this.f46030g = k11;
            this.f46029f = true;
        }
    }

    public final float[] b() {
        if (this.f46031i == null) {
            this.f46031i = new float[3];
        }
        i0.a.b(this.f46031i, this.f46025a, this.f46026b, this.f46027c);
        return this.f46031i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f46028e == dVar.f46028e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f46028e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f46028e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f46030g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
