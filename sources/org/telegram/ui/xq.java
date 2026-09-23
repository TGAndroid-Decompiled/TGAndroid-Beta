package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class xq implements ViewTreeObserver.OnPreDrawListener {
    public final int f39640a;
    public final View f39641b;
    public final int f39642c;
    public final Object d;

    public xq(Object obj, org.telegram.ui.Components.u00 u00Var, int i10, int i11) {
        this.f39640a = i11;
        this.d = obj;
        this.f39641b = u00Var;
        this.f39642c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f7;
        int i10 = this.f39640a;
        int i11 = this.f39642c;
        Object obj = this.d;
        View view = this.f39641b;
        float f10 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        switch (i10) {
            case 0:
                qr qrVar = (qr) obj;
                qrVar.f36551c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = qrVar.f36551c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = qrVar.f36551c.getChildAt(i14);
                    if (childAt != view) {
                        qrVar.f36551c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(qrVar.f36551c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / qrVar.f36551c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    qrVar.f36551c.addView(view);
                    s4.o0 layoutManager = qrVar.f36551c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new u4(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                org.telegram.ui.Components.ok okVar = (org.telegram.ui.Components.ok) obj;
                org.telegram.ui.Components.pk pkVar = okVar.X;
                pkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = pkVar.f27068r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = pkVar.f27068r.getChildAt(i15);
                    if (view != null) {
                        pkVar.f27068r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                        }
                    }
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(pkVar.f27068r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / pkVar.f27068r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.mk(this));
                okVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    pkVar.f27068r.addView(view);
                    s4.o0 layoutManager2 = pkVar.f27068r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.mk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.rk0 rk0Var = (org.telegram.ui.Components.rk0) obj;
                SparseArray sparseArray = rk0Var.f27658b;
                org.telegram.ui.Components.ml0 ml0Var = rk0Var.f27657a;
                ml0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                rk0Var.h.remove(this);
                int childCount3 = ml0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt3 = ml0Var.getChildAt(i16);
                    ml0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        rk0Var.d = true;
                        ml0Var.invalidate();
                        int min = (int) ((Math.min(ml0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / ml0Var.getMeasuredHeight()) * 100.0f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, R, 5));
                        ofFloat5.addListener(new ei.v2(this, R, 9));
                        ofFloat5.setStartDelay(min);
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                }
                rk0Var.f27661g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.qk0(0, this, animatorSet3));
                return false;
            default:
                u10 u10Var = (u10) obj;
                u10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ai.w0 w0Var = u10Var.f37846b;
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
                animatorSet4.addListener(new k10(this));
                u10Var.f37859l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    w0Var.addView(view);
                    s4.o0 layoutManager3 = w0Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new k10(this, layoutManager3));
                        ofFloat7.start();
                        return true;
                    }
                }
                return true;
        }
    }
}
