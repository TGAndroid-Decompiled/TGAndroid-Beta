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
public final class xp implements ViewTreeObserver.OnPreDrawListener {
    public final int f51742a;
    public final View f51743b;
    public final int f51744c;
    public final Object d;

    public xp(Object obj, org.telegram.ui.Components.mz mzVar, int i7, int i10) {
        this.f51742a = i10;
        this.d = obj;
        this.f51743b = mzVar;
        this.f51744c = i7;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z9;
        float f10;
        float f11;
        int i7;
        int i10 = this.f51742a;
        int i11 = this.f51744c;
        Object obj = this.d;
        View view = this.f51743b;
        float f12 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = true;
        switch (i10) {
            case 0:
                qq qqVar = (qq) obj;
                qqVar.f49121c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = qqVar.f49121c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = qqVar.f49121c.getChildAt(i14);
                    if (childAt != view) {
                        qqVar.f49121c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(qqVar.f49121c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / qqVar.f49121c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    qqVar.f49121c.addView(view);
                    v4.n0 layoutManager = qqVar.f49121c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z9 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new va(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z9;
                    }
                }
                z9 = true;
                animatorSet.start();
                return z9;
            case 1:
                float f13 = 0.0f;
                org.telegram.ui.Components.uj ujVar = (org.telegram.ui.Components.uj) obj;
                org.telegram.ui.Components.vj vjVar = ujVar.X;
                vjVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = vjVar.f39113r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt2 = vjVar.f39113r.getChildAt(i15);
                    if (view != null) {
                        vjVar.f39113r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                            i15++;
                            f13 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f13);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(vjVar.f39113r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / vjVar.f39113r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i15++;
                    f13 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.sj(this));
                ujVar.U.d();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    vjVar.f39113r.addView(view);
                    v4.n0 layoutManager2 = vjVar.f39113r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.sj(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i16 = 0;
                org.telegram.ui.Components.ti0 ti0Var = (org.telegram.ui.Components.ti0) obj;
                SparseArray sparseArray = ti0Var.f38431b;
                org.telegram.ui.Components.qj0 qj0Var = ti0Var.f38430a;
                qj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ti0Var.h.remove(this);
                int childCount3 = qj0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                while (i13 < childCount3) {
                    View childAt3 = qj0Var.getChildAt(i13);
                    qj0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        ti0Var.d = z10;
                        qj0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.i2(this, R, 5));
                        ofFloat5.addListener(new hi.m2(this, R, 12));
                        ofFloat5.setStartDelay((int) ((Math.min(qj0Var.getMeasuredHeight(), Math.max(i16, childAt3.getTop())) / qj0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i13++;
                    z10 = true;
                    i16 = 0;
                }
                ti0Var.f38435g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.w50(3, this, animatorSet3));
                return false;
            default:
                a00 a00Var = (a00) obj;
                a00Var.getViewTreeObserver().removeOnPreDrawListener(this);
                bt btVar = a00Var.f43512b;
                int childCount4 = btVar.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = btVar.getChildAt(i17);
                    if (view != null) {
                        btVar.getClass();
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
                    ofFloat6.setStartDelay((int) ((Math.min(btVar.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / btVar.getMeasuredHeight()) * f10));
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
                animatorSet4.addListener(new qz(this));
                a00Var.f43526l0.d();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    btVar.addView(view);
                    v4.n0 layoutManager3 = btVar.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i18] = view.getAlpha();
                        fArr2[1] = f14;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr2);
                        ofFloat7.addListener(new qz(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
