package qg;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s01;
import org.telegram.ui.u00;
import xh.b4;
import xh.n7;
import xh.o8;
import xh.p2;
import xh.q2;
import xh.x2;
import xh.x3;
import zh.g4;
import zh.m5;
import zh.n5;
import zh.o6;
import zh.q3;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f40845a;
    public final Object f40846b;

    public o(a6.i iVar, View view) {
        this.f40845a = 3;
        this.f40846b = iVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        p2 p2Var;
        boolean z10;
        int i10 = this.f40845a;
        Object obj = this.f40846b;
        switch (i10) {
            case 0:
                LimitPreviewView limitPreviewView = (LimitPreviewView) obj;
                int i11 = LimitPreviewView.f21185l0;
                limitPreviewView.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue < 0.5f) {
                    f7 = (floatValue / 0.5f) * (-7.0f);
                } else {
                    f7 = (1.0f - ((floatValue - 0.5f) / 0.5f)) * (-7.0f);
                }
                limitPreviewView.f21189b0 = f7;
                return;
            case 1:
                s0 s0Var = (s0) obj;
                s0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s0Var.d.invalidate();
                r0 r0Var = s0Var.e;
                if (r0Var != null) {
                    r0Var.invalidate();
                    return;
                }
                return;
            case 2:
                ((x1) obj).f40983a.f40966o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            case 3:
                ((View) ((g.c0) ((a6.i) obj).f301b).d.getParent()).invalidate();
                return;
            case 4:
                sg.b bVar = (sg.b) obj;
                bVar.getClass();
                bVar.f41873b = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                bVar.invalidate();
                return;
            case 5:
                wg.h hVar = (wg.h) obj;
                hVar.getClass();
                hVar.setContainerHeight(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 6:
                x3 x3Var = (x3) obj;
                x3Var.Y0.f7759c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x3Var.T1();
                return;
            case 7:
                ((x2) obj).h.invalidate();
                return;
            case 8:
                q2 q2Var = (q2) obj;
                q2Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q2Var.E = floatValue2;
                if (floatValue2 >= 0.8f && (p2Var = q2Var.H) != null && (z10 = p2Var.f45865l) && z10) {
                    p2Var.f45865l = false;
                    p2Var.b();
                }
                q2Var.invalidate();
                return;
            case 9:
                View view = (View) obj;
                float sin = (((float) Math.sin(((Float) valueAnimator.getAnimatedValue()).floatValue() * 3.141592653589793d)) * 0.03f) + 1.0f;
                view.setScaleX(sin);
                view.setScaleY(sin);
                return;
            case 10:
                b4 b4Var = (b4) obj;
                b4Var.getClass();
                b4Var.f45275y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.invalidate();
                return;
            case 11:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u00 u00Var = ((n7) obj).f45776c;
                u00Var.setScaleX(floatValue3);
                u00Var.setScaleY(floatValue3);
                return;
            case 12:
                o8 o8Var = (o8) obj;
                o8Var.getClass();
                o8Var.f45824c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o8Var.invalidate();
                return;
            case 13:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg.u uVar = ((yg.v) obj).f47148b;
                if (uVar != null) {
                    uVar.setAlpha(floatValue4);
                    return;
                }
                return;
            case 14:
                zh.a aVar = (zh.a) obj;
                aVar.getClass();
                aVar.h = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                aVar.invalidate();
                return;
            case 15:
                zh.k kVar = (zh.k) obj;
                kVar.O.e = AndroidUtilities.lerp(0.0f, 1.0f - kVar.f48566b0.f48602d0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                kVar.invalidate();
                return;
            case 16:
                ((zh.m0) obj).invalidate();
                return;
            case 17:
                zh.o1 o1Var = (zh.o1) obj;
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.f48665c.setAlpha(floatValue5);
                o1Var.f48661a.setAlpha(AndroidUtilities.lerp(0.0f, 0.5f, floatValue5));
                o1Var.invalidate();
                return;
            case 18:
                zh.f0 f0Var = (zh.f0) obj;
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Drawable drawable = f0Var.e;
                if (drawable != null) {
                    drawable.setAlpha((int) (AndroidUtilities.lerp(f0Var.f48391f, 1.0f, floatValue6) * 255.0f));
                    f0Var.h.invalidate();
                    return;
                }
                return;
            case 19:
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zh.f0 f0Var2 = (zh.f0) ((yg.b) obj).f46937b;
                Drawable drawable2 = f0Var2.e;
                if (drawable2 != null) {
                    drawable2.setAlpha((int) (AndroidUtilities.lerp(1.0f, f0Var2.f48391f, floatValue7) * 255.0f));
                    f0Var2.h.invalidate();
                    return;
                }
                return;
            case 20:
                zh.x0 x0Var = (zh.x0) obj;
                x0Var.getClass();
                x0Var.h.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 21:
                zh.e1 e1Var = (zh.e1) obj;
                e1Var.getClass();
                e1Var.f48365n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.invalidate();
                return;
            case 22:
                zh.x2 x2Var = (zh.x2) obj;
                x2Var.getClass();
                float floatValue8 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView[] textViewArr = x2Var.f49038c;
                textViewArr[0].setAlpha(floatValue8);
                float f10 = 1.0f - floatValue8;
                textViewArr[0].setTranslationY((-AndroidUtilities.dp(4.0f)) * f10);
                textViewArr[1].setAlpha(f10);
                textViewArr[1].setTranslationY(floatValue8 * AndroidUtilities.dp(4.0f));
                return;
            case 23:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj;
                s01 s01Var = profileStoriesView.h;
                float floatValue9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                profileStoriesView.G = floatValue9;
                s01Var.R = floatValue9;
                s01Var.invalidate();
                profileStoriesView.invalidate();
                return;
            case 24:
                q3 q3Var = (q3) obj;
                q3Var.f48812r = ((Float) q3Var.f48814w.getAnimatedValue()).floatValue();
                q3Var.invalidate();
                return;
            case 25:
                g4 g4Var = (g4) obj;
                g4Var.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g4Var.e.setTranslationY(((-g4Var.d) + g4Var.getMeasuredHeight()) - g4Var.v);
                return;
            case 26:
                n5 n5Var = (n5) obj;
                float floatValue10 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ArrayList arrayList = n5Var.f48709a;
                m5 m5Var = (m5) arrayList.get(n5Var.d);
                m5Var.f48692n = floatValue10;
                m5Var.invalidate();
                int i12 = n5Var.f48711c;
                if (i12 != -1) {
                    m5 m5Var2 = (m5) arrayList.get(i12);
                    m5Var2.f48692n = 1.0f - floatValue10;
                    m5Var2.invalidate();
                    return;
                }
                return;
            default:
                o6 o6Var = (o6) obj;
                o6Var.getClass();
                o6Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.invalidate();
                o6Var.requestLayout();
                o6Var.J.requestLayout();
                return;
        }
    }

    public o(Object obj, int i10) {
        this.f40845a = i10;
        this.f40846b = obj;
    }
}
