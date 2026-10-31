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
import org.telegram.ui.jx0;
import org.telegram.ui.xz;
import rh.a3;
import rh.e4;
import rh.i4;
import rh.t2;
import rh.u2;
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
    public final int f45599a;
    public final Object f45600b;

    public e0(Object obj, int i10) {
        this.f45599a = i10;
        this.f45600b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        t2 t2Var;
        boolean z10;
        switch (this.f45599a) {
            case 0:
                ((i0) this.f45600b).d.setReveal(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e4 e4Var = (e4) this.f45600b;
                e4Var.T2.f6825c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e4Var.P1();
                return;
            case 2:
                ((a3) this.f45600b).h.invalidate();
                return;
            case 3:
                u2 u2Var = (u2) this.f45600b;
                u2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u2Var.E = floatValue;
                if (floatValue >= 0.8f && (t2Var = u2Var.H) != null && (z10 = t2Var.f47499l) && z10) {
                    t2Var.f47499l = false;
                    t2Var.b();
                }
                u2Var.invalidate();
                return;
            case 4:
                View view = (View) this.f45600b;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 5:
                i4 i4Var = (i4) this.f45600b;
                i4Var.getClass();
                i4Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i4Var.invalidate();
                return;
            case 6:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xz xzVar = ((w7) this.f45600b).f47649c;
                xzVar.setScaleX(floatValue2);
                xzVar.setScaleY(floatValue2);
                return;
            case 7:
                v8 v8Var = (v8) this.f45600b;
                v8Var.getClass();
                v8Var.f47601c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v8Var.invalidate();
                return;
            case 8:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sg.q qVar = ((sg.s) this.f45600b).f48466b;
                if (qVar != null) {
                    qVar.setAlpha(floatValue3);
                    return;
                }
                return;
            case 9:
                th.a aVar = (th.a) this.f45600b;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 10:
                th.l lVar = (th.l) this.f45600b;
                lVar.O.e = org.telegram.messenger.i0.T1(0.0f, 1.0f - lVar.f49152b0.f49201d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                lVar.invalidate();
                return;
            case 11:
                ((th.j0) this.f45600b).invalidate();
                return;
            case 12:
                p1 p1Var = (p1) this.f45600b;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p1Var.f49083c.setAlpha(floatValue4);
                p1Var.f49079a.setAlpha(org.telegram.messenger.i0.T1(0.0f, 0.5f, floatValue4));
                p1Var.invalidate();
                return;
            case 13:
                th.c0 c0Var = (th.c0) this.f45600b;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = c0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (org.telegram.messenger.i0.T1(c0Var.f48815f, 1.0f, floatValue5) * 255.0f));
                    c0Var.h.invalidate();
                    return;
                }
                return;
            case 14:
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                th.c0 c0Var2 = (th.c0) ((sg.r) this.f45600b).f48463b;
                Drawable drawable2 = c0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (org.telegram.messenger.i0.T1(1.0f, c0Var2.f48815f, floatValue6) * 255.0f));
                    c0Var2.h.invalidate();
                    return;
                }
                return;
            case 15:
                th.w0 w0Var = (th.w0) this.f45600b;
                w0Var.getClass();
                w0Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 16:
                d1 d1Var = (d1) this.f45600b;
                d1Var.getClass();
                d1Var.f48869n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d1Var.invalidate();
                return;
            case 17:
                w2 w2Var = (w2) this.f45600b;
                w2Var.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = w2Var.f49562c;
                textViewArr[0].setAlpha(floatValue7);
                float f7 = 1.0f - floatValue7;
                textViewArr[0].setTranslationY((-org.telegram.messenger.i0.L(4.0f)) * f7);
                textViewArr[1].setAlpha(f7);
                textViewArr[1].setTranslationY(floatValue7 * org.telegram.messenger.i0.L(4.0f));
                return;
            case 18:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) this.f45600b;
                jx0 jx0Var = profileStoriesView.h;
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue8;
                jx0Var.R = floatValue8;
                jx0Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 19:
                p3 p3Var = (p3) this.f45600b;
                p3Var.f49363r = ((Float) p3Var.f49366x.getAnimatedValue()).floatValue();
                p3Var.invalidate();
                return;
            case 20:
                f4 f4Var = (f4) this.f45600b;
                f4Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f4Var.e.setTranslationY(((-f4Var.d) + f4Var.getMeasuredHeight()) - f4Var.f48968w);
                return;
            case 21:
                i5 i5Var = (i5) this.f45600b;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = i5Var.f49065a;
                h5 h5Var = (h5) arrayList.get(i5Var.d);
                h5Var.f49029n = floatValue9;
                h5Var.invalidate();
                int i10 = i5Var.f49067c;
                if (i10 != -1) {
                    h5 h5Var2 = (h5) arrayList.get(i10);
                    h5Var2.f49029n = 1.0f - floatValue9;
                    h5Var2.invalidate();
                    return;
                }
                return;
            case 22:
                i6 i6Var = (i6) this.f45600b;
                i6Var.getClass();
                i6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i6Var.invalidate();
                i6Var.requestLayout();
                i6Var.J.requestLayout();
                return;
            case 23:
                uh.m mVar = (uh.m) this.f45600b;
                mVar.f50267x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mVar.f50264r.setTranslationY(org.telegram.messenger.i0.W1(mVar.f50267x, -org.telegram.messenger.i0.L(42.0f), 0));
                mVar.f50263n.setTranslationY(org.telegram.messenger.i0.W1(mVar.f50267x, 0, org.telegram.messenger.i0.L(42.0f)));
                return;
            case 24:
                vh.k kVar = (vh.k) this.f45600b;
                kVar.f51349n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vh.f fVar = kVar.f51340f;
                mt editText = fVar.getEditText();
                int L = org.telegram.messenger.i0.L(-26.0f);
                editText.setTranslationX(org.telegram.messenger.i0.W1(kVar.f51349n0, kVar.getEditTextLeft() + L, org.telegram.messenger.i0.L(2.0f)));
                FrameLayout frameLayout = kVar.f51355s;
                frameLayout.setTranslationX(org.telegram.messenger.i0.W1(kVar.f51349n0, -org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(2.0f)));
                frameLayout.setTranslationY(org.telegram.messenger.i0.W1(kVar.f51349n0, -org.telegram.messenger.i0.L(8.0f), 0));
                fVar.getEmojiButton().setAlpha(kVar.f51349n0);
                kVar.f51353r.setAlpha((float) Math.pow(kVar.f51349n0, 16.0d));
                kVar.u(kVar.f51349n0);
                oh ohVar = kVar.M;
                if (ohVar != null) {
                    ohVar.setAlpha((float) Math.pow(kVar.f51349n0, 4.0d));
                }
                fVar.getEditText().invalidate();
                kVar.invalidate();
                return;
            case 25:
                vh.t tVar = (vh.t) this.f45600b;
                tVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tVar.f51945a.invalidate();
                return;
            case 26:
                z1 z1Var = (z1) this.f45600b;
                z1Var.getClass();
                z1Var.h = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.i();
                return;
            case 27:
                ((n2) this.f45600b).f51501i1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 28:
                p2 p2Var = (p2) this.f45600b;
                p2Var.getClass();
                p2Var.f51743o0 = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                p2Var.invalidate();
                return;
            default:
                ((y2) this.f45600b).invalidate();
                return;
        }
    }
}
