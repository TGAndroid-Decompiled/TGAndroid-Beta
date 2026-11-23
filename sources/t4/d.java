package t4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f57644a;
    public final int f57645b;
    public final int f57646c;
    public final int d;
    public final int f57647e;
    public boolean f57648f;
    public int f57649g;
    public int h;
    public float[] f57650i;

    public d(int i7, int i10) {
        this.f57644a = Color.red(i7);
        this.f57645b = Color.green(i7);
        this.f57646c = Color.blue(i7);
        this.d = i7;
        this.f57647e = i10;
    }

    public final void a() {
        int o4;
        int o10;
        if (!this.f57648f) {
            int i7 = this.d;
            int i10 = i0.a.i(4.5f, -1, i7);
            int i11 = i0.a.i(3.0f, -1, i7);
            if (i10 != -1 && i11 != -1) {
                this.h = i0.a.o(-1, i10);
                this.f57649g = i0.a.o(-1, i11);
                this.f57648f = true;
                return;
            }
            int i12 = i0.a.i(4.5f, -16777216, i7);
            int i13 = i0.a.i(3.0f, -16777216, i7);
            if (i12 != -1 && i13 != -1) {
                this.h = i0.a.o(-16777216, i12);
                this.f57649g = i0.a.o(-16777216, i13);
                this.f57648f = true;
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
            this.f57649g = o10;
            this.f57648f = true;
        }
    }

    public final float[] b() {
        if (this.f57650i == null) {
            this.f57650i = new float[3];
        }
        i0.a.c(this.f57644a, this.f57645b, this.f57646c, this.f57650i);
        return this.f57650i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f57647e == dVar.f57647e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f57647e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f57647e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f57649g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
