package x3;
public final class e {
    public final int f58202a;
    public final int f58203b;
    public final float f58204c;

    public e(float f10, int i3, int i10) {
        this.f58202a = i3;
        this.f58203b = i10;
        this.f58204c = f10;
    }

    public static e a(int i3) {
        int i10;
        int i11 = (i3 >> 13) & 7;
        if (i11 == 0) {
            return null;
        }
        int i12 = (i3 >> 10) & 7;
        int i13 = i3 & 511;
        if ((i3 & 512) != 0) {
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
        if (this.f58202a != eVar.f58202a || this.f58203b != eVar.f58203b || Float.compare(this.f58204c, eVar.f58204c) != 0) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f58204c) + (((this.f58202a * 31) + this.f58203b) * 31);
    }

    public final String toString() {
        return "GainField{name=" + this.f58202a + ", originator=" + this.f58203b + ", gain=" + this.f58204c + '}';
    }
}
