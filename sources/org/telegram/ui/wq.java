package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class wq implements ViewTreeObserver.OnPreDrawListener {
    public final int f42843a;
    public final View f42844b;
    public final int f42845c;
    public final Object d;

    public wq(Object obj, org.telegram.ui.Components.u00 u00Var, int i10, int i11) {
        this.f42843a = i11;
        this.d = obj;
        this.f42844b = u00Var;
        this.f42845c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z4;
        float f10;
        int i10 = this.f42843a;
        int i11 = this.f42845c;
        Object obj = this.d;
        View view = this.f42844b;
        float f11 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = true;
        switch (i10) {
            case 0:
                qr qrVar = (qr) obj;
                qrVar.f40573c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = qrVar.f40573c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = qrVar.f40573c.getChildAt(i14);
                    if (childAt != view) {
                        qrVar.f40573c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(qrVar.f40573c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / qrVar.f40573c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    qrVar.f40573c.addView(view);
                    f2.w0 layoutManager = qrVar.f40573c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z4 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new s5(this, layoutManager));
                        ofFloat2.start();
                        animatorSet.start();
                        return z4;
                    }
                }
                z4 = true;
                animatorSet.start();
                return z4;
            case 1:
                org.telegram.ui.Components.ik ikVar = (org.telegram.ui.Components.ik) obj;
                org.telegram.ui.Components.jk jkVar = ikVar.U;
                jkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = jkVar.f28132r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = jkVar.f28132r.getChildAt(i15);
                    if (view != null) {
                        jkVar.f28132r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                        }
                    }
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(jkVar.f28132r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / jkVar.f28132r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.gk(this));
                ikVar.R.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    jkVar.f28132r.addView(view);
                    f2.w0 layoutManager2 = jkVar.f28132r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.gk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) obj;
                SparseArray sparseArray = zk0Var.f33963b;
                org.telegram.ui.Components.sl0 sl0Var = zk0Var.f33962a;
                sl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                zk0Var.h.remove(this);
                int childCount3 = sl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                int i16 = 0;
                while (i16 < childCount3) {
                    View childAt3 = sl0Var.getChildAt(i16);
                    sl0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        zk0Var.d = z10;
                        sl0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new jh.b(this, R, 6));
                        ofFloat5.addListener(new org.telegram.ui.Cells.b4(this, R, 6));
                        ofFloat5.setStartDelay((int) ((Math.min(sl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / sl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i16++;
                    z10 = true;
                }
                zk0Var.f33967g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new eg.w2(27, this, animatorSet3));
                return false;
            default:
                t10 t10Var = (t10) obj;
                t10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                mh.d1 d1Var = t10Var.f41357b;
                int childCount4 = d1Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = d1Var.getChildAt(i17);
                    if (view != null) {
                        d1Var.getClass();
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
                    ofFloat6.setStartDelay((int) ((Math.min(d1Var.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / d1Var.getMeasuredHeight()) * f10));
                    ofFloat6.setDuration(200L);
                    animatorSet4.playTogether(ofFloat6);
                    i17++;
                    f11 = 0.0f;
                    i12 = 2;
                    i13 = 0;
                }
                animatorSet4.addListener(new j10(this));
                t10Var.f41368i0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    d1Var.addView(view);
                    f2.w0 layoutManager3 = d1Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new j10(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
