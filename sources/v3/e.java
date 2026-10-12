package v3;
public final class e {
    public final int f46547a;
    public final int f46548b;
    public final float f46549c;

    public e(float f7, int i10, int i11) {
        this.f46547a = i10;
        this.f46548b = i11;
        this.f46549c = f7;
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
        if (this.f46547a != eVar.f46547a || this.f46548b != eVar.f46548b || Float.compare(this.f46549c, eVar.f46549c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f46549c) + (((this.f46547a * 31) + this.f46548b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f46547a + ", originator=" + this.f46548b + ", gain=" + this.f46549c + '}';
    }
}
