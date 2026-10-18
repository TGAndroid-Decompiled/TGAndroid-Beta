package v3;
public final class e {
    public final int f47980a;
    public final int f47981b;
    public final float f47982c;

    public e(float f7, int i10, int i11) {
        this.f47980a = i10;
        this.f47981b = i11;
        this.f47982c = f7;
    }

    public static e a(int i10) {
        int i11;
        int i12 = (i10 >> 13) & 7;
        if (i12 == 0) {
            return null;
        }
        int i13 = (i10 >> 10) & 7;
        int i14 = i10 & 511;
        if ((i10 & 512) != 0) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        return new e((i14 * i11) / 10.0f, i12, i13);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f47980a != eVar.f47980a || this.f47981b != eVar.f47981b || Float.compare(this.f47982c, eVar.f47982c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47982c) + (((this.f47980a * 31) + this.f47981b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f47980a + ", originator=" + this.f47981b + ", gain=" + this.f47982c + '}';
    }
}
