package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import kg.j2;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.eo0;
import org.telegram.ui.ix0;
import th.f3;
import th.h5;
import th.i5;
import th.i6;
import th.p3;
import th.t1;
import th.w0;
import th.w2;
import vh.e4;
import vh.k2;
import vh.p2;
import vh.p6;
import vh.r6;
import vh.v4;
import vh.z3;
import xh.j3;
import xh.m2;
public final class r extends AnimatorListenerAdapter {
    public final int f48473a;
    public final Object f48474b;

    public r(Object obj, int i10) {
        this.f48473a = i10;
        this.f48474b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        int i10 = this.f48473a;
        Object obj = this.f48474b;
        switch (i10) {
            case 0:
                s sVar = (s) obj;
                sVar.setVisibility(8);
                q qVar = sVar.f48477b;
                if (qVar != null) {
                    sVar.removeView(qVar);
                    sVar.f48477b = null;
                }
                sVar.e = null;
                return;
            case 1:
                ((h0) obj).f48361y.c();
                return;
            case 2:
                th.a aVar = (th.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((th.l) obj).O.f49491p = false;
                return;
            case 4:
                th.c0 c0Var = (th.c0) obj;
                th.h0 h0Var = c0Var.K;
                if (h0Var != null && c0Var.I == h0Var.f49020a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    c0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new qh.e0(this, 14));
                    c0Var.J.setStartDelay(3000L);
                    c0Var.J.setDuration(550L);
                    c0Var.J.setInterpolator(new LinearInterpolator());
                    c0Var.J.start();
                    return;
                }
                return;
            case 5:
                ((w0) obj).I = null;
                return;
            case 6:
                t1 t1Var = (t1) obj;
                t1Var.f49471x5.invalidate();
                t1Var.setAnimatedTop(0);
                t1Var.f49471x5.E2 = true;
                View view = t1Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    t1Var.G1.setTranslationY(((1.0f - t1Var.getTopViewEnterProgress()) * t1Var.G1.getLayoutParams().height) + t1Var.T1);
                }
                t1Var.f49471x5.N1 = null;
                return;
            case 7:
                w2 w2Var = (w2) obj;
                w2Var.f49576c[1].setVisibility(8);
                w2Var.f49576c[0].setAlpha(1.0f);
                w2Var.f49576c[0].setTranslationY(0.0f);
                return;
            case 8:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                ix0 ix0Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                ix0Var.R = 1.0f;
                ix0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 9:
                ((f3) obj).M = null;
                return;
            case 10:
                p3 p3Var = (p3) obj;
                p3Var.f49380x = null;
                p3Var.f49377r = 1.0f;
                p3Var.invalidate();
                return;
            case 11:
            default:
                super.onAnimationEnd(animator);
                return;
            case 12:
                i6 i6Var = (i6) obj;
                i6Var.H = false;
                i6Var.G = 0.0f;
                i6Var.invalidate();
                i6Var.requestLayout();
                i6Var.J.requestLayout();
                return;
            case 13:
                vh.k kVar = ((vh.f) obj).f51137c0;
                if (kVar.f51356f0 == animator) {
                    kVar.f51356f0 = null;
                    kVar.f51355f.getEditText().setScrollY(kVar.f51350b0);
                    return;
                }
                return;
            case 14:
                vh.w wVar = (vh.w) obj;
                wVar.f52095l = 1.0f;
                vh.x xVar = wVar.f52099p;
                if (xVar.f52155n.contains(wVar)) {
                    wVar.f52089c.R();
                    j2 j2Var = wVar.d;
                    if (j2Var != null) {
                        j2Var.pause();
                        wVar.d.release(null);
                        wVar.d = null;
                    }
                    TextureView textureView = wVar.e;
                    if (textureView != null) {
                        org.telegram.messenger.i0.E2(textureView);
                        wVar.e = null;
                    }
                    wVar.f52090f = false;
                    xVar.f52155n.remove(wVar);
                }
                xVar.invalidate();
                return;
            case 15:
                k2 k2Var = (k2) ((eo0) obj).f36881c;
                k2Var.F.setVisibility(8);
                k2Var.d.setVisibility(8);
                return;
            case 16:
                p2 p2Var = (p2) obj;
                p2Var.f51758o0 = 1.0f;
                p2Var.invalidate();
                return;
            case 17:
                org.telegram.messenger.i0.E2((nj0) obj);
                return;
            case 18:
                super.onAnimationEnd(animator);
                z3 z3Var = (z3) obj;
                ImageView imageView = z3Var.f52265c;
                z3Var.f52265c = z3Var.d;
                z3Var.d = imageView;
                imageView.bringToFront();
                z3Var.d.setVisibility(8);
                z3Var.h = null;
                return;
            case 19:
                super.onAnimationEnd(animator);
                ((e4) obj).f51125x = null;
                return;
            case 20:
                v4 v4Var = (v4) obj;
                if (v4Var.getParent() instanceof ViewGroup) {
                    ((ViewGroup) v4Var.getParent()).removeView(v4Var);
                    return;
                }
                return;
            case 21:
                ((r6) obj).N = false;
                return;
            case 22:
                p6 p6Var = (p6) obj;
                p6Var.setTranslationY(0.0f);
                p6Var.d = null;
                return;
            case 23:
                xh.s sVar2 = (xh.s) obj;
                sVar2.setVisibility(8);
                sVar2.f54028a = null;
                return;
            case 24:
                ((m2) obj).E.setVisibility(8);
                return;
            case 25:
                ((j3) obj).I.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f48473a) {
            case 11:
                super.onAnimationStart(animator);
                i5 i5Var = (i5) this.f48474b;
                ci0 ci0Var = ((h5) i5Var.f49079a.get(i5Var.d)).f49041c;
                ci0Var.L = 2;
                ci0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
