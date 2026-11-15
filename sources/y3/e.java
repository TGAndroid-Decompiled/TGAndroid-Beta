package y3;
public final class e {
    public final int f60169a;
    public final int f60170b;
    public final float f60171c;

    public e(float f10, int i7, int i10) {
        this.f60169a = i7;
        this.f60170b = i10;
        this.f60171c = f10;
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
        if (this.f60169a != eVar.f60169a || this.f60170b != eVar.f60170b || Float.compare(this.f60171c, eVar.f60171c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f60171c) + (((this.f60169a * 31) + this.f60170b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f60169a + ", originator=" + this.f60170b + ", gain=" + this.f60171c + '}';
    }
}
