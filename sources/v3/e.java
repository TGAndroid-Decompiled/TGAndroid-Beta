package v3;
public final class e {
    public final int f50055a;
    public final int f50056b;
    public final float f50057c;

    public e(float f7, int i10, int i11) {
        this.f50055a = i10;
        this.f50056b = i11;
        this.f50057c = f7;
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
        if (this.f50055a != eVar.f50055a || this.f50056b != eVar.f50056b || Float.compare(this.f50057c, eVar.f50057c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f50057c) + (((this.f50055a * 31) + this.f50056b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f50055a + ", originator=" + this.f50056b + ", gain=" + this.f50057c + '}';
    }
}
