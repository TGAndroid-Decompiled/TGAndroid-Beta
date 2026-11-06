package y3;
public final class e {
    public final int f58829a;
    public final int f58830b;
    public final float f58831c;

    public e(float f10, int i7, int i10) {
        this.f58829a = i7;
        this.f58830b = i10;
        this.f58831c = f10;
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
        if (this.f58829a != eVar.f58829a || this.f58830b != eVar.f58830b || Float.compare(this.f58831c, eVar.f58831c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f58831c) + (((this.f58829a * 31) + this.f58830b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f58829a + ", originator=" + this.f58830b + ", gain=" + this.f58831c + '}';
    }
}
