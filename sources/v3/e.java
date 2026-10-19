package v3;
public final class e {
    public final int f47935a;
    public final int f47936b;
    public final float f47937c;

    public e(float f7, int i10, int i11) {
        this.f47935a = i10;
        this.f47936b = i11;
        this.f47937c = f7;
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
        if (this.f47935a != eVar.f47935a || this.f47936b != eVar.f47936b || Float.compare(this.f47937c, eVar.f47937c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f47937c) + (((this.f47935a * 31) + this.f47936b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f47935a + ", originator=" + this.f47936b + ", gain=" + this.f47937c + '}';
    }
}
