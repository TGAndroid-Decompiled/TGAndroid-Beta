package th;

import android.app.Activity;
import org.telegram.messenger.cd;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.ui.PremiumPreviewFragment;
public final class i1 implements Runnable {
    public final int f49055a;
    public final z2 f49056b;

    public i1(z2 z2Var, int i10) {
        this.f49055a = i10;
        this.f49056b = z2Var;
    }

    @Override
    public final void run() {
        float f7;
        int i10 = this.f49055a;
        boolean z10 = false;
        z2 z2Var = this.f49056b;
        switch (i10) {
            case 0:
                z2Var.S1.setVisibility(8);
                return;
            case 1:
                if (!z2Var.f49755s0.H0) {
                    z2Var.f49720i3 = null;
                    if (z2Var.f49747q0 == null) {
                        vh.p2 p2Var = new vh.p2(z2Var.getContext(), 3);
                        p2Var.l(1.0f, -22.0f);
                        z2Var.f49747q0 = p2Var;
                        p2Var.h(i0.b.o(i0.b.f(0.13f, -16777216, -1), 240));
                        vh.p2 p2Var2 = z2Var.f49747q0;
                        p2Var2.U = false;
                        p2Var2.s(cd.L0(2131746414, null));
                        z2Var.f49747q0.setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(1.0f));
                        g2 g2Var = z2Var.L0;
                        vh.p2 p2Var3 = z2Var.f49747q0;
                        if (z2Var.f49711g2) {
                            f7 = 0.0f;
                        } else {
                            f7 = 56.0f;
                        }
                        g2Var.addView(p2Var3, w7.b6.d(-1, -2.0f, 85, 0.0f, 0.0f, 0.0f, f7));
                    }
                    z2Var.f49747q0.u();
                    tz.H(true);
                    return;
                }
                return;
            case 2:
                z2Var.O0();
                return;
            case 3:
                ((f7) z2Var.f49783z1).b(true);
                return;
            case 4:
                z2Var.p0(true);
                return;
            case 5:
                o7 o7Var = z2Var.f49755s0;
                if (o7Var != null) {
                    o7Var.V(new PremiumPreviewFragment(0, "noncontacts"));
                    return;
                }
                return;
            case 6:
                z2Var.M0();
                return;
            case 7:
                z2Var.f49766u3 = 0L;
                t1 t1Var = z2Var.K1;
                if (t1Var != null) {
                    t1Var.F(true);
                    z2Var.K1.Q1();
                    z2Var.p0(true);
                    return;
                }
                return;
            case 8:
                Activity W = org.telegram.messenger.i0.W(z2Var.getContext());
                if (W != null) {
                    o0 o0Var = new o0(2, z2Var, W);
                    o7 o7Var2 = ((f7) z2Var.f49783z1).d;
                    n7 n7Var = o7Var2.f49346z0;
                    if (n7Var != null) {
                        z10 = n7Var.release(o0Var);
                        o7Var2.f49346z0 = null;
                    }
                    if (!z10) {
                        org.telegram.messenger.i0.h3(o0Var, 80L);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                o7 o7Var3 = ((f7) z2Var.f49783z1).d;
                o7Var3.f49311i1 = false;
                o7Var3.d0();
                return;
            case 10:
                z2Var.J0(null);
                return;
            case 11:
                z2Var.a1(false);
                vp.d1().edit().putInt("taptostorysoundhint", vp.d1().getInt("taptostorysoundhint", 0) + 1).apply();
                return;
            default:
                z2Var.D3 = true;
                z2Var.setActive(false);
                return;
        }
    }
}
