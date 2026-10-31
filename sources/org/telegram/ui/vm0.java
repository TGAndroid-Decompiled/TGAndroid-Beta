package org.telegram.ui;

import org.telegram.tgnet.tl.TL_stars;
public final class vm0 implements org.telegram.messenger.j20 {
    public final int f42769a;
    public final TL_stars.TL_starGiftUnique f42770b;
    public final long f42771c;
    public final org.telegram.messenger.us d;
    public final Object e;
    public final Object f42772f;

    public vm0(org.telegram.messenger.us usVar, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f42769a = i10;
        this.d = usVar;
        this.e = obj;
        this.f42770b = tL_starGiftUnique;
        this.f42771c = j10;
        this.f42772f = obj2;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z10;
        switch (this.f42769a) {
            case 0:
                tn0.Y((tn0) this.d, (boolean[]) this.e, this.f42770b, this.f42771c, (tm0) this.f42772f, (rh.d3) obj, (gf.e) obj2);
                return;
            default:
                rh.e4 e4Var = (rh.e4) this.d;
                ph.k0 k0Var = (ph.k0) this.f42772f;
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
                        o2Var.c(this.f42770b, this.f42771c, z10);
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
