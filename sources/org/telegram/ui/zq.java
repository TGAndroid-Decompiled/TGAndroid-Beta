package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class zq implements ViewTreeObserver.OnPreDrawListener {
    public final int f45042a;
    public final View f45043b;
    public final int f45044c;
    public final Object d;

    public zq(Object obj, org.telegram.ui.Components.j10 j10Var, int i10, int i11) {
        this.f45042a = i11;
        this.d = obj;
        this.f45043b = j10Var;
        this.f45044c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f7;
        float f10;
        int i10;
        int i11 = this.f45042a;
        int i12 = this.f45044c;
        Object obj = this.d;
        View view = this.f45043b;
        float f11 = 0.0f;
        int i13 = 2;
        int i14 = 0;
        switch (i11) {
            case 0:
                tr trVar = (tr) obj;
                trVar.f42056c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = trVar.f42056c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = trVar.f42056c.getChildAt(i15);
                    if (childAt != view) {
                        trVar.f42056c.getClass();
                        if (RecyclerView.R(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(trVar.f42056c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / trVar.f42056c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    trVar.f42056c.addView(view);
                    s4.p0 layoutManager = trVar.f42056c.getLayoutManager();
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
                float f12 = 0.0f;
                org.telegram.ui.Components.rk rkVar = (org.telegram.ui.Components.rk) obj;
                org.telegram.ui.Components.sk skVar = rkVar.X;
                skVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = skVar.f30837r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt2 = skVar.f30837r.getChildAt(i16);
                    if (view != null) {
                        skVar.f30837r.getClass();
                        if (RecyclerView.R(childAt2) < i12) {
                            i16++;
                            f12 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f12);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(skVar.f30837r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / skVar.f30837r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i16++;
                    f12 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.pk(this));
                rkVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    skVar.f30837r.addView(view);
                    s4.p0 layoutManager2 = skVar.f30837r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.pk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i17 = 0;
                org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) obj;
                SparseArray sparseArray = vl0Var.f31817b;
                org.telegram.ui.Components.qm0 qm0Var = vl0Var.f31816a;
                qm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                vl0Var.h.remove(this);
                int childCount3 = qm0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i18 = 0;
                while (i18 < childCount3) {
                    View childAt3 = qm0Var.getChildAt(i18);
                    qm0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        vl0Var.d = true;
                        qm0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, R, 5));
                        ofFloat5.addListener(new ei.v2(this, R, 10));
                        ofFloat5.setStartDelay((int) ((Math.min(qm0Var.getMeasuredHeight(), Math.max(i17, childAt3.getTop())) / qm0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i18++;
                    i17 = 0;
                }
                vl0Var.f31821g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.ul0(0, this, animatorSet3));
                return false;
            default:
                w10 w10Var = (w10) obj;
                w10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ai.w0 w0Var = w10Var.f43042b;
                int childCount4 = w0Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i19 = 0;
                while (i19 < childCount4) {
                    View childAt4 = w0Var.getChildAt(i19);
                    if (view != null) {
                        w0Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.R(childAt4) < i12) {
                            f10 = f11;
                            i10 = i14;
                            i19++;
                            f11 = f10;
                            i14 = i10;
                            i13 = 2;
                        }
                    } else {
                        f7 = 100.0f;
                    }
                    childAt4.setAlpha(f11);
                    f10 = f11;
                    i10 = i14;
                    float[] fArr = new float[i13];
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, View.ALPHA, fArr);
                    ofFloat6.setStartDelay((int) ((Math.min(w0Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / w0Var.getMeasuredHeight()) * f7));
                    ofFloat6.setDuration(200L);
                    Animator[] animatorArr = new Animator[1];
                    animatorArr[i10] = ofFloat6;
                    animatorSet4.playTogether(animatorArr);
                    i19++;
                    f11 = f10;
                    i14 = i10;
                    i13 = 2;
                }
                float f13 = f11;
                int i20 = i14;
                animatorSet4.addListener(new m10(this));
                w10Var.f43056l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    w0Var.addView(view);
                    s4.p0 layoutManager3 = w0Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i20] = view.getAlpha();
                        fArr2[1] = f13;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr2);
                        ofFloat7.addListener(new m10(this, layoutManager3));
                        ofFloat7.start();
                        return true;
                    }
                }
                return true;
        }
    }
}
