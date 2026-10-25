package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;
public final class qp extends AnimatorListenerAdapter {
    public final int f42881a;
    public final Object f42882b;

    public qp(Object obj, int i10) {
        this.f42881a = i10;
        this.f42882b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f42881a) {
            case 15:
                ((org.telegram.ui.Components.im) this.f42882b).f29315a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f42881a) {
            case 0:
                rp rpVar = (rp) this.f42882b;
                rpVar.L = 0.0f;
                rpVar.K = 1.0f;
                View view = rpVar.f43200a0;
                if (view != null) {
                    view.invalidate();
                }
                rpVar.T.invalidate();
                ui uiVar = rpVar.Y;
                if (uiVar != null) {
                    uiVar.run();
                    rpVar.Y = null;
                    return;
                }
                return;
            case 1:
                rq rqVar = (rq) this.f42882b;
                View view2 = rqVar.f43237b;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                ((kr) rqVar.d).f41007c.removeView(view2);
                return;
            case 2:
                org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.f42882b;
                k6Var.d = null;
                k6Var.f29814b.clear();
                return;
            case 3:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f42882b;
                animatedPhoneNumberEditText.f25835n = null;
                animatedPhoneNumberEditText.f25834f.clear();
                return;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) this.f42882b;
                r6Var.b();
                r6Var.f32130o = null;
                r6Var.f32125j = 0.0f;
                r6Var.f32128m = 0.0f;
                r6Var.f32127l = 0.0f;
                r6Var.f32126k = 0.0f;
                r6Var.f32133r = 0.0f;
                r6Var.f32132q = 0.0f;
                r6Var.invalidateSelf();
                Runnable runnable = r6Var.f32120b0;
                if (runnable != null) {
                    runnable.run();
                }
                r6Var.f32135t = null;
                CharSequence charSequence = r6Var.f32136u;
                if (charSequence != null) {
                    r6Var.t(charSequence, true, r6Var.v);
                    r6Var.f32136u = null;
                    r6Var.v = false;
                    return;
                }
                org.telegram.ui.Components.pg pgVar = r6Var.I;
                if (pgVar != null) {
                    pgVar.run();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f42882b;
                y9Var.setVisibility(8);
                y9Var.setImageDrawable(null);
                y9Var.setAlpha(1.0f);
                return;
            case 6:
                org.telegram.ui.Components.g9 g9Var = ((org.telegram.ui.Components.u8) this.f42882b).f33287b;
                g9Var.f28492f = false;
                g9Var.e.setVisibility(8);
                return;
            case 7:
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.f42882b;
                if (l9Var.f30110f != null) {
                    l9Var.e = 1.0f;
                    l9Var.n();
                    if (l9Var.f30111g) {
                        l9Var.f30111g = false;
                        Runnable runnable2 = l9Var.f30113j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    l9Var.f();
                }
                l9Var.f30110f = null;
                return;
            case 8:
                ((org.telegram.ui.Components.rf) this.f42882b).f32243f.f25849b0.setVisibility(8);
                return;
            case 9:
                ((org.telegram.ui.Components.vg) this.f42882b).f33649d0 = 1.0f;
                return;
            case 10:
                ((org.telegram.ui.Components.ti) ((org.telegram.ui.Components.xh) this.f42882b).d).f33057s.setVisibility(8);
                return;
            case 11:
                ((org.telegram.ui.Components.ai) this.f42882b).d.v.setVisibility(8);
                return;
            case 12:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f42882b;
                tiVar.f33009c1 = null;
                if (!tiVar.f33062t1) {
                    if (tiVar.f33002a1.getTag() == null && tiVar.T0 == 0 && !tiVar.W0) {
                        tiVar.f33012d1.setVisibility(4);
                    }
                    tiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var = tiVar.f33025h1;
                if (w0Var != null) {
                    w0Var.setVisibility(4);
                    return;
                }
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) this.f42882b;
                nkVar.f31033s.setVisibility(8);
                nkVar.f31031n = 0;
                org.telegram.ui.Components.ck ckVar = nkVar.f31032r;
                ckVar.setAlpha(1.0f);
                ckVar.setScaleX(1.0f);
                ckVar.setScaleY(1.0f);
                ckVar.setTranslationX(0.0f);
                ckVar.invalidate();
                return;
            case 14:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.f42882b;
                if (mkVar.X.H.getTag() == null) {
                    mkVar.X.H.setVisibility(4);
                }
                mkVar.X.I = null;
                return;
            case 15:
                org.telegram.ui.Components.im imVar = (org.telegram.ui.Components.im) this.f42882b;
                if (animator.equals(imVar.f29315a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.f29315a;
                    chatAttachAlertPhotoLayout.f26022c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.f42882b;
                org.telegram.ui.Components.cn cnVar = bnVar.P;
                cnVar.J = null;
                cnVar.K = false;
                bnVar.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) this.f42882b;
                org.telegram.ui.Components.b31 b31Var = ypVar.Q;
                if (b31Var != null) {
                    if (b31Var.getParent() != null) {
                        ((ViewGroup) ypVar.Q.getParent()).removeView(ypVar.Q);
                    }
                    ypVar.Q = null;
                }
                ypVar.S = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                org.telegram.ui.Components.b31 b31Var2 = (org.telegram.ui.Components.b31) this.f42882b;
                b31Var2.f26741c = null;
                b31Var2.f26739a.setShader(null);
                b31Var2.f26743n = null;
                b31Var2.f26744r = null;
                b31Var2.setImageDrawable(null);
                AndroidUtilities.removeFromParent(b31Var2);
                return;
            case 19:
                CheckBox checkBox = (CheckBox) this.f42882b;
                if (animator.equals(checkBox.f26070s)) {
                    checkBox.f26070s = null;
                }
                if (!checkBox.f26072x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 20:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f42882b;
                if (animator.equals(checkBoxBase.f26086p)) {
                    checkBoxBase.f26086p = null;
                }
                if (!checkBoxBase.f26087q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.yq yqVar = (org.telegram.ui.Components.yq) this.f42882b;
                if (yqVar.K == yqVar.L) {
                    yqVar.G.setVisibility(4);
                }
                yqVar.f35125y = null;
                return;
            case 22:
                org.telegram.ui.Components.gr grVar = (org.telegram.ui.Components.gr) this.f42882b;
                grVar.f28689l = 1.0f;
                grVar.f28692o = null;
                grVar.f28693p = null;
                grVar.f28694q = null;
                View view3 = grVar.H;
                if (view3 != null) {
                    if (grVar.h == 0 && grVar.G) {
                        view3.setVisibility(8);
                    }
                    grVar.H.invalidate();
                }
                grVar.f28683c = -1;
                return;
            case 23:
                org.telegram.ui.Components.ru ruVar = (org.telegram.ui.Components.ru) this.f42882b;
                ruVar.O = false;
                ruVar.d.setTranslationY(0.0f);
                ruVar.d.setAlpha(0.0f);
                ruVar.c(0.0f);
                ruVar.R = 0.0f;
                ruVar.j();
                return;
            case 24:
                ((org.telegram.ui.Components.zu) this.f42882b).f35405a.O = false;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.f42882b).d = null;
                return;
            case 26:
                ((org.telegram.ui.Components.sz) this.f42882b).W = null;
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.bz) this.f42882b).f27002n = null;
                return;
            case 28:
                ((org.telegram.ui.Components.q00) this.f42882b).a();
                return;
            default:
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) this.f42882b;
                s00Var.U = s00Var.f32364c0;
                s00Var.f32362b0 = s00Var.f32368f0;
                s00Var.V = s00Var.f32365d0;
                s00Var.W = s00Var.f32366e0;
                s00Var.f32364c0 = -1;
                s00Var.f32365d0 = -1;
                s00Var.f32366e0 = -1;
                s00Var.f32368f0 = -1;
                return;
        }
    }

    public qp(rq rqVar, s4.p0 p0Var) {
        this.f42881a = 1;
        this.f42882b = rqVar;
    }
}
