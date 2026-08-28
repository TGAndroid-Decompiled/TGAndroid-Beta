package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CheckBoxBase;
public final class xp extends AnimatorListenerAdapter {
    public final int f44566a;
    public final Object f44567b;

    public xp(Object obj, int i9) {
        this.f44566a = i9;
        this.f44567b = obj;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        float f10;
        switch (this.f44566a) {
            case 0:
                bq bqVar = (bq) this.f44567b;
                org.telegram.ui.Components.fr frVar = bqVar.h;
                if (bqVar.D) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                frVar.b(f10);
                bqVar.h.invalidateSelf();
                return;
            case 15:
                ((org.telegram.ui.Components.nl) this.f44567b).f31124a.K = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f44566a) {
            case 1:
                nq nqVar = (nq) this.f44567b;
                View view = nqVar.f40787b;
                view.setAlpha(1.0f);
                f2.z0.x0(view);
                ((jr) nqVar.d).f39563c.removeView(view);
                return;
            case 2:
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) this.f44567b;
                b6Var.d = null;
                b6Var.f27047b.clear();
                return;
            case 3:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f44567b;
                animatedPhoneNumberEditText.f26068n = null;
                animatedPhoneNumberEditText.f26067f.clear();
                return;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f44567b;
                i6Var.c();
                i6Var.f29340k = null;
                i6Var.h = 0.0f;
                i6Var.f29342m = 0.0f;
                i6Var.invalidateSelf();
                Runnable runnable = i6Var.V;
                if (runnable != null) {
                    runnable.run();
                }
                i6Var.f29344o = null;
                CharSequence charSequence = i6Var.f29345p;
                if (charSequence != null) {
                    i6Var.q(charSequence, true, i6Var.f29346q);
                    i6Var.f29345p = null;
                    i6Var.f29346q = false;
                    return;
                }
                org.telegram.ui.Components.fg fgVar = i6Var.C;
                if (fgVar != null) {
                    fgVar.run();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.o9 o9Var = (org.telegram.ui.Components.o9) this.f44567b;
                o9Var.setVisibility(8);
                o9Var.setImageDrawable(null);
                o9Var.setAlpha(1.0f);
                return;
            case 6:
                org.telegram.ui.Components.w8 w8Var = ((org.telegram.ui.Components.k8) this.f44567b).f30029b;
                w8Var.f34142f = false;
                w8Var.f34141e.setVisibility(8);
                return;
            case 7:
                org.telegram.ui.Components.b9 b9Var = (org.telegram.ui.Components.b9) this.f44567b;
                if (b9Var.f27078f != null) {
                    b9Var.f27077e = 1.0f;
                    b9Var.n();
                    if (b9Var.f27079g) {
                        b9Var.f27079g = false;
                        Runnable runnable2 = b9Var.f27081j;
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                    }
                    b9Var.f();
                }
                b9Var.f27078f = null;
                return;
            case 8:
                ((org.telegram.ui.Components.hf) this.f44567b).f29068f.U.setVisibility(8);
                return;
            case 9:
                ((org.telegram.ui.Components.lg) this.f44567b).W = 1.0f;
                return;
            case 10:
                ((org.telegram.ui.Components.sh) this.f44567b).f32464c.f30153s.setVisibility(8);
                return;
            case 11:
                ((org.telegram.ui.Components.uh) this.f44567b).d.v.setVisibility(8);
                return;
            case 12:
                org.telegram.ui.Components.ki kiVar = (org.telegram.ui.Components.ki) this.f44567b;
                kiVar.V0 = null;
                if (!kiVar.f30134m1) {
                    if (kiVar.T0.getTag() == null && kiVar.M0 == 0 && !kiVar.P0) {
                        kiVar.W0.setVisibility(4);
                    }
                    kiVar.f30111e1.setVisibility(4);
                    return;
                }
                org.telegram.ui.ActionBar.w0 w0Var = kiVar.f30097a1;
                if (w0Var != null) {
                    w0Var.setVisibility(4);
                    return;
                }
                return;
            case 13:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.fk fkVar = (org.telegram.ui.Components.fk) this.f44567b;
                fkVar.f28460s.setVisibility(8);
                fkVar.f28458n = 0;
                org.telegram.ui.Components.uj ujVar = fkVar.f28459r;
                ujVar.setAlpha(1.0f);
                ujVar.setScaleX(1.0f);
                ujVar.setScaleY(1.0f);
                ujVar.setTranslationX(0.0f);
                ujVar.invalidate();
                return;
            case 14:
                org.telegram.ui.Components.ek ekVar = (org.telegram.ui.Components.ek) this.f44567b;
                if (ekVar.T.D.getTag() == null) {
                    ekVar.T.D.setVisibility(4);
                }
                ekVar.T.E = null;
                return;
            case 15:
                org.telegram.ui.Components.nl nlVar = (org.telegram.ui.Components.nl) this.f44567b;
                if (animator.equals(nlVar.f31124a.K)) {
                    ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = nlVar.f31124a;
                    chatAttachAlertPhotoLayout.V = true;
                    chatAttachAlertPhotoLayout.K = null;
                    return;
                }
                return;
            case 16:
                org.telegram.ui.Components.gm gmVar = (org.telegram.ui.Components.gm) this.f44567b;
                org.telegram.ui.Components.hm hmVar = gmVar.L;
                hmVar.F = null;
                hmVar.G = false;
                gmVar.invalidate();
                return;
            case 17:
                org.telegram.ui.Components.cp cpVar = (org.telegram.ui.Components.cp) this.f44567b;
                kh.eb ebVar = cpVar.N;
                if (ebVar != null) {
                    if (ebVar.getParent() != null) {
                        ((ViewGroup) cpVar.N.getParent()).removeView(cpVar.N);
                    }
                    cpVar.N = null;
                }
                cpVar.P = null;
                super.onAnimationEnd(animator);
                return;
            case 18:
                CheckBox checkBox = (CheckBox) this.f44567b;
                if (animator.equals(checkBox.f26295s)) {
                    checkBox.f26295s = null;
                }
                if (!checkBox.f26297x) {
                    checkBox.C = null;
                    return;
                }
                return;
            case 19:
                CheckBoxBase checkBoxBase = (CheckBoxBase) this.f44567b;
                if (animator.equals(checkBoxBase.f26312p)) {
                    checkBoxBase.f26312p = null;
                }
                if (!checkBoxBase.f26313q) {
                    checkBoxBase.C = null;
                    return;
                }
                return;
            case 20:
                org.telegram.ui.Components.cq cqVar = (org.telegram.ui.Components.cq) this.f44567b;
                if (cqVar.G == cqVar.H) {
                    cqVar.C.setVisibility(4);
                }
                cqVar.f27553y = null;
                return;
            case 21:
                org.telegram.ui.Components.lq lqVar = (org.telegram.ui.Components.lq) this.f44567b;
                lqVar.f30523l = 1.0f;
                lqVar.f30526o = null;
                lqVar.f30527p = null;
                lqVar.f30528q = null;
                View view2 = lqVar.H;
                if (view2 != null) {
                    if (lqVar.h == 0 && lqVar.G) {
                        view2.setVisibility(8);
                    }
                    lqVar.H.invalidate();
                }
                lqVar.f30516c = -1;
                return;
            case 22:
                org.telegram.ui.Components.ut utVar = (org.telegram.ui.Components.ut) this.f44567b;
                utVar.K = false;
                utVar.d.setTranslationY(0.0f);
                utVar.d.setAlpha(0.0f);
                utVar.c(0.0f);
                utVar.N = 0.0f;
                utVar.j();
                return;
            case 23:
                ((org.telegram.ui.Components.cu) this.f44567b).f27568a.K = false;
                return;
            case 24:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.uu) this.f44567b).d = null;
                return;
            case 25:
                ((org.telegram.ui.Components.wy) this.f44567b).S = null;
                return;
            case 26:
                super.onAnimationEnd(animator);
                ((org.telegram.ui.Components.fy) this.f44567b).f28603n = null;
                return;
            case 27:
                ((org.telegram.ui.Components.tz) this.f44567b).a();
                return;
            case 28:
                org.telegram.ui.Components.vz vzVar = (org.telegram.ui.Components.vz) this.f44567b;
                vzVar.Q = vzVar.V;
                vzVar.U = vzVar.f34033b0;
                vzVar.R = vzVar.W;
                vzVar.S = vzVar.f34031a0;
                vzVar.V = -1;
                vzVar.W = -1;
                vzVar.f34031a0 = -1;
                vzVar.f34033b0 = -1;
                return;
            case 29:
                org.telegram.ui.Components.j00 j00Var = (org.telegram.ui.Components.j00) this.f44567b;
                j00Var.f29570s = 1.0f;
                j00Var.invalidate();
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    public xp(nq nqVar, f2.z0 z0Var) {
        this.f44566a = 1;
        this.f44567b = nqVar;
    }
}
