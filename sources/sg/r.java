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
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.go0;
import org.telegram.ui.jx0;
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
import xh.i3;
import xh.m2;
public final class r extends AnimatorListenerAdapter {
    public final int f48462a;
    public final Object f48463b;

    public r(Object obj, int i10) {
        this.f48462a = i10;
        this.f48463b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        int i10 = this.f48462a;
        Object obj = this.f48463b;
        switch (i10) {
            case 0:
                s sVar = (s) obj;
                sVar.setVisibility(8);
                q qVar = sVar.f48466b;
                if (qVar != null) {
                    sVar.removeView(qVar);
                    sVar.f48466b = null;
                }
                sVar.e = null;
                return;
            case 1:
                ((h0) obj).f48350y.c();
                return;
            case 2:
                th.a aVar = (th.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 3:
                super.onAnimationEnd(animator);
                ((th.l) obj).O.f49477p = false;
                return;
            case 4:
                th.c0 c0Var = (th.c0) obj;
                th.h0 h0Var = c0Var.K;
                if (h0Var != null && c0Var.I == h0Var.f49006a) {
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
                t1Var.f49457x5.invalidate();
                t1Var.setAnimatedTop(0);
                t1Var.f49457x5.E2 = true;
                View view = t1Var.G1;
                if (view != null && view.getVisibility() == 0) {
                    t1Var.G1.setTranslationY(((1.0f - t1Var.getTopViewEnterProgress()) * t1Var.G1.getLayoutParams().height) + t1Var.T1);
                }
                t1Var.f49457x5.N1 = null;
                return;
            case 7:
                w2 w2Var = (w2) obj;
                w2Var.f49562c[1].setVisibility(8);
                w2Var.f49562c[0].setAlpha(1.0f);
                w2Var.f49562c[0].setTranslationY(0.0f);
                return;
            case 8:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                jx0 jx0Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                jx0Var.R = 1.0f;
                jx0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 9:
                ((f3) obj).M = null;
                return;
            case 10:
                p3 p3Var = (p3) obj;
                p3Var.f49366x = null;
                p3Var.f49363r = 1.0f;
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
                vh.k kVar = ((vh.f) obj).f51122c0;
                if (kVar.f51341f0 == animator) {
                    kVar.f51341f0 = null;
                    kVar.f51340f.getEditText().setScrollY(kVar.f51335b0);
                    return;
                }
                return;
            case 14:
                vh.w wVar = (vh.w) obj;
                wVar.f52079l = 1.0f;
                vh.x xVar = wVar.f52083p;
                if (xVar.f52137n.contains(wVar)) {
                    wVar.f52073c.R();
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
                    wVar.f52074f = false;
                    xVar.f52137n.remove(wVar);
                }
                xVar.invalidate();
                return;
            case 15:
                k2 k2Var = (k2) ((go0) obj).f37607c;
                k2Var.F.setVisibility(8);
                k2Var.d.setVisibility(8);
                return;
            case 16:
                p2 p2Var = (p2) obj;
                p2Var.f51743o0 = 1.0f;
                p2Var.invalidate();
                return;
            case 17:
                org.telegram.messenger.i0.E2((mj0) obj);
                return;
            case 18:
                super.onAnimationEnd(animator);
                z3 z3Var = (z3) obj;
                ImageView imageView = z3Var.f52247c;
                z3Var.f52247c = z3Var.d;
                z3Var.d = imageView;
                imageView.bringToFront();
                z3Var.d.setVisibility(8);
                z3Var.h = null;
                return;
            case 19:
                super.onAnimationEnd(animator);
                ((e4) obj).f51110x = null;
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
                sVar2.f54010a = null;
                return;
            case 24:
                ((m2) obj).E.setVisibility(8);
                return;
            case 25:
                ((i3) obj).I.setVisibility(8);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f48462a) {
            case 11:
                super.onAnimationStart(animator);
                i5 i5Var = (i5) this.f48463b;
                bi0 bi0Var = ((h5) i5Var.f49065a.get(i5Var.d)).f49027c;
                bi0Var.L = 2;
                bi0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
