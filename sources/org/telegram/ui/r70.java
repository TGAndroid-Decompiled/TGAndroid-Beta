package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class r70 extends ViewGroup {
    public AnimatorSet f41986a;
    public boolean f41987b;
    public final ArrayList f41988c;
    public org.telegram.ui.Components.j30 d;
    public org.telegram.ui.Components.j30 f41989e;
    public int f41990f;
    public final s70 h;

    public r70(s70 s70Var, Context context) {
        super(context);
        this.h = s70Var;
        this.f41988c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.j30 j30Var) {
        s70 s70Var = this.h;
        s70Var.v = true;
        s70Var.B.remove(j30Var.getKey());
        s70Var.C.remove(j30Var);
        j30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f41986a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f41986a.setupEndValues();
            this.f41986a.cancel();
        }
        this.f41987b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f41986a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.ok0(8, this, j30Var));
        this.f41986a.setInterpolator(org.telegram.ui.Components.jr.h);
        this.f41986a.setDuration(320L);
        this.f41989e = j30Var;
        ArrayList arrayList = this.f41988c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f41989e, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41989e, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f41989e, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        ArrayList arrayList;
        boolean z10;
        int x4;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int max;
        int i15;
        float f9;
        float f10;
        float f11;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int dp = size - AndroidUtilities.dp(26.0f);
        int dp2 = AndroidUtilities.dp(6.0f);
        int dp3 = AndroidUtilities.dp(6.0f);
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            arrayList = this.f41988c;
            z10 = true;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.j30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                if (childAt != this.f41989e && childAt.getMeasuredWidth() + i18 > dp) {
                    dp2 += AndroidUtilities.dp(34.0f);
                    i18 = 0;
                }
                if (childAt.getMeasuredWidth() + i19 > dp) {
                    dp3 += AndroidUtilities.dp(34.0f);
                    i19 = 0;
                }
                int dp4 = AndroidUtilities.dp(5.0f) + i18;
                if (!this.f41987b) {
                    org.telegram.ui.Components.j30 j30Var = this.f41989e;
                    if (childAt == j30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + i19);
                        childAt.setTranslationY(dp3);
                    } else if (j30Var != null) {
                        float f12 = dp4;
                        if (childAt.getTranslationX() != f12) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f12));
                        }
                        float f13 = dp2;
                        if (childAt.getTranslationY() != f13) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, f13));
                        }
                        i17 = Math.max(i17, dp2);
                    } else {
                        childAt.setTranslationX(dp4);
                        childAt.setTranslationY(dp2);
                        i17 = Math.max(i17, dp2);
                    }
                }
                if (childAt != this.f41989e) {
                    i18 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i18);
                }
                i19 = org.telegram.messenger.x3.C(9.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        if (AndroidUtilities.isTablet()) {
            x4 = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            x4 = b.x(158.0f, Math.min(point.x, point.y), 3);
        }
        if (i17 > 0) {
            i12 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i12 = 0;
        }
        s70 s70Var = this.h;
        if (i12 > s70Var.f42302x - AndroidUtilities.dp(12.0f)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (dp - i18 < x4 && !z11) {
            dp2 += AndroidUtilities.dp(34.0f);
            i17 = Math.max(i17, dp2);
            i18 = 0;
        }
        if (i17 > 0) {
            i13 = AndroidUtilities.dp(34.0f) + i17;
        } else {
            i13 = 0;
        }
        if (i13 > s70Var.f42302x - AndroidUtilities.dp(12.0f)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!this.f41987b) {
            int dp5 = AndroidUtilities.dp(28.0f) + dp3;
            s70Var.E = dp2;
            if (this.f41986a != null) {
                this.f41990f = AndroidUtilities.dp(28.0f) + dp2;
                this.f41986a.playTogether(arrayList);
                this.f41986a.start();
                this.f41987b = true;
            } else {
                this.f41990f = dp5;
            }
        }
        if (z12) {
            max = s70Var.f42302x - AndroidUtilities.dp(12.0f);
        } else {
            int dp6 = AndroidUtilities.dp(37.0f);
            if (i17 > 0) {
                i14 = AndroidUtilities.dp(31.0f) + i17;
            } else {
                i14 = 0;
            }
            max = Math.max(dp6, Math.min(i14, s70Var.f42302x - AndroidUtilities.dp(12.0f)));
        }
        s70Var.f42294b.a(max);
        q70 q70Var = s70Var.d;
        if (q70Var != null) {
            if (this.f41989e != null) {
                i15 = 1;
            } else {
                i15 = 0;
            }
            int max2 = Math.max(0, childCount - i15);
            float d = j7.l1.d(6.0f, i17, 0);
            float f14 = i18;
            if (max2 > 0) {
                z10 = false;
            }
            ViewPropertyAnimator animate = q70Var.f41557c.animate();
            float f15 = 0.0f;
            float f16 = 1.0f;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f9);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f10);
            if (!z10) {
                f16 = 0.5f;
            }
            ViewPropertyAnimator scaleY = scaleX.scaleY(f16);
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
            b.q(scaleY, jrVar, 320L);
            ViewPropertyAnimator animate2 = q70Var.d.animate();
            if (z12) {
                f11 = ((q70Var.getHeight() - q70Var.getPaddingTop()) - q70Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f);
            } else {
                f11 = d;
            }
            ViewPropertyAnimator translationY = animate2.translationY(f11);
            if (z12) {
                f15 = AndroidUtilities.dp(-36.0f);
            } else if (max2 > 0) {
                f15 = Math.max(-AndroidUtilities.dp(36.0f), f14 - AndroidUtilities.dp(46.0f));
            }
            translationY.translationX(f15).setInterpolator(jrVar).setDuration(320L).start();
            q70Var.f41559f.f42296e.post(new e0(q70Var, d, 3));
        }
        setMeasuredDimension(size, this.f41990f);
    }
}
