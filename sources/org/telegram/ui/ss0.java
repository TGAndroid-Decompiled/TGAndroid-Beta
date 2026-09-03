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
    public final int f41304a;
    public final Object f41305b;

    public ss0(Object obj, int i10) {
        this.f41304a = i10;
        this.f41305b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41304a) {
            case 0:
                ((PhotoViewer) ((org.telegram.ui.Components.ex0) this.f41305b).f26692c).f34432x2 = null;
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
        int i10 = this.f41304a;
        boolean z11 = false;
        boolean z12 = false;
        Object obj = this.f41305b;
        switch (i10) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) ((org.telegram.ui.Components.ex0) obj).f26692c;
                if (photoViewer.f34432x2 != null) {
                    gl0 gl0Var = new gl0(this, 17);
                    photoViewer.F2 = gl0Var;
                    AndroidUtilities.runOnUIThread(gl0Var, 860L);
                    return;
                }
                return;
            case 1:
                it0 it0Var = (it0) obj;
                PhotoViewer photoViewer2 = it0Var.f37778b;
                zf.n nVar = photoViewer2.f34450z1.f25240b;
                nVar.q();
                CropAreaView cropAreaView = nVar.f51201a;
                cropAreaView.setDimVisibility(true);
                cropAreaView.f(true, true);
                cropAreaView.invalidate();
                photoViewer2.f34450z1.f25240b.G = true;
                photoViewer2.f34334m6 = null;
                photoViewer2.f34379r4 = it0Var.f37777a;
                qh.h3 h3Var = photoViewer2.f1().I;
                if (photoViewer2.f34379r4 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                h3Var.b(z4);
                qh.h3 h3Var2 = photoViewer2.H1;
                if (h3Var2 != null) {
                    if (photoViewer2.f34379r4 != 3) {
                        z11 = true;
                    }
                    h3Var2.b(z11);
                }
                if (photoViewer2.f34379r4 != 3) {
                    photoViewer2.W5 = 0.0f;
                }
                photoViewer2.f34326l6 = -1;
                photoViewer2.f34236b6 = 1.0f;
                photoViewer2.X5 = 1.0f;
                photoViewer2.Z5 = 0.0f;
                photoViewer2.f34226a6 = 0.0f;
                photoViewer2.w3(1.0f);
                photoViewer2.f34367q2 = true;
                photoViewer2.f34230b0.invalidate();
                return;
            case 2:
                jt0 jt0Var = (jt0) obj;
                PhotoViewer photoViewer3 = jt0Var.f38122b;
                photoViewer3.F1.f30057f0.setVisibility(0);
                photoViewer3.f34334m6 = null;
                photoViewer3.f34379r4 = jt0Var.f38121a;
                qh.h3 h3Var3 = photoViewer3.f1().I;
                if (photoViewer3.f34379r4 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h3Var3.b(z10);
                qh.h3 h3Var4 = photoViewer3.H1;
                if (h3Var4 != null) {
                    if (photoViewer3.f34379r4 != 3) {
                        z12 = true;
                    }
                    h3Var4.b(z12);
                }
                if (photoViewer3.f34379r4 != 3) {
                    photoViewer3.W5 = 0.0f;
                }
                photoViewer3.f34326l6 = -1;
                photoViewer3.f34236b6 = 1.0f;
                photoViewer3.X5 = 1.0f;
                photoViewer3.Z5 = 0.0f;
                photoViewer3.f34226a6 = 0.0f;
                photoViewer3.w3(1.0f);
                photoViewer3.f34367q2 = true;
                photoViewer3.f34230b0.invalidate();
                return;
            case 3:
                ((PhotoViewer) ((nt0) obj).f39450n0).f34413v3[0].setTag(null);
                return;
            case 4:
                ((ot0) obj).d.Q1.f35259h0 = 1.0f;
                return;
            case 5:
                PhotoViewer photoViewer4 = ((ot0) obj).d;
                photoViewer4.Q1.setVisibility(4);
                photoViewer4.Q1.f35259h0 = 1.0f;
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new gl0(this, 19));
                return;
            case 7:
                ft0 ft0Var = (ft0) obj;
                if (animator.equals(ft0Var.f36912c.Q7)) {
                    ft0Var.f36912c.Q7 = null;
                    return;
                }
                return;
            case 8:
                nu0 nu0Var = (nu0) obj;
                if (nu0Var.f39458e == animator) {
                    nu0Var.f39457c[1].setVisibility(8);
                    nu0Var.f39458e = null;
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
                premiumPreviewFragment.f34481a0.removeView(premiumPreviewFragment.f34499o0);
                premiumPreviewFragment.f34499o0 = null;
                super.onAnimationEnd(animator);
                return;
            case 12:
                ((ProfileActivity) ((org.telegram.ui.Components.ex0) obj).f26692c).A5 = null;
                return;
            case 13:
                o01 o01Var = (o01) obj;
                if (!o01Var.B) {
                    o01Var.setVisibility(8);
                    return;
                }
                return;
            case 14:
                k11 k11Var = (k11) obj;
                if (animator.equals(k11Var.f38161c)) {
                    k11Var.f38161c = null;
                    return;
                }
                return;
            case 15:
                t21 t21Var = (t21) obj;
                org.telegram.ui.Components.wo woVar = t21Var.L;
                if (woVar != null) {
                    if (woVar.getParent() != null) {
                        ((ViewGroup) t21Var.L.getParent()).removeView(t21Var.L);
                    }
                    t21Var.L = null;
                }
                t21Var.K = null;
                super.onAnimationEnd(animator);
                return;
            case 16:
                ((l41) obj).d.X.f35259h0 = 1.0f;
                return;
            case 17:
                SecretMediaViewer secretMediaViewer = ((l41) obj).d;
                secretMediaViewer.X.setVisibility(4);
                secretMediaViewer.X.f35259h0 = 1.0f;
                return;
            case 18:
                w61 w61Var = ((m51) obj).f38860e;
                w61Var.P0.D = 0.0f;
                w61Var.P0 = null;
                w61Var.f42314e0.invalidate();
                return;
            case 19:
                ng.g0.a();
                w61 w61Var2 = (w61) obj;
                t51 t51Var = w61Var2.f42314e0;
                t51 t51Var2 = w61Var2.f42314e0;
                t51Var.setLayerType(0, null);
                n51 n51Var = w61Var2.f42309c0;
                n51Var.setLayerType(0, null);
                w61Var2.f42306b0.setLayerType(0, null);
                w61Var2.V.setLayerType(0, null);
                org.telegram.ui.Components.in inVar = w61Var2.f42327k0;
                if (inVar != null) {
                    inVar.setLayerType(0, null);
                }
                View view = w61Var2.f42325j0;
                if (view != null) {
                    view.setLayerType(0, null);
                }
                n51Var.b();
                w61Var2.f42303a0.m(false);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                w61Var2.T1.unlock();
                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                Objects.requireNonNull(globalInstance);
                AndroidUtilities.runOnUIThread(new sz0(globalInstance, 13));
                w61Var2.h();
                w61Var2.E(1.0f);
                for (int i11 = 0; i11 < t51Var2.getChildCount(); i11++) {
                    View childAt = t51Var2.getChildAt(i11);
                    childAt.setScaleX(1.0f);
                    childAt.setScaleY(1.0f);
                }
                for (int i12 = 0; i12 < w61Var2.f42303a0.f31649b.getChildCount(); i12++) {
                    View childAt2 = w61Var2.f42303a0.f31649b.getChildAt(i12);
                    childAt2.setScaleX(1.0f);
                    childAt2.setScaleY(1.0f);
                }
                w61Var2.f42303a0.f31649b.invalidate();
                w61Var2.f42321h0.invalidate();
                t51Var2.invalidate();
                return;
            case 20:
                ((na1) obj).Y.setVisibility(8);
                return;
            case 21:
                jd1 jd1Var = ((xc1) obj).f43014a;
                if (!jd1Var.f37995m1.a()) {
                    jd1Var.O1.setVisibility(8);
                    return;
                }
                return;
            case 22:
                super.onAnimationEnd(animator);
                ((me1) obj).f38961a = null;
                return;
            case 23:
                super.onAnimationEnd(animator);
                ((qf1) obj).setScrollEnabled(true);
                return;
            case 24:
                ug1 ug1Var = (ug1) obj;
                if (animator.equals(ug1Var.f41831e.H)) {
                    ug1Var.f41831e.H = null;
                    return;
                }
                return;
            case 25:
                mh1 mh1Var = (mh1) obj;
                mh1Var.d = null;
                mh1Var.f38980a = null;
                mh1Var.f38981b = false;
                mh1Var.f38984f.f34932c.setAllowDrawCursor(true);
                return;
            case 26:
                org.telegram.ui.Components.tf0 tf0Var = (org.telegram.ui.Components.tf0) obj;
                ((ej1) tf0Var.f31350b).getClass();
                ((ej1) tf0Var.f31350b).f36514c.setVisibility(4);
                return;
            case 27:
                ((org.telegram.ui.web.a1) obj).f42453s.setVisibility(8);
                return;
            case 28:
                qh.k kVar = ((qh.f) obj).W;
                if (kVar.f45571d0 == animator) {
                    kVar.f45571d0 = null;
                    kVar.f45574f.getEditText().setScrollY(kVar.V);
                    return;
                }
                return;
            default:
                qh.x xVar = (qh.x) obj;
                xVar.f46293l = 1.0f;
                qh.y yVar = xVar.f46297p;
                if (yVar.f46339n.contains(xVar)) {
                    xVar.f46286c.onDetachedFromWindow();
                    fg.s2 s2Var = xVar.d;
                    if (s2Var != null) {
                        s2Var.pause();
                        xVar.d.release(null);
                        xVar.d = null;
                    }
                    TextureView textureView = xVar.f46287e;
                    if (textureView != null) {
                        AndroidUtilities.removeFromParent(textureView);
                        xVar.f46287e = null;
                    }
                    xVar.f46288f = false;
                    yVar.f46339n.remove(xVar);
                }
                yVar.invalidate();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41304a) {
            case 1:
                it0 it0Var = (it0) this.f41305b;
                it0Var.f37778b.R0.setVisibility(0);
                it0Var.f37778b.f34450z1.setVisibility(0);
                return;
            case 2:
                return;
            case 13:
                ((o01) this.f41305b).setVisibility(0);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
