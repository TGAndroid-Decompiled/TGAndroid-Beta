package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class tm0 implements org.telegram.messenger.k20 {
    public final int f41673a;
    public final TL_stars.TL_starGiftUnique f41674b;
    public final long f41675c;
    public final org.telegram.messenger.vs d;
    public final Object e;
    public final Object f41676f;

    public tm0(org.telegram.messenger.vs vsVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f41673a = i10;
        this.d = vsVar;
        this.e = obj;
        this.f41674b = tL_starGiftUnique;
        this.f41675c = j10;
        this.f41676f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.f41673a) {
            case 0:
                rn0.Z((rn0) this.d, (boolean[]) this.e, this.f41674b, this.f41675c, (rm0) this.f41676f, (rh.e3) obj, (gf.e) obj2);
                return;
            default:
                rh.e4 e4Var = (rh.e4) this.d;
                ph.k0 k0Var = (ph.k0) this.f41676f;
                String str = (String) obj2;
                ((gf.e) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    rh.o2 o2Var = e4Var.J2;
                    if (o2Var != null) {
                        if (k0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        o2Var.c(this.f41674b, this.f41675c, z10);
                    }
                    if (k0Var != null) {
                        org.telegram.messenger.i0.g3(new ph.e0(k0Var, 3));
                        e4Var.N0 = true;
                    }
                    e4Var.dismiss();
                    return;
                }
                return;
        }
    }
}
