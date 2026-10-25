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
public final class rq implements ViewTreeObserver.OnPreDrawListener {
    public final int f43236a;
    public final View f43237b;
    public final int f43238c;
    public final Object d;

    public rq(Object obj, org.telegram.ui.Components.c10 c10Var, int i10, int i11) {
        this.f43236a = i11;
        this.d = obj;
        this.f43237b = c10Var;
        this.f43238c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f7;
        float f10;
        int i10;
        int i11 = this.f43236a;
        int i12 = this.f43238c;
        Object obj = this.d;
        View view = this.f43237b;
        float f11 = 0.0f;
        int i13 = 2;
        int i14 = 0;
        boolean z11 = true;
        switch (i11) {
            case 0:
                kr krVar = (kr) obj;
                krVar.f41007c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = krVar.f41007c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = krVar.f41007c.getChildAt(i15);
                    if (childAt != view) {
                        krVar.f41007c.getClass();
                        if (RecyclerView.R(childAt) >= i12) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(krVar.f41007c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / krVar.f41007c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    krVar.f41007c.addView(view);
                    s4.p0 layoutManager = krVar.f41007c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new qp(this, layoutManager));
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
                org.telegram.ui.Components.mk mkVar = (org.telegram.ui.Components.mk) obj;
                org.telegram.ui.Components.nk nkVar = mkVar.X;
                nkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = nkVar.f31032r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount2) {
                    View childAt2 = nkVar.f31032r.getChildAt(i16);
                    if (view != null) {
                        nkVar.f31032r.getClass();
                        if (RecyclerView.R(childAt2) < i12) {
                            i16++;
                            f12 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f12);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(nkVar.f31032r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / nkVar.f31032r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i16++;
                    f12 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.kk(this));
                mkVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    nkVar.f31032r.addView(view);
                    s4.p0 layoutManager2 = nkVar.f31032r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.kk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i17 = 0;
                org.telegram.ui.Components.ql0 ql0Var = (org.telegram.ui.Components.ql0) obj;
                SparseArray sparseArray = ql0Var.f31951b;
                org.telegram.ui.Components.mm0 mm0Var = ql0Var.f31950a;
                mm0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ql0Var.h.remove(this);
                int childCount3 = mm0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                while (i14 < childCount3) {
                    View childAt3 = mm0Var.getChildAt(i14);
                    mm0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i12 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        ql0Var.d = z11;
                        mm0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.u2(this, R, 5));
                        ofFloat5.addListener(new hi.y2(this, R, 10));
                        ofFloat5.setStartDelay((int) ((Math.min(mm0Var.getMeasuredHeight(), Math.max(i17, childAt3.getTop())) / mm0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i14++;
                    z11 = true;
                    i17 = 0;
                }
                ql0Var.f31954g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.ll0(2, this, animatorSet3));
                return false;
            default:
                h10 h10Var = (h10) obj;
                h10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                bi.r1 r1Var = h10Var.f39825b;
                int childCount4 = r1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i18 = 0;
                while (i18 < childCount4) {
                    View childAt4 = r1Var.getChildAt(i18);
                    if (view != null) {
                        r1Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.R(childAt4) < i12) {
                            f10 = f11;
                            i10 = i14;
                            i18++;
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
                    ofFloat6.setStartDelay((int) ((Math.min(r1Var.getMeasuredHeight(), Math.max(i14, childAt4.getTop())) / r1Var.getMeasuredHeight()) * f7));
                    ofFloat6.setDuration(200L);
                    Animator[] animatorArr = new Animator[1];
                    animatorArr[i10] = ofFloat6;
                    animatorSet4.playTogether(animatorArr);
                    i18++;
                    f11 = f10;
                    i14 = i10;
                    i13 = 2;
                }
                float f13 = f11;
                int i19 = i14;
                animatorSet4.addListener(new w00(this));
                h10Var.f39838l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    r1Var.addView(view);
                    s4.p0 layoutManager3 = r1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i19] = view.getAlpha();
                        fArr2[1] = f13;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr2);
                        ofFloat7.addListener(new w00(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
