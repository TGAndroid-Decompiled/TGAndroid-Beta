package y3;
public final class e {
    public final int f58859a;
    public final int f58860b;
    public final float f58861c;

    public e(float f10, int i7, int i10) {
        this.f58859a = i7;
        this.f58860b = i10;
        this.f58861c = f10;
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
        if (this.f58859a != eVar.f58859a || this.f58860b != eVar.f58860b || Float.compare(this.f58861c, eVar.f58861c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f58861c) + (((this.f58859a * 31) + this.f58860b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f58859a + ", originator=" + this.f58860b + ", gain=" + this.f58861c + '}';
    }
}
