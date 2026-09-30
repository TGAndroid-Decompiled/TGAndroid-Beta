package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class wq implements ViewTreeObserver.OnPreDrawListener {
    public final int f39835a;
    public final View f39836b;
    public final int f39837c;
    public final Object d;

    public wq(Object obj, org.telegram.ui.Components.w00 w00Var, int i10, int i11) {
        this.f39835a = i11;
        this.d = obj;
        this.f39836b = w00Var;
        this.f39837c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f7;
        int i10 = this.f39835a;
        int i11 = this.f39837c;
        Object obj = this.d;
        View view = this.f39836b;
        float f10 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        switch (i10) {
            case 0:
                pr prVar = (pr) obj;
                prVar.f36715c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = prVar.f36715c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = prVar.f36715c.getChildAt(i14);
                    if (childAt != view) {
                        prVar.f36715c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(prVar.f36715c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / prVar.f36715c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    prVar.f36715c.addView(view);
                    s4.o0 layoutManager = prVar.f36715c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new t4(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.qk qkVar = (org.telegram.ui.Components.qk) obj;
                org.telegram.ui.Components.rk rkVar = qkVar.X;
                rkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = rkVar.f28045r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = rkVar.f28045r.getChildAt(i15);
                    if (view != null) {
                        rkVar.f28045r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                        }
                    }
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(rkVar.f28045r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / rkVar.f28045r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.ok(this));
                qkVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    rkVar.f28045r.addView(view);
                    s4.o0 layoutManager2 = rkVar.f28045r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.ok(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.el0 el0Var = (org.telegram.ui.Components.el0) obj;
                SparseArray sparseArray = el0Var.f24005b;
                org.telegram.ui.Components.zl0 zl0Var = el0Var.f24004a;
                zl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                el0Var.h.remove(this);
                int childCount3 = zl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt3 = zl0Var.getChildAt(i16);
                    zl0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        el0Var.d = true;
                        zl0Var.invalidate();
                        int min = (int) ((Math.min(zl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / zl0Var.getMeasuredHeight()) * 100.0f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.p2(this, R, 5));
                        ofFloat5.addListener(new ei.v2(this, R, 9));
                        ofFloat5.setStartDelay(min);
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                }
                el0Var.f24008g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.dl0(0, this, animatorSet3));
                return false;
            default:
                t10 t10Var = (t10) obj;
                t10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ai.w0 w0Var = t10Var.f38029b;
                int childCount4 = w0Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = w0Var.getChildAt(i17);
                    if (view != null) {
                        w0Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.R(childAt4) < i11) {
                            i17++;
                            f10 = 0.0f;
                            i12 = 2;
                            i13 = 0;
                        }
                    } else {
                        f7 = 100.0f;
                    }
                    childAt4.setAlpha(f10);
                    float[] fArr = new float[i12];
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, View.ALPHA, fArr);
                    ofFloat6.setStartDelay((int) ((Math.min(w0Var.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / w0Var.getMeasuredHeight()) * f7));
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i17++;
                    f10 = 0.0f;
                    i12 = 2;
                    i13 = 0;
                }
                animatorSet4.addListener(new j10(this));
                t10Var.f38042l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    w0Var.addView(view);
                    s4.o0 layoutManager3 = w0Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new j10(this, layoutManager3));
                        ofFloat7.start();
                        return true;
                    }
                }
                return true;
        }
    }
}
