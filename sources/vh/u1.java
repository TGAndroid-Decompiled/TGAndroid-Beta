package vh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.m20;
import org.telegram.messenger.r20;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.hk;
public class u1 extends org.telegram.ui.ActionBar.z2 implements us {
    public static int f51993y1 = 1;
    public String f51994i1;
    public int f51995j1;
    public final w0 f51996k1;
    public final x0 l1;
    public final hk f51997m1;
    public final t1 f51998n1;
    public float f51999o1;
    public final boolean f52000p1;
    public final boolean f52001q1;
    public boolean f52002r1;
    public int f52003s1;
    public qh.d f52004t1;
    public float f52005u1;
    public m20 f52006v1;
    public ag.n f52007w1;
    public r20 f52008x1;

    public u1(Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(1, context, p6Var, true);
        int i10;
        this.f51994i1 = null;
        this.f51995j1 = -1;
        this.f51996k1 = new TLRPC.Document();
        this.l1 = new TLRPC.Document();
        this.f51999o1 = -1.0f;
        this.f52000p1 = z10;
        this.f52001q1 = z11;
        this.F = true;
        P(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, p6Var));
        this.f52003s1 = this.G0;
        this.f21620x = true;
        G0(false);
        this.f21586b = new qp0(this, context);
        hk hkVar = new hk(this, context, 7);
        this.f51997m1 = hkVar;
        if (z10) {
            i10 = 0;
        } else {
            i10 = f51993y1;
        }
        hkVar.f32090b = i10;
        hkVar.setAdapter(new y0(this, z10, context));
        this.f21586b.addView(hkVar, w7.b6.e(-1, -1, 87));
        new r2(this.f21586b, false, new v0(this, 0));
        if (!z10) {
            t1 t1Var = new t1(context);
            this.f51998n1 = t1Var;
            t1Var.G = new v0(this, 1);
            t1Var.F = hkVar.f32090b;
            t1Var.invalidate();
            this.f21586b.addView(t1Var, w7.b6.e(-1, -2, 87));
        }
        zs.f(this.f21583a).c(this, zs.f19718x0);
        zs.f(this.f21583a).c(this, zs.B0);
        boolean z12 = org.telegram.messenger.f8.f15522j;
        if (!z10) {
            ui.b0(this.f21583a).B(5);
            ui.b0(this.f21583a).w();
            ui.b0(this.f21583a).V0(0, true, true, false);
        }
        ui.b0(this.f21583a).B(0);
        ui.b0(this.f21583a).V0(0, false, true, false);
        ui.b0(this.f21583a).V0(2, false, true, false);
        ui.b0(this.f21583a).V0(7, false, true, false);
    }

    @Override
    public final boolean H() {
        if (this.f51997m1.getTranslationY() >= ((int) this.f51999o1)) {
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
        this.f21589c.animate().translationY(0.0f).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.m1.f20561w).start();
        for (View view : this.f51997m1.getViewPages()) {
            if (view instanceof l1) {
                p1 p1Var2 = ((l1) view).f51447f;
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
            if ((i10 != 1 || K0(new org.telegram.utils.twidget.v(this, i10, 7))) && ((Boolean) this.f52008x1.a(Integer.valueOf(i10))).booleanValue()) {
                dismiss();
            }
        }
    }

    public final void N0(r20 r20Var) {
        View[] viewPages;
        this.f52008x1 = r20Var;
        for (View view : this.f51997m1.getViewPages()) {
            if (view instanceof l1) {
                k1 k1Var = ((l1) view).f51446c;
                if (k1Var.H == null) {
                    k1Var.D(null);
                }
            }
        }
    }

    @Override
    public final int S() {
        if (this.f21586b.getMeasuredHeight() <= 0) {
            return org.telegram.messenger.i0.f16026q.y;
        }
        return (int) (this.f21586b.getMeasuredHeight() - this.f51997m1.getY());
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        View[] viewPages;
        int i12 = zs.f19718x0;
        int i13 = zs.B0;
        if (i10 == i12 || i10 == i13) {
            for (View view : this.f51997m1.getViewPages()) {
                if (view instanceof l1) {
                    l1 l1Var = (l1) view;
                    if (i10 == i13 || ((l1Var.f51225a == 0 && ((Integer) objArr[0]).intValue() == 5) || (l1Var.f51225a == 1 && ((Integer) objArr[0]).intValue() == 0))) {
                        k1 k1Var = l1Var.f51446c;
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
        zs.f(this.f21583a).n(this, zs.f19718x0);
        zs.f(this.f21583a).n(this, zs.B0);
        L0();
        super.dismiss();
        boolean z10 = org.telegram.messenger.f8.f15522j;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 < 0 && this.G0 == this.f52003s1 && (w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.I0)) != this.G0) {
                this.G0 = w02;
                this.f52003s1 = w02;
                E0(w02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
