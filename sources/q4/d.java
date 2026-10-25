package q4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f46965a;
    public final int f46966b;
    public final int f46967c;
    public final int d;
    public final int e;
    public boolean f46968f;
    public int f46969g;
    public int h;
    public float[] f46970i;

    public d(int i10, int i11) {
        this.f46965a = Color.red(i10);
        this.f46966b = Color.green(i10);
        this.f46967c = Color.blue(i10);
        this.d = i10;
        this.e = i11;
    }

    public final void a() {
        int o10;
        int o11;
        if (!this.f46968f) {
            int i10 = this.d;
            int i11 = i0.a.i(4.5f, -1, i10);
            int i12 = i0.a.i(3.0f, -1, i10);
            if (i11 != -1 && i12 != -1) {
                this.h = i0.a.o(-1, i11);
                this.f46969g = i0.a.o(-1, i12);
                this.f46968f = true;
                return;
            }
            int i13 = i0.a.i(4.5f, -16777216, i10);
            int i14 = i0.a.i(3.0f, -16777216, i10);
            if (i13 != -1 && i14 != -1) {
                this.h = i0.a.o(-16777216, i13);
                this.f46969g = i0.a.o(-16777216, i14);
                this.f46968f = true;
                return;
            }
            if (i11 != -1) {
                o10 = i0.a.o(-1, i11);
            } else {
                o10 = i0.a.o(-16777216, i13);
            }
            this.h = o10;
            if (i12 != -1) {
                o11 = i0.a.o(-1, i12);
            } else {
                o11 = i0.a.o(-16777216, i14);
            }
            this.f46969g = o11;
            this.f46968f = true;
        }
    }

    public final float[] b() {
        if (this.f46970i == null) {
            this.f46970i = new float[3];
        }
        i0.a.c(this.f46970i, this.f46965a, this.f46966b, this.f46967c);
        return this.f46970i;
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
        sb2.append(Integer.toHexString(this.f46969g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
