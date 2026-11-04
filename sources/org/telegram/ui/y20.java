package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class y20 extends AnimatorListenerAdapter {
    public final int f52161a;
    public final Object f52162b;

    public y20(Object obj, int i3) {
        this.f52161a = i3;
        this.f52162b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f52161a) {
            case 4:
                ((nc0) this.f52162b).f47963s = null;
                return;
            case 10:
                ((PhotoViewer) ((org.telegram.ui.Components.ri0) this.f52162b).f37738c).B2 = null;
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
        int i3 = this.f52161a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f52162b;
        switch (i3) {
            case 0:
                x30 x30Var = ((z20) obj).f52508o;
                x30 x30Var2 = x30.f51711v5;
                x30Var.d1();
                x30Var.f28586b.invalidate();
                x30Var.I1.invalidate();
                if (x30Var.f51755k2) {
                    x30Var.f51755k2 = false;
                    x30Var.Q0(true);
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                l30 l30Var = (l30) obj;
                l30Var.G = null;
                x30 x30Var3 = l30Var.L;
                x30Var3.I1.invalidate();
                x30Var3.S3.invalidate();
                x30Var3.f28586b.invalidate();
                x30.P0(x30Var3);
                l30Var.H.clear();
                l30Var.I.clear();
                return;
            case 2:
                s50 s50Var = (s50) obj;
                s50Var.f49364a = null;
                s50Var.f49365b = false;
                return;
            case 3:
                la0 la0Var = (la0) obj;
                la0Var.E = false;
                la0Var.y0();
                return;
            case 4:
                nc0 nc0Var = (nc0) obj;
                if (nc0Var.f47963s != null && nc0Var.f47961n != null) {
                    nc0Var.f47962r.setVisibility(4);
                    nc0Var.f47963s = null;
                    return;
                }
                return;
            case 5:
                ((dg0) obj).U.setVisibility(8);
                return;
            case 6:
                xg0 xg0Var = (xg0) obj;
                xg0Var.f52025f = 1.0f;
                xg0Var.invalidate();
                return;
            case 7:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.f41335e)) {
                    notificationsCustomSettingsActivity.f41335e = null;
                    return;
                }
                return;
            case 8:
                cm0 cm0Var = (cm0) obj;
                ac acVar = cm0Var.Y;
                if (acVar != null) {
                    if (acVar.getParent() != null) {
                        ((ViewGroup) cm0Var.Y.getParent()).removeView(cm0Var.Y);
                    }
                    cm0Var.Y = null;
                }
                cm0Var.f44389a0 = null;
                super.onAnimationEnd(animator);
                return;
            case 9:
                um0 um0Var = (um0) obj;
                vm0 vm0Var = um0Var.f50149n0;
                org.telegram.ui.ActionBar.x4[] x4VarArr = vm0Var.f50558n;
                vm0Var.f50559r = null;
                if (vm0Var.f50562x) {
                    x4VarArr[1].setVisibility(8);
                } else {
                    org.telegram.ui.ActionBar.x4 x4Var = x4VarArr[0];
                    x4VarArr[0] = x4VarArr[1];
                    x4VarArr[1] = x4Var;
                    x4Var.setVisibility(8);
                    if (vm0Var.f50558n[0].f28803b == vm0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    vm0Var.f50556e = z10;
                    vm0Var.h.i(1.0f, vm0Var.f50558n[0].f28803b);
                }
                vm0Var.f50560s = false;
                um0Var.f50145i0 = false;
                um0Var.f50144h0 = false;
                vm0.h0(vm0Var).setEnabled(true);
                vm0Var.h.setEnabled(true);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ri0) obj).f37738c;
                if (photoViewer.B2 != null) {
                    sg0 sg0Var = new sg0(this, 20);
                    photoViewer.J2 = sg0Var;
                    org.telegram.messenger.g0.i3(sg0Var, 860L);
                    return;
                }
                return;
            case 11:
                hp0 hp0Var = (hp0) obj;
                PhotoViewer photoViewer2 = hp0Var.f45963b;
                pg.m mVar = photoViewer2.D1.f31808b;
                mVar.q();
                CropAreaView cropAreaView = mVar.f53511a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.D1.f31808b.K = true;
                photoViewer2.f41519q6 = null;
                photoViewer2.f41562v4 = hp0Var.f45962a;
                gi.p3 p3Var = photoViewer2.h1().M;
                if (photoViewer2.f41562v4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                p3Var.b(z11);
                gi.p3 p3Var2 = photoViewer2.L1;
                if (p3Var2 != null) {
                    if (photoViewer2.f41562v4 != 3) {
                        z13 = true;
                    }
                    p3Var2.b(z13);
                }
                if (photoViewer2.f41562v4 != 3) {
                    photoViewer2.f41378a6 = 0.0f;
                }
                photoViewer2.f41510p6 = -1;
                photoViewer2.f41426f6 = 1.0f;
                photoViewer2.f41388b6 = 1.0f;
                photoViewer2.f41406d6 = 0.0f;
                photoViewer2.f41416e6 = 0.0f;
                photoViewer2.z3(1.0f);
                photoViewer2.f41551u2 = true;
                photoViewer2.f41420f0.invalidate();
                return;
            case 12:
                ip0 ip0Var = (ip0) obj;
                PhotoViewer photoViewer3 = ip0Var.f46363b;
                photoViewer3.J1.f36471j0.setVisibility(0);
                photoViewer3.f41519q6 = null;
                photoViewer3.f41562v4 = ip0Var.f46362a;
                gi.p3 p3Var3 = photoViewer3.h1().M;
                if (photoViewer3.f41562v4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                p3Var3.b(z12);
                gi.p3 p3Var4 = photoViewer3.L1;
                if (p3Var4 != null) {
                    if (photoViewer3.f41562v4 != 3) {
                        z14 = true;
                    }
                    p3Var4.b(z14);
                }
                if (photoViewer3.f41562v4 != 3) {
                    photoViewer3.f41378a6 = 0.0f;
                }
                photoViewer3.f41510p6 = -1;
                photoViewer3.f41426f6 = 1.0f;
                photoViewer3.f41388b6 = 1.0f;
                photoViewer3.f41406d6 = 0.0f;
                photoViewer3.f41416e6 = 0.0f;
                photoViewer3.z3(1.0f);
                photoViewer3.f41551u2 = true;
                photoViewer3.f41420f0.invalidate();
                return;
            case 13:
                ((PhotoViewer) ((mp0) obj).f47741r0).f41600z3[0].setTag(null);
                return;
            case 14:
                ((np0) obj).d.U1.f52735l0 = 1.0f;
                return;
            case 15:
                PhotoViewer photoViewer4 = ((np0) obj).d;
                photoViewer4.U1.setVisibility(4);
                photoViewer4.U1.f52735l0 = 1.0f;
                return;
            case 16:
                org.telegram.messenger.g0.h3(new sg0(this, 22));
                return;
            case 17:
                ep0 ep0Var = (ep0) obj;
                if (animator.equals(ep0Var.f45021c.V7)) {
                    ep0Var.f45021c.V7 = null;
                    return;
                }
                return;
            case 18:
                jq0 jq0Var = (jq0) obj;
                if (jq0Var.f46674e == animator) {
                    jq0Var.f46673c[1].setVisibility(8);
                    jq0Var.f46674e = null;
                    return;
                }
                return;
            case 19:
                vq0 vq0Var = (vq0) obj;
                if (vq0Var.C != null) {
                    vq0Var.C = null;
                    vq0Var.b();
                    return;
                }
                return;
            case 20:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Z;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Z = null;
                    return;
                }
                return;
            case 21:
                ((uu0) obj).f50193b.Q5 = null;
                return;
            case 22:
                cw0 cw0Var = (cw0) obj;
                if (!cw0Var.F) {
                    cw0Var.setVisibility(8);
                    return;
                }
                return;
            case 23:
                yw0 yw0Var = (yw0) obj;
                if (animator.equals(yw0Var.d)) {
                    yw0Var.d = null;
                    return;
                }
                return;
            case 24:
                ((yy0) obj).d.Z.f52735l0 = 1.0f;
                return;
            case 25:
                SecretMediaViewer secretMediaViewer = ((yy0) obj).d;
                secretMediaViewer.Z.setVisibility(4);
                secretMediaViewer.Z.f52735l0 = 1.0f;
                return;
            case 26:
                g11 g11Var = ((xz0) obj).f52134e;
                g11Var.T0.H = 0.0f;
                g11Var.T0 = null;
                g11Var.f45456i0.invalidate();
                return;
            case 27:
                dh.d0.a();
                g11 g11Var2 = (g11) obj;
                e01 e01Var = g11Var2.f45456i0;
                e01 e01Var2 = g11Var2.f45456i0;
                e01Var.setLayerType(0, null);
                yz0 yz0Var = g11Var2.f45452g0;
                yz0Var.setLayerType(0, null);
                g11Var2.f45450f0.setLayerType(0, null);
                g11Var2.f45442c0.setLayerType(0, null);
                org.telegram.ui.Components.sm smVar = g11Var2.f45466o0;
                if (smVar != null) {
                    smVar.setLayerType(0, null);
                }
                View view = g11Var2.f45464n0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                yz0Var.b();
                g11Var2.f45447e0.m(false);
                org.telegram.messenger.hs.e().k(99, 512);
                g11Var2.Y1.e();
                org.telegram.messenger.g0.h3(new pu0(org.telegram.messenger.hs.e(), 14));
                g11Var2.h();
                g11Var2.E(1.0f);
                for (int i10 = 0; i10 < e01Var2.getChildCount(); i10++) {
                    View childAt = e01Var2.getChildAt(i10);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i11 = 0; i11 < g11Var2.f45447e0.f41058b.getChildCount(); i11++) {
                    View childAt2 = g11Var2.f45447e0.f41058b.getChildAt(i11);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                g11Var2.f45447e0.f41058b.invalidate();
                g11Var2.f45461l0.invalidate();
                e01Var2.invalidate();
                return;
            case 28:
                ((r41) obj).f49066b0.setVisibility(8);
                return;
            default:
                l71 l71Var = ((a71) obj).f43680a;
                if (!l71Var.f47191r1.a()) {
                    l71Var.T1.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f52161a) {
            case 11:
                hp0 hp0Var = (hp0) this.f52162b;
                hp0Var.f45963b.V0.setVisibility(0);
                hp0Var.f45963b.D1.setVisibility(0);
                return;
            case 12:
                return;
            case 22:
                ((cw0) this.f52162b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
