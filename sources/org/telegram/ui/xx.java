package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class xx extends AnimatorListenerAdapter {
    public final int f53343a;
    public final Object f53344b;

    public xx(Object obj, int i7) {
        this.f53343a = i7;
        this.f53344b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f53343a) {
            case 5:
                ((oc0) this.f53344b).f49923s = null;
                return;
            case 11:
                ((PhotoViewer) ((org.telegram.ui.Components.y50) this.f53344b).f41885c).B2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i7 = this.f53343a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f53344b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.p70 p70Var = (org.telegram.ui.Components.p70) obj;
                FrameLayout frameLayout = p70Var.f38235b;
                hi.n5 n5Var = (hi.n5) p70Var.f38236c;
                if (n5Var.getParent() != null) {
                    frameLayout.removeView(n5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) p70Var.d);
                return;
            case 1:
                c40 c40Var = ((e30) obj).f46538o;
                c40 c40Var2 = c40.C5;
                c40Var.d1();
                c40Var.f29682b.invalidate();
                c40Var.L1.invalidate();
                if (c40Var.f45947n2) {
                    c40Var.f45947n2 = false;
                    c40Var.Q0(true);
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                q30 q30Var = (q30) obj;
                q30Var.G = null;
                c40 c40Var3 = q30Var.L;
                c40Var3.L1.invalidate();
                c40Var3.Z3.invalidate();
                c40Var3.f29682b.invalidate();
                c40.P0(c40Var3);
                q30Var.H.clear();
                q30Var.I.clear();
                return;
            case 3:
                x50 x50Var = (x50) obj;
                x50Var.f53098a = null;
                x50Var.f53099b = false;
                return;
            case 4:
                pa0 pa0Var = (pa0) obj;
                pa0Var.E = false;
                pa0Var.y0();
                return;
            case 5:
                oc0 oc0Var = (oc0) obj;
                if (oc0Var.f49923s != null && oc0Var.f49921n != null) {
                    oc0Var.f49922r.setVisibility(4);
                    oc0Var.f49923s = null;
                    return;
                }
                return;
            case 6:
                ((jg0) obj).U.setVisibility(8);
                return;
            case 7:
                dh0 dh0Var = (dh0) obj;
                dh0Var.f46402f = 1.0f;
                dh0Var.invalidate();
                return;
            case 8:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f42674e)) {
                    notificationsCustomSettingsActivity.f42674e = null;
                    return;
                }
                return;
            case 9:
                im0 im0Var = (im0) obj;
                bc bcVar = im0Var.Y;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) im0Var.Y.getParent()).removeView(im0Var.Y);
                    }
                    im0Var.Y = null;
                }
                im0Var.f48085a0 = null;
                super.onAnimationEnd(animator);
                return;
            case 10:
                an0 an0Var = (an0) obj;
                bn0 bn0Var = an0Var.f45461n0;
                org.telegram.ui.ActionBar.v4[] v4VarArr = bn0Var.f45795n;
                bn0Var.f45796r = null;
                if (bn0Var.f45799x) {
                    v4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.v4 v4Var = v4VarArr[0];
                    v4VarArr[0] = v4VarArr[1];
                    v4VarArr[1] = v4Var;
                    v4Var.setVisibility(8);
                    if (bn0Var.f45795n[0].f29755b == bn0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bn0Var.f45793e = z10;
                    bn0Var.h.i(1.0f, bn0Var.f45795n[0].f29755b);
                }
                bn0Var.f45797s = false;
                an0Var.f45457i0 = false;
                an0Var.f45456h0 = false;
                bn0.h0(bn0Var).setEnabled(true);
                bn0Var.h.setEnabled(true);
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.y50) obj).f41885c;
                if (photoViewer.B2 != null) {
                    ef0 ef0Var = new ef0(this, 21);
                    photoViewer.I2 = ef0Var;
                    org.telegram.messenger.g0.i3(ef0Var, 860L);
                    return;
                }
                return;
            case 12:
                pp0 pp0Var = (pp0) obj;
                PhotoViewer photoViewer2 = pp0Var.f50334b;
                og.o oVar = photoViewer2.D1.f34907b;
                oVar.q();
                CropAreaView cropAreaView = oVar.f21530a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.f34907b.K = true;
                photoViewer2.f42853p6 = null;
                photoViewer2.f42896u4 = pp0Var.f50333a;
                hi.p3 p3Var = photoViewer2.b1().M;
                if (photoViewer2.f42896u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p3Var.b(z11);
                hi.p3 p3Var2 = photoViewer2.L1;
                if (p3Var2 != null) {
                    if (photoViewer2.f42896u4 != 3) {
                        z13 = true;
                    }
                    p3Var2.b(z13);
                }
                if (photoViewer2.f42896u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f42844o6 = -1;
                photoViewer2.f42759e6 = 1.0f;
                photoViewer2.f42721a6 = 1.0f;
                photoViewer2.f42741c6 = 0.0f;
                photoViewer2.f42749d6 = 0.0f;
                photoViewer2.u3(1.0f);
                photoViewer2.f42894u2 = true;
                photoViewer2.f42763f0.invalidate();
                return;
            case 13:
                qp0 qp0Var = (qp0) obj;
                PhotoViewer photoViewer3 = qp0Var.f50708b;
                photoViewer3.J1.f39657j0.setVisibility(0);
                photoViewer3.f42853p6 = null;
                photoViewer3.f42896u4 = qp0Var.f50707a;
                hi.p3 p3Var3 = photoViewer3.b1().M;
                if (photoViewer3.f42896u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                p3Var3.b(z12);
                hi.p3 p3Var4 = photoViewer3.L1;
                if (p3Var4 != null) {
                    if (photoViewer3.f42896u4 != 3) {
                        z14 = true;
                    }
                    p3Var4.b(z14);
                }
                if (photoViewer3.f42896u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f42844o6 = -1;
                photoViewer3.f42759e6 = 1.0f;
                photoViewer3.f42721a6 = 1.0f;
                photoViewer3.f42741c6 = 0.0f;
                photoViewer3.f42749d6 = 0.0f;
                photoViewer3.u3(1.0f);
                photoViewer3.f42894u2 = true;
                photoViewer3.f42763f0.invalidate();
                return;
            case 14:
                ((PhotoViewer) ((up0) obj).f51995r0).f42934y3[0].setTag(null);
                return;
            case 15:
                ((vp0) obj).d.U1.f47809l0 = 1.0f;
                return;
            case 16:
                PhotoViewer photoViewer4 = ((vp0) obj).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.f47809l0 = 1.0f;
                return;
            case 17:
                org.telegram.messenger.g0.h3(new ef0(this, 23));
                return;
            case 18:
                lp0 lp0Var = (lp0) obj;
                if (animator.equals(lp0Var.f49022c.U7)) {
                    lp0Var.f49022c.U7 = null;
                    return;
                }
                return;
            case 19:
                rq0 rq0Var = (rq0) obj;
                if (rq0Var.f51002e == animator) {
                    rq0Var.f51001c[1].setVisibility(8);
                    rq0Var.f51002e = null;
                    return;
                }
                return;
            case 20:
                dr0 dr0Var = (dr0) obj;
                if (dr0Var.C != null) {
                    dr0Var.C = null;
                    dr0Var.b();
                    return;
                }
                return;
            case 21:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Z;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Z = null;
                    return;
                }
                return;
            case 22:
                ((bv0) obj).f45842b.T5 = null;
                return;
            case 23:
                jw0 jw0Var = (jw0) obj;
                if (!jw0Var.F) {
                    jw0Var.setVisibility(8);
                    return;
                }
                return;
            case 24:
                fx0 fx0Var = (fx0) obj;
                if (animator.equals(fx0Var.d)) {
                    fx0Var.d = null;
                    return;
                }
                return;
            case 25:
                ((fz0) obj).d.Z.f47809l0 = 1.0f;
                return;
            case 26:
                SecretMediaViewer secretMediaViewer = ((fz0) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.f47809l0 = 1.0f;
                return;
            case 27:
                n11 n11Var = ((e01) obj).f46519e;
                n11Var.T0.H = 0.0f;
                n11Var.T0 = null;
                n11Var.f49386i0.invalidate();
                return;
            case 28:
                ch.f0.a();
                n11 n11Var2 = (n11) obj;
                l01 l01Var = n11Var2.f49386i0;
                l01 l01Var2 = n11Var2.f49386i0;
                l01Var.setLayerType(0, null);
                f01 f01Var = n11Var2.f49382g0;
                f01Var.setLayerType(0, null);
                n11Var2.f49380f0.setLayerType(0, null);
                n11Var2.f49372c0.setLayerType(0, null);
                org.telegram.ui.Components.bn bnVar = n11Var2.f49396o0;
                if (bnVar != null) {
                    bnVar.setLayerType(0, null);
                }
                View view = n11Var2.f49395n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                f01Var.b();
                n11Var2.f49377e0.m(false);
                org.telegram.messenger.ns.e().k(99, 512);
                n11Var2.Y1.e();
                org.telegram.messenger.g0.h3(new pu0(org.telegram.messenger.ns.e(), 15));
                n11Var2.h();
                n11Var2.E(1.0f);
                for (int i10 = 0; i10 < l01Var2.getChildCount(); i10++) {
                    View childAt = l01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < n11Var2.f49377e0.f33010b.getChildCount(); i11++) {
                    View childAt2 = n11Var2.f49377e0.f33010b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                n11Var2.f49377e0.f33010b.invalidate();
                n11Var2.f49392l0.invalidate();
                l01Var2.invalidate();
                return;
            default:
                ((z41) obj).f53845b0.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f53343a) {
            case 12:
                pp0 pp0Var = (pp0) this.f53344b;
                pp0Var.f50334b.V0.setVisibility(0);
                pp0Var.f50334b.D1.setVisibility(0);
                return;
            case 13:
                return;
            case 23:
                ((jw0) this.f53344b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
