package v4;
public final class h1 {
    public int f56967a;
    public int f56968b;
    public int f56969c;
    public int d;
    public int f56970e;

    public final boolean a() {
        int i7;
        int i10;
        int i11;
        int i12 = this.f56967a;
        int i13 = 2;
        if ((i12 & 7) != 0) {
            int i14 = this.d;
            int i15 = this.f56968b;
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
            int i17 = this.f56969c;
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
            int i18 = this.f56970e;
            int i19 = this.f56968b;
            if (i18 > i19) {
                i7 = 1;
            } else if (i18 == i19) {
                i7 = 2;
            } else {
                i7 = 4;
            }
            if (((i7 << 8) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 28672) != 0) {
            int i20 = this.f56970e;
            int i21 = this.f56969c;
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
