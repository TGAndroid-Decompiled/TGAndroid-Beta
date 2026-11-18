package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Point;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class tq0 extends FrameLayout implements org.telegram.messenger.fs {
    public final FrameLayout f52328a;
    public final ih0 f52329b;
    public final org.telegram.ui.ActionBar.n5[] f52330c;
    public final org.telegram.ui.Components.n6 d;
    public AnimatorSet f52331e;
    public AnimatorSet f52332f;
    public boolean h;
    public ValueAnimator f52333n;
    public float f52334r;
    public int f52335s;

    public tq0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f52328a = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(56.0f), 0, 0, 0);
        addView(frameLayout, c8.ma.e(-1, -1, 119));
        ih0 ih0Var = new ih0(activity, 2);
        this.f52329b = ih0Var;
        ih0Var.setPivotX(org.telegram.messenger.g0.L(16.0f));
        ih0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, 0, 0);
        ih0Var.setClipToPadding(false);
        frameLayout.addView(ih0Var, c8.ma.e(-1, -1, 119));
        this.f52330c = new org.telegram.ui.ActionBar.n5[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f52330c[i7] = new org.telegram.ui.ActionBar.n5(activity);
            this.f52330c[i7].setGravity(19);
            this.f52330c[i7].setTextColor(-1);
            this.f52330c[i7].setTextSize(20);
            this.f52330c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.f52330c[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            this.f52330c[i7].setScrollNonFitText(true);
            this.f52329b.addView(this.f52330c[i7], c8.ma.e(-1, -2, 19));
        }
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(activity, true, false, false);
        this.d = n6Var;
        n6Var.b(0.4f, 320L, org.telegram.ui.Components.lr.h);
        n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        n6Var.setGravity(19);
        n6Var.setTextColor(-1);
        n6Var.setEllipsizeByGradient(true);
        n6Var.setImportantForAccessibility(1);
        n6Var.setAccessibilityLiveRegion(1);
        this.f52328a.addView(n6Var, c8.ma.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean z11;
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = !isEmpty;
        boolean z13 = this.h;
        org.telegram.ui.Components.n6 n6Var = this.d;
        if (z12 != z13) {
            this.h = z12;
            AnimatorSet animatorSet = this.f52332f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = org.telegram.messenger.g0.f24118q;
            if (point.x > point.y) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!isEmpty) {
                i7 = 30;
            } else {
                i7 = 33;
            }
            if (z11) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            int L = org.telegram.messenger.g0.L(i7 - i10);
            float f14 = 0.87f;
            float f15 = 0.0f;
            ih0 ih0Var = this.f52329b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(n6Var, View.ALPHA, f12));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(n6Var, property, fArr));
                if (!isEmpty) {
                    f15 = org.telegram.messenger.g0.L(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(ih0Var, property, f15));
                if (!isEmpty) {
                    f13 = 0.87f;
                } else {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ih0Var, View.SCALE_X, f13));
                if (isEmpty) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(ih0Var, View.SCALE_Y, f14));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f52332f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f52332f.setInterpolator(org.telegram.ui.Components.lr.h);
                this.f52332f.start();
            } else {
                if (!isEmpty) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                n6Var.setAlpha(f10);
                n6Var.setTranslationY(L);
                if (!isEmpty) {
                    f15 = org.telegram.messenger.g0.L(-12.0f);
                }
                ih0Var.setTranslationY(f15);
                if (!isEmpty) {
                    f11 = 0.87f;
                } else {
                    f11 = 1.0f;
                }
                ih0Var.setScaleX(f11);
                if (isEmpty) {
                    f14 = 1.0f;
                }
                ih0Var.setScaleY(f14);
            }
        }
        n6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        n6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        int i7;
        int i10;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f52330c;
        int i11 = 0;
        TextPaint paint = n5VarArr[0].getPaint();
        float N = org.telegram.messenger.g0.N(0.66f);
        if (z10) {
            i7 = 1912602624;
        } else {
            i7 = 0;
        }
        paint.setShadowLayer(N, 0.0f, 1.0f, i7);
        TextPaint paint2 = n5VarArr[1].getPaint();
        float N2 = org.telegram.messenger.g0.N(0.66f);
        if (z10) {
            i10 = 1912602624;
        } else {
            i10 = 0;
        }
        paint2.setShadowLayer(N2, 0.0f, 1.0f, i10);
        org.telegram.ui.Components.m6 drawable = this.d.getDrawable();
        float N3 = org.telegram.messenger.g0.N(0.66f);
        if (z10) {
            i11 = 1912602624;
        }
        drawable.s(N3, 1.0f, i11);
    }

    public final void c(CharSequence charSequence) {
        boolean z10;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f52330c;
        boolean z11 = true;
        n5VarArr[1].setAlpha(0.0f);
        n5VarArr[1].setVisibility(8);
        CharSequence text = n5VarArr[0].getText();
        if (text != null || charSequence != null) {
            if (text == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (charSequence != null) {
                z11 = false;
            }
            if (z10 != z11) {
                z11 = false;
            } else {
                z11 = TextUtils.equals(text.toString(), charSequence.toString());
            }
        }
        if (!z11) {
            org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[0];
            n5Var.S = 0.0f;
            n5Var.b();
        }
        n5VarArr[0].k(charSequence);
        n5VarArr[0].setAlpha(1.0f);
        n5VarArr[0].setTranslationX(0.0f);
        n5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z10, boolean z11) {
        boolean equals;
        int i7;
        Property property;
        org.telegram.ui.ActionBar.n5[] n5VarArr = this.f52330c;
        CharSequence text = n5VarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (equals) {
            return;
        }
        AnimatorSet animatorSet = this.f52331e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f52331e = null;
        }
        org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[1];
        org.telegram.ui.ActionBar.n5 n5Var2 = n5VarArr[0];
        n5Var.getClass();
        n5Var.S = n5Var2.S;
        n5Var.b();
        n5VarArr[1].k(n5VarArr[0].getText());
        n5VarArr[1].setRightPadding((int) this.f52334r);
        org.telegram.ui.ActionBar.n5 n5Var3 = n5VarArr[0];
        n5Var3.S = 0.0f;
        n5Var3.b();
        n5VarArr[0].k(charSequence);
        int L = org.telegram.messenger.g0.L(8.0f);
        if (z11) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        float f10 = L * i7;
        n5VarArr[1].setTranslationX(0.0f);
        n5VarArr[1].setTranslationY(0.0f);
        if (z10) {
            n5VarArr[0].setTranslationX(0.0f);
            n5VarArr[0].setTranslationY(-f10);
        } else {
            n5VarArr[0].setTranslationX(-f10);
            n5VarArr[0].setTranslationY(0.0f);
        }
        n5VarArr[0].setAlpha(0.0f);
        n5VarArr[1].setAlpha(1.0f);
        n5VarArr[0].setVisibility(0);
        n5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(n5VarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(n5VarArr[0], property2, 1.0f));
        org.telegram.ui.ActionBar.n5 n5Var4 = n5VarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z10) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(n5Var4, property, f10));
        org.telegram.ui.ActionBar.n5 n5Var5 = n5VarArr[0];
        if (z10) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(n5Var5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f52331e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f52331e.addListener(new ay(this, 19));
        this.f52331e.setDuration(320L);
        this.f52331e.setInterpolator(org.telegram.ui.Components.lr.h);
        this.f52331e.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25148l4) {
            org.telegram.ui.ActionBar.n5[] n5VarArr = this.f52330c;
            n5VarArr[0].invalidate();
            n5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25148l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25148l4);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f52328a.layout(0, org.telegram.messenger.g0.f24112m, i11 - i7, i12 - i10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = org.telegram.messenger.g0.f24112m;
        int i12 = this.f52335s;
        int i13 = org.telegram.messenger.g0.f24118q.y;
        if (i12 != i13) {
            this.f52335s = i13;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f52328a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i11, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
