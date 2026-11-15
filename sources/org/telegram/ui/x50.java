package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class x50 extends ViewGroup {
    public AnimatorSet f53097a;
    public boolean f53098b;
    public final ArrayList f53099c;
    public org.telegram.ui.Components.f20 d;
    public int f53100e;
    public final y50 f53101f;

    public x50(y50 y50Var, Context context) {
        super(context);
        this.f53101f = y50Var;
        this.f53099c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.f20 f20Var) {
        y50 y50Var = this.f53101f;
        y50Var.E.remove(f20Var.getKey());
        y50Var.F.remove(f20Var);
        f20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f53097a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f53097a.setupEndValues();
            this.f53097a.cancel();
        }
        this.f53098b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f53097a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.y50(9, this, f20Var));
        this.f53097a.setInterpolator(org.telegram.ui.Components.er.h);
        this.f53097a.setDuration(320L);
        this.d = f20Var;
        ArrayList arrayList = this.f53099c;
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
            arrayList = this.f53099c;
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            if (childAt instanceof org.telegram.ui.Components.f20) {
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
                if (!this.f53098b) {
                    org.telegram.ui.Components.f20 f20Var = this.d;
                    if (childAt == f20Var) {
                        childAt.setTranslationX(L + i18);
                        childAt.setTranslationY(i13);
                    } else if (f20Var != null) {
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
        if (!this.f53098b) {
            AnimatorSet animatorSet = this.f53097a;
            if (animatorSet != null) {
                this.f53100e = C2;
                animatorSet.playTogether(arrayList);
                this.f53097a.start();
                this.f53098b = true;
            } else {
                this.f53100e = Math.max(C2, org.telegram.messenger.g0.L(28.0f) + i13 + L);
            }
        }
        y50 y50Var = this.f53101f;
        te.c cVar = y50Var.f53421a;
        if (y50Var.F.isEmpty()) {
            min = 0.0f;
        } else {
            min = Math.min(C2, y50Var.f53430x);
        }
        cVar.a(min);
        setMeasuredDimension(size, this.f53100e);
    }
}
