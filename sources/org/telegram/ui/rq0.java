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
public final class rq0 extends FrameLayout implements org.telegram.messenger.is {
    public final FrameLayout f50995a;
    public final eh0 f50996b;
    public final org.telegram.ui.ActionBar.j5[] f50997c;
    public final org.telegram.ui.Components.h6 d;
    public AnimatorSet f50998e;
    public AnimatorSet f50999f;
    public boolean h;
    public ValueAnimator f51000n;
    public float f51001r;
    public int f51002s;

    public rq0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f50995a = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(56.0f), 0, 0, 0);
        addView(frameLayout, c8.ja.e(-1, -1, 119));
        eh0 eh0Var = new eh0(activity, 2);
        this.f50996b = eh0Var;
        eh0Var.setPivotX(org.telegram.messenger.g0.L(16.0f));
        eh0Var.setPadding(org.telegram.messenger.g0.L(16.0f), 0, 0, 0);
        eh0Var.setClipToPadding(false);
        frameLayout.addView(eh0Var, c8.ja.e(-1, -1, 119));
        this.f50997c = new org.telegram.ui.ActionBar.j5[2];
        for (int i7 = 0; i7 < 2; i7++) {
            this.f50997c[i7] = new org.telegram.ui.ActionBar.j5(activity);
            this.f50997c[i7].setGravity(19);
            this.f50997c[i7].setTextColor(-1);
            this.f50997c[i7].setTextSize(20);
            this.f50997c[i7].setTypeface(org.telegram.messenger.g0.o());
            this.f50997c[i7].setDrawablePadding(org.telegram.messenger.g0.L(4.0f));
            this.f50997c[i7].setScrollNonFitText(true);
            this.f50996b.addView(this.f50997c[i7], c8.ja.e(-1, -2, 19));
        }
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(activity, true, false, false);
        this.d = h6Var;
        h6Var.b(0.4f, 320L, org.telegram.ui.Components.er.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
        h6Var.setGravity(19);
        h6Var.setTextColor(-1);
        h6Var.setEllipsizeByGradient(true);
        h6Var.setImportantForAccessibility(1);
        h6Var.setAccessibilityLiveRegion(1);
        this.f50995a.addView(h6Var, c8.ja.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
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
        org.telegram.ui.Components.h6 h6Var = this.d;
        if (z12 != z13) {
            this.h = z12;
            AnimatorSet animatorSet = this.f50999f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = org.telegram.messenger.g0.f23611q;
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
            eh0 eh0Var = this.f50996b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(h6Var, View.ALPHA, f12));
                float[] fArr = {L};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(h6Var, property, fArr));
                if (!isEmpty) {
                    f15 = org.telegram.messenger.g0.L(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(eh0Var, property, f15));
                if (!isEmpty) {
                    f13 = 0.87f;
                } else {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(eh0Var, View.SCALE_X, f13));
                if (isEmpty) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(eh0Var, View.SCALE_Y, f14));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f50999f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f50999f.setInterpolator(org.telegram.ui.Components.er.h);
                this.f50999f.start();
            } else {
                if (!isEmpty) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                h6Var.setAlpha(f10);
                h6Var.setTranslationY(L);
                if (!isEmpty) {
                    f15 = org.telegram.messenger.g0.L(-12.0f);
                }
                eh0Var.setTranslationY(f15);
                if (!isEmpty) {
                    f11 = 0.87f;
                } else {
                    f11 = 1.0f;
                }
                eh0Var.setScaleX(f11);
                if (isEmpty) {
                    f14 = 1.0f;
                }
                eh0Var.setScaleY(f14);
            }
        }
        h6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        h6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        int i7;
        int i10;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f50997c;
        int i11 = 0;
        TextPaint paint = j5VarArr[0].getPaint();
        float N = org.telegram.messenger.g0.N(0.66f);
        if (z10) {
            i7 = 1912602624;
        } else {
            i7 = 0;
        }
        paint.setShadowLayer(N, 0.0f, 1.0f, i7);
        TextPaint paint2 = j5VarArr[1].getPaint();
        float N2 = org.telegram.messenger.g0.N(0.66f);
        if (z10) {
            i10 = 1912602624;
        } else {
            i10 = 0;
        }
        paint2.setShadowLayer(N2, 0.0f, 1.0f, i10);
        org.telegram.ui.Components.g6 drawable = this.d.getDrawable();
        float N3 = org.telegram.messenger.g0.N(0.66f);
        if (z10) {
            i11 = 1912602624;
        }
        drawable.s(N3, 1.0f, i11);
    }

    public final void c(CharSequence charSequence) {
        boolean z10;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f50997c;
        boolean z11 = true;
        j5VarArr[1].setAlpha(0.0f);
        j5VarArr[1].setVisibility(8);
        CharSequence text = j5VarArr[0].getText();
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
            org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[0];
            j5Var.S = 0.0f;
            j5Var.b();
        }
        j5VarArr[0].k(charSequence);
        j5VarArr[0].setAlpha(1.0f);
        j5VarArr[0].setTranslationX(0.0f);
        j5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z10, boolean z11) {
        boolean equals;
        int i7;
        Property property;
        org.telegram.ui.ActionBar.j5[] j5VarArr = this.f50997c;
        CharSequence text = j5VarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (equals) {
            return;
        }
        AnimatorSet animatorSet = this.f50998e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f50998e = null;
        }
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[1];
        org.telegram.ui.ActionBar.j5 j5Var2 = j5VarArr[0];
        j5Var.getClass();
        j5Var.S = j5Var2.S;
        j5Var.b();
        j5VarArr[1].k(j5VarArr[0].getText());
        j5VarArr[1].setRightPadding((int) this.f51001r);
        org.telegram.ui.ActionBar.j5 j5Var3 = j5VarArr[0];
        j5Var3.S = 0.0f;
        j5Var3.b();
        j5VarArr[0].k(charSequence);
        int L = org.telegram.messenger.g0.L(8.0f);
        if (z11) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        float f10 = L * i7;
        j5VarArr[1].setTranslationX(0.0f);
        j5VarArr[1].setTranslationY(0.0f);
        if (z10) {
            j5VarArr[0].setTranslationX(0.0f);
            j5VarArr[0].setTranslationY(-f10);
        } else {
            j5VarArr[0].setTranslationX(-f10);
            j5VarArr[0].setTranslationY(0.0f);
        }
        j5VarArr[0].setAlpha(0.0f);
        j5VarArr[1].setAlpha(1.0f);
        j5VarArr[0].setVisibility(0);
        j5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(j5VarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(j5VarArr[0], property2, 1.0f));
        org.telegram.ui.ActionBar.j5 j5Var4 = j5VarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z10) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(j5Var4, property, f10));
        org.telegram.ui.ActionBar.j5 j5Var5 = j5VarArr[0];
        if (z10) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(j5Var5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f50998e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f50998e.addListener(new xx(this, 19));
        this.f50998e.setDuration(320L);
        this.f50998e.setInterpolator(org.telegram.ui.Components.er.h);
        this.f50998e.start();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25515i4) {
            org.telegram.ui.ActionBar.j5[] j5VarArr = this.f50997c;
            j5VarArr[0].invalidate();
            j5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25515i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25515i4);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        this.f50995a.layout(0, org.telegram.messenger.g0.f23605m, i11 - i7, i12 - i10);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = org.telegram.messenger.g0.f23605m;
        int i12 = this.f51002s;
        int i13 = org.telegram.messenger.g0.f23611q.y;
        if (i12 != i13) {
            this.f51002s = i13;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f50995a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i11, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
