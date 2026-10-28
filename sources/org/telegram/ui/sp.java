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
public final class sp extends AnimatorListenerAdapter {
    public final int f43371a;
    public final Object f43372b;

    public sp(Object obj, int i10) {
        this.f43371a = i10;
        this.f43372b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f43371a) {
            case 15:
                ((org.telegram.ui.Components.im) this.f43372b).f29384a.O = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f43371a) {
            case 0:
                tp tpVar = (tp) this.f43372b;
                tpVar.L = 0.0f;
                tpVar.K = 1.0f;
                View view = tpVar.f43689a0;
                if (view != null) {
                    view.invalidate();
                }
                tpVar.T.invalidate();
                xi xiVar = tpVar.Y;
                if (xiVar != null) {
                    xiVar.run();
                    tpVar.Y = null;
                    return;
                }
                return;
            case 1:
                tq tqVar = (tq) this.f43372b;
                View view2 = tqVar.f43726b;
                view2.setAlpha(1.0f);
                s4.p0.x0(view2);
                ((mr) tqVar.d).f41508c.removeView(view2);
                return;
            case 2:
                org.telegram.ui.Components.k6 k6Var = (org.telegram.ui.Components.k6) this.f43372b;
                k6Var.d = null;
                k6Var.f29863b.clear();
                return;
            case 3:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f43372b;
                animatedPhoneNumberEditText.f25839n = null;
                animatedPhoneNumberEditText.f25838f.clear();
                return;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) this.f43372b;
                r6Var.b();
                r6Var.f32153o = null;
                r6Var.f32148j = 0.0f;
                r6Var.f32151m = 0.0f;
                r6Var.f32150l = 0.0f;
                r6Var.f32149k = 0.0f;
                r6Var.f32156r = 0.0f;
                r6Var.f32155q = 0.0f;
                r6Var.invalidateSelf();
                Runnable runnable = r6Var.f32143b0;
                if (runnable != null) {
                    runnable.run();
                }
                r6Var.f32158t = null;
                CharSequence charSequence = r6Var.f32159u;
                if (charSequence != null) {
                    r6Var.t(charSequence, true, r6Var.v);
                    r6Var.f32159u = null;
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
                org.telegram.ui.Components.y9 y9Var = (org.telegram.ui.Components.y9) this.f43372b;
                y9Var.setVisibility(8);
                y9Var.setImageDrawable(null);
                y9Var.setAlpha(1.0f);
                return;
            case 6:
                org.telegram.ui.Components.g9 g9Var = ((org.telegram.ui.Components.u8) this.f43372b).f33281b;
                g9Var.f28476f = false;
                g9Var.e.setVisibility(8);
                return;
            case 7:
                org.telegram.ui.Components.l9 l9Var = (org.telegram.ui.Components.l9) this.f43372b;
                if (l9Var.f30179f != null) {
                    l9Var.e = 1.0f;
                    l9Var.n();
                    if (l9Var.f30180g) {
                        l9Var.f30180g = false;
                        Runnable runnable2 = l9Var.f30182j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    l9Var.f();
                }
                l9Var.f30179f = null;
                return;
            case 8:
                ((org.telegram.ui.Components.rf) this.f43372b).f32242f.f25853b0.setVisibility(8);
                return;
            case 9:
                ((org.telegram.ui.Components.vg) this.f43372b).f33722d0 = 1.0f;
                return;
            case 10:
                ((org.telegram.ui.Components.ti) ((org.telegram.ui.Components.xh) this.f43372b).d).f33029s.setVisibility(8);
                return;
            case 11:
                ((org.telegram.ui.Components.ai) this.f43372b).d.v.setVisibility(8);
                return;
            case 12:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.f43372b;
                tiVar.f32981c1 = null;
                if (!tiVar.f33034t1) {
                    if (tiVar.f32974a1.getTag() == null && tiVar.T0 == 0 && !tiVar.W0) {
                        tiVar.f32984d1.setVisibility(4);
                    }
                    tiVar.l1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var = tiVar.f32997h1;
                if (w0Var != null) {
                    w0Var.setVisibility(4);
                    return;
                }
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) this.f43372b;
                nkVar.f30948s.setVisibility(8);
                nkVar.f30946n = 0;
                org.telegram.ui.Components.ck ckVar = nkVar.f30947r;
                ckVar.setAlpha(1.0f);
                ckVar.setScaleX(1.0f);
                ckVar.setScaleY(1.0f);
                ckVar.setTranslationX(0.0f);
                ckVar.invalidate();
                return;
            case 14:
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) this.f43372b;
                if (mkVar.X.H.getTag() == null) {
                    mkVar.X.H.setVisibility(4);
                }
                mkVar.X.I = null;
                return;
            case 15:
                org.telegram.ui.Components.im imVar = (org.telegram.ui.Components.im) this.f43372b;
                if (animator.equals(imVar.f29384a.O)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = imVar.f29384a;
                    chatAttachAlertPhotoLayout.f26026c0 = true;
                    chatAttachAlertPhotoLayout.O = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.bn bnVar = (org.telegram.ui.Components.bn) this.f43372b;
                org.telegram.ui.Components.cn cnVar = bnVar.P;
                cnVar.J = null;
                cnVar.K = false;
                bnVar.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.zp zpVar = (org.telegram.ui.Components.zp) this.f43372b;
                org.telegram.ui.Components.c31 c31Var = zpVar.Q;
                if (c31Var != null) {
                    if (c31Var.getParent() != null) {
                        ((ViewGroup) zpVar.Q.getParent()).removeView(zpVar.Q);
                    }
                    zpVar.Q = null;
                }
                zpVar.S = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                org.telegram.ui.Components.c31 c31Var2 = (org.telegram.ui.Components.c31) this.f43372b;
                c31Var2.f27048c = null;
                c31Var2.f27046a.setShader(null);
                c31Var2.f27050n = null;
                c31Var2.f27051r = null;
                c31Var2.setImageDrawable(null);
                AndroidUtilities.removeFromParent(c31Var2);
                return;
            case 19:
                CheckBox checkBox = (CheckBox) this.f43372b;
                if (animator.equals(checkBox.f26074s)) {
                    checkBox.f26074s = null;
                }
                if (!checkBox.f26076x) {
                    checkBox.G = null;
                    return;
                }
                return;
            case 20:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f43372b;
                if (animator.equals(checkBoxBase.f26090p)) {
                    checkBoxBase.f26090p = null;
                }
                if (!checkBoxBase.f26091q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 21:
                org.telegram.ui.Components.yq yqVar = (org.telegram.ui.Components.yq) this.f43372b;
                if (yqVar.K == yqVar.L) {
                    yqVar.G.setVisibility(4);
                }
                yqVar.f35143y = null;
                return;
            case 22:
                org.telegram.ui.Components.gr grVar = (org.telegram.ui.Components.gr) this.f43372b;
                grVar.f28729l = 1.0f;
                grVar.f28732o = null;
                grVar.f28733p = null;
                grVar.f28734q = null;
                View view3 = grVar.H;
                if (view3 != null) {
                    if (grVar.h == 0 && grVar.G) {
                        view3.setVisibility(8);
                    }
                    grVar.H.invalidate();
                }
                grVar.f28723c = -1;
                return;
            case 23:
                org.telegram.ui.Components.ru ruVar = (org.telegram.ui.Components.ru) this.f43372b;
                ruVar.O = false;
                ruVar.d.setTranslationY(0.0f);
                ruVar.d.setAlpha(0.0f);
                ruVar.c(0.0f);
                ruVar.R = 0.0f;
                ruVar.j();
                return;
            case 24:
                ((org.telegram.ui.Components.zu) this.f43372b).f35451a.O = false;
                return;
            case 25:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.rv) this.f43372b).d = null;
                return;
            case 26:
                ((org.telegram.ui.Components.sz) this.f43372b).W = null;
                return;
            case 27:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.bz) this.f43372b).f27003n = null;
                return;
            case 28:
                ((org.telegram.ui.Components.q00) this.f43372b).a();
                return;
            default:
                org.telegram.ui.Components.s00 s00Var = (org.telegram.ui.Components.s00) this.f43372b;
                s00Var.U = s00Var.f32421c0;
                s00Var.f32419b0 = s00Var.f32425f0;
                s00Var.V = s00Var.f32422d0;
                s00Var.W = s00Var.f32423e0;
                s00Var.f32421c0 = -1;
                s00Var.f32422d0 = -1;
                s00Var.f32423e0 = -1;
                s00Var.f32425f0 = -1;
                return;
        }
    }

    public sp(tq tqVar, s4.p0 p0Var) {
        this.f43371a = 1;
        this.f43372b = tqVar;
    }
}
