package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class y50 extends ViewGroup {
    public AnimatorSet f52091a;
    public boolean f52092b;
    public final ArrayList f52093c;
    public org.telegram.ui.Components.c20 d;
    public int f52094e;
    public final z50 f52095f;

    public y50(z50 z50Var, Context context) {
        super(context);
        this.f52095f = z50Var;
        this.f52093c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.c20 c20Var) {
        z50 z50Var = this.f52095f;
        z50Var.D.remove(c20Var.getKey());
        z50Var.E.remove(c20Var);
        c20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f52091a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f52091a.setupEndValues();
            this.f52091a.cancel();
        }
        this.f52092b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f52091a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.v50(9, this, c20Var));
        this.f52091a.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f52091a.setDuration(320L);
        this.d = c20Var;
        ArrayList arrayList = this.f52093c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ArrayList arrayList;
        float min;
        int i11;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i12 = size - (L * 2);
        int i13 = L;
        int i14 = i13;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            arrayList = this.f52093c;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Components.c20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(28.0f), 1073741824));
                if (childAt != this.d && childAt.getMeasuredWidth() + i17 > i12) {
                    i14 += org.telegram.messenger.g0.L(34.0f);
                    i17 = 0;
                }
                if (childAt.getMeasuredWidth() + i18 > i12) {
                    i13 += org.telegram.messenger.g0.L(34.0f);
                    i18 = 0;
                }
                int i19 = L + i17;
                if (!this.f52092b) {
                    org.telegram.ui.Components.c20 c20Var = this.d;
                    if (childAt == c20Var) {
                        childAt.setTranslationX(L + i18);
                        childAt.setTranslationY(i13);
                    } else if (c20Var != null) {
                        float f10 = i19;
                        if (childAt.getTranslationX() != f10) {
                            i11 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f10));
                        } else {
                            i11 = 1;
                        }
                        float f11 = i14;
                        if (childAt.getTranslationY() != f11) {
                            float[] fArr = new float[i11];
                            fArr[0] = f11;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(i19);
                        childAt.setTranslationY(i14);
                    }
                }
                if (childAt != this.d) {
                    int C = org.telegram.messenger.k5.C(6.0f, childAt.getMeasuredWidth(), i17);
                    i16 = Math.max(i16, i14);
                    i17 = C;
                }
                i18 = org.telegram.messenger.k5.C(6.0f, childAt.getMeasuredWidth(), i18);
            }
            i15++;
        }
        int C2 = org.telegram.messenger.k5.C(28.0f, i16, L);
        if (!this.f52092b) {
            AnimatorSet animatorSet = this.f52091a;
            if (animatorSet != null) {
                this.f52094e = C2;
                animatorSet.playTogether(arrayList);
                this.f52091a.start();
                this.f52092b = true;
            } else {
                this.f52094e = Math.max(C2, org.telegram.messenger.g0.L(28.0f) + i13 + L);
            }
        }
        z50 z50Var = this.f52095f;
        te.c cVar = z50Var.f52475a;
        if (z50Var.E.isEmpty()) {
            min = 0.0f;
        } else {
            min = Math.min(C2, z50Var.f52484x);
        }
        cVar.a(min);
        setMeasuredDimension(size, this.f52094e);
    }
}
