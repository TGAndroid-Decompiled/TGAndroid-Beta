package vh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.at;
import org.telegram.messenger.n20;
import org.telegram.messenger.s20;
import org.telegram.messenger.vi;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.hk;
public class u1 extends org.telegram.ui.ActionBar.z2 implements vs {
    public static int f52000y1 = 1;
    public String f52001i1;
    public int f52002j1;
    public final x0 f52003k1;
    public final y0 l1;
    public final hk f52004m1;
    public final t1 f52005n1;
    public float f52006o1;
    public final boolean f52007p1;
    public final boolean f52008q1;
    public boolean f52009r1;
    public int f52010s1;
    public qh.d f52011t1;
    public float f52012u1;
    public n20 f52013v1;
    public ag.n f52014w1;
    public s20 f52015x1;

    public u1(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(1, context, p6Var, true);
        int i10;
        this.f52001i1 = null;
        this.f52002j1 = -1;
        this.f52003k1 = new TLRPC.Document();
        this.l1 = new TLRPC.Document();
        this.f52006o1 = -1.0f;
        this.f52007p1 = z10;
        this.f52008q1 = z11;
        this.F = true;
        P(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, p6Var));
        this.f52010s1 = this.G0;
        this.f21621x = true;
        G0(false);
        this.f21587b = new rp0(this, context);
        hk hkVar = new hk(this, context, 7);
        this.f52004m1 = hkVar;
        if (z10) {
            i10 = 0;
        } else {
            i10 = f52000y1;
        }
        hkVar.f32493b = i10;
        hkVar.setAdapter(new z0(this, z10, context));
        this.f21587b.addView(hkVar, w7.b6.e(-1, -1, 87));
        new r2(this.f21587b, false, new w0(this, 0));
        if (!z10) {
            t1 t1Var = new t1(context);
            this.f52005n1 = t1Var;
            t1Var.G = new w0(this, 1);
            t1Var.F = hkVar.f32493b;
            t1Var.invalidate();
            this.f21587b.addView(t1Var, w7.b6.e(-1, -2, 87));
        }
        at.f(this.f21584a).c(this, at.f14814x0);
        at.f(this.f21584a).c(this, at.B0);
        boolean z12 = org.telegram.messenger.f8.f15706j;
        if (!z10) {
            vi.b0(this.f21584a).B(5);
            vi.b0(this.f21584a).w();
            vi.b0(this.f21584a).V0(0, true, true, false);
        }
        vi.b0(this.f21584a).B(0);
        vi.b0(this.f21584a).V0(0, false, true, false);
        vi.b0(this.f21584a).V0(2, false, true, false);
        vi.b0(this.f21584a).V0(7, false, true, false);
    }

    @Override
    public final boolean H() {
        if (this.f52004m1.getTranslationY() >= ((int) this.f52006o1)) {
            return true;
        }
        return false;
    }

    public boolean I0(Integer num) {
        return true;
    }

    public boolean J0(Integer num) {
        return true;
    }

    public boolean K0(Runnable runnable) {
        return true;
    }

    public final void L0() {
        View[] viewPages;
        p1 p1Var;
        this.d = false;
        this.f21590c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.f20562w).start();
        for (View view : this.f52004m1.getViewPages()) {
            if (view instanceof l1) {
                p1 p1Var2 = ((l1) view).f51462f;
                if (p1Var2 != null) {
                    org.telegram.messenger.i0.v1(p1Var2.e);
                }
            } else if ((view instanceof g1) && (p1Var = ((g1) view).d) != null) {
                org.telegram.messenger.i0.v1(p1Var.e);
            }
        }
    }

    public final void M0(int i10) {
        if (I0(Integer.valueOf(i10))) {
            if ((i10 != 1 || K0(new org.telegram.utils.twidget.v(this, i10, 7))) && ((Boolean) this.f52015x1.a(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void N0(s20 s20Var) {
        View[] viewPages;
        this.f52015x1 = s20Var;
        for (View view : this.f52004m1.getViewPages()) {
            if (view instanceof l1) {
                k1 k1Var = ((l1) view).f51461c;
                if (k1Var.H == null) {
                    k1Var.D(null);
                }
            }
        }
    }

    @Override
    public final int S() {
        if (this.f21587b.getMeasuredHeight() <= 0) {
            return org.telegram.messenger.i0.f16172q.y;
        }
        return (int) (this.f21587b.getMeasuredHeight() - this.f52004m1.getY());
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        View[] viewPages;
        int i12 = at.f14814x0;
        int i13 = at.B0;
        if (i10 == i12 || i10 == i13) {
            for (View view : this.f52004m1.getViewPages()) {
                if (view instanceof l1) {
                    l1 l1Var = (l1) view;
                    if (i10 == i13 || ((l1Var.f51240a == 0 && ((Integer) objArr[0]).intValue() == 5) || (l1Var.f51240a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        k1 k1Var = l1Var.f51461c;
                        if (k1Var.H == null) {
                            k1Var.D(null);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        at.f(this.f21584a).n(this, at.f14814x0);
        at.f(this.f21584a).n(this, at.B0);
        L0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.f8.f15706j;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 < 0 && this.G0 == this.f52010s1 && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, this.I0)) != this.G0) {
                this.G0 = w02;
                this.f52010s1 = w02;
                E0(w02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
