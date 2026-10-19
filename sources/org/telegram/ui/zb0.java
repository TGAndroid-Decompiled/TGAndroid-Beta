package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class zb0 extends AnimatorListenerAdapter {
    public final int f43704a;
    public final Object f43705b;

    public zb0(Object obj, int i10) {
        this.f43704a = i10;
        this.f43705b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f43704a) {
            case 1:
                ((ne0) this.f43705b).f39553s = null;
                return;
            case 7:
                ((PhotoViewer) ((org.telegram.ui.Components.ml0) this.f43705b).f28562c).A2 = null;
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
        int i10 = this.f43704a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f43705b;
        switch (i10) {
            case 0:
                nc0 nc0Var = (nc0) obj;
                nc0Var.H = false;
                nc0Var.n0();
                return;
            case 1:
                ne0 ne0Var = (ne0) obj;
                if (ne0Var.f39553s != null && ne0Var.f39551n != null) {
                    ne0Var.f39552r.setVisibility(4);
                    ne0Var.f39553s = null;
                    return;
                }
                return;
            case 2:
                ((ui0) obj).T.setVisibility(8);
                return;
            case 3:
                oj0 oj0Var = (oj0) obj;
                oj0Var.f39904f = 1.0f;
                oj0Var.invalidate();
                return;
            case 4:
                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = (NotificationsCustomSettingsActivity) obj;
                if (animator.equals(notificationsCustomSettingsActivity.e)) {
                    notificationsCustomSettingsActivity.e = null;
                    return;
                }
                return;
            case 5:
                ip0 ip0Var = (ip0) obj;
                lc lcVar = ip0Var.X;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) ip0Var.X.getParent()).removeView(ip0Var.X);
                    }
                    ip0Var.X = null;
                }
                ip0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 6:
                lq0 lq0Var = (lq0) obj;
                oq0 oq0Var = lq0Var.D0;
                mq0[] mq0VarArr = oq0Var.f39958n;
                oq0Var.f39959r = null;
                if (oq0Var.f39961w) {
                    mq0VarArr[1].setVisibility(8);
                } else {
                    mq0 mq0Var = mq0VarArr[0];
                    mq0VarArr[0] = mq0VarArr[1];
                    mq0VarArr[1] = mq0Var;
                    mq0Var.setVisibility(8);
                    if (oq0Var.f39958n[0].e == oq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    oq0Var.e = z10;
                    oq0Var.h.j(1.0f, oq0Var.f39958n[0].e);
                }
                oq0Var.f39960s = false;
                lq0Var.f38982y0 = false;
                lq0Var.f38981x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) oq0Var).actionBar;
                kVar.setEnabled(true);
                oq0Var.h.setEnabled(true);
                return;
            case 7:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ml0) obj).f28562c;
                if (photoViewer.A2 != null) {
                    ck0 ck0Var = new ck0(this, 18);
                    photoViewer.I2 = ck0Var;
                    AndroidUtilities.runOnUIThread(ck0Var, 860L);
                    return;
                }
                return;
            case 8:
                ct0 ct0Var = (ct0) obj;
                PhotoViewer photoViewer2 = ct0Var.f36045b;
                mg.p pVar = photoViewer2.C1.f28763b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f16917a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f28763b.J = true;
                photoViewer2.f33373p6 = null;
                photoViewer2.f33417u4 = ct0Var.f36044a;
                ei.b4 b4Var = photoViewer2.f1().L;
                if (photoViewer2.f33417u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                b4Var.b(z11);
                ei.b4 b4Var2 = photoViewer2.K1;
                if (b4Var2 != null) {
                    if (photoViewer2.f33417u4 != 3) {
                        z13 = true;
                    }
                    b4Var2.b(z13);
                }
                if (photoViewer2.f33417u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f33365o6 = -1;
                photoViewer2.f33278e6 = 1.0f;
                photoViewer2.f33240a6 = 1.0f;
                photoViewer2.f33260c6 = 0.0f;
                photoViewer2.f33269d6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f33406t2 = true;
                photoViewer2.f33272e0.invalidate();
                return;
            case 9:
                dt0 dt0Var = (dt0) obj;
                PhotoViewer photoViewer3 = dt0Var.f36442b;
                photoViewer3.I1.f25192i0.setVisibility(0);
                photoViewer3.f33373p6 = null;
                photoViewer3.f33417u4 = dt0Var.f36441a;
                ei.b4 b4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f33417u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                b4Var3.b(z12);
                ei.b4 b4Var4 = photoViewer3.K1;
                if (b4Var4 != null) {
                    if (photoViewer3.f33417u4 != 3) {
                        z14 = true;
                    }
                    b4Var4.b(z14);
                }
                if (photoViewer3.f33417u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f33365o6 = -1;
                photoViewer3.f33278e6 = 1.0f;
                photoViewer3.f33240a6 = 1.0f;
                photoViewer3.f33260c6 = 0.0f;
                photoViewer3.f33269d6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f33406t2 = true;
                photoViewer3.f33272e0.invalidate();
                return;
            case 10:
                ((PhotoViewer) ((ht0) obj).f37781q0).y3[0].setTag(null);
                return;
            case 11:
                ((it0) obj).d.T1.f42044k0 = 1.0f;
                return;
            case 12:
                PhotoViewer photoViewer4 = ((it0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f42044k0 = 1.0f;
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new ck0(this, 20));
                return;
            case 14:
                zs0 zs0Var = (zs0) obj;
                if (animator.equals(zs0Var.f43796c.U7)) {
                    zs0Var.f43796c.U7 = null;
                    return;
                }
                return;
            case 15:
                gu0 gu0Var = (gu0) obj;
                if (gu0Var.e == animator) {
                    gu0Var.f37412c[1].setVisibility(8);
                    gu0Var.e = null;
                    return;
                }
                return;
            case 16:
                vu0 vu0Var = (vu0) obj;
                if (vu0Var.C != null) {
                    vu0Var.C = null;
                    vu0Var.b();
                    return;
                }
                return;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 18:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f33497d0.removeView(premiumPreviewFragment.f33513r0);
                premiumPreviewFragment.f33513r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 19:
                ((ProfileActivity) ((org.telegram.ui.Components.ml0) obj).f28562c).F5 = null;
                return;
            case 20:
                c01 c01Var = (c01) obj;
                if (!c01Var.E) {
                    c01Var.setVisibility(8);
                    return;
                }
                return;
            case 21:
                z01 z01Var = (z01) obj;
                if (animator.equals(z01Var.f43583c)) {
                    z01Var.f43583c = null;
                    return;
                }
                return;
            case 22:
                ((m31) obj).d.f33778a0.f42044k0 = 1.0f;
                return;
            case 23:
                SecretMediaViewer secretMediaViewer = ((m31) obj).d;
                secretMediaViewer.f33778a0.setVisibility(4);
                secretMediaViewer.f33778a0.f42044k0 = 1.0f;
                return;
            case 24:
                x51 x51Var = ((n41) obj).e;
                x51Var.S0.G = 0.0f;
                x51Var.S0 = null;
                x51Var.f43055h0.invalidate();
                return;
            case 25:
                ah.x0.a();
                x51 x51Var2 = (x51) obj;
                u41 u41Var = x51Var2.f43055h0;
                u41 u41Var2 = x51Var2.f43055h0;
                u41Var.setLayerType(0, null);
                o41 o41Var = x51Var2.f43051f0;
                o41Var.setLayerType(0, null);
                x51Var2.f43048e0.setLayerType(0, null);
                x51Var2.f43041b0.setLayerType(0, null);
                org.telegram.ui.Components.un unVar = x51Var2.f43066n0;
                if (unVar != null) {
                    unVar.setLayerType(0, null);
                }
                View view = x51Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                o41Var.b();
                x51Var2.f43046d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                x51Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new qy0(globalInstance, 14));
                x51Var2.h();
                x51Var2.E(1.0f);
                for (int i11 = 0; i11 < u41Var2.getChildCount(); i11++) {
                    View childAt = u41Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < x51Var2.f43046d0.f27922b.getChildCount(); i12++) {
                    View childAt2 = x51Var2.f43046d0.f27922b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                x51Var2.f43046d0.f27922b.invalidate();
                x51Var2.f43061k0.invalidate();
                u41Var2.invalidate();
                return;
            case 26:
                ((p91) obj).f40124b0.setVisibility(8);
                return;
            case 27:
                kc1 kc1Var = ((yb1) obj).f43437a;
                if (!kc1Var.f38553p1.a()) {
                    kc1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 28:
                super.onAnimationEnd(animator);
                ((ld1) obj).f38892a = null;
                return;
            default:
                super.onAnimationEnd(animator);
                ((pe1) obj).setScrollEnabled(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f43704a) {
            case 8:
                ct0 ct0Var = (ct0) this.f43705b;
                ct0Var.f36045b.U0.setVisibility(0);
                ct0Var.f36045b.C1.setVisibility(0);
                return;
            case 9:
                return;
            case 20:
                ((c01) this.f43705b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
