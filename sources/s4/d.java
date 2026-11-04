package s4;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f54652a;
    public final int f54653b;
    public final int f54654c;
    public final int d;
    public final int f54655e;
    public boolean f54656f;
    public int f54657g;
    public int h;
    public float[] f54658i;

    public d(int i3, int i10) {
        this.f54652a = Color.red(i3);
        this.f54653b = Color.green(i3);
        this.f54654c = Color.blue(i3);
        this.d = i3;
        this.f54655e = i10;
    }

    public final void a() {
        int o10;
        int o11;
        if (!this.f54656f) {
            int i3 = this.d;
            int i10 = i0.a.i(4.5f, -1, i3);
            int i11 = i0.a.i(3.0f, -1, i3);
            if (i10 != -1 && i11 != -1) {
                this.h = i0.a.o(-1, i10);
                this.f54657g = i0.a.o(-1, i11);
                this.f54656f = true;
                return;
            }
            int i12 = i0.a.i(4.5f, -16777216, i3);
            int i13 = i0.a.i(3.0f, -16777216, i3);
            if (i12 != -1 && i13 != -1) {
                this.h = i0.a.o(-16777216, i12);
                this.f54657g = i0.a.o(-16777216, i13);
                this.f54656f = true;
                return;
            }
            if (i10 != -1) {
                o10 = i0.a.o(-1, i10);
            } else {
                o10 = i0.a.o(-16777216, i12);
            }
            this.h = o10;
            if (i11 != -1) {
                o11 = i0.a.o(-1, i11);
            } else {
                o11 = i0.a.o(-16777216, i13);
            }
            this.f54657g = o11;
            this.f54656f = true;
        }
    }

    public final float[] b() {
        if (this.f54658i == null) {
            this.f54658i = new float[3];
        }
        i0.a.c(this.f54652a, this.f54653b, this.f54654c, this.f54658i);
        return this.f54658i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f54655e == dVar.f54655e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f54655e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(d.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f54655e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f54657g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}
