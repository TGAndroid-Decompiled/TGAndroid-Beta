package v3;
public final class e {
    public final int f50369a;
    public final int f50370b;
    public final float f50371c;

    public e(float f7, int i10, int i11) {
        this.f50369a = i10;
        this.f50370b = i11;
        this.f50371c = f7;
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
        if (this.f50369a != eVar.f50369a || this.f50370b != eVar.f50370b || Float.compare(this.f50371c, eVar.f50371c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f50371c) + (((this.f50369a * 31) + this.f50370b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f50369a + ", originator=" + this.f50370b + ", gain=" + this.f50371c + '}';
    }
}
