package v3;
public final class e {
    public final int f47940a;
    public final int f47941b;
    public final float f47942c;

    public e(float f7, int i10, int i11) {
        this.f47940a = i10;
        this.f47941b = i11;
        this.f47942c = f7;
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
        if (this.f47940a != eVar.f47940a || this.f47941b != eVar.f47941b || Float.compare(this.f47942c, eVar.f47942c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47942c) + (((this.f47940a * 31) + this.f47941b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f47940a + ", originator=" + this.f47941b + ", gain=" + this.f47942c + '}';
    }
}
