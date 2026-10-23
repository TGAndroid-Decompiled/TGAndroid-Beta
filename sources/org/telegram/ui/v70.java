package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class v70 extends AnimatorListenerAdapter {
    public final int f42630a;
    public final Object f42631b;

    public v70(Object obj, int i10) {
        this.f42630a = i10;
        this.f42631b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42630a) {
            case 2:
                ((ue0) this.f42631b).f42399s = null;
                return;
            case 8:
                ((PhotoViewer) ((org.telegram.ui.Components.ql0) this.f42631b).f29941c).A2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        org.telegram.ui.ActionBar.k kVar;
        boolean z11;
        boolean z12;
        int i10 = this.f42630a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f42631b;
        switch (i10) {
            case 0:
                w70 w70Var = (w70) obj;
                w70Var.d = null;
                w70Var.f42950a = null;
                w70Var.f42951b = false;
                return;
            case 1:
                sc0 sc0Var = (sc0) obj;
                sc0Var.H = false;
                sc0Var.o0();
                return;
            case 2:
                ue0 ue0Var = (ue0) obj;
                if (ue0Var.f42399s != null && ue0Var.f42397n != null) {
                    ue0Var.f42398r.setVisibility(4);
                    ue0Var.f42399s = null;
                    return;
                }
                return;
            case 3:
                ((yi0) obj).T.setVisibility(8);
                return;
            case 4:
                tj0 tj0Var = (tj0) obj;
                tj0Var.f42028f = 1.0f;
                tj0Var.invalidate();
                return;
            case 5:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 6:
                lp0 lp0Var = (lp0) obj;
                lc lcVar = lp0Var.X;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) lp0Var.X.getParent()).removeView(lp0Var.X);
                    }
                    lp0Var.X = null;
                }
                lp0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 7:
                oq0 oq0Var = (oq0) obj;
                rq0 rq0Var = oq0Var.D0;
                pq0[] pq0VarArr = rq0Var.f41227n;
                rq0Var.f41228r = null;
                if (rq0Var.f41230w) {
                    pq0VarArr[1].setVisibility(8);
                } else {
                    pq0 pq0Var = pq0VarArr[0];
                    pq0VarArr[0] = pq0VarArr[1];
                    pq0VarArr[1] = pq0Var;
                    pq0Var.setVisibility(8);
                    if (rq0Var.f41227n[0].e == rq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    rq0Var.e = z10;
                    rq0Var.h.i(1.0f, rq0Var.f41227n[0].e);
                }
                rq0Var.f41229s = false;
                oq0Var.f40244y0 = false;
                oq0Var.f40243x0 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) rq0Var).actionBar;
                kVar.setEnabled(true);
                rq0Var.h.setEnabled(true);
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ql0) obj).f29941c;
                if (photoViewer.A2 != null) {
                    oj0 oj0Var = new oj0(this, 19);
                    photoViewer.I2 = oj0Var;
                    AndroidUtilities.runOnUIThread(oj0Var, 860L);
                    return;
                }
                return;
            case 9:
                ft0 ft0Var = (ft0) obj;
                PhotoViewer photoViewer2 = ft0Var.f37417b;
                mg.p pVar = photoViewer2.C1.f30163b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f16980a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f30163b.J = true;
                photoViewer2.f33681p6 = null;
                photoViewer2.f33725u4 = ft0Var.f37416a;
                ei.b4 b4Var = photoViewer2.g1().L;
                if (photoViewer2.f33725u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b4Var.b(z11);
                ei.b4 b4Var2 = photoViewer2.K1;
                if (b4Var2 != null) {
                    if (photoViewer2.f33725u4 != 3) {
                        z13 = true;
                    }
                    b4Var2.b(z13);
                }
                if (photoViewer2.f33725u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f33673o6 = -1;
                photoViewer2.f33586e6 = 1.0f;
                photoViewer2.f33548a6 = 1.0f;
                photoViewer2.f33568c6 = 0.0f;
                photoViewer2.f33577d6 = 0.0f;
                photoViewer2.y3(1.0f);
                photoViewer2.f33714t2 = true;
                photoViewer2.f33580e0.invalidate();
                return;
            case 10:
                gt0 gt0Var = (gt0) obj;
                PhotoViewer photoViewer3 = gt0Var.f37663b;
                photoViewer3.I1.f26929i0.setVisibility(0);
                photoViewer3.f33681p6 = null;
                photoViewer3.f33725u4 = gt0Var.f37662a;
                ei.b4 b4Var3 = photoViewer3.g1().L;
                if (photoViewer3.f33725u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                b4Var3.b(z12);
                ei.b4 b4Var4 = photoViewer3.K1;
                if (b4Var4 != null) {
                    if (photoViewer3.f33725u4 != 3) {
                        z14 = true;
                    }
                    b4Var4.b(z14);
                }
                if (photoViewer3.f33725u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f33673o6 = -1;
                photoViewer3.f33586e6 = 1.0f;
                photoViewer3.f33548a6 = 1.0f;
                photoViewer3.f33568c6 = 0.0f;
                photoViewer3.f33577d6 = 0.0f;
                photoViewer3.y3(1.0f);
                photoViewer3.f33714t2 = true;
                photoViewer3.f33580e0.invalidate();
                return;
            case 11:
                ((PhotoViewer) ((kt0) obj).f39057q0).y3[0].setTag(null);
                return;
            case 12:
                ((lt0) obj).d.T1.f43653k0 = 1.0f;
                return;
            case 13:
                PhotoViewer photoViewer4 = ((lt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f43653k0 = 1.0f;
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new oj0(this, 21));
                return;
            case 15:
                ct0 ct0Var = (ct0) obj;
                if (animator.equals(ct0Var.f36426c.U7)) {
                    ct0Var.f36426c.U7 = null;
                    return;
                }
                return;
            case 16:
                ju0 ju0Var = (ju0) obj;
                if (ju0Var.e == animator) {
                    ju0Var.f38705c[1].setVisibility(8);
                    ju0Var.e = null;
                    return;
                }
                return;
            case 17:
                yu0 yu0Var = (yu0) obj;
                if (yu0Var.C != null) {
                    yu0Var.C = null;
                    yu0Var.b();
                    return;
                }
                return;
            case 18:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 19:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33805d0.removeView(premiumPreviewFragment.f33824t0);
                premiumPreviewFragment.f33824t0 = null;
                super.onAnimationEnd(animator);
                return;
            case 20:
                ((ProfileActivity) ((org.telegram.ui.Components.ql0) obj).f29941c).F5 = null;
                return;
            case 21:
                g01 g01Var = (g01) obj;
                if (!g01Var.E) {
                    g01Var.setVisibility(8);
                    return;
                }
                return;
            case 22:
                d11 d11Var = (d11) obj;
                if (animator.equals(d11Var.f36473c)) {
                    d11Var.f36473c = null;
                    return;
                }
                return;
            case 23:
                ((q31) obj).d.f34086a0.f43653k0 = 1.0f;
                return;
            case 24:
                SecretMediaViewer secretMediaViewer = ((q31) obj).d;
                secretMediaViewer.f34086a0.setVisibility(4);
                secretMediaViewer.f34086a0.f43653k0 = 1.0f;
                return;
            case 25:
                b61 b61Var = ((r41) obj).e;
                b61Var.S0.G = 0.0f;
                b61Var.S0 = null;
                b61Var.f35905h0.invalidate();
                return;
            case 26:
                ah.x0.a();
                b61 b61Var2 = (b61) obj;
                y41 y41Var = b61Var2.f35905h0;
                y41 y41Var2 = b61Var2.f35905h0;
                y41Var.setLayerType(0, null);
                s41 s41Var = b61Var2.f35901f0;
                s41Var.setLayerType(0, null);
                b61Var2.f35898e0.setLayerType(0, null);
                b61Var2.f35891b0.setLayerType(0, null);
                org.telegram.ui.Components.un unVar = b61Var2.f35916n0;
                if (unVar != null) {
                    unVar.setLayerType(0, null);
                }
                View view = b61Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                s41Var.b();
                b61Var2.f35896d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                b61Var2.X1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new my0(globalInstance, 15));
                b61Var2.h();
                b61Var2.E(1.0f);
                for (int i11 = 0; i11 < y41Var2.getChildCount(); i11++) {
                    View childAt = y41Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < b61Var2.f35896d0.f29245b.getChildCount(); i12++) {
                    View childAt2 = b61Var2.f35896d0.f29245b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                b61Var2.f35896d0.f29245b.invalidate();
                b61Var2.f35911k0.invalidate();
                y41Var2.invalidate();
                return;
            case 27:
                ((u91) obj).f42313b0.setVisibility(8);
                return;
            case 28:
                qc1 qc1Var = ((ec1) obj).f36921a;
                if (!qc1Var.f40759q1.a()) {
                    qc1Var.S1.setVisibility(8);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                ((rd1) obj).f41104a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42630a) {
            case 9:
                ft0 ft0Var = (ft0) this.f42631b;
                ft0Var.f37417b.U0.setVisibility(0);
                ft0Var.f37417b.C1.setVisibility(0);
                return;
            case 10:
                return;
            case 21:
                ((g01) this.f42631b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
