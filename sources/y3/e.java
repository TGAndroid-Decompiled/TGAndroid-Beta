package y3;
public final class e {
    public final int f58853a;
    public final int f58854b;
    public final float f58855c;

    public e(float f10, int i7, int i10) {
        this.f58853a = i7;
        this.f58854b = i10;
        this.f58855c = f10;
    }

    public static e a(int i7) {
        int i10;
        int i11 = (i7 >> 13) & 7;
        if (i11 == 0) {
            return null;
        }
        int i12 = (i7 >> 10) & 7;
        int i13 = i7 & 511;
        if ((i7 & 512) != 0) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        return new e((i13 * i10) / 10.0f, i11, i12);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f58853a != eVar.f58853a || this.f58854b != eVar.f58854b || Float.compare(this.f58855c, eVar.f58855c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f58855c) + (((this.f58853a * 31) + this.f58854b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f58853a + ", originator=" + this.f58854b + ", gain=" + this.f58855c + '}';
    }
}
