package t4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f57601a;
    public final int f57602b;
    public final int f57603c;
    public final int d;
    public final int f57604e;
    public boolean f57605f;
    public int f57606g;
    public int h;
    public float[] f57607i;

    public d(int i7, int i10) {
        this.f57601a = Color.red(i7);
        this.f57602b = Color.green(i7);
        this.f57603c = Color.blue(i7);
        this.d = i7;
        this.f57604e = i10;
    }

    public final void a() {
        int o4;
        int o10;
        if (!this.f57605f) {
            int i7 = this.d;
            int i10 = i0.a.i(4.5f, -1, i7);
            int i11 = i0.a.i(3.0f, -1, i7);
            if (i10 != -1 && i11 != -1) {
                this.h = i0.a.o(-1, i10);
                this.f57606g = i0.a.o(-1, i11);
                this.f57605f = true;
                return;
            }
            int i12 = i0.a.i(4.5f, -16777216, i7);
            int i13 = i0.a.i(3.0f, -16777216, i7);
            if (i12 != -1 && i13 != -1) {
                this.h = i0.a.o(-16777216, i12);
                this.f57606g = i0.a.o(-16777216, i13);
                this.f57605f = true;
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
            this.f57606g = o10;
            this.f57605f = true;
        }
    }

    public final float[] b() {
        if (this.f57607i == null) {
            this.f57607i = new float[3];
        }
        i0.a.c(this.f57601a, this.f57602b, this.f57603c, this.f57607i);
        return this.f57607i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f57604e == dVar.f57604e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f57604e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f57604e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f57606g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
