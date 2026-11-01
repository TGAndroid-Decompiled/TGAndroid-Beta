package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class w60 extends ViewGroup {
    public AnimatorSet f42677a;
    public boolean f42678b;
    public final ArrayList f42679c;
    public org.telegram.ui.Components.s20 d;
    public int e;
    public final x60 f42680f;

    public w60(x60 x60Var, Context context) {
        super(context);
        this.f42680f = x60Var;
        this.f42679c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.s20 s20Var) {
        x60 x60Var = this.f42680f;
        x60Var.D.remove(s20Var.getKey());
        x60Var.E.remove(s20Var);
        s20Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f42677a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f42677a.setupEndValues();
            this.f42677a.cancel();
        }
        this.f42678b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f42677a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.jw0(4, (Object) this, (Object) s20Var));
        this.f42677a.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f42677a.setDuration(320L);
        this.d = s20Var;
        ArrayList arrayList = this.f42679c;
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
            arrayList = this.f42679c;
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
                if (!this.f42678b) {
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
        if (!this.f42678b) {
            AnimatorSet animatorSet = this.f42677a;
            if (animatorSet != null) {
                this.e = C2;
                animatorSet.playTogether(arrayList);
                this.f42677a.start();
                this.f42678b = true;
            } else {
                this.e = Math.max(C2, org.telegram.messenger.i0.L(28.0f) + i14 + L);
            }
        }
        x60 x60Var = this.f42680f;
        fe.f fVar = x60Var.f43264a;
        if (x60Var.E.isEmpty()) {
            min = 0.0f;
        } else {
            min = Math.min(C2, x60Var.f43272x);
        }
        fVar.a(min);
        setMeasuredDimension(size, this.e);
    }
}
