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
    public final int f54264a;
    public final View f54265b;
    public final int f54266c;
    public final Object d;

    public yp(Object obj, org.telegram.ui.Components.yz yzVar, int i7, int i10) {
        this.f54264a = i10;
        this.d = obj;
        this.f54265b = yzVar;
        this.f54266c = i7;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f10;
        float f11;
        int i7;
        int i10 = this.f54264a;
        int i11 = this.f54266c;
        Object obj = this.d;
        View view = this.f54265b;
        float f12 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z11 = true;
        switch (i10) {
            case 0:
                rq rqVar = (rq) obj;
                rqVar.f51697c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = rqVar.f51697c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = rqVar.f51697c.getChildAt(i14);
                    if (childAt != view) {
                        rqVar.f51697c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(rqVar.f51697c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / rqVar.f51697c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    rqVar.f51697c.addView(view);
                    v4.p0 layoutManager = rqVar.f51697c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new org.telegram.ui.Cells.y9(this, layoutManager));
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
                org.telegram.ui.Components.lk lkVar = (org.telegram.ui.Components.lk) obj;
                org.telegram.ui.Components.mk mkVar = lkVar.Y;
                mkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = mkVar.f37536r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt2 = mkVar.f37536r.getChildAt(i15);
                    if (view != null) {
                        mkVar.f37536r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                            i15++;
                            f13 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f13);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(mkVar.f37536r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / mkVar.f37536r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i15++;
                    f13 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.jk(this));
                lkVar.V.d();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    mkVar.f37536r.addView(view);
                    v4.p0 layoutManager2 = mkVar.f37536r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.jk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i16 = 0;
                org.telegram.ui.Components.hj0 hj0Var = (org.telegram.ui.Components.hj0) obj;
                SparseArray sparseArray = hj0Var.f35928b;
                org.telegram.ui.Components.ek0 ek0Var = hj0Var.f35927a;
                ek0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                hj0Var.h.remove(this);
                int childCount3 = ek0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                while (i13 < childCount3) {
                    View childAt3 = ek0Var.getChildAt(i13);
                    ek0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        hj0Var.d = z11;
                        ek0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.j2(this, R, 5));
                        ofFloat5.addListener(new ki.e2(this, R, 12));
                        ofFloat5.setStartDelay((int) ((Math.min(ek0Var.getMeasuredHeight(), Math.max(i16, childAt3.getTop())) / ek0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i13++;
                    z11 = true;
                    i16 = 0;
                }
                hj0Var.f35932g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.h10(4, this, animatorSet3));
                return false;
            default:
                c00 c00Var = (c00) obj;
                c00Var.getViewTreeObserver().removeOnPreDrawListener(this);
                et etVar = c00Var.f46345b;
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
