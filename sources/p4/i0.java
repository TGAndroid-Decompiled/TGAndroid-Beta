package p4;
public final class i0 implements l0 {
    public final int f53313a;
    public final m0 f53314b;
    public final int f53315c;

    public i0(m0 m0Var, int i7, int i10) {
        this.f53313a = i10;
        this.f53314b = m0Var;
        this.f53315c = i7;
    }

    @Override
    public final void f(v vVar) {
        int i7 = this.f53313a;
        int i10 = 0;
        r0 = false;
        boolean z9 = false;
        i10 = 0;
        i10 = 0;
        int i11 = this.f53315c;
        m0 m0Var = this.f53314b;
        switch (i7) {
            case 0:
                g1 g1Var = m0Var.h.f53229t;
                int i12 = n.f53398a;
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
                g1 g1Var2 = m0Var.h.f53229t;
                int i13 = n.f53398a;
                if (i11 != -1 && i11 != 0) {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalArgumentException(jg.g.j(i11, "Unrecognized ShuffleMode: "));
                    }
                    z9 = true;
                }
                g1Var2.x(z9);
                return;
        }
    }
}
