package p4;
public final class i0 implements l0 {
    public final int f54719a;
    public final m0 f54720b;
    public final int f54721c;

    public i0(m0 m0Var, int i7, int i10) {
        this.f54719a = i10;
        this.f54720b = m0Var;
        this.f54721c = i7;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f54719a;
        int i10 = 0;
        r0 = false;
        boolean z10 = false;
        i10 = 0;
        i10 = 0;
        int i11 = this.f54721c;
        m0 m0Var = this.f54720b;
        switch (i7) {
            case 0:
                g1 g1Var = m0Var.h.f54635t;
                int i12 = n.f54804a;
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
                g1Var.k(i10);
                return;
            default:
                g1 g1Var2 = m0Var.h.f54635t;
                int i13 = n.f54804a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalArgumentException(i5.c.i(i11, "Unrecognized ShuffleMode: "));
                    }
                    z10 = true;
                }
                g1Var2.x(z10);
                return;
        }
    }
}
