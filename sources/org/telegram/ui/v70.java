package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class v70 extends ViewGroup {
    public AnimatorSet f44730a;
    public boolean f44731b;
    public final ArrayList f44732c;
    public org.telegram.ui.Components.x30 d;
    public int e;
    public final w70 f44733f;

    public v70(w70 w70Var, Context context) {
        super(context);
        this.f44733f = w70Var;
        this.f44732c = new ArrayList();
    }

    public final void a(org.telegram.ui.Components.x30 x30Var) {
        w70 w70Var = this.f44733f;
        w70Var.f45002y.remove(x30Var.getKey());
        w70Var.E.remove(x30Var);
        x30Var.setOnClickListener(null);
        AnimatorSet animatorSet = this.f44730a;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f44730a.setupEndValues();
            this.f44730a.cancel();
        }
        this.f44731b = false;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f44730a = animatorSet2;
        animatorSet2.addListener(new org.telegram.ui.Components.ll0(8, this, x30Var));
        this.f44730a.setInterpolator(org.telegram.ui.Components.ds.h);
        this.f44730a.setDuration(320L);
        this.d = x30Var;
        ArrayList arrayList = this.f44732c;
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
        int dp = AndroidUtilities.dp(8.0f);
        int i13 = size - (dp * 2);
        int i14 = dp;
        int i15 = i14;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            arrayList = this.f44732c;
            if (i16 >= childCount) {
                break;
            }
            View childAt = getChildAt(i16);
            if (childAt instanceof org.telegram.ui.Components.x30) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(28.0f), 1073741824));
                if (childAt != this.d && childAt.getMeasuredWidth() + i18 > i13) {
                    i15 += AndroidUtilities.dp(34.0f);
                    i18 = 0;
                }
                if (childAt.getMeasuredWidth() + i19 > i13) {
                    i14 += AndroidUtilities.dp(34.0f);
                    i19 = 0;
                }
                int i20 = dp + i18;
                if (!this.f44731b) {
                    org.telegram.ui.Components.x30 x30Var = this.d;
                    if (childAt == x30Var) {
                        childAt.setTranslationX(dp + i19);
                        childAt.setTranslationY(i14);
                    } else if (x30Var != null) {
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
                    int D = org.telegram.messenger.t.D(6.0f, childAt.getMeasuredWidth(), i18);
                    i17 = Math.max(i17, i15);
                    i18 = D;
                }
                i19 = org.telegram.messenger.t.D(6.0f, childAt.getMeasuredWidth(), i19);
            }
            i16++;
        }
        int D2 = org.telegram.messenger.t.D(28.0f, i17, dp);
        if (!this.f44731b) {
            AnimatorSet animatorSet = this.f44730a;
            if (animatorSet != null) {
                this.e = D2;
                animatorSet.playTogether(arrayList);
                this.f44730a.start();
                this.f44731b = true;
            } else {
                this.e = Math.max(D2, AndroidUtilities.dp(28.0f) + i14 + dp);
            }
        }
        w70 w70Var = this.f44733f;
        oe.e eVar = w70Var.f44993a;
        if (w70Var.E.isEmpty()) {
            min = 0.0f;
        } else {
            min = Math.min(D2, w70Var.f45000w);
        }
        eVar.a(min);
        setMeasuredDimension(size, this.e);
    }
}
