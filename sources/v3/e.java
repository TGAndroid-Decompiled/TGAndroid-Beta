package v3;
public final class e {
    public final int f47944a;
    public final int f47945b;
    public final float f47946c;

    public e(float f7, int i10, int i11) {
        this.f47944a = i10;
        this.f47945b = i11;
        this.f47946c = f7;
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
        if (this.f47944a != eVar.f47944a || this.f47945b != eVar.f47945b || Float.compare(this.f47946c, eVar.f47946c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47946c) + (((this.f47944a * 31) + this.f47945b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f47944a + ", originator=" + this.f47945b + ", gain=" + this.f47946c + '}';
    }
}
