package p4;
public final class i0 implements m0 {
    public final int f55412a;
    public final n0 f55413b;
    public final int f55414c;

    public i0(n0 n0Var, int i7, int i10) {
        this.f55412a = i10;
        this.f55413b = n0Var;
        this.f55414c = i7;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f55412a;
        int i10 = 0;
        r0 = false;
        boolean z10 = false;
        i10 = 0;
        i10 = 0;
        int i11 = this.f55414c;
        n0 n0Var = this.f55413b;
        switch (i7) {
            case 0:
                h1 h1Var = n0Var.h.f55324t;
                int i12 = n.f55479a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2 && i11 != 3) {
                            h2.a.l("LegacyConversions", "Unrecognized PlaybackStateCompat.RepeatMode: " + i11 + " was converted to `Player.REPEAT_MODE_OFF`");
                        } else {
                            i10 = 2;
                        }
                    } else {
                        i10 = 1;
                    }
                }
                h1Var.k(i10);
                return;
            default:
                h1 h1Var2 = n0Var.h.f55324t;
                int i13 = n.f55479a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalArgumentException(i5.c.i(i11, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                h1Var2.y(z10);
                return;
        }
    }
}
