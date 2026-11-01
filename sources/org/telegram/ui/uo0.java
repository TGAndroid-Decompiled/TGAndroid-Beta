package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
public final class uo0 implements org.telegram.messenger.r20 {
    public final int f42318a;
    public final PhotoViewer f42319b;

    public uo0(PhotoViewer photoViewer, int i10) {
        this.f42318a = i10;
        this.f42319b = photoViewer;
    }

    @Override
    public final void a(Object obj) {
        Bitmap b10;
        float f7;
        int i10;
        float f10;
        float f11;
        float f12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        boolean z14 = true;
        switch (this.f42318a) {
            case 0:
                PhotoViewer photoViewer = this.f42319b;
                jg.s2 s2Var = (jg.s2) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((org.telegram.messenger.af) photoViewer.f33501g7.get(photoViewer.P4)).f14607i);
                    jg.v2 v2Var = photoViewer.p5;
                    v2Var.L = true;
                    v2Var.E = s2Var;
                    Bitmap n10 = photoViewer.C4.n();
                    int i12 = photoViewer.C4.U;
                    jg.s2 s2Var2 = v2Var.E;
                    if (s2Var2 == null) {
                        b10 = v2Var.I;
                    } else if (!isEmpty && n10 != null) {
                        b10 = v2Var.e(n10);
                    } else {
                        b10 = s2Var2.b();
                    }
                    photoViewer.C4.v0(b10);
                    photoViewer.f33614t5.setUndoCutState(true);
                    photoViewer.d3(true, true);
                    photoViewer.f33614t5.post(new oo0(photoViewer, 9));
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 1:
                Uri uri = (Uri) obj;
                org.telegram.ui.Components.cc.F(this.f42319b.f33477e0, true).j();
                return;
            case 2:
                PhotoViewer photoViewer2 = this.f42319b;
                photoViewer2.L1.Q1 = photoViewer2.K1.c();
                photoViewer2.f33477e0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.L1.S1);
                if ((photoViewer2.L1.B0 instanceof jg.g3) && max > 0) {
                    f7 = ((org.telegram.messenger.i0.f16172q.y - max) - org.telegram.messenger.i0.L(80.0f)) - photoViewer2.L1.getSelectedEntityBottom();
                } else {
                    f7 = 0.0f;
                }
                ValueAnimator valueAnimator = photoViewer2.f33607s7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.f33607s7 = null;
                }
                if (photoViewer2.f33622u4 != 3) {
                    f7 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.Z5, f7);
                photoViewer2.f33607s7 = ofFloat;
                ofFloat.addUpdateListener(new no0(photoViewer2, 9));
                photoViewer2.f33607s7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.f33607s7;
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
                valueAnimator2.setInterpolator(grVar);
                photoViewer2.f33607s7.start();
                AnimatorSet animatorSet = photoViewer2.J1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new no0(photoViewer2, 8));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.J1 = animatorSet2;
                jg.d2 d2Var = photoViewer2.L1.U0;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(d2Var, property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.L1.L0, property, Math.min(0, org.telegram.messenger.i0.L(40.0f) + i10));
                jg.d0 d0Var = photoViewer2.L1.O0;
                Property property2 = View.ALPHA;
                if (max > org.telegram.messenger.i0.L(20.0f)) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(d0Var, property2, f10);
                jg.k1 k1Var = photoViewer2.L1.f10173j0;
                if (max > org.telegram.messenger.i0.L(20.0f)) {
                    f11 = 0.0f;
                } else {
                    f11 = 1.0f;
                }
                ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(k1Var, property2, f11);
                jg.o1 o1Var = photoViewer2.L1.f10175k0;
                if (max > org.telegram.messenger.i0.L(20.0f)) {
                    f12 = 0.0f;
                } else {
                    f12 = 1.0f;
                }
                animatorSet2.playTogether(ofFloat3, ofFloat4, ofFloat5, ofFloat6, ObjectAnimator.ofFloat(o1Var, property2, f12), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(grVar);
                animatorSet2.start();
                cr0 cr0Var = photoViewer2.L1;
                jg.t1 t1Var = cr0Var.f10167d1;
                if (t1Var != null) {
                    if (cr0Var.Q1) {
                        t1Var.a(2131231513);
                    } else if (cr0Var.P1) {
                        t1Var.a(2131231505);
                    } else {
                        t1Var.a(2131232041);
                    }
                }
                TextView textView = cr0Var.f10171h1;
                if (!cr0Var.Q1 && !cr0Var.P1) {
                    z10 = true;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                }
                org.telegram.messenger.i0.T3(1.0f, textView, z10, z11);
                ImageView imageView = cr0Var.f10169f1;
                if (!cr0Var.Q1 && !cr0Var.P1) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                org.telegram.messenger.i0.T3(1.0f, imageView, z12, z11);
                TextView textView2 = cr0Var.f10174j1;
                if (!cr0Var.Q1 && !cr0Var.P1) {
                    z13 = z11;
                } else {
                    z13 = true;
                }
                org.telegram.messenger.i0.T3(1.0f, textView2, z13, z11);
                TextView textView3 = cr0Var.f10172i1;
                if (!cr0Var.Q1 && !cr0Var.P1) {
                    z14 = z11;
                }
                org.telegram.messenger.i0.T3(1.0f, textView3, z14, z11);
                return;
            case 3:
                PhotoViewer photoViewer3 = this.f42319b;
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                if (!photoViewer3.f33586q5.f29411b.Q && (i11 = photoViewer3.P4) >= 0 && i11 < photoViewer3.f33501g7.size() && (photoViewer3.f33501g7.get(photoViewer3.P4) instanceof org.telegram.messenger.ff)) {
                    org.telegram.ui.Components.pe0 pe0Var = photoViewer3.f33586q5;
                    vh.n2 n2Var = pe0Var.h;
                    if (n2Var != null) {
                        n2Var.dismiss();
                        pe0Var.h = null;
                    }
                    photoViewer3.f33586q5.f29411b.setLoading(true);
                    Utilities.e.c(new v50(photoViewer3, ffVar, (org.telegram.messenger.ff) photoViewer3.f33501g7.get(photoViewer3.P4), PhotoViewer.A1(), 17));
                    return;
                }
                return;
            case 4:
                PhotoViewer photoViewer4 = this.f42319b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.f33501g7.get(photoViewer4.P4);
                if (obj2 instanceof org.telegram.messenger.ff) {
                    ((org.telegram.messenger.ff) obj2).f14621x = num.intValue();
                } else if (obj2 instanceof org.telegram.messenger.jf) {
                    ((org.telegram.messenger.jf) obj2).f14621x = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.P4)) {
                    photoViewer4.P2();
                }
                photoViewer4.V1.setTimer(num.intValue());
                return;
            case 5:
                PhotoViewer photoViewer5 = this.f42319b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.R7.setTranslationY(photoViewer5.P0.getTranslationY() - (photoViewer5.U1.getAlpha() * i0.a.d(46.0f, photoViewer5.U1.getEditTextHeight(), 0)));
                }
                photoViewer5.f33478e1.setTranslationY(photoViewer5.U1.getAlpha() * (-i0.a.d(46.0f, num2.intValue(), 0)));
                photoViewer5.f33487f1.setTranslationY(photoViewer5.U1.getAlpha() * (-i0.a.d(46.0f, num2.intValue(), 0)));
                photoViewer5.f33495g1.setTranslationY(photoViewer5.U1.getAlpha() * (-i0.a.d(46.0f, num2.intValue(), 0)));
                org.telegram.ui.Components.oh ohVar = photoViewer5.U1.M;
                if (ohVar != null) {
                    ohVar.setTranslationY((-num2.intValue()) - org.telegram.messenger.i0.L(14.0f));
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer6 = this.f42319b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.f33501g7.get(photoViewer6.P4);
                if (obj3 instanceof org.telegram.messenger.ff) {
                    ((org.telegram.messenger.ff) obj3).f14621x = num3.intValue();
                } else if (obj3 instanceof org.telegram.messenger.jf) {
                    ((org.telegram.messenger.jf) obj3).f14621x = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.P4)) {
                    photoViewer6.P2();
                }
                photoViewer6.U1.setTimer(num3.intValue());
                return;
            case 7:
                Integer num4 = (Integer) obj;
                org.telegram.ui.Components.oh ohVar2 = this.f42319b.V1.M;
                if (ohVar2 != null) {
                    ohVar2.setTranslationY(num4.intValue());
                    return;
                }
                return;
            case 8:
                PhotoViewer photoViewer7 = this.f42319b;
                Boolean bool = (Boolean) obj;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer7.C0(0, false);
                return;
            default:
                PhotoViewer photoViewer8 = this.f42319b;
                Boolean bool2 = (Boolean) obj;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.C0(0, false);
                return;
        }
    }
}
