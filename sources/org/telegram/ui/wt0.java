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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class wt0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout f44374a;
    public final bh.d f44375b;
    public final org.telegram.ui.ActionBar.h5[] f44376c;
    public final org.telegram.ui.Components.o6 d;
    public AnimatorSet f44377e;
    public AnimatorSet f44378f;
    public boolean h;
    public ValueAnimator f44379n;
    public float f44380r;
    public int f44381s;

    public wt0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f44374a = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(56.0f), 0, 0, 0);
        addView(frameLayout, i7.f6.e(-1, -1, 119));
        bh.d dVar = new bh.d(activity, 26);
        this.f44375b = dVar;
        dVar.setPivotX(AndroidUtilities.dp(16.0f));
        dVar.setPadding(AndroidUtilities.dp(16.0f), 0, 0, 0);
        dVar.setClipToPadding(false);
        frameLayout.addView(dVar, i7.f6.e(-1, -1, 119));
        this.f44376c = new org.telegram.ui.ActionBar.h5[2];
        for (int i10 = 0; i10 < 2; i10++) {
            this.f44376c[i10] = new org.telegram.ui.ActionBar.h5(activity);
            this.f44376c[i10].setGravity(19);
            this.f44376c[i10].setTextColor(-1);
            this.f44376c[i10].setTextSize(20);
            this.f44376c[i10].setTypeface(AndroidUtilities.bold());
            this.f44376c[i10].setDrawablePadding(AndroidUtilities.dp(4.0f));
            this.f44376c[i10].setScrollNonFitText(true);
            this.f44375b.addView(this.f44376c[i10], i7.f6.e(-1, -2, 19));
        }
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(activity, true, false, false);
        this.d = o6Var;
        o6Var.b(0.4f, 320L, org.telegram.ui.Components.jr.h);
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setGravity(19);
        o6Var.setTextColor(-1);
        o6Var.setEllipsizeByGradient(true);
        o6Var.setImportantForAccessibility(1);
        o6Var.setAccessibilityLiveRegion(1);
        this.f44374a.addView(o6Var, i7.f6.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        float f9;
        float f10;
        float f11;
        float f12;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = !isEmpty;
        boolean z13 = this.h;
        org.telegram.ui.Components.o6 o6Var = this.d;
        if (z12 != z13) {
            this.h = z12;
            AnimatorSet animatorSet = this.f44378f;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!isEmpty) {
                i10 = 30;
            } else {
                i10 = 33;
            }
            if (z11) {
                i11 = 6;
            } else {
                i11 = 0;
            }
            int dp = AndroidUtilities.dp(i10 - i11);
            float f13 = 0.87f;
            float f14 = 0.0f;
            bh.d dVar = this.f44375b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(o6Var, View.ALPHA, f11));
                float[] fArr = {dp};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(o6Var, property, fArr));
                if (!isEmpty) {
                    f14 = AndroidUtilities.dp(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(dVar, property, f14));
                if (!isEmpty) {
                    f12 = 0.87f;
                } else {
                    f12 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(dVar, View.SCALE_X, f12));
                if (isEmpty) {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(dVar, View.SCALE_Y, f13));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f44378f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f44378f.setInterpolator(org.telegram.ui.Components.jr.h);
                this.f44378f.start();
            } else {
                if (!isEmpty) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                o6Var.setAlpha(f9);
                o6Var.setTranslationY(dp);
                if (!isEmpty) {
                    f14 = AndroidUtilities.dp(-12.0f);
                }
                dVar.setTranslationY(f14);
                if (!isEmpty) {
                    f10 = 0.87f;
                } else {
                    f10 = 1.0f;
                }
                dVar.setScaleX(f10);
                if (isEmpty) {
                    f13 = 1.0f;
                }
                dVar.setScaleY(f13);
            }
        }
        o6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        o6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f44376c;
        int i12 = 0;
        TextPaint paint = h5VarArr[0].getPaint();
        float dpf2 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i10 = 1912602624;
        } else {
            i10 = 0;
        }
        paint.setShadowLayer(dpf2, 0.0f, 1.0f, i10);
        TextPaint paint2 = h5VarArr[1].getPaint();
        float dpf22 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i11 = 1912602624;
        } else {
            i11 = 0;
        }
        paint2.setShadowLayer(dpf22, 0.0f, 1.0f, i11);
        org.telegram.ui.Components.n6 drawable = this.d.getDrawable();
        float dpf23 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i12 = 1912602624;
        }
        drawable.p(dpf23, 1.0f, i12);
    }

    public final void c(CharSequence charSequence) {
        boolean z10;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f44376c;
        boolean z11 = true;
        h5VarArr[1].setAlpha(0.0f);
        h5VarArr[1].setVisibility(8);
        CharSequence text = h5VarArr[0].getText();
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
            org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[0];
            h5Var.N = 0.0f;
            h5Var.b();
        }
        h5VarArr[0].k(charSequence);
        h5VarArr[0].setAlpha(1.0f);
        h5VarArr[0].setTranslationX(0.0f);
        h5VarArr[0].setTranslationY(0.0f);
    }

    public final void d(CharSequence charSequence, boolean z10, boolean z11) {
        boolean equals;
        int i10;
        Property property;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f44376c;
        CharSequence text = h5VarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (equals) {
            return;
        }
        AnimatorSet animatorSet = this.f44377e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f44377e = null;
        }
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5Var.getClass();
        h5Var.N = h5Var2.N;
        h5Var.b();
        h5VarArr[1].k(h5VarArr[0].getText());
        h5VarArr[1].setRightPadding((int) this.f44380r);
        org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[0];
        h5Var3.N = 0.0f;
        h5Var3.b();
        h5VarArr[0].k(charSequence);
        int dp = AndroidUtilities.dp(8.0f);
        if (z11) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        float f9 = dp * i10;
        h5VarArr[1].setTranslationX(0.0f);
        h5VarArr[1].setTranslationY(0.0f);
        if (z10) {
            h5VarArr[0].setTranslationX(0.0f);
            h5VarArr[0].setTranslationY(-f9);
        } else {
            h5VarArr[0].setTranslationX(-f9);
            h5VarArr[0].setTranslationY(0.0f);
        }
        h5VarArr[0].setAlpha(0.0f);
        h5VarArr[1].setAlpha(1.0f);
        h5VarArr[0].setVisibility(0);
        h5VarArr[1].setVisibility(0);
        ArrayList arrayList = new ArrayList();
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(h5VarArr[1], property2, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(h5VarArr[0], property2, 1.0f));
        org.telegram.ui.ActionBar.h5 h5Var4 = h5VarArr[1];
        Property property3 = View.TRANSLATION_X;
        Property property4 = View.TRANSLATION_Y;
        if (z10) {
            property = property4;
        } else {
            property = property3;
        }
        arrayList.add(ObjectAnimator.ofFloat(h5Var4, property, f9));
        org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[0];
        if (z10) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(h5Var5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f44377e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f44377e.addListener(new e50(this, 17));
        this.f44377e.setDuration(320L);
        this.f44377e.setInterpolator(org.telegram.ui.Components.jr.h);
        this.f44377e.start();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f44376c;
            h5VarArr[0].invalidate();
            h5VarArr[1].invalidate();
            this.d.invalidate();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f44374a.layout(0, AndroidUtilities.statusBarHeight, i12 - i10, i13 - i11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = AndroidUtilities.statusBarHeight;
        int i13 = this.f44381s;
        int i14 = AndroidUtilities.displaySize.y;
        if (i13 != i14) {
            this.f44381s = i14;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f44374a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i12, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
