package p4;
public final class j0 implements m0 {
    public final int f55352a;
    public final n0 f55353b;
    public final int f55354c;

    public j0(n0 n0Var, int i7, int i10) {
        this.f55352a = i10;
        this.f55353b = n0Var;
        this.f55354c = i7;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f55352a;
        int i10 = 0;
        r0 = false;
        boolean z10 = false;
        i10 = 0;
        i10 = 0;
        int i11 = this.f55354c;
        n0 n0Var = this.f55353b;
        switch (i7) {
            case 0:
                i1 i1Var = n0Var.h.f55245t;
                int i12 = n.f55374a;
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
                i1Var.k(i10);
                return;
            default:
                i1 i1Var2 = n0Var.h.f55245t;
                int i13 = n.f55374a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalArgumentException(i5.c.i(i11, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                i1Var2.x(z10);
                return;
        }
    }
}
