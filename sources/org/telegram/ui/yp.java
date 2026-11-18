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
public final class yp implements ViewTreeObserver.OnPreDrawListener {
    public final int f54263a;
    public final View f54264b;
    public final int f54265c;
    public final Object d;

    public yp(Object obj, org.telegram.ui.Components.wz wzVar, int i7, int i10) {
        this.f54263a = i10;
        this.d = obj;
        this.f54264b = wzVar;
        this.f54265c = i7;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f10;
        float f11;
        int i7;
        int i10 = this.f54263a;
        int i11 = this.f54265c;
        Object obj = this.d;
        View view = this.f54264b;
        float f12 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z11 = true;
        switch (i10) {
            case 0:
                rq rqVar = (rq) obj;
                rqVar.f51733c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = rqVar.f51733c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = rqVar.f51733c.getChildAt(i14);
                    if (childAt != view) {
                        rqVar.f51733c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(rqVar.f51733c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / rqVar.f51733c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    rqVar.f51733c.addView(view);
                    v4.p0 layoutManager = rqVar.f51733c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new org.telegram.ui.Cells.x9(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z10;
                    }
                }
                z10 = true;
                animatorSet.start();
                return z10;
            case 1:
                float f13 = 0.0f;
                org.telegram.ui.Components.jk jkVar = (org.telegram.ui.Components.jk) obj;
                org.telegram.ui.Components.kk kkVar = jkVar.Y;
                kkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = kkVar.f36781r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt2 = kkVar.f36781r.getChildAt(i15);
                    if (view != null) {
                        kkVar.f36781r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                            i15++;
                            f13 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f13);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(kkVar.f36781r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / kkVar.f36781r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i15++;
                    f13 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.hk(this));
                jkVar.V.d();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    kkVar.f36781r.addView(view);
                    v4.p0 layoutManager2 = kkVar.f36781r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.hk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i16 = 0;
                org.telegram.ui.Components.fj0 fj0Var = (org.telegram.ui.Components.fj0) obj;
                SparseArray sparseArray = fj0Var.f35121b;
                org.telegram.ui.Components.ck0 ck0Var = fj0Var.f35120a;
                ck0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                fj0Var.h.remove(this);
                int childCount3 = ck0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                while (i13 < childCount3) {
                    View childAt3 = ck0Var.getChildAt(i13);
                    ck0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        fj0Var.d = z11;
                        ck0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.k2(this, R, 5));
                        ofFloat5.addListener(new ki.f2(this, R, 12));
                        ofFloat5.setStartDelay((int) ((Math.min(ck0Var.getMeasuredHeight(), Math.max(i16, childAt3.getTop())) / ck0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i13++;
                    z11 = true;
                    i16 = 0;
                }
                fj0Var.f35125g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.h60(3, this, animatorSet3));
                return false;
            default:
                c00 c00Var = (c00) obj;
                c00Var.getViewTreeObserver().removeOnPreDrawListener(this);
                et etVar = c00Var.f46331b;
                int childCount4 = etVar.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = etVar.getChildAt(i17);
                    if (view != null) {
                        etVar.getClass();
                        f10 = 100.0f;
                        if (RecyclerView.R(childAt4) < i11) {
                            f11 = f12;
                            i7 = i13;
                            i17++;
                            f12 = f11;
                            i13 = i7;
                            i12 = 2;
                        }
                    } else {
                        f10 = 100.0f;
                    }
                    childAt4.setAlpha(f12);
                    f11 = f12;
                    i7 = i13;
                    float[] fArr = new float[i12];
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, View.ALPHA, fArr);
                    ofFloat6.setStartDelay((int) ((Math.min(etVar.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / etVar.getMeasuredHeight()) * f10));
                    ofFloat6.setDuration(200L);
                    Animator[] animatorArr = new Animator[1];
                    animatorArr[i7] = ofFloat6;
                    animatorSet4.playTogether(animatorArr);
                    i17++;
                    f12 = f11;
                    i13 = i7;
                    i12 = 2;
                }
                float f14 = f12;
                int i18 = i13;
                animatorSet4.addListener(new sz(this));
                c00Var.m0.d();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    etVar.addView(view);
                    v4.p0 layoutManager3 = etVar.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i18] = view.getAlpha();
                        fArr2[1] = f14;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr2);
                        ofFloat7.addListener(new sz(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
