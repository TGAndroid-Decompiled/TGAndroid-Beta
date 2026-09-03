package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ss0 extends AnimatorListenerAdapter {
    public final int f38305a;
    public final Object f38306b;

    public ss0(Object obj, int i10) {
        this.f38305a = i10;
        this.f38306b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38305a) {
            case 0:
                ((PhotoViewer) ((org.telegram.ui.Components.ex0) this.f38306b).f24716c).f31880x2 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z4;
        boolean z10;
        int i10 = this.f38305a;
        boolean z11 = false;
        boolean z12 = false;
        Object obj = this.f38306b;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ex0) obj).f24716c;
                if (photoViewer.f31880x2 != null) {
                    gl0 gl0Var = new gl0(this, 17);
                    photoViewer.F2 = gl0Var;
                    AndroidUtilities.runOnUIThread(gl0Var, 860L);
                    return;
                }
                return;
            case 1:
                it0 it0Var = (it0) obj;
                PhotoViewer photoViewer2 = it0Var.f35026b;
                yf.n nVar = photoViewer2.f31898z1.f31372b;
                nVar.q();
                CropAreaView cropAreaView = nVar.f47310a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.f31898z1.f31372b.G = true;
                photoViewer2.f31782m6 = null;
                photoViewer2.f31827r4 = it0Var.f35025a;
                ph.i3 i3Var = photoViewer2.f1().I;
                if (photoViewer2.f31827r4 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                i3Var.b(z4);
                ph.i3 i3Var2 = photoViewer2.H1;
                if (i3Var2 != null) {
                    if (photoViewer2.f31827r4 != 3) {
                        z11 = true;
                    }
                    i3Var2.b(z11);
                }
                if (photoViewer2.f31827r4 != 3) {
                    photoViewer2.W5 = 0.0f;
                }
                photoViewer2.f31774l6 = -1;
                photoViewer2.f31685b6 = 1.0f;
                photoViewer2.X5 = 1.0f;
                photoViewer2.Z5 = 0.0f;
                photoViewer2.f31675a6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f31815q2 = true;
                photoViewer2.f31679b0.invalidate();
                return;
            case 2:
                jt0 jt0Var = (jt0) obj;
                PhotoViewer photoViewer3 = jt0Var.f35368b;
                photoViewer3.F1.f27532f0.setVisibility(0);
                photoViewer3.f31782m6 = null;
                photoViewer3.f31827r4 = jt0Var.f35367a;
                ph.i3 i3Var3 = photoViewer3.f1().I;
                if (photoViewer3.f31827r4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i3Var3.b(z10);
                ph.i3 i3Var4 = photoViewer3.H1;
                if (i3Var4 != null) {
                    if (photoViewer3.f31827r4 != 3) {
                        z12 = true;
                    }
                    i3Var4.b(z12);
                }
                if (photoViewer3.f31827r4 != 3) {
                    photoViewer3.W5 = 0.0f;
                }
                photoViewer3.f31774l6 = -1;
                photoViewer3.f31685b6 = 1.0f;
                photoViewer3.X5 = 1.0f;
                photoViewer3.Z5 = 0.0f;
                photoViewer3.f31675a6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f31815q2 = true;
                photoViewer3.f31679b0.invalidate();
                return;
            case 3:
                ((PhotoViewer) ((nt0) obj).f36581n0).f31861v3[0].setTag(null);
                return;
            case 4:
                ((ot0) obj).d.Q1.f32655h0 = 1.0f;
                return;
            case 5:
                PhotoViewer photoViewer4 = ((ot0) obj).d;
                photoViewer4.Q1.setVisibility(4);
                photoViewer4.Q1.f32655h0 = 1.0f;
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gl0(this, 19));
                return;
            case 7:
                ft0 ft0Var = (ft0) obj;
                if (animator.equals(ft0Var.f34224c.Q7)) {
                    ft0Var.f34224c.Q7 = null;
                    return;
                }
                return;
            case 8:
                nu0 nu0Var = (nu0) obj;
                if (nu0Var.e == animator) {
                    nu0Var.f36585c[1].setVisibility(8);
                    nu0Var.e = null;
                    return;
                }
                return;
            case 9:
                cv0 cv0Var = (cv0) obj;
                if (cv0Var.C != null) {
                    cv0Var.C = null;
                    cv0Var.b();
                    return;
                }
                return;
            case 10:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                Runnable runnable = popupNotificationActivity.V;
                if (runnable != null) {
                    runnable.run();
                    popupNotificationActivity.V = null;
                    return;
                }
                return;
            case 11:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                premiumPreviewFragment.f31926a0.removeView(premiumPreviewFragment.f31943o0);
                premiumPreviewFragment.f31943o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                ((ProfileActivity) ((org.telegram.ui.Components.ex0) obj).f24716c).A5 = null;
                return;
            case 13:
                o01 o01Var = (o01) obj;
                if (!o01Var.B) {
                    o01Var.setVisibility(8);
                    return;
                }
                return;
            case 14:
                l11 l11Var = (l11) obj;
                if (animator.equals(l11Var.f35620c)) {
                    l11Var.f35620c = null;
                    return;
                }
                return;
            case 15:
                t21 t21Var = (t21) obj;
                org.telegram.ui.Components.to toVar = t21Var.L;
                if (toVar != null) {
                    if (toVar.getParent() != null) {
                        ((ViewGroup) t21Var.L.getParent()).removeView(t21Var.L);
                    }
                    t21Var.L = null;
                }
                t21Var.K = null;
                super.onAnimationEnd(animator);
                return;
            case 16:
                ((l41) obj).d.X.f32655h0 = 1.0f;
                return;
            case 17:
                SecretMediaViewer secretMediaViewer = ((l41) obj).d;
                secretMediaViewer.X.setVisibility(4);
                secretMediaViewer.X.f32655h0 = 1.0f;
                return;
            case 18:
                x61 x61Var = ((m51) obj).e;
                x61Var.P0.D = 0.0f;
                x61Var.P0 = null;
                x61Var.f39862e0.invalidate();
                return;
            case 19:
                mg.g0.a();
                x61 x61Var2 = (x61) obj;
                t51 t51Var = x61Var2.f39862e0;
                t51 t51Var2 = x61Var2.f39862e0;
                t51Var.setLayerType(0, null);
                n51 n51Var = x61Var2.f39858c0;
                n51Var.setLayerType(0, null);
                x61Var2.f39855b0.setLayerType(0, null);
                x61Var2.V.setLayerType(0, null);
                org.telegram.ui.Components.gn gnVar = x61Var2.f39875k0;
                if (gnVar != null) {
                    gnVar.setLayerType(0, null);
                }
                View view = x61Var2.f39873j0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                n51Var.b();
                x61Var2.f39852a0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                x61Var2.T1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new sz0(globalInstance, 13));
                x61Var2.h();
                x61Var2.E(1.0f);
                for (int i11 = 0; i11 < t51Var2.getChildCount(); i11++) {
                    View childAt = t51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < x61Var2.f39852a0.f28998b.getChildCount(); i12++) {
                    View childAt2 = x61Var2.f39852a0.f28998b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                x61Var2.f39852a0.f28998b.invalidate();
                x61Var2.f39869h0.invalidate();
                t51Var2.invalidate();
                return;
            case 20:
                ((oa1) obj).Y.setVisibility(8);
                return;
            case 21:
                jd1 jd1Var = ((xc1) obj).f39959a;
                if (!jd1Var.f35212m1.a()) {
                    jd1Var.O1.setVisibility(8);
                    return;
                }
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((le1) obj).f35751a = null;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((qf1) obj).setScrollEnabled(true);
                return;
            case 24:
                vg1 vg1Var = (vg1) obj;
                if (animator.equals(vg1Var.e.H)) {
                    vg1Var.e.H = null;
                    return;
                }
                return;
            case 25:
                mh1 mh1Var = (mh1) obj;
                mh1Var.d = null;
                mh1Var.f36091a = null;
                mh1Var.f36092b = false;
                mh1Var.f36094f.f32363c.setAllowDrawCursor(true);
                return;
            case 26:
                org.telegram.ui.Components.sf0 sf0Var = (org.telegram.ui.Components.sf0) obj;
                ((dj1) sf0Var.f28736b).getClass();
                ((dj1) sf0Var.f28736b).f33491c.setVisibility(4);
                return;
            case 27:
                ((org.telegram.ui.web.c1) obj).f39404s.setVisibility(8);
                return;
            case 28:
                ph.k kVar = ((ph.f) obj).W;
                if (kVar.f41840d0 == animator) {
                    kVar.f41840d0 = null;
                    kVar.f41842f.getEditText().setScrollY(kVar.V);
                    return;
                }
                return;
            default:
                ph.x xVar = (ph.x) obj;
                xVar.f42560l = 1.0f;
                ph.y yVar = xVar.f42564p;
                if (yVar.f42627n.contains(xVar)) {
                    xVar.f42554c.onDetachedFromWindow();
                    eg.t2 t2Var = xVar.d;
                    if (t2Var != null) {
                        t2Var.pause();
                        xVar.d.release(null);
                        xVar.d = null;
                    }
                    TextureView textureView = xVar.e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        xVar.e = null;
                    }
                    xVar.f42555f = false;
                    yVar.f42627n.remove(xVar);
                }
                yVar.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38305a) {
            case 1:
                it0 it0Var = (it0) this.f38306b;
                it0Var.f35026b.R0.setVisibility(0);
                it0Var.f35026b.f31898z1.setVisibility(0);
                return;
            case 2:
                return;
            case 13:
                ((o01) this.f38306b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
