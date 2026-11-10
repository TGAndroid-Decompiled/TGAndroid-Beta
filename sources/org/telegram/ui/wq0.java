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
public final class wq0 extends FrameLayout implements org.telegram.messenger.ls {
    public final FrameLayout f51418a;
    public final vq0 f51419b;
    public final org.telegram.ui.ActionBar.m5[] f51420c;
    public final org.telegram.ui.Components.i6 d;
    public AnimatorSet f51421e;
    public AnimatorSet f51422f;
    public boolean h;
    public ValueAnimator f51423n;
    public float f51424r;
    public int f51425s;

    public wq0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f51418a = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(56.0f), 0, 0, 0);
        addView(frameLayout, c8.ha.e(-1, -1, 119));
        vq0 vq0Var = new vq0(activity, 0);
        this.f51419b = vq0Var;
        vq0Var.setPivotX(org.telegram.messenger.g0.L(16.0f));
        vq0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, 0, 0);
        vq0Var.setClipToPadding(false);
        frameLayout.addView(vq0Var, c8.ha.e(-1, -1, 119));
        this.f51420c = new org.telegram.ui.ActionBar.m5[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f51420c[i7] = new org.telegram.ui.ActionBar.m5(activity);
            this.f51420c[i7].setGravity(19);
            this.f51420c[i7].setTextColor(-1);
            this.f51420c[i7].setTextSize(20);
            this.f51420c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.f51420c[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            this.f51420c[i7].setScrollNonFitText(true);
            this.f51419b.addView(this.f51420c[i7], c8.ha.e(-1, -2, 19));
        }
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(activity, true, false, false);
        this.d = i6Var;
        i6Var.b(0.4f, 320L, org.telegram.ui.Components.wq.h);
        i6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        i6Var.setGravity(19);
        i6Var.setTextColor(-1);
        i6Var.setEllipsizeByGradient(true);
        i6Var.setImportantForAccessibility(1);
        i6Var.setAccessibilityLiveRegion(1);
        this.f51418a.addView(i6Var, c8.ha.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
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
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (z11 != z12) {
            this.h = z11;
            AnimatorSet animatorSet = this.f51422f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = org.telegram.messenger.g0.f22567q;
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
            vq0 vq0Var = this.f51419b;
            if (z9) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(i6Var, View.ALPHA, f12));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(i6Var, property, fArr));
                if (!isEmpty) {
                    f15 = org.telegram.messenger.g0.L(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(vq0Var, property, f15));
                if (!isEmpty) {
                    f13 = 0.87f;
                } else {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(vq0Var, View.SCALE_X, f13));
                if (isEmpty) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(vq0Var, View.SCALE_Y, f14));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f51422f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f51422f.setInterpolator(org.telegram.ui.Components.wq.h);
                this.f51422f.start();
            } else {
                if (!isEmpty) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                i6Var.setAlpha(f10);
                i6Var.setTranslationY(L);
                if (!isEmpty) {
                    f15 = org.telegram.messenger.g0.L(-12.0f);
                }
                vq0Var.setTranslationY(f15);
                if (!isEmpty) {
                    f11 = 0.87f;
                } else {
                    f11 = 1.0f;
                }
                vq0Var.setScaleX(f11);
                if (isEmpty) {
                    f14 = 1.0f;
                }
                vq0Var.setScaleY(f14);
            }
        }
        i6Var.c(charSequence, z9, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        i6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z9) {
        int i7;
        int i10;
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.f51420c;
        int i11 = 0;
        TextPaint paint = m5VarArr[0].getPaint();
        float N = org.telegram.messenger.g0.N(0.66f);
        if (z9) {
            i7 = 1912602624;
        } else {
            i7 = 0;
        }
        paint.setShadowLayer(N, 0.0f, 1.0f, i7);
        TextPaint paint2 = m5VarArr[1].getPaint();
        float N2 = org.telegram.messenger.g0.N(0.66f);
        if (z9) {
            i10 = 1912602624;
        } else {
            i10 = 0;
        }
        paint2.setShadowLayer(N2, 0.0f, 1.0f, i10);
        org.telegram.ui.Components.h6 drawable = this.d.getDrawable();
        float N3 = org.telegram.messenger.g0.N(0.66f);
        if (z9) {
            i11 = 1912602624;
        }
        drawable.s(N3, 1.0f, i11);
    }

    public final void c(CharSequence charSequence) {
        boolean z9;
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.f51420c;
        boolean z10 = true;
        m5VarArr[1].setAlpha(0.0f);
        m5VarArr[1].setVisibility(8);
        CharSequence text = m5VarArr[0].getText();
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
            org.telegram.ui.ActionBar.m5 m5Var = m5VarArr[0];
            m5Var.R = 0.0f;
            m5Var.b();
        }
        m5VarArr[0].k(charSequence);
        m5VarArr[0].setAlpha(1.0f);
        m5VarArr[0].setTranslationX(0.0f);
        m5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z9, boolean z10) {
        boolean equals;
        int i7;
        Property property;
        org.telegram.ui.ActionBar.m5[] m5VarArr = this.f51420c;
        CharSequence text = m5VarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (equals) {
            return;
        }
        AnimatorSet animatorSet = this.f51421e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f51421e = null;
        }
        org.telegram.ui.ActionBar.m5 m5Var = m5VarArr[1];
        org.telegram.ui.ActionBar.m5 m5Var2 = m5VarArr[0];
        m5Var.getClass();
        m5Var.R = m5Var2.R;
        m5Var.b();
        m5VarArr[1].k(m5VarArr[0].getText());
        m5VarArr[1].setRightPadding((int) this.f51424r);
        org.telegram.ui.ActionBar.m5 m5Var3 = m5VarArr[0];
        m5Var3.R = 0.0f;
        m5Var3.b();
        m5VarArr[0].k(charSequence);
        int L = org.telegram.messenger.g0.L(8.0f);
        if (z10) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        float f10 = L * i7;
        m5VarArr[1].setTranslationX(0.0f);
        m5VarArr[1].setTranslationY(0.0f);
        if (z9) {
            m5VarArr[0].setTranslationX(0.0f);
            m5VarArr[0].setTranslationY(-f10);
        } else {
            m5VarArr[0].setTranslationX(-f10);
            m5VarArr[0].setTranslationY(0.0f);
        }
        m5VarArr[0].setAlpha(0.0f);
        m5VarArr[1].setAlpha(1.0f);
        m5VarArr[0].setVisibility(0);
        m5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(m5VarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(m5VarArr[0], property2, 1.0f));
        org.telegram.ui.ActionBar.m5 m5Var4 = m5VarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z9) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(m5Var4, property, f10));
        org.telegram.ui.ActionBar.m5 m5Var5 = m5VarArr[0];
        if (z9) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(m5Var5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f51421e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f51421e.addListener(new g30(this, 18));
        this.f51421e.setDuration(320L);
        this.f51421e.setInterpolator(org.telegram.ui.Components.wq.h);
        this.f51421e.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25022i4) {
            org.telegram.ui.ActionBar.m5[] m5VarArr = this.f51420c;
            m5VarArr[0].invalidate();
            m5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25022i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25022i4);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        this.f51418a.layout(0, org.telegram.messenger.g0.f22561m, i11 - i7, i12 - i10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = org.telegram.messenger.g0.f22561m;
        int i12 = this.f51425s;
        int i13 = org.telegram.messenger.g0.f22567q.y;
        if (i12 != i13) {
            this.f51425s = i13;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f51418a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i11, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
