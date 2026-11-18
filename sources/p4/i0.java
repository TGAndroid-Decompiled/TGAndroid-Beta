package p4;
public final class i0 implements l0 {
    public final int f55284a;
    public final m0 f55285b;
    public final int f55286c;

    public i0(m0 m0Var, int i7, int i10) {
        this.f55284a = i10;
        this.f55285b = m0Var;
        this.f55286c = i7;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f55284a;
        int i10 = 0;
        r0 = false;
        boolean z10 = false;
        i10 = 0;
        i10 = 0;
        int i11 = this.f55286c;
        m0 m0Var = this.f55285b;
        switch (i7) {
            case 0:
                i1 i1Var = m0Var.h.f55195t;
                int i12 = n.f55348a;
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
                i1 i1Var2 = m0Var.h.f55195t;
                int i13 = n.f55348a;
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
