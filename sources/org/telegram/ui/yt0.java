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
public final class yt0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public final FrameLayout f44944a;
    public final dh.g f44945b;
    public final org.telegram.ui.ActionBar.h5[] f44946c;
    public final org.telegram.ui.Components.j6 d;
    public AnimatorSet f44947e;
    public AnimatorSet f44948f;
    public boolean h;
    public ValueAnimator f44949n;
    public float f44950r;
    public int f44951s;

    public yt0(Activity activity) {
        super(activity);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f44944a = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(56.0f), 0, 0, 0);
        addView(frameLayout, g7.e6.e(-1, -1, 119));
        dh.g gVar = new dh.g(activity, 24);
        this.f44945b = gVar;
        gVar.setPivotX(AndroidUtilities.dp(16.0f));
        gVar.setPadding(AndroidUtilities.dp(16.0f), 0, 0, 0);
        gVar.setClipToPadding(false);
        frameLayout.addView(gVar, g7.e6.e(-1, -1, 119));
        this.f44946c = new org.telegram.ui.ActionBar.h5[2];
        for (int i9 = 0; i9 < 2; i9++) {
            this.f44946c[i9] = new org.telegram.ui.ActionBar.h5(activity);
            this.f44946c[i9].setGravity(19);
            this.f44946c[i9].setTextColor(-1);
            this.f44946c[i9].setTextSize(20);
            this.f44946c[i9].setTypeface(AndroidUtilities.bold());
            this.f44946c[i9].setDrawablePadding(AndroidUtilities.dp(4.0f));
            this.f44946c[i9].setScrollNonFitText(true);
            this.f44945b.addView(this.f44946c[i9], g7.e6.e(-1, -2, 19));
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(activity, true, false, false);
        this.d = j6Var;
        j6Var.b(0.4f, 320L, org.telegram.ui.Components.gr.h);
        j6Var.setTextSize(AndroidUtilities.dp(14.0f));
        j6Var.setGravity(19);
        j6Var.setTextColor(-1);
        j6Var.setEllipsizeByGradient(true);
        j6Var.setImportantForAccessibility(1);
        j6Var.setAccessibilityLiveRegion(1);
        this.f44944a.addView(j6Var, g7.e6.d(-1, 20.0f, 51, 16.0f, 0.0f, 0.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, boolean z10) {
        boolean z11;
        int i9;
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean z12 = !isEmpty;
        boolean z13 = this.h;
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (z12 != z13) {
            this.h = z12;
            AnimatorSet animatorSet = this.f44948f;
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
                i9 = 30;
            } else {
                i9 = 33;
            }
            if (z11) {
                i10 = 6;
            } else {
                i10 = 0;
            }
            int dp = AndroidUtilities.dp(i9 - i10);
            float f14 = 0.87f;
            float f15 = 0.0f;
            dh.g gVar = this.f44945b;
            if (z10) {
                ArrayList arrayList = new ArrayList();
                if (!isEmpty) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(j6Var, View.ALPHA, f12));
                float[] fArr = {dp};
                Property property = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(j6Var, property, fArr));
                if (!isEmpty) {
                    f15 = AndroidUtilities.dp(-12.0f);
                }
                arrayList.add(ObjectAnimator.ofFloat(gVar, property, f15));
                if (!isEmpty) {
                    f13 = 0.87f;
                } else {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(gVar, View.SCALE_X, f13));
                if (isEmpty) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(gVar, View.SCALE_Y, f14));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f44948f = animatorSet2;
                animatorSet2.playTogether(arrayList);
                this.f44948f.setInterpolator(org.telegram.ui.Components.gr.h);
                this.f44948f.start();
            } else {
                if (!isEmpty) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                j6Var.setAlpha(f10);
                j6Var.setTranslationY(dp);
                if (!isEmpty) {
                    f15 = AndroidUtilities.dp(-12.0f);
                }
                gVar.setTranslationY(f15);
                if (!isEmpty) {
                    f11 = 0.87f;
                } else {
                    f11 = 1.0f;
                }
                gVar.setScaleX(f11);
                if (isEmpty) {
                    f14 = 1.0f;
                }
                gVar.setScaleY(f14);
            }
        }
        j6Var.c(charSequence, z10, true);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = null;
        }
        j6Var.setContentDescription(charSequence);
    }

    public final void b(boolean z10) {
        int i9;
        int i10;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f44946c;
        int i11 = 0;
        TextPaint paint = h5VarArr[0].getPaint();
        float dpf2 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i9 = 1912602624;
        } else {
            i9 = 0;
        }
        paint.setShadowLayer(dpf2, 0.0f, 1.0f, i9);
        TextPaint paint2 = h5VarArr[1].getPaint();
        float dpf22 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i10 = 1912602624;
        } else {
            i10 = 0;
        }
        paint2.setShadowLayer(dpf22, 0.0f, 1.0f, i10);
        org.telegram.ui.Components.i6 drawable = this.d.getDrawable();
        float dpf23 = AndroidUtilities.dpf2(0.66f);
        if (z10) {
            i11 = 1912602624;
        }
        drawable.p(dpf23, 1.0f, i11);
    }

    public final void c(CharSequence charSequence) {
        boolean z10;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f44946c;
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
        int i9;
        Property property;
        org.telegram.ui.ActionBar.h5[] h5VarArr = this.f44946c;
        CharSequence text = h5VarArr[0].getText();
        if (text == null) {
            equals = false;
        } else {
            equals = TextUtils.equals(text.toString(), charSequence.toString());
        }
        if (equals) {
            return;
        }
        AnimatorSet animatorSet = this.f44947e;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f44947e = null;
        }
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[1];
        org.telegram.ui.ActionBar.h5 h5Var2 = h5VarArr[0];
        h5Var.getClass();
        h5Var.N = h5Var2.N;
        h5Var.b();
        h5VarArr[1].k(h5VarArr[0].getText());
        h5VarArr[1].setRightPadding((int) this.f44950r);
        org.telegram.ui.ActionBar.h5 h5Var3 = h5VarArr[0];
        h5Var3.N = 0.0f;
        h5Var3.b();
        h5VarArr[0].k(charSequence);
        int dp = AndroidUtilities.dp(8.0f);
        if (z11) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        float f10 = dp * i9;
        h5VarArr[1].setTranslationX(0.0f);
        h5VarArr[1].setTranslationY(0.0f);
        if (z10) {
            h5VarArr[0].setTranslationX(0.0f);
            h5VarArr[0].setTranslationY(-f10);
        } else {
            h5VarArr[0].setTranslationX(-f10);
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
        arrayList.add(ObjectAnimator.ofFloat(h5Var4, property, f10));
        org.telegram.ui.ActionBar.h5 h5Var5 = h5VarArr[0];
        if (z10) {
            property3 = property4;
        }
        arrayList.add(ObjectAnimator.ofFloat(h5Var5, property3, 0.0f));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f44947e = animatorSet2;
        animatorSet2.playTogether(arrayList);
        this.f44947e.addListener(new bc0(this, 15));
        this.f44947e.setDuration(320L);
        this.f44947e.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f44947e.start();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            org.telegram.ui.ActionBar.h5[] h5VarArr = this.f44946c;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        this.f44944a.layout(0, AndroidUtilities.statusBarHeight, i11 - i9, i12 - i10);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        int i11 = AndroidUtilities.statusBarHeight;
        int i12 = this.f44951s;
        int i13 = AndroidUtilities.displaySize.y;
        if (i12 != i13) {
            this.f44951s = i13;
            this.h = !this.h;
            a(this.d.getText(), false);
        }
        this.f44944a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - i11, 1073741824));
        setMeasuredDimension(size, size2);
    }
}
