package y3;
public final class e {
    public final int f60776a;
    public final int f60777b;
    public final float f60778c;

    public e(float f10, int i7, int i10) {
        this.f60776a = i7;
        this.f60777b = i10;
        this.f60778c = f10;
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
        if (this.f60776a != eVar.f60776a || this.f60777b != eVar.f60777b || Float.compare(this.f60778c, eVar.f60778c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f60778c) + (((this.f60776a * 31) + this.f60777b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f60776a + ", originator=" + this.f60777b + ", gain=" + this.f60778c + '}';
    }
}
