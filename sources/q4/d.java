package q4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f41470a;
    public final int f41471b;
    public final int f41472c;
    public final int d;
    public final int e;
    public boolean f41473f;
    public int f41474g;
    public int h;
    public float[] f41475i;

    public d(int i10, int i11) {
        this.f41470a = Color.red(i10);
        this.f41471b = Color.green(i10);
        this.f41472c = Color.blue(i10);
        this.d = i10;
        this.e = i11;
    }

    public final void a() {
        int k10;
        int k11;
        if (!this.f41473f) {
            int i10 = this.d;
            int g10 = i0.a.g(4.5f, -1, i10);
            int g11 = i0.a.g(3.0f, -1, i10);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f41474g = i0.a.k(-1, g11);
                this.f41473f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i10);
            int g13 = i0.a.g(3.0f, -16777216, i10);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f41474g = i0.a.k(-16777216, g13);
                this.f41473f = true;
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
            this.f41474g = k11;
            this.f41473f = true;
        }
    }

    public final float[] b() {
        if (this.f41475i == null) {
            this.f41475i = new float[3];
        }
        i0.a.b(this.f41475i, this.f41470a, this.f41471b, this.f41472c);
        return this.f41475i;
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
        sb2.append(Integer.toHexString(this.f41474g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
