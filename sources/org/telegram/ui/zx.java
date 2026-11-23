package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class zx extends AnimatorListenerAdapter {
    public final int f54741a;
    public final Object f54742b;

    public zx(Object obj, int i7) {
        this.f54741a = i7;
        this.f54742b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f54741a) {
            case 5:
                ((oc0) this.f54742b).f50658s = null;
                return;
            case 11:
                ((PhotoViewer) ((org.telegram.ui.Components.f10) this.f54742b).f34944c).B2 = null;
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
        int i7 = this.f54741a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f54742b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) obj;
                FrameLayout frameLayout = z70Var.f42738b;
                hi.w5 w5Var = (hi.w5) z70Var.f42739c;
                if (w5Var.getParent() != null) {
                    frameLayout.removeView(w5Var);
                }
                frameLayout.getViewTreeObserver().removeOnPreDrawListener((e7) z70Var.d);
                return;
            case 1:
                e40 e40Var = ((g30) obj).f48039o;
                e40 e40Var2 = e40.C5;
                e40Var.e1();
                e40Var.f30226b.invalidate();
                e40Var.L1.invalidate();
                if (e40Var.f47372n2) {
                    e40Var.f47372n2 = false;
                    e40Var.R0(true);
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                s30 s30Var = (s30) obj;
                s30Var.G = null;
                e40 e40Var3 = s30Var.L;
                e40Var3.L1.invalidate();
                e40Var3.Z3.invalidate();
                e40Var3.f30226b.invalidate();
                e40.Q0(e40Var3);
                s30Var.H.clear();
                s30Var.I.clear();
                return;
            case 3:
                z50 z50Var = (z50) obj;
                z50Var.f54528a = null;
                z50Var.f54529b = false;
                return;
            case 4:
                pa0 pa0Var = (pa0) obj;
                pa0Var.E = false;
                pa0Var.y0();
                return;
            case 5:
                oc0 oc0Var = (oc0) obj;
                if (oc0Var.f50658s != null && oc0Var.f50656n != null) {
                    oc0Var.f50657r.setVisibility(4);
                    oc0Var.f50658s = null;
                    return;
                }
                return;
            case 6:
                ((mg0) obj).U.setVisibility(8);
                return;
            case 7:
                fh0 fh0Var = (fh0) obj;
                fh0Var.f47840f = 1.0f;
                fh0Var.invalidate();
                return;
            case 8:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f43239e)) {
                    notificationsCustomSettingsActivity.f43239e = null;
                    return;
                }
                return;
            case 9:
                jm0 jm0Var = (jm0) obj;
                bc bcVar = jm0Var.Y;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) jm0Var.Y.getParent()).removeView(jm0Var.Y);
                    }
                    jm0Var.Y = null;
                }
                jm0Var.f49155a0 = null;
                super.onAnimationEnd(animator);
                return;
            case 10:
                cn0 cn0Var = (cn0) obj;
                dn0 dn0Var = cn0Var.f46837n0;
                org.telegram.ui.ActionBar.y4[] y4VarArr = dn0Var.f47200n;
                dn0Var.f47201r = null;
                if (dn0Var.f47204x) {
                    y4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.y4 y4Var = y4VarArr[0];
                    y4VarArr[0] = y4VarArr[1];
                    y4VarArr[1] = y4Var;
                    y4Var.setVisibility(8);
                    if (dn0Var.f47200n[0].f30360b == dn0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dn0Var.f47198e = z10;
                    dn0Var.h.i(1.0f, dn0Var.f47200n[0].f30360b);
                }
                dn0Var.f47202s = false;
                cn0Var.f46833i0 = false;
                cn0Var.f46832h0 = false;
                dn0.h0(dn0Var).setEnabled(true);
                dn0Var.h.setEnabled(true);
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.f10) obj).f34944c;
                if (photoViewer.B2 != null) {
                    gf0 gf0Var = new gf0(this, 21);
                    photoViewer.I2 = gf0Var;
                    org.telegram.messenger.g0.h3(gf0Var, 860L);
                    return;
                }
                return;
            case 12:
                rp0 rp0Var = (rp0) obj;
                PhotoViewer photoViewer2 = rp0Var.f51809b;
                og.o oVar = photoViewer2.D1.f38811b;
                oVar.q();
                CropAreaView cropAreaView = oVar.f21987a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.f38811b.K = true;
                photoViewer2.f43424p6 = null;
                photoViewer2.f43467u4 = rp0Var.f51808a;
                hi.x3 x3Var = photoViewer2.b1().M;
                if (photoViewer2.f43467u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x3Var.b(z11);
                hi.x3 x3Var2 = photoViewer2.L1;
                if (x3Var2 != null) {
                    if (photoViewer2.f43467u4 != 3) {
                        z13 = true;
                    }
                    x3Var2.b(z13);
                }
                if (photoViewer2.f43467u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f43415o6 = -1;
                photoViewer2.f43329e6 = 1.0f;
                photoViewer2.f43287a6 = 1.0f;
                photoViewer2.f43309c6 = 0.0f;
                photoViewer2.f43318d6 = 0.0f;
                photoViewer2.v3(1.0f);
                photoViewer2.f43465u2 = true;
                photoViewer2.f43334f0.invalidate();
                return;
            case 13:
                sp0 sp0Var = (sp0) obj;
                PhotoViewer photoViewer3 = sp0Var.f52129b;
                photoViewer3.J1.f34294j0.setVisibility(0);
                photoViewer3.f43424p6 = null;
                photoViewer3.f43467u4 = sp0Var.f52128a;
                hi.x3 x3Var3 = photoViewer3.b1().M;
                if (photoViewer3.f43467u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                x3Var3.b(z12);
                hi.x3 x3Var4 = photoViewer3.L1;
                if (x3Var4 != null) {
                    if (photoViewer3.f43467u4 != 3) {
                        z14 = true;
                    }
                    x3Var4.b(z14);
                }
                if (photoViewer3.f43467u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f43415o6 = -1;
                photoViewer3.f43329e6 = 1.0f;
                photoViewer3.f43287a6 = 1.0f;
                photoViewer3.f43309c6 = 0.0f;
                photoViewer3.f43318d6 = 0.0f;
                photoViewer3.v3(1.0f);
                photoViewer3.f43465u2 = true;
                photoViewer3.f43334f0.invalidate();
                return;
            case 14:
                ((PhotoViewer) ((wp0) obj).f53723r0).f43505y3[0].setTag(null);
                return;
            case 15:
                ((xp0) obj).d.U1.f49193l0 = 1.0f;
                return;
            case 16:
                PhotoViewer photoViewer4 = ((xp0) obj).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.f49193l0 = 1.0f;
                return;
            case 17:
                org.telegram.messenger.g0.g3(new gf0(this, 23));
                return;
            case 18:
                op0 op0Var = (op0) obj;
                if (animator.equals(op0Var.f50742c.f43289a8)) {
                    op0Var.f50742c.f43289a8 = null;
                    return;
                }
                return;
            case 19:
                tq0 tq0Var = (tq0) obj;
                if (tq0Var.f52454e == animator) {
                    tq0Var.f52453c[1].setVisibility(8);
                    tq0Var.f52454e = null;
                    return;
                }
                return;
            case 20:
                fr0 fr0Var = (fr0) obj;
                if (fr0Var.C != null) {
                    fr0Var.C = null;
                    fr0Var.b();
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
                ((cv0) obj).f46884b.V5 = null;
                return;
            case 23:
                kw0 kw0Var = (kw0) obj;
                if (!kw0Var.F) {
                    kw0Var.setVisibility(8);
                    return;
                }
                return;
            case 24:
                hx0 hx0Var = (hx0) obj;
                if (animator.equals(hx0Var.d)) {
                    hx0Var.d = null;
                    return;
                }
                return;
            case 25:
                ((iz0) obj).d.Z.f49193l0 = 1.0f;
                return;
            case 26:
                SecretMediaViewer secretMediaViewer = ((iz0) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.f49193l0 = 1.0f;
                return;
            case 27:
                q11 q11Var = ((h01) obj).f48393e;
                q11Var.T0.H = 0.0f;
                q11Var.T0 = null;
                q11Var.f51247i0.invalidate();
                return;
            case 28:
                ch.f0.a();
                q11 q11Var2 = (q11) obj;
                o01 o01Var = q11Var2.f51247i0;
                o01 o01Var2 = q11Var2.f51247i0;
                o01Var.setLayerType(0, null);
                i01 i01Var = q11Var2.f51243g0;
                i01Var.setLayerType(0, null);
                q11Var2.f51241f0.setLayerType(0, null);
                q11Var2.f51233c0.setLayerType(0, null);
                org.telegram.ui.Components.in inVar = q11Var2.f51257o0;
                if (inVar != null) {
                    inVar.setLayerType(0, null);
                }
                View view = q11Var2.f51256n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                i01Var.b();
                q11Var2.f51238e0.m(false);
                org.telegram.messenger.ks.e().k(99, 512);
                q11Var2.Y1.e();
                org.telegram.messenger.g0.g3(new qu0(org.telegram.messenger.ks.e(), 15));
                q11Var2.h();
                q11Var2.E(1.0f);
                for (int i10 = 0; i10 < o01Var2.getChildCount(); i10++) {
                    View childAt = o01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < q11Var2.f51238e0.f36804b.getChildCount(); i11++) {
                    View childAt2 = q11Var2.f51238e0.f36804b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                q11Var2.f51238e0.f36804b.invalidate();
                q11Var2.f51253l0.invalidate();
                o01Var2.invalidate();
                return;
            default:
                ((b51) obj).f45927b0.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f54741a) {
            case 12:
                rp0 rp0Var = (rp0) this.f54742b;
                rp0Var.f51809b.V0.setVisibility(0);
                rp0Var.f51809b.D1.setVisibility(0);
                return;
            case 13:
                return;
            case 23:
                ((kw0) this.f54742b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
