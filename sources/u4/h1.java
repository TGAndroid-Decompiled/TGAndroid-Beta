package u4;
public final class h1 {
    public int f55581a;
    public int f55582b;
    public int f55583c;
    public int d;
    public int f55584e;

    public final boolean a() {
        int i3;
        int i10;
        int i11;
        int i12 = this.f55581a;
        int i13 = 2;
        if ((i12 & 7) != 0) {
            int i14 = this.d;
            int i15 = this.f55582b;
            if (i14 > i15) {
                i11 = 1;
            } else if (i14 == i15) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            if ((i11 & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 112) != 0) {
            int i16 = this.d;
            int i17 = this.f55583c;
            if (i16 > i17) {
                i10 = 1;
            } else if (i16 == i17) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if (((i10 << 4) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 1792) != 0) {
            int i18 = this.f55584e;
            int i19 = this.f55582b;
            if (i18 > i19) {
                i3 = 1;
            } else if (i18 == i19) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            if (((i3 << 8) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 28672) != 0) {
            int i20 = this.f55584e;
            int i21 = this.f55583c;
            if (i20 > i21) {
                i13 = 1;
            } else if (i20 != i21) {
                i13 = 4;
            }
            if ((i12 & (i13 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
