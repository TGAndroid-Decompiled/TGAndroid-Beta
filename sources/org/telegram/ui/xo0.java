package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class xo0 extends AnimatorListenerAdapter {
    public final int f39957a;
    public final Object f39958b;

    public xo0(Object obj, int i10) {
        this.f39957a = i10;
        this.f39958b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39957a) {
            case 2:
                ((PhotoViewer) ((org.telegram.ui.Components.al0) this.f39958b).f22727c).A2 = null;
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
        int i10 = this.f39957a;
        boolean z13 = false;
        boolean z14 = false;
        Object obj = this.f39958b;
        switch (i10) {
            case 0:
                tp0 tp0Var = (tp0) obj;
                kc kcVar = tp0Var.X;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) tp0Var.X.getParent()).removeView(tp0Var.X);
                    }
                    tp0Var.X = null;
                }
                tp0Var.Z = null;
                super.onAnimationEnd(animator);
                return;
            case 1:
                vq0 vq0Var = (vq0) obj;
                yq0 yq0Var = vq0Var.D0;
                wq0[] wq0VarArr = yq0Var.f40230n;
                yq0Var.f40231r = null;
                if (yq0Var.f40233w) {
                    wq0VarArr[1].setVisibility(8);
                } else {
                    wq0 wq0Var = wq0VarArr[0];
                    wq0VarArr[0] = wq0VarArr[1];
                    wq0VarArr[1] = wq0Var;
                    wq0Var.setVisibility(8);
                    if (yq0Var.f40230n[0].e == yq0Var.h.getFirstTabId()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yq0Var.e = z10;
                    yq0Var.h.j(1.0f, yq0Var.f40230n[0].e);
                }
                yq0Var.f40232s = false;
                vq0Var.f38797y0 = false;
                vq0Var.f38796x0 = false;
                kVar = ((org.telegram.ui.ActionBar.m2) yq0Var).actionBar;
                kVar.setEnabled(true);
                yq0Var.h.setEnabled(true);
                return;
            case 2:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.al0) obj).f22727c;
                if (photoViewer.A2 != null) {
                    il0 il0Var = new il0(this, 17);
                    photoViewer.I2 = il0Var;
                    AndroidUtilities.runOnUIThread(il0Var, 860L);
                    return;
                }
                return;
            case 3:
                ot0 ot0Var = (ot0) obj;
                PhotoViewer photoViewer2 = ot0Var.f36346b;
                lg.p pVar = photoViewer2.C1.f23948b;
                pVar.q();
                CropAreaView cropAreaView = pVar.f14323a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.C1.f23948b.J = true;
                photoViewer2.f31324p6 = null;
                photoViewer2.f31368u4 = ot0Var.f36345a;
                ci.i4 i4Var = photoViewer2.f1().L;
                if (photoViewer2.f31368u4 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i4Var.b(z11);
                ci.i4 i4Var2 = photoViewer2.K1;
                if (i4Var2 != null) {
                    if (photoViewer2.f31368u4 != 3) {
                        z13 = true;
                    }
                    i4Var2.b(z13);
                }
                if (photoViewer2.f31368u4 != 3) {
                    photoViewer2.Z5 = 0.0f;
                }
                photoViewer2.f31316o6 = -1;
                photoViewer2.f31230e6 = 1.0f;
                photoViewer2.f31192a6 = 1.0f;
                photoViewer2.f31212c6 = 0.0f;
                photoViewer2.f31221d6 = 0.0f;
                photoViewer2.v3(1.0f);
                photoViewer2.f31357t2 = true;
                photoViewer2.f31224e0.invalidate();
                return;
            case 4:
                pt0 pt0Var = (pt0) obj;
                PhotoViewer photoViewer3 = pt0Var.f36681b;
                photoViewer3.I1.f28494i0.setVisibility(0);
                photoViewer3.f31324p6 = null;
                photoViewer3.f31368u4 = pt0Var.f36680a;
                ci.i4 i4Var3 = photoViewer3.f1().L;
                if (photoViewer3.f31368u4 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                i4Var3.b(z12);
                ci.i4 i4Var4 = photoViewer3.K1;
                if (i4Var4 != null) {
                    if (photoViewer3.f31368u4 != 3) {
                        z14 = true;
                    }
                    i4Var4.b(z14);
                }
                if (photoViewer3.f31368u4 != 3) {
                    photoViewer3.Z5 = 0.0f;
                }
                photoViewer3.f31316o6 = -1;
                photoViewer3.f31230e6 = 1.0f;
                photoViewer3.f31192a6 = 1.0f;
                photoViewer3.f31212c6 = 0.0f;
                photoViewer3.f31221d6 = 0.0f;
                photoViewer3.v3(1.0f);
                photoViewer3.f31357t2 = true;
                photoViewer3.f31224e0.invalidate();
                return;
            case 5:
                ((PhotoViewer) ((tt0) obj).f38240q0).y3[0].setTag(null);
                return;
            case 6:
                ((ut0) obj).d.T1.f34062k0 = 1.0f;
                return;
            case 7:
                PhotoViewer photoViewer4 = ((ut0) obj).d;
                photoViewer4.T1.setVisibility(4);
                photoViewer4.T1.f34062k0 = 1.0f;
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new il0(this, 19));
                return;
            case 9:
                lt0 lt0Var = (lt0) obj;
                if (animator.equals(lt0Var.f35413c.U7)) {
                    lt0Var.f35413c.U7 = null;
                    return;
                }
                return;
            case 10:
                su0 su0Var = (su0) obj;
                if (su0Var.e == animator) {
                    su0Var.f37868c[1].setVisibility(8);
                    su0Var.e = null;
                    return;
                }
                return;
            case 11:
                hv0 hv0Var = (hv0) obj;
                if (hv0Var.C != null) {
                    hv0Var.C = null;
                    hv0Var.b();
                    return;
                }
                return;
            case 12:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.Y;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.Y = null;
                    return;
                }
                return;
            case 13:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31448d0.removeView(premiumPreviewFragment.f31464r0);
                premiumPreviewFragment.f31464r0 = null;
                super.onAnimationEnd(animator);
                return;
            case 14:
                ((ProfileActivity) ((org.telegram.ui.Components.al0) obj).f22727c).D5 = null;
                return;
            case 15:
                r01 r01Var = (r01) obj;
                if (!r01Var.E) {
                    r01Var.setVisibility(8);
                    return;
                }
                return;
            case 16:
                n11 n11Var = (n11) obj;
                if (animator.equals(n11Var.f35728c)) {
                    n11Var.f35728c = null;
                    return;
                }
                return;
            case 17:
                v21 v21Var = (v21) obj;
                ci.tb tbVar = v21Var.O;
                if (tbVar != null) {
                    if (tbVar.getParent() != null) {
                        ((ViewGroup) v21Var.O.getParent()).removeView(v21Var.O);
                    }
                    v21Var.O = null;
                }
                v21Var.N = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                ((q41) obj).d.f31724a0.f34062k0 = 1.0f;
                return;
            case 19:
                SecretMediaViewer secretMediaViewer = ((q41) obj).d;
                secretMediaViewer.f31724a0.setVisibility(4);
                secretMediaViewer.f31724a0.f34062k0 = 1.0f;
                return;
            case 20:
                a71 a71Var = ((q51) obj).e;
                a71Var.S0.G = 0.0f;
                a71Var.S0 = null;
                a71Var.f32028h0.invalidate();
                return;
            case 21:
                zg.e0.a();
                a71 a71Var2 = (a71) obj;
                x51 x51Var = a71Var2.f32028h0;
                x51 x51Var2 = a71Var2.f32028h0;
                x51Var.setLayerType(0, null);
                r51 r51Var = a71Var2.f32024f0;
                r51Var.setLayerType(0, null);
                a71Var2.f32021e0.setLayerType(0, null);
                a71Var2.f32014b0.setLayerType(0, null);
                org.telegram.ui.Components.ln lnVar = a71Var2.f32039n0;
                if (lnVar != null) {
                    lnVar.setLayerType(0, null);
                }
                View view = a71Var2.m0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                r51Var.b();
                a71Var2.f32019d0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                a71Var2.W1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new vz0(globalInstance, 13));
                a71Var2.h();
                a71Var2.E(1.0f);
                for (int i11 = 0; i11 < x51Var2.getChildCount(); i11++) {
                    View childAt = x51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < a71Var2.f32019d0.f30651b.getChildCount(); i12++) {
                    View childAt2 = a71Var2.f32019d0.f30651b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                a71Var2.f32019d0.f30651b.invalidate();
                a71Var2.f32034k0.invalidate();
                x51Var2.invalidate();
                return;
            case 22:
                ((sa1) obj).f37671b0.setVisibility(8);
                return;
            case 23:
                od1 od1Var = ((cd1) obj).f32691a;
                if (!od1Var.f36196p1.a()) {
                    od1Var.R1.setVisibility(8);
                    return;
                }
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((qe1) obj).f36874a = null;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((uf1) obj).setScrollEnabled(true);
                return;
            case 26:
                yg1 yg1Var = (yg1) obj;
                if (animator.equals(yg1Var.e.K)) {
                    yg1Var.e.K = null;
                    return;
                }
                return;
            case 27:
                qh1 qh1Var = (qh1) obj;
                qh1Var.d = null;
                qh1Var.f36925a = null;
                qh1Var.f36926b = false;
                qh1Var.f36928f.f31897c.setAllowDrawCursor(true);
                return;
            case 28:
                oi.i iVar = (oi.i) obj;
                ((hj1) iVar.f15765b).getClass();
                ((hj1) iVar.f15765b).f34238c.setVisibility(4);
                return;
            default:
                ((org.telegram.ui.web.b1) obj).f39021s.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f39957a) {
            case 3:
                ot0 ot0Var = (ot0) this.f39958b;
                ot0Var.f36346b.U0.setVisibility(0);
                ot0Var.f36346b.C1.setVisibility(0);
                return;
            case 4:
                return;
            case 15:
                ((r01) this.f39958b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
