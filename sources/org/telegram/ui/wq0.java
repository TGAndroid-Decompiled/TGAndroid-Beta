package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class wq0 extends AnimatorListenerAdapter {
    public final int f39074a;
    public final Object f39075b;

    public wq0(Object obj, int i10) {
        this.f39074a = i10;
        this.f39075b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39074a) {
            case 1:
                ((PhotoViewer) ((org.telegram.ui.Components.qk0) this.f39075b).f27380c).A2 = null;
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
        int i10 = this.f39074a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f39075b;
        switch (i10) {
            case 0:
                xq0 xq0Var = (xq0) obj;
                ar0 ar0Var = xq0Var.D0;
                yq0[] yq0VarArr = ar0Var.f31871n;
                ar0Var.f31872r = null;
                if (ar0Var.f31874w) {
                    yq0VarArr[1].setVisibility(8);
                } else {
                    yq0 yq0Var = yq0VarArr[0];
                    yq0VarArr[0] = yq0VarArr[1];
                    yq0VarArr[1] = yq0Var;
                    yq0Var.setVisibility(8);
                    if (ar0Var.f31871n[0].e == ar0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ar0Var.e = z10;
                    ar0Var.h.j(1.0f, ar0Var.f31871n[0].e);
                }
                ar0Var.f31873s = false;
                xq0Var.f39645y0 = false;
                xq0Var.f39644x0 = false;
                kVar = ((org.telegram.ui.ActionBar.n2) ar0Var).actionBar;
                kVar.setEnabled(true);
                ar0Var.h.setEnabled(true);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.qk0) obj).f27380c;
                if (photoViewer.A2 != null) {
                    jl0 jl0Var = new jl0(this, 17);
                    photoViewer.I2 = jl0Var;
                    AndroidUtilities.runOnUIThread(jl0Var, 860L);
                    return;
                }
                return;
            case 2:
                pt0 pt0Var = (pt0) obj;
                PhotoViewer photoViewer2 = pt0Var.f36208b;
                lg.p pVar = photoViewer2.C1.f28468b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f14088a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f28468b.J = true;
                photoViewer2.f31008p6 = null;
                photoViewer2.f31052u4 = pt0Var.f36207a;
                ci.i4 i4Var = photoViewer2.f1().L;
                if (photoViewer2.f31052u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i4Var.b(z11);
                ci.i4 i4Var2 = photoViewer2.K1;
                if (i4Var2 != null) {
                    if (photoViewer2.f31052u4 != 3) {
                        z13 = true;
                    }
                    i4Var2.b(z13);
                }
                if (photoViewer2.f31052u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f31000o6 = -1;
                photoViewer2.f30914e6 = 1.0f;
                photoViewer2.f30876a6 = 1.0f;
                photoViewer2.f30896c6 = 0.0f;
                photoViewer2.f30905d6 = 0.0f;
                photoViewer2.v3(1.0f);
                photoViewer2.f31041t2 = true;
                photoViewer2.f30908e0.invalidate();
                return;
            case 3:
                qt0 qt0Var = (qt0) obj;
                PhotoViewer photoViewer3 = qt0Var.f36617b;
                photoViewer3.I1.f25279i0.setVisibility(0);
                photoViewer3.f31008p6 = null;
                photoViewer3.f31052u4 = qt0Var.f36616a;
                ci.i4 i4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f31052u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i4Var3.b(z12);
                ci.i4 i4Var4 = photoViewer3.K1;
                if (i4Var4 != null) {
                    if (photoViewer3.f31052u4 != 3) {
                        z14 = true;
                    }
                    i4Var4.b(z14);
                }
                if (photoViewer3.f31052u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f31000o6 = -1;
                photoViewer3.f30914e6 = 1.0f;
                photoViewer3.f30876a6 = 1.0f;
                photoViewer3.f30896c6 = 0.0f;
                photoViewer3.f30905d6 = 0.0f;
                photoViewer3.v3(1.0f);
                photoViewer3.f31041t2 = true;
                photoViewer3.f30908e0.invalidate();
                return;
            case 4:
                ((PhotoViewer) ((ut0) obj).f38219q0).y3[0].setTag(null);
                return;
            case 5:
                ((vt0) obj).d.T1.f33928k0 = 1.0f;
                return;
            case 6:
                PhotoViewer photoViewer4 = ((vt0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f33928k0 = 1.0f;
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new jl0(this, 19));
                return;
            case 8:
                mt0 mt0Var = (mt0) obj;
                if (animator.equals(mt0Var.f35388c.U7)) {
                    mt0Var.f35388c.U7 = null;
                    return;
                }
                return;
            case 9:
                tu0 tu0Var = (tu0) obj;
                if (tu0Var.e == animator) {
                    tu0Var.f37760c[1].setVisibility(8);
                    tu0Var.e = null;
                    return;
                }
                return;
            case 10:
                iv0 iv0Var = (iv0) obj;
                if (iv0Var.C != null) {
                    iv0Var.C = null;
                    iv0Var.b();
                    return;
                }
                return;
            case 11:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 12:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31132d0.removeView(premiumPreviewFragment.f31148r0);
                premiumPreviewFragment.f31148r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 13:
                ((ProfileActivity) ((org.telegram.ui.Components.qk0) obj).f27380c).D5 = null;
                return;
            case 14:
                t01 t01Var = (t01) obj;
                if (!t01Var.E) {
                    t01Var.setVisibility(8);
                    return;
                }
                return;
            case 15:
                p11 p11Var = (p11) obj;
                if (animator.equals(p11Var.f36001c)) {
                    p11Var.f36001c = null;
                    return;
                }
                return;
            case 16:
                w21 w21Var = (w21) obj;
                ci.tb tbVar = w21Var.O;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) w21Var.O.getParent()).removeView(w21Var.O);
                    }
                    w21Var.O = null;
                }
                w21Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 17:
                ((p41) obj).d.f31408a0.f33928k0 = 1.0f;
                return;
            case 18:
                SecretMediaViewer secretMediaViewer = ((p41) obj).d;
                secretMediaViewer.f31408a0.setVisibility(4);
                secretMediaViewer.f31408a0.f33928k0 = 1.0f;
                return;
            case 19:
                z61 z61Var = ((p51) obj).e;
                z61Var.S0.G = 0.0f;
                z61Var.S0 = null;
                z61Var.f40021h0.invalidate();
                return;
            case 20:
                zg.f0.a();
                z61 z61Var2 = (z61) obj;
                w51 w51Var = z61Var2.f40021h0;
                w51 w51Var2 = z61Var2.f40021h0;
                w51Var.setLayerType(0, null);
                q51 q51Var = z61Var2.f40017f0;
                q51Var.setLayerType(0, null);
                z61Var2.f40014e0.setLayerType(0, null);
                z61Var2.f40007b0.setLayerType(0, null);
                org.telegram.ui.Components.ln lnVar = z61Var2.f40032n0;
                if (lnVar != null) {
                    lnVar.setLayerType(0, null);
                }
                View view = z61Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                q51Var.b();
                z61Var2.f40012d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                z61Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new xz0(globalInstance, 13));
                z61Var2.h();
                z61Var2.E(1.0f);
                for (int i11 = 0; i11 < w51Var2.getChildCount(); i11++) {
                    View childAt = w51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < z61Var2.f40012d0.f26443b.getChildCount(); i12++) {
                    View childAt2 = z61Var2.f40012d0.f26443b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                z61Var2.f40012d0.f26443b.invalidate();
                z61Var2.f40027k0.invalidate();
                w51Var2.invalidate();
                return;
            case 21:
                ((ra1) obj).f36755b0.setVisibility(8);
                return;
            case 22:
                od1 od1Var = ((cd1) obj).f32316a;
                if (!od1Var.f35823p1.a()) {
                    od1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((qe1) obj).f36410a = null;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((uf1) obj).setScrollEnabled(true);
                return;
            case 25:
                yg1 yg1Var = (yg1) obj;
                if (animator.equals(yg1Var.e.K)) {
                    yg1Var.e.K = null;
                    return;
                }
                return;
            case 26:
                qh1 qh1Var = (qh1) obj;
                qh1Var.d = null;
                qh1Var.f36451a = null;
                qh1Var.f36452b = false;
                qh1Var.f36454f.f31581c.setAllowDrawCursor(true);
                return;
            case 27:
                ni.i iVar = (ni.i) obj;
                ((hj1) iVar.f15238b).getClass();
                ((hj1) iVar.f15238b).f33870c.setVisibility(4);
                return;
            case 28:
                ((org.telegram.ui.web.b1) obj).f38652s.setVisibility(8);
                return;
            default:
                pg.d0 d0Var = (pg.d0) obj;
                d0Var.f40777a.getPainting().c(null, d0Var.f40777a.getCurrentColor(), true, null);
                d0Var.f40791r = null;
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39074a) {
            case 2:
                pt0 pt0Var = (pt0) this.f39075b;
                pt0Var.f36208b.U0.setVisibility(0);
                pt0Var.f36208b.C1.setVisibility(0);
                return;
            case 3:
                return;
            case 14:
                ((t01) this.f39075b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
