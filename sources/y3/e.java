package y3;
public final class e {
    public final int f58854a;
    public final int f58855b;
    public final float f58856c;

    public e(float f10, int i7, int i10) {
        this.f58854a = i7;
        this.f58855b = i10;
        this.f58856c = f10;
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
        if (this.f58854a != eVar.f58854a || this.f58855b != eVar.f58855b || Float.compare(this.f58856c, eVar.f58856c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f58856c) + (((this.f58854a * 31) + this.f58855b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f58854a + ", originator=" + this.f58855b + ", gain=" + this.f58856c + '}';
    }
}
