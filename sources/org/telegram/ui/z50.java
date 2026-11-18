package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class z50 extends ViewGroup {
    public AnimatorSet f54433a;
    public boolean f54434b;
    public final ArrayList f54435c;
    public org.telegram.ui.Components.m20 d;
    public int f54436e;
    public final a60 f54437f;

    public z50(a60 a60Var, Context context) {
        super(context);
        this.f54437f = a60Var;
        this.f54435c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.m20 m20Var) {
        a60 a60Var = this.f54437f;
        a60Var.E.remove(m20Var.getKey());
        a60Var.F.remove(m20Var);
        m20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f54433a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f54433a.setupEndValues();
            this.f54433a.cancel();
        }
        this.f54434b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f54433a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.h60(9, this, m20Var));
        this.f54433a.setInterpolator(org.telegram.ui.Components.lr.h);
        this.f54433a.setDuration(320L);
        this.d = m20Var;
        ArrayList arrayList = this.f54435c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 1.0f, 0.0f));
        requestLayout();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
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
            arrayList = this.f54435c;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Components.m20) {
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
                if (!this.f54434b) {
                    org.telegram.ui.Components.m20 m20Var = this.d;
                    if (childAt == m20Var) {
                        childAt.setTranslationX(L + i18);
                        childAt.setTranslationY(i13);
                    } else if (m20Var != null) {
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
                    int C = org.telegram.messenger.f3.C(6.0f, childAt.getMeasuredWidth(), i17);
                    i16 = Math.max(i16, i14);
                    i17 = C;
                }
                i18 = org.telegram.messenger.f3.C(6.0f, childAt.getMeasuredWidth(), i18);
            }
            i15++;
        }
        int C2 = org.telegram.messenger.f3.C(28.0f, i16, L);
        if (!this.f54434b) {
            AnimatorSet animatorSet = this.f54433a;
            if (animatorSet != null) {
                this.f54436e = C2;
                animatorSet.playTogether(arrayList);
                this.f54433a.start();
                this.f54434b = true;
            } else {
                this.f54436e = Math.max(C2, org.telegram.messenger.g0.L(28.0f) + i13 + L);
            }
        }
        a60 a60Var = this.f54437f;
        te.c cVar = a60Var.f45467a;
        if (a60Var.F.isEmpty()) {
            min = 0.0f;
        } else {
            min = Math.min(C2, a60Var.f45476x);
        }
        cVar.a(min);
        setMeasuredDimension(size, this.f54436e);
    }
}
