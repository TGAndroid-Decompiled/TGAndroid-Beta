package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class vq implements ViewTreeObserver.OnPreDrawListener {
    public final int f39231a;
    public final View f39232b;
    public final int f39233c;
    public final Object d;

    public vq(Object obj, org.telegram.ui.Components.t00 t00Var, int i10, int i11) {
        this.f39231a = i11;
        this.d = obj;
        this.f39232b = t00Var;
        this.f39233c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z4;
        float f10;
        int i10 = this.f39231a;
        int i11 = this.f39233c;
        Object obj = this.d;
        View view = this.f39232b;
        float f11 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = true;
        switch (i10) {
            case 0:
                pr prVar = (pr) obj;
                prVar.f37450c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = prVar.f37450c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = prVar.f37450c.getChildAt(i14);
                    if (childAt != view) {
                        prVar.f37450c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(prVar.f37450c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / prVar.f37450c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    prVar.f37450c.addView(view);
                    f2.v0 layoutManager = prVar.f37450c.getLayoutManager();
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
                org.telegram.ui.Components.gk gkVar = (org.telegram.ui.Components.gk) obj;
                org.telegram.ui.Components.hk hkVar = gkVar.U;
                hkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = hkVar.f25434r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = hkVar.f25434r.getChildAt(i15);
                    if (view != null) {
                        hkVar.f25434r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                        }
                    }
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(hkVar.f25434r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / hkVar.f25434r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.ek(this));
                gkVar.R.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    hkVar.f25434r.addView(view);
                    f2.v0 layoutManager2 = hkVar.f25434r.getLayoutManager();
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
                org.telegram.ui.Components.zk0 zk0Var = (org.telegram.ui.Components.zk0) obj;
                SparseArray sparseArray = zk0Var.f31375b;
                org.telegram.ui.Components.sl0 sl0Var = zk0Var.f31374a;
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
                        ofFloat5.addUpdateListener(new ih.b(this, R, 6));
                        ofFloat5.addListener(new org.telegram.ui.Cells.b4(this, R, 6));
                        ofFloat5.setStartDelay((int) ((Math.min(sl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / sl0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i16++;
                    z10 = true;
                }
                zk0Var.f31378g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new dg.y2(27, this, animatorSet3));
                return false;
            default:
                t10 t10Var = (t10) obj;
                t10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                lh.e1 e1Var = t10Var.f38474b;
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
                animatorSet4.addListener(new j10(this));
                t10Var.f38484i0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    e1Var.addView(view);
                    f2.v0 layoutManager3 = e1Var.getLayoutManager();
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
