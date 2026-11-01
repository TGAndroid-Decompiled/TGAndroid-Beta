package qh;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.oh;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.ix0;
import org.telegram.ui.wz;
import rh.b3;
import rh.e4;
import rh.i4;
import rh.u2;
import rh.v2;
import rh.v8;
import rh.w7;
import th.d1;
import th.f4;
import th.h5;
import th.i5;
import th.i6;
import th.p1;
import th.p3;
import th.w2;
import vh.n2;
import vh.p2;
import vh.y2;
import vh.z1;
public final class e0 implements ValueAnimator.AnimatorUpdateListener {
    public final int f45610a;
    public final Object f45611b;

    public e0(Object obj, int i10) {
        this.f45610a = i10;
        this.f45611b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        u2 u2Var;
        boolean z10;
        switch (this.f45610a) {
            case 0:
                ((i0) this.f45611b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e4 e4Var = (e4) this.f45611b;
                e4Var.T2.f6826c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var.P1();
                return;
            case 2:
                ((b3) this.f45611b).h.invalidate();
                return;
            case 3:
                v2 v2Var = (v2) this.f45611b;
                v2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v2Var.E = floatValue;
                if (floatValue >= 0.8f && (u2Var = v2Var.H) != null && (z10 = u2Var.f47543l) && z10) {
                    u2Var.f47543l = false;
                    u2Var.b();
                }
                v2Var.invalidate();
                return;
            case 4:
                View view = (View) this.f45611b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 5:
                i4 i4Var = (i4) this.f45611b;
                i4Var.getClass();
                i4Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                return;
            case 6:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wz wzVar = ((w7) this.f45611b).f47659c;
                wzVar.setScaleX(floatValue2);
                wzVar.setScaleY(floatValue2);
                return;
            case 7:
                v8 v8Var = (v8) this.f45611b;
                v8Var.getClass();
                v8Var.f47615c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.invalidate();
                return;
            case 8:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.q qVar = ((sg.s) this.f45611b).f48477b;
                if (qVar != null) {
                    qVar.setAlpha(floatValue3);
                    return;
                }
                return;
            case 9:
                th.a aVar = (th.a) this.f45611b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 10:
                th.l lVar = (th.l) this.f45611b;
                lVar.O.e = org.telegram.messenger.i0.T1(0.0f, 1.0f - lVar.f49166b0.f49215d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                lVar.invalidate();
                return;
            case 11:
                ((th.j0) this.f45611b).invalidate();
                return;
            case 12:
                p1 p1Var = (p1) this.f45611b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p1Var.f49097c.setAlpha(floatValue4);
                p1Var.f49093a.setAlpha(org.telegram.messenger.i0.T1(0.0f, 0.5f, floatValue4));
                p1Var.invalidate();
                return;
            case 13:
                th.c0 c0Var = (th.c0) this.f45611b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = c0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (org.telegram.messenger.i0.T1(c0Var.f48829f, 1.0f, floatValue5) * 255.0f));
                    c0Var.h.invalidate();
                    return;
                }
                return;
            case 14:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th.c0 c0Var2 = (th.c0) ((sg.r) this.f45611b).f48474b;
                Drawable drawable2 = c0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (org.telegram.messenger.i0.T1(1.0f, c0Var2.f48829f, floatValue6) * 255.0f));
                    c0Var2.h.invalidate();
                    return;
                }
                return;
            case 15:
                th.w0 w0Var = (th.w0) this.f45611b;
                w0Var.getClass();
                w0Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                d1 d1Var = (d1) this.f45611b;
                d1Var.getClass();
                d1Var.f48883n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 17:
                w2 w2Var = (w2) this.f45611b;
                w2Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = w2Var.f49576c;
                textViewArr[0].setAlpha(floatValue7);
                float f7 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-org.telegram.messenger.i0.L(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue7 * org.telegram.messenger.i0.L(4.0f));
                return;
            case 18:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f45611b;
                ix0 ix0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                ix0Var.R = floatValue8;
                ix0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 19:
                p3 p3Var = (p3) this.f45611b;
                p3Var.f49377r = ((Float) p3Var.f49380x.getAnimatedValue()).floatValue();
                p3Var.invalidate();
                return;
            case 20:
                f4 f4Var = (f4) this.f45611b;
                f4Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.e.setTranslationY(((-f4Var.d) + f4Var.getMeasuredHeight()) - f4Var.f48982w);
                return;
            case 21:
                i5 i5Var = (i5) this.f45611b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = i5Var.f49079a;
                h5 h5Var = (h5) arrayList.get(i5Var.d);
                h5Var.f49043n = floatValue9;
                h5Var.invalidate();
                int i10 = i5Var.f49081c;
                if (i10 != -1) {
                    h5 h5Var2 = (h5) arrayList.get(i10);
                    h5Var2.f49043n = 1.0f - floatValue9;
                    h5Var2.invalidate();
                    return;
                }
                return;
            case 22:
                i6 i6Var = (i6) this.f45611b;
                i6Var.getClass();
                i6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.invalidate();
                i6Var.requestLayout();
                i6Var.J.requestLayout();
                return;
            case 23:
                uh.m mVar = (uh.m) this.f45611b;
                mVar.f50281x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f50278r.setTranslationY(org.telegram.messenger.i0.W1(mVar.f50281x, -org.telegram.messenger.i0.L(42.0f), 0));
                mVar.f50277n.setTranslationY(org.telegram.messenger.i0.W1(mVar.f50281x, 0, org.telegram.messenger.i0.L(42.0f)));
                return;
            case 24:
                vh.k kVar = (vh.k) this.f45611b;
                kVar.f51364n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh.f fVar = kVar.f51355f;
                mt editText = fVar.getEditText();
                int L = org.telegram.messenger.i0.L(-26.0f);
                editText.setTranslationX(org.telegram.messenger.i0.W1(kVar.f51364n0, kVar.getEditTextLeft() + L, org.telegram.messenger.i0.L(2.0f)));
                FrameLayout frameLayout = kVar.f51370s;
                frameLayout.setTranslationX(org.telegram.messenger.i0.W1(kVar.f51364n0, -org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(2.0f)));
                frameLayout.setTranslationY(org.telegram.messenger.i0.W1(kVar.f51364n0, -org.telegram.messenger.i0.L(8.0f), 0));
                fVar.getEmojiButton().setAlpha(kVar.f51364n0);
                kVar.f51368r.setAlpha((float) Math.pow(kVar.f51364n0, 16.0d));
                kVar.u(kVar.f51364n0);
                oh ohVar = kVar.M;
                if (ohVar != null) {
                    ohVar.setAlpha((float) Math.pow(kVar.f51364n0, 4.0d));
                }
                fVar.getEditText().invalidate();
                kVar.invalidate();
                return;
            case 25:
                vh.t tVar = (vh.t) this.f45611b;
                tVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.f51958a.invalidate();
                return;
            case 26:
                z1 z1Var = (z1) this.f45611b;
                z1Var.getClass();
                z1Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.i();
                return;
            case 27:
                ((n2) this.f45611b).f51516i1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                p2 p2Var = (p2) this.f45611b;
                p2Var.getClass();
                p2Var.f51758o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                p2Var.invalidate();
                return;
            default:
                ((y2) this.f45611b).invalidate();
                return;
        }
    }
}
