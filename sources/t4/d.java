package t4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f55431a;
    public final int f55432b;
    public final int f55433c;
    public final int d;
    public final int f55434e;
    public boolean f55435f;
    public int f55436g;
    public int h;
    public float[] f55437i;

    public d(int i7, int i10) {
        this.f55431a = Color.red(i7);
        this.f55432b = Color.green(i7);
        this.f55433c = Color.blue(i7);
        this.d = i7;
        this.f55434e = i10;
    }

    public final void a() {
        int o4;
        int o10;
        if (!this.f55435f) {
            int i7 = this.d;
            int i10 = i0.a.i(4.5f, -1, i7);
            int i11 = i0.a.i(3.0f, -1, i7);
            if (i10 != -1 && i11 != -1) {
                this.h = i0.a.o(-1, i10);
                this.f55436g = i0.a.o(-1, i11);
                this.f55435f = true;
                return;
            }
            int i12 = i0.a.i(4.5f, -16777216, i7);
            int i13 = i0.a.i(3.0f, -16777216, i7);
            if (i12 != -1 && i13 != -1) {
                this.h = i0.a.o(-16777216, i12);
                this.f55436g = i0.a.o(-16777216, i13);
                this.f55435f = true;
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
            this.f55436g = o10;
            this.f55435f = true;
        }
    }

    public final float[] b() {
        if (this.f55437i == null) {
            this.f55437i = new float[3];
        }
        i0.a.c(this.f55431a, this.f55432b, this.f55433c, this.f55437i);
        return this.f55437i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55434e == dVar.f55434e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f55434e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f55434e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f55436g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
