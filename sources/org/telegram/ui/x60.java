package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class x60 extends ViewGroup {
    public AnimatorSet f43452a;
    public boolean f43453b;
    public final ArrayList f43454c;
    public org.telegram.ui.Components.s20 d;
    public int e;
    public final y60 f43455f;

    public x60(y60 y60Var, Context context) {
        super(context);
        this.f43455f = y60Var;
        this.f43454c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.s20 s20Var) {
        y60 y60Var = this.f43455f;
        y60Var.D.remove(s20Var.getKey());
        y60Var.E.remove(s20Var);
        s20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f43452a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f43452a.setupEndValues();
            this.f43452a.cancel();
        }
        this.f43453b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f43452a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.iw0(4, (Object) this, (Object) s20Var));
        this.f43452a.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f43452a.setDuration(320L);
        this.d = s20Var;
        ArrayList arrayList = this.f43454c;
        arrayList.clear();
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_X, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.SCALE_Y, 1.0f, 0.75f));
        arrayList.add(ObjectAnimator.ofFloat(this.d, View.ALPHA, 1.0f, 0.0f));
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
        float min;
        int i12;
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(8.0f);
        int i13 = size - (L * 2);
        int i14 = L;
        int i15 = i14;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            arrayList = this.f43454c;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.s20) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(28.0f), 1073741824));
                if (childAt != this.d && childAt.getMeasuredWidth() + i18 > i13) {
                    i15 += org.telegram.messenger.i0.L(34.0f);
                    i18 = 0;
                }
                if (childAt.getMeasuredWidth() + i19 > i13) {
                    i14 += org.telegram.messenger.i0.L(34.0f);
                    i19 = 0;
                }
                int i20 = L + i18;
                if (!this.f43453b) {
                    org.telegram.ui.Components.s20 s20Var = this.d;
                    if (childAt == s20Var) {
                        childAt.setTranslationX(L + i19);
                        childAt.setTranslationY(i14);
                    } else if (s20Var != null) {
                        float f7 = i20;
                        if (childAt.getTranslationX() != f7) {
                            i12 = 1;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_X, f7));
                        } else {
                            i12 = 1;
                        }
                        float f10 = i15;
                        if (childAt.getTranslationY() != f10) {
                            float[] fArr = new float[i12];
                            fArr[0] = f10;
                            arrayList.add(ObjectAnimator.ofFloat(childAt, View.TRANSLATION_Y, fArr));
                        }
                    } else {
                        childAt.setTranslationX(i20);
                        childAt.setTranslationY(i15);
                    }
                }
                if (childAt != this.d) {
                    int C = org.telegram.messenger.m5.C(6.0f, childAt.getMeasuredWidth(), i18);
                    i17 = Math.max(i17, i15);
                    i18 = C;
                }
                i19 = org.telegram.messenger.m5.C(6.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        int C2 = org.telegram.messenger.m5.C(28.0f, i17, L);
        if (!this.f43453b) {
            AnimatorSet animatorSet = this.f43452a;
            if (animatorSet != null) {
                this.e = C2;
                animatorSet.playTogether(arrayList);
                this.f43452a.start();
                this.f43453b = true;
            } else {
                this.e = Math.max(C2, org.telegram.messenger.i0.L(28.0f) + i14 + L);
            }
        }
        y60 y60Var = this.f43455f;
        fe.f fVar = y60Var.f43732a;
        if (y60Var.E.isEmpty()) {
            min = 0.0f;
        } else {
            min = Math.min(C2, y60Var.f43740x);
        }
        fVar.a(min);
        setMeasuredDimension(size, this.e);
    }
}
