package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class s70 extends ViewGroup {

    public AnimatorSet f42538a;

    public boolean f42539b;

    public final ArrayList f42540c;
    public org.telegram.ui.Components.a30 d;

    public org.telegram.ui.Components.a30 f42541e;

    public int f42542f;
    public final t70 h;

    public s70(t70 t70Var, Context context) {
        super(context);
        this.h = t70Var;
        this.f42540c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.a30 a30Var) {
        t70 t70Var = this.h;
        t70Var.v = true;
        t70Var.B.remove(a30Var.getKey());
        t70Var.C.remove(a30Var);
        a30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f42538a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f42538a.setupEndValues();
            this.f42538a.cancel();
        }
        this.f42539b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f42538a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.fk0(7, this, a30Var));
        this.f42538a.setInterpolator(org.telegram.ui.Components.er.h);
        this.f42538a.setDuration(320L);
        this.f42541e = a30Var;
        ArrayList arrayList = this.f42540c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.f42541e, (Property<org.telegram.ui.Components.a30, Float>) View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f42541e, (Property<org.telegram.ui.Components.a30, Float>) View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.f42541e, (Property<org.telegram.ui.Components.a30, Float>) View.ALPHA, 1.0f, 0.0f));
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
        int iX;
        int iMax;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int iDp = size - AndroidUtilities.dp(26.0f);
        int iDp2 = AndroidUtilities.dp(6.0f);
        int iDp3 = AndroidUtilities.dp(6.0f);
        int i12 = 0;
        int iMax2 = 0;
        int iC = 0;
        int iC2 = 0;
        while (true) {
            arrayList = this.f42540c;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt instanceof org.telegram.ui.Components.a30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                if (childAt != this.f42541e && childAt.getMeasuredWidth() + iC > iDp) {
                    iDp2 += AndroidUtilities.dp(34.0f);
                    iC = 0;
                }
                if (childAt.getMeasuredWidth() + iC2 > iDp) {
                    iDp3 += AndroidUtilities.dp(34.0f);
                    iC2 = 0;
                }
                int iDp4 = AndroidUtilities.dp(5.0f) + iC;
                if (!this.f42539b) {
                    org.telegram.ui.Components.a30 a30Var = this.f42541e;
                    if (childAt == a30Var) {
                        childAt.setTranslationX(AndroidUtilities.dp(5.0f) + iC2);
                        childAt.setTranslationY(iDp3);
                    } else if (a30Var != null) {
                        float f10 = iDp4;
                        if (childAt.getTranslationX() != f10) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_X, f10));
                        }
                        float f11 = iDp2;
                        if (childAt.getTranslationY() != f11) {
                            arrayList.add(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.TRANSLATION_Y, f11));
                        }
                        iMax2 = Math.max(iMax2, iDp2);
                    } else {
                        childAt.setTranslationX(iDp4);
                        childAt.setTranslationY(iDp2);
                        iMax2 = Math.max(iMax2, iDp2);
                    }
                }
                if (childAt != this.f42541e) {
                    iC = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), iC);
                }
                iC2 = org.telegram.messenger.y1.C(9.0f, childAt.getMeasuredWidth(), iC2);
            }
            i12++;
        }
        int i13 = 3;
        if (AndroidUtilities.isTablet()) {
            iX = AndroidUtilities.dp(372.0f) / 3;
        } else {
            Point point = AndroidUtilities.displaySize;
            iX = org.telegram.messenger.rl.x(158.0f, Math.min(point.x, point.y), 3);
        }
        int iDp5 = iMax2 > 0 ? AndroidUtilities.dp(34.0f) + iMax2 : 0;
        t70 t70Var = this.h;
        boolean z10 = iDp5 > t70Var.f42803x - AndroidUtilities.dp(12.0f);
        if (iDp - iC < iX && !z10) {
            iDp2 += AndroidUtilities.dp(34.0f);
            iMax2 = Math.max(iMax2, iDp2);
            iC = 0;
        }
        boolean z11 = (iMax2 > 0 ? AndroidUtilities.dp(34.0f) + iMax2 : 0) > t70Var.f42803x - AndroidUtilities.dp(12.0f);
        if (!this.f42539b) {
            int iDp6 = AndroidUtilities.dp(28.0f) + iDp3;
            t70Var.E = iDp2;
            if (this.f42538a != null) {
                this.f42542f = AndroidUtilities.dp(28.0f) + iDp2;
                this.f42538a.playTogether(arrayList);
                this.f42538a.start();
                this.f42539b = true;
            } else {
                this.f42542f = iDp6;
            }
        }
        if (z11) {
            iMax = t70Var.f42803x - AndroidUtilities.dp(12.0f);
        } else {
            iMax = Math.max(AndroidUtilities.dp(37.0f), Math.min(iMax2 > 0 ? AndroidUtilities.dp(31.0f) + iMax2 : 0, t70Var.f42803x - AndroidUtilities.dp(12.0f)));
        }
        t70Var.f42795b.a(iMax);
        r70 r70Var = t70Var.d;
        if (r70Var != null) {
            int iMax3 = Math.max(0, childCount - (this.f42541e != null ? 1 : 0));
            float fD = i0.a.d(6.0f, iMax2, 0);
            float f12 = iC;
            boolean z12 = iMax3 <= 0;
            float fMax = 0.0f;
            ViewPropertyAnimator viewPropertyAnimatorScaleY = r70Var.f41829c.animate().alpha(z12 ? 1.0f : 0.0f).scaleX(z12 ? 1.0f : 0.5f).scaleY(z12 ? 1.0f : 0.5f);
            org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
            org.telegram.messenger.rl.o(viewPropertyAnimatorScaleY, erVar, 320L);
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = r70Var.d.animate().translationY(z11 ? ((r70Var.getHeight() - r70Var.getPaddingTop()) - r70Var.getPaddingBottom()) - AndroidUtilities.dp(44.0f) : fD);
            if (z11) {
                fMax = AndroidUtilities.dp(-36.0f);
            } else if (iMax3 > 0) {
                fMax = Math.max(-AndroidUtilities.dp(36.0f), f12 - AndroidUtilities.dp(46.0f));
            }
            viewPropertyAnimatorTranslationY.translationX(fMax).setInterpolator(erVar).setDuration(320L).start();
            r70Var.f41831f.f42797e.post(new e0(r70Var, fD, i13));
        }
        setMeasuredDimension(size, this.f42542f);
    }
}
