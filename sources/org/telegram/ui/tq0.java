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
public final class tq0 extends FrameLayout implements org.telegram.messenger.ls {
    public final FrameLayout f50123a;
    public final sq0 f50124b;
    public final org.telegram.ui.ActionBar.k5[] f50125c;
    public final org.telegram.ui.Components.j6 d;
    public AnimatorSet f50126e;
    public AnimatorSet f50127f;
    public boolean h;
    public ValueAnimator f50128n;
    public float f50129r;
    public int f50130s;

    public tq0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f50123a = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(56.0f), 0, 0, 0);
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        sq0 sq0Var = new sq0(activity, 0);
        this.f50124b = sq0Var;
        sq0Var.setPivotX(org.telegram.messenger.g0.L(16.0f));
        sq0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, 0, 0);
        sq0Var.setClipToPadding(false);
        frameLayout.addView(sq0Var, c8.ha.e(-1, -1, 119));
        this.f50125c = new org.telegram.ui.ActionBar.k5[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f50125c[i7] = new org.telegram.ui.ActionBar.k5(activity);
            this.f50125c[i7].setGravity(19);
            this.f50125c[i7].setTextColor(-1);
            this.f50125c[i7].setTextSize(20);
            this.f50125c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.f50125c[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            this.f50125c[i7].setScrollNonFitText(true);
            this.f50124b.addView(this.f50125c[i7], c8.ha.e(-1, -2, 19));
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, true, false, false);
        this.d = j6Var;
        j6Var.b(0.4f, 320L, org.telegram.ui.Components.xq.h);
        j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        j6Var.setGravity(19);
        j6Var.setTextColor(-1);
        j6Var.setEllipsizeByGradient(true);
        j6Var.setImportantForAccessibility(1);
        j6Var.setAccessibilityLiveRegion(1);
        this.f50123a.addView(j6Var, c8.ha.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z9) {
        boolean z10;
        int i7;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z11 = !isEmpty;
        boolean z12 = this.h;
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (z11 != z12) {
            this.h = z11;
            AnimatorSet animatorSet = this.f50127f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = org.telegram.messenger.g0.f22544q;
            if (point.x > point.y) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!isEmpty) {
                i7 = 30;
            } else {
                i7 = 33;
            }
            if (z10) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            int L = org.telegram.messenger.g0.L(i7 - i10);
            float f14 = 0.87f;
            float f15 = 0.0f;
            sq0 sq0Var = this.f50124b;
            if (z9) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(j6Var, View.ALPHA, f12));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(j6Var, property, fArr));
                if (!isEmpty) {
                    f15 = org.telegram.messenger.g0.L(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(sq0Var, property, f15));
                if (!isEmpty) {
                    f13 = 0.87f;
                } else {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(sq0Var, View.SCALE_X, f13));
                if (isEmpty) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(sq0Var, View.SCALE_Y, f14));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f50127f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f50127f.setInterpolator(org.telegram.ui.Components.xq.h);
                this.f50127f.start();
            } else {
                if (!isEmpty) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                j6Var.setAlpha(f10);
                j6Var.setTranslationY(L);
                if (!isEmpty) {
                    f15 = org.telegram.messenger.g0.L(-12.0f);
                }
                sq0Var.setTranslationY(f15);
                if (!isEmpty) {
                    f11 = 0.87f;
                } else {
                    f11 = 1.0f;
                }
                sq0Var.setScaleX(f11);
                if (isEmpty) {
                    f14 = 1.0f;
                }
                sq0Var.setScaleY(f14);
            }
        }
        j6Var.c(charSequence, z9, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        j6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z9) {
        int i7;
        int i10;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f50125c;
        int i11 = 0;
        TextPaint paint = k5VarArr[0].getPaint();
        float N = org.telegram.messenger.g0.N(0.66f);
        if (z9) {
            i7 = 1912602624;
        } else {
            i7 = 0;
        }
        paint.setShadowLayer(N, 0.0f, 1.0f, i7);
        TextPaint paint2 = k5VarArr[1].getPaint();
        float N2 = org.telegram.messenger.g0.N(0.66f);
        if (z9) {
            i10 = 1912602624;
        } else {
            i10 = 0;
        }
        paint2.setShadowLayer(N2, 0.0f, 1.0f, i10);
        org.telegram.ui.Components.i6 drawable = this.d.getDrawable();
        float N3 = org.telegram.messenger.g0.N(0.66f);
        if (z9) {
            i11 = 1912602624;
        }
        drawable.s(N3, 1.0f, i11);
    }

    public final void c(CharSequence charSequence) {
        boolean z9;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f50125c;
        boolean z10 = true;
        k5VarArr[1].setAlpha(0.0f);
        k5VarArr[1].setVisibility(8);
        CharSequence text = k5VarArr[0].getText();
        if (text != null || charSequence != null) {
            if (text == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (charSequence != null) {
                z10 = false;
            }
            if (z9 != z10) {
                z10 = false;
            } else {
                z10 = TextUtils.equals(text.toString(), charSequence.toString());
            }
        }
        if (!z10) {
            org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[0];
            k5Var.R = 0.0f;
            k5Var.b();
        }
        k5VarArr[0].k(charSequence);
        k5VarArr[0].setAlpha(1.0f);
        k5VarArr[0].setTranslationX(0.0f);
        k5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z9, boolean z10) {
        boolean equals;
        int i7;
        Property property;
        org.telegram.ui.ActionBar.k5[] k5VarArr = this.f50125c;
        CharSequence text = k5VarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (equals) {
            return;
        }
        AnimatorSet animatorSet = this.f50126e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f50126e = null;
        }
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[1];
        org.telegram.ui.ActionBar.k5 k5Var2 = k5VarArr[0];
        k5Var.getClass();
        k5Var.R = k5Var2.R;
        k5Var.b();
        k5VarArr[1].k(k5VarArr[0].getText());
        k5VarArr[1].setRightPadding((int) this.f50129r);
        org.telegram.ui.ActionBar.k5 k5Var3 = k5VarArr[0];
        k5Var3.R = 0.0f;
        k5Var3.b();
        k5VarArr[0].k(charSequence);
        int L = org.telegram.messenger.g0.L(8.0f);
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        float f10 = L * i7;
        k5VarArr[1].setTranslationX(0.0f);
        k5VarArr[1].setTranslationY(0.0f);
        if (z9) {
            k5VarArr[0].setTranslationX(0.0f);
            k5VarArr[0].setTranslationY(-f10);
        } else {
            k5VarArr[0].setTranslationX(-f10);
            k5VarArr[0].setTranslationY(0.0f);
        }
        k5VarArr[0].setAlpha(0.0f);
        k5VarArr[1].setAlpha(1.0f);
        k5VarArr[0].setVisibility(0);
        k5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(k5VarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(k5VarArr[0], property2, 1.0f));
        org.telegram.ui.ActionBar.k5 k5Var4 = k5VarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z9) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(k5Var4, property, f10));
        org.telegram.ui.ActionBar.k5 k5Var5 = k5VarArr[0];
        if (z9) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(k5Var5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f50126e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f50126e.addListener(new d30(this, 18));
        this.f50126e.setDuration(320L);
        this.f50126e.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f50126e.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25009i4) {
            org.telegram.ui.ActionBar.k5[] k5VarArr = this.f50125c;
            k5VarArr[0].invalidate();
            k5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009i4);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.f50123a.layout(0, org.telegram.messenger.g0.f22538m, i11 - i7, i12 - i10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = org.telegram.messenger.g0.f22538m;
        int i12 = this.f50130s;
        int i13 = org.telegram.messenger.g0.f22544q.y;
        if (i12 != i13) {
            this.f50130s = i13;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f50123a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i11, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
