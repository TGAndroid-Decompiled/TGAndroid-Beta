package v3;
public final class e {
    public final int f48381a;
    public final int f48382b;
    public final float f48383c;

    public e(float f7, int i10, int i11) {
        this.f48381a = i10;
        this.f48382b = i11;
        this.f48383c = f7;
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
        if (this.f48381a != eVar.f48381a || this.f48382b != eVar.f48382b || Float.compare(this.f48383c, eVar.f48383c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f48383c) + (((this.f48381a * 31) + this.f48382b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f48381a + ", originator=" + this.f48382b + ", gain=" + this.f48383c + '}';
    }
}
