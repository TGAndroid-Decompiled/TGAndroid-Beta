package yg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s01;
import zh.g3;
import zh.m5;
import zh.n5;
import zh.o6;
import zh.q3;
import zh.t1;
import zh.x0;
import zh.x2;
public final class b extends AnimatorListenerAdapter {
    public final int f46936a;
    public final Object f46937b;

    public b(Object obj, int i10) {
        this.f46936a = i10;
        this.f46937b = obj;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        int i10 = this.f46936a;
        Object obj = this.f46937b;
        switch (i10) {
            case 0:
                ((q) obj).run();
                return;
            case 1:
                v vVar = (v) obj;
                vVar.setVisibility(8);
                u uVar = vVar.f47148b;
                if (uVar != null) {
                    vVar.removeView(uVar);
                    vVar.f47148b = null;
                }
                vVar.e = null;
                return;
            case 2:
                ((i0) obj).f47025x.c();
                return;
            case 3:
                zh.a aVar = (zh.a) obj;
                aVar.h = 1.0f;
                aVar.invalidate();
                return;
            case 4:
                super.onAnimationEnd(animator);
                ((zh.k) obj).O.f49060p = false;
                return;
            case 5:
                zh.f0 f0Var = (zh.f0) obj;
                zh.k0 k0Var = f0Var.K;
                if (k0Var != null && f0Var.I == k0Var.f48575a) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    f0Var.J = ofFloat;
                    ofFloat.addUpdateListener(new qg.o(this, 19));
                    f0Var.J.setStartDelay(3000L);
                    f0Var.J.setDuration(550L);
                    f0Var.J.setInterpolator(new LinearInterpolator());
                    f0Var.J.start();
                    return;
                }
                return;
            case 6:
                ((x0) obj).I = null;
                return;
            case 7:
                t1 t1Var = (t1) obj;
                t1Var.f48891r5.invalidate();
                t1Var.setAnimatedTop(0);
                t1Var.f48891r5.V2 = true;
                View view = t1Var.F1;
                if (view != null && view.getVisibility() == 0) {
                    t1Var.F1.setTranslationY(((1.0f - t1Var.getTopViewEnterProgress()) * t1Var.F1.getLayoutParams().height) + t1Var.S1);
                }
                t1Var.f48891r5.f48169e2 = null;
                return;
            case 8:
                x2 x2Var = (x2) obj;
                x2Var.f49038c[1].setVisibility(8);
                x2Var.f49038c[0].setAlpha(1.0f);
                x2Var.f49038c[0].setTranslationY(0.0f);
                return;
            case 9:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                s01 s01Var = profileStoriesView.h;
                profileStoriesView.G = 1.0f;
                s01Var.R = 1.0f;
                s01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 10:
                ((g3) obj).M = null;
                return;
            case 11:
                q3 q3Var = (q3) obj;
                q3Var.f48814w = null;
                q3Var.f48812r = 1.0f;
                q3Var.invalidate();
                return;
            case 12:
            default:
                super.onAnimationEnd(animator);
                return;
            case 13:
                o6 o6Var = (o6) obj;
                o6Var.H = false;
                o6Var.G = 0.0f;
                o6Var.invalidate();
                o6Var.requestLayout();
                o6Var.J.requestLayout();
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f46936a) {
            case 12:
                super.onAnimationStart(animator);
                n5 n5Var = (n5) this.f46937b;
                hj0 hj0Var = ((m5) n5Var.f48709a.get(n5Var.d)).f48690c;
                hj0Var.M = 2;
                hj0Var.start();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
