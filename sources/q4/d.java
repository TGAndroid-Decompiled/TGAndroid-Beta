package q4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f46056a;
    public final int f46057b;
    public final int f46058c;
    public final int d;
    public final int f46059e;
    public boolean f46060f;
    public int f46061g;
    public int h;
    public float[] f46062i;

    public d(int i10, int i11) {
        this.f46056a = Color.red(i10);
        this.f46057b = Color.green(i10);
        this.f46058c = Color.blue(i10);
        this.d = i10;
        this.f46059e = i11;
    }

    public final void a() {
        int k10;
        int k11;
        if (!this.f46060f) {
            int i10 = this.d;
            int g10 = i0.a.g(4.5f, -1, i10);
            int g11 = i0.a.g(3.0f, -1, i10);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f46061g = i0.a.k(-1, g11);
                this.f46060f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i10);
            int g13 = i0.a.g(3.0f, -16777216, i10);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f46061g = i0.a.k(-16777216, g13);
                this.f46060f = true;
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
            this.f46061g = k11;
            this.f46060f = true;
        }
    }

    public final float[] b() {
        if (this.f46062i == null) {
            this.f46062i = new float[3];
        }
        i0.a.b(this.f46062i, this.f46056a, this.f46057b, this.f46058c);
        return this.f46062i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f46059e == dVar.f46059e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f46059e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f46059e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f46061g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
