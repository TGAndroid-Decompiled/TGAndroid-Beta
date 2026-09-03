package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class xq implements ViewTreeObserver.OnPreDrawListener {
    public final int f40051a;
    public final View f40052b;
    public final int f40053c;
    public final Object d;

    public xq(Object obj, org.telegram.ui.Components.u00 u00Var, int i10, int i11) {
        this.f40051a = i11;
        this.d = obj;
        this.f40052b = u00Var;
        this.f40053c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z4;
        float f10;
        int i10 = this.f40051a;
        int i11 = this.f40053c;
        Object obj = this.d;
        View view = this.f40052b;
        float f11 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = true;
        switch (i10) {
            case 0:
                rr rrVar = (rr) obj;
                rrVar.f37961c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = rrVar.f37961c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = rrVar.f37961c.getChildAt(i14);
                    if (childAt != view) {
                        rrVar.f37961c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(rrVar.f37961c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / rrVar.f37961c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    rrVar.f37961c.addView(view);
                    f2.v0 layoutManager = rrVar.f37961c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z4 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new u5(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z4;
                    }
                }
                z4 = true;
                animatorSet.start();
                return z4;
            case 1:
                org.telegram.ui.Components.gk gkVar = (org.telegram.ui.Components.gk) obj;
                org.telegram.ui.Components.hk hkVar = gkVar.U;
                hkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = hkVar.f25436r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = hkVar.f25436r.getChildAt(i15);
                    if (view != null) {
                        hkVar.f25436r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                        }
                    }
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(hkVar.f25436r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / hkVar.f25436r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.ek(this));
                gkVar.R.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    hkVar.f25436r.addView(view);
                    f2.v0 layoutManager2 = hkVar.f25436r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.ek(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.yk0 yk0Var = (org.telegram.ui.Components.yk0) obj;
                SparseArray sparseArray = yk0Var.f31046b;
                org.telegram.ui.Components.rl0 rl0Var = yk0Var.f31045a;
                rl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                yk0Var.h.remove(this);
                int childCount3 = rl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount3) {
                    View childAt3 = rl0Var.getChildAt(i16);
                    rl0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        yk0Var.d = z10;
                        rl0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new ih.b(this, R, 6));
                        ofFloat5.addListener(new org.telegram.ui.Cells.a4(this, R, 6));
                        ofFloat5.setStartDelay((int) ((Math.min(rl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / rl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i16++;
                    z10 = true;
                }
                yk0Var.f31049g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new dg.y2(27, this, animatorSet3));
                return false;
            default:
                u10 u10Var = (u10) obj;
                u10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                lh.e1 e1Var = u10Var.f38640b;
                int childCount4 = e1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = e1Var.getChildAt(i17);
                    if (view != null) {
                        e1Var.getClass();
                        f10 = 100.0f;
                        if (RecyclerView.R(childAt4) < i11) {
                            i17++;
                            f11 = 0.0f;
                            i12 = 2;
                            i13 = 0;
                        }
                    } else {
                        f10 = 100.0f;
                    }
                    childAt4.setAlpha(f11);
                    float[] fArr = new float[i12];
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, View.ALPHA, fArr);
                    ofFloat6.setStartDelay((int) ((Math.min(e1Var.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / e1Var.getMeasuredHeight()) * f10));
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i17++;
                    f11 = 0.0f;
                    i12 = 2;
                    i13 = 0;
                }
                animatorSet4.addListener(new k10(this));
                u10Var.f38650i0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    e1Var.addView(view);
                    f2.v0 layoutManager3 = e1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new k10(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
