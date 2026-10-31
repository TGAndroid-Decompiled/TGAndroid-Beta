package q4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f45467a;
    public final int f45468b;
    public final int f45469c;
    public final int d;
    public final int e;
    public boolean f45470f;
    public int f45471g;
    public int h;
    public float[] f45472i;

    public d(int i10, int i11) {
        this.f45467a = Color.red(i10);
        this.f45468b = Color.green(i10);
        this.f45469c = Color.blue(i10);
        this.d = i10;
        this.e = i11;
    }

    public final void a() {
        int o10;
        int o11;
        if (!this.f45470f) {
            int i10 = this.d;
            int i11 = i0.b.i(4.5f, -1, i10);
            int i12 = i0.b.i(3.0f, -1, i10);
            if (i11 != -1 && i12 != -1) {
                this.h = i0.b.o(-1, i11);
                this.f45471g = i0.b.o(-1, i12);
                this.f45470f = true;
                return;
            }
            int i13 = i0.b.i(4.5f, -16777216, i10);
            int i14 = i0.b.i(3.0f, -16777216, i10);
            if (i13 != -1 && i14 != -1) {
                this.h = i0.b.o(-16777216, i13);
                this.f45471g = i0.b.o(-16777216, i14);
                this.f45470f = true;
                return;
            }
            if (i11 != -1) {
                o10 = i0.b.o(-1, i11);
            } else {
                o10 = i0.b.o(-16777216, i13);
            }
            this.h = o10;
            if (i12 != -1) {
                o11 = i0.b.o(-1, i12);
            } else {
                o11 = i0.b.o(-16777216, i14);
            }
            this.f45471g = o11;
            this.f45470f = true;
        }
    }

    public final float[] b() {
        if (this.f45472i == null) {
            this.f45472i = new float[3];
        }
        i0.b.c(this.f45467a, this.f45468b, this.f45469c, this.f45472i);
        return this.f45472i;
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
        sb2.append(Integer.toHexString(this.f45471g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
