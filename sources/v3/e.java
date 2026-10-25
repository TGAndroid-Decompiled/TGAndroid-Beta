package v3;
public final class e {
    public final int f50052a;
    public final int f50053b;
    public final float f50054c;

    public e(float f7, int i10, int i11) {
        this.f50052a = i10;
        this.f50053b = i11;
        this.f50054c = f7;
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
        if (this.f50052a != eVar.f50052a || this.f50053b != eVar.f50053b || Float.compare(this.f50054c, eVar.f50054c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f50054c) + (((this.f50052a * 31) + this.f50053b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f50052a + ", originator=" + this.f50053b + ", gain=" + this.f50054c + '}';
    }
}
