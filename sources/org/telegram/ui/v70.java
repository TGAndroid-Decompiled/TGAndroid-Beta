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
    public final int f42598a;
    public final Object f42599b;

    public v70(Object obj, int i10) {
        this.f42598a = i10;
        this.f42599b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42598a) {
            case 2:
                ((te0) this.f42599b).f42021s = null;
                return;
            case 8:
                ((PhotoViewer) ((org.telegram.ui.Components.pl0) this.f42599b).f29621c).A2 = null;
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
        int i10 = this.f42598a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f42599b;
        switch (i10) {
            case 0:
                w70 w70Var = (w70) obj;
                w70Var.d = null;
                w70Var.f42931a = null;
                w70Var.f42932b = false;
                return;
            case 1:
                rc0 rc0Var = (rc0) obj;
                rc0Var.H = false;
                rc0Var.o0();
                return;
            case 2:
                te0 te0Var = (te0) obj;
                if (te0Var.f42021s != null && te0Var.f42019n != null) {
                    te0Var.f42020r.setVisibility(4);
                    te0Var.f42021s = null;
                    return;
                }
                return;
            case 3:
                ((xi0) obj).T.setVisibility(8);
                return;
            case 4:
                sj0 sj0Var = (sj0) obj;
                sj0Var.f41418f = 1.0f;
                sj0Var.invalidate();
                return;
            case 5:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 6:
                kp0 kp0Var = (kp0) obj;
                lc lcVar = kp0Var.X;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) kp0Var.X.getParent()).removeView(kp0Var.X);
                    }
                    kp0Var.X = null;
                }
                kp0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 7:
                nq0 nq0Var = (nq0) obj;
                qq0 qq0Var = nq0Var.D0;
                oq0[] oq0VarArr = qq0Var.f40924n;
                qq0Var.f40925r = null;
                if (qq0Var.f40927w) {
                    oq0VarArr[1].setVisibility(8);
                } else {
                    oq0 oq0Var = oq0VarArr[0];
                    oq0VarArr[0] = oq0VarArr[1];
                    oq0VarArr[1] = oq0Var;
                    oq0Var.setVisibility(8);
                    if (qq0Var.f40924n[0].e == qq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    qq0Var.e = z10;
                    qq0Var.h.i(1.0f, qq0Var.f40924n[0].e);
                }
                qq0Var.f40926s = false;
                nq0Var.f39958y0 = false;
                nq0Var.f39957x0 = false;
                kVar = ((org.telegram.ui.ActionBar.o2) qq0Var).actionBar;
                kVar.setEnabled(true);
                qq0Var.h.setEnabled(true);
                return;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.pl0) obj).f29621c;
                if (photoViewer.A2 != null) {
                    nj0 nj0Var = new nj0(this, 19);
                    photoViewer.I2 = nj0Var;
                    AndroidUtilities.runOnUIThread(nj0Var, 860L);
                    return;
                }
                return;
            case 9:
                et0 et0Var = (et0) obj;
                PhotoViewer photoViewer2 = et0Var.f36998b;
                mg.p pVar = photoViewer2.C1.f29903b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f16980a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f29903b.J = true;
                photoViewer2.f33683p6 = null;
                photoViewer2.f33727u4 = et0Var.f36997a;
                ei.b4 b4Var = photoViewer2.g1().L;
                if (photoViewer2.f33727u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b4Var.b(z11);
                ei.b4 b4Var2 = photoViewer2.K1;
                if (b4Var2 != null) {
                    if (photoViewer2.f33727u4 != 3) {
                        z13 = true;
                    }
                    b4Var2.b(z13);
                }
                if (photoViewer2.f33727u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f33675o6 = -1;
                photoViewer2.f33588e6 = 1.0f;
                photoViewer2.f33550a6 = 1.0f;
                photoViewer2.f33570c6 = 0.0f;
                photoViewer2.f33579d6 = 0.0f;
                photoViewer2.y3(1.0f);
                photoViewer2.f33716t2 = true;
                photoViewer2.f33582e0.invalidate();
                return;
            case 10:
                ft0 ft0Var = (ft0) obj;
                PhotoViewer photoViewer3 = ft0Var.f37380b;
                photoViewer3.I1.f26667i0.setVisibility(0);
                photoViewer3.f33683p6 = null;
                photoViewer3.f33727u4 = ft0Var.f37379a;
                ei.b4 b4Var3 = photoViewer3.g1().L;
                if (photoViewer3.f33727u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                b4Var3.b(z12);
                ei.b4 b4Var4 = photoViewer3.K1;
                if (b4Var4 != null) {
                    if (photoViewer3.f33727u4 != 3) {
                        z14 = true;
                    }
                    b4Var4.b(z14);
                }
                if (photoViewer3.f33727u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f33675o6 = -1;
                photoViewer3.f33588e6 = 1.0f;
                photoViewer3.f33550a6 = 1.0f;
                photoViewer3.f33570c6 = 0.0f;
                photoViewer3.f33579d6 = 0.0f;
                photoViewer3.y3(1.0f);
                photoViewer3.f33716t2 = true;
                photoViewer3.f33582e0.invalidate();
                return;
            case 11:
                ((PhotoViewer) ((jt0) obj).f38687q0).y3[0].setTag(null);
                return;
            case 12:
                ((kt0) obj).d.T1.f43408k0 = 1.0f;
                return;
            case 13:
                PhotoViewer photoViewer4 = ((kt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f43408k0 = 1.0f;
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new nj0(this, 21));
                return;
            case 15:
                bt0 bt0Var = (bt0) obj;
                if (animator.equals(bt0Var.f36138c.U7)) {
                    bt0Var.f36138c.U7 = null;
                    return;
                }
                return;
            case 16:
                iu0 iu0Var = (iu0) obj;
                if (iu0Var.e == animator) {
                    iu0Var.f38388c[1].setVisibility(8);
                    iu0Var.e = null;
                    return;
                }
                return;
            case 17:
                xu0 xu0Var = (xu0) obj;
                if (xu0Var.C != null) {
                    xu0Var.C = null;
                    xu0Var.b();
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
                premiumPreviewFragment.f33807d0.removeView(premiumPreviewFragment.f33826t0);
                premiumPreviewFragment.f33826t0 = null;
                super.onAnimationEnd(animator);
                return;
            case 20:
                ((ProfileActivity) ((org.telegram.ui.Components.pl0) obj).f29621c).F5 = null;
                return;
            case 21:
                f01 f01Var = (f01) obj;
                if (!f01Var.E) {
                    f01Var.setVisibility(8);
                    return;
                }
                return;
            case 22:
                c11 c11Var = (c11) obj;
                if (animator.equals(c11Var.f36178c)) {
                    c11Var.f36178c = null;
                    return;
                }
                return;
            case 23:
                ((p31) obj).d.f34088a0.f43408k0 = 1.0f;
                return;
            case 24:
                SecretMediaViewer secretMediaViewer = ((p31) obj).d;
                secretMediaViewer.f34088a0.setVisibility(4);
                secretMediaViewer.f34088a0.f43408k0 = 1.0f;
                return;
            case 25:
                a61 a61Var = ((q41) obj).e;
                a61Var.S0.G = 0.0f;
                a61Var.S0 = null;
                a61Var.f35622h0.invalidate();
                return;
            case 26:
                ah.x0.a();
                a61 a61Var2 = (a61) obj;
                x41 x41Var = a61Var2.f35622h0;
                x41 x41Var2 = a61Var2.f35622h0;
                x41Var.setLayerType(0, null);
                r41 r41Var = a61Var2.f35618f0;
                r41Var.setLayerType(0, null);
                a61Var2.f35615e0.setLayerType(0, null);
                a61Var2.f35608b0.setLayerType(0, null);
                org.telegram.ui.Components.sn snVar = a61Var2.f35633n0;
                if (snVar != null) {
                    snVar.setLayerType(0, null);
                }
                View view = a61Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                r41Var.b();
                a61Var2.f35613d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                a61Var2.X1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new ly0(globalInstance, 15));
                a61Var2.h();
                a61Var2.E(1.0f);
                for (int i11 = 0; i11 < x41Var2.getChildCount(); i11++) {
                    View childAt = x41Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < a61Var2.f35613d0.f28979b.getChildCount(); i12++) {
                    View childAt2 = a61Var2.f35613d0.f28979b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                a61Var2.f35613d0.f28979b.invalidate();
                a61Var2.f35628k0.invalidate();
                x41Var2.invalidate();
                return;
            case 27:
                ((t91) obj).f41944b0.setVisibility(8);
                return;
            case 28:
                pc1 pc1Var = ((dc1) obj).f36583a;
                if (!pc1Var.f40488q1.a()) {
                    pc1Var.S1.setVisibility(8);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                ((qd1) obj).f40793a = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f42598a) {
            case 9:
                et0 et0Var = (et0) this.f42599b;
                et0Var.f36998b.U0.setVisibility(0);
                et0Var.f36998b.C1.setVisibility(0);
                return;
            case 10:
                return;
            case 21:
                ((f01) this.f42599b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
