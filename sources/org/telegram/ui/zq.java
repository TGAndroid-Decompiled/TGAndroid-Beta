package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
public final class zq implements ViewTreeObserver.OnPreDrawListener {
    public final int f40545a;
    public final View f40546b;
    public final int f40547c;
    public final Object d;

    public zq(Object obj, org.telegram.ui.Components.t00 t00Var, int i10, int i11) {
        this.f40545a = i11;
        this.d = obj;
        this.f40546b = t00Var;
        this.f40547c = i10;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f7;
        int i10 = this.f40545a;
        int i11 = this.f40547c;
        Object obj = this.d;
        View view = this.f40546b;
        float f10 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        switch (i10) {
            case 0:
                sr srVar = (sr) obj;
                srVar.f37398c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = srVar.f37398c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = srVar.f37398c.getChildAt(i14);
                    if (childAt != view) {
                        srVar.f37398c.getClass();
                        if (RecyclerView.S(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(srVar.f37398c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / srVar.f37398c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    srVar.f37398c.addView(view);
                    s4.o0 layoutManager = srVar.f37398c.getLayoutManager();
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
                org.telegram.ui.Components.nk nkVar = (org.telegram.ui.Components.nk) obj;
                org.telegram.ui.Components.ok okVar = nkVar.X;
                okVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = okVar.f26968r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                for (int i15 = 0; i15 < childCount2; i15++) {
                    View childAt2 = okVar.f26968r.getChildAt(i15);
                    if (view != null) {
                        okVar.f26968r.getClass();
                        if (RecyclerView.S(childAt2) < i11) {
                        }
                    }
                    childAt2.setAlpha(0.0f);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(okVar.f26968r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / okVar.f26968r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                }
                animatorSet2.addListener(new org.telegram.ui.Components.lk(this));
                nkVar.U.lock();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    okVar.f26968r.addView(view);
                    s4.o0 layoutManager2 = okVar.f26968r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.lk(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                org.telegram.ui.Components.bl0 bl0Var = (org.telegram.ui.Components.bl0) obj;
                SparseArray sparseArray = bl0Var.f23033b;
                org.telegram.ui.Components.wl0 wl0Var = bl0Var.f23032a;
                wl0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                bl0Var.h.remove(this);
                int childCount3 = wl0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    View childAt3 = wl0Var.getChildAt(i16);
                    wl0Var.getClass();
                    int S = RecyclerView.S(childAt3);
                    if (childAt3 != view && S >= i11 - 1 && sparseArray.get(S, null) == null) {
                        sparseArray.put(S, Float.valueOf(0.0f));
                        bl0Var.d = true;
                        wl0Var.invalidate();
                        int min = (int) ((Math.min(wl0Var.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / wl0Var.getMeasuredHeight()) * 100.0f);
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.q2(this, S, 5));
                        ofFloat5.addListener(new ei.v2(this, S, 9));
                        ofFloat5.setStartDelay(min);
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                }
                bl0Var.f23036g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.al0(0, this, animatorSet3));
                return false;
            default:
                x10 x10Var = (x10) obj;
                x10Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ai.w0 w0Var = x10Var.f39304b;
                int childCount4 = w0Var.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = w0Var.getChildAt(i17);
                    if (view != null) {
                        w0Var.getClass();
                        f7 = 100.0f;
                        if (RecyclerView.S(childAt4) < i11) {
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
                animatorSet4.addListener(new n10(this));
                x10Var.f39317l0.lock();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    w0Var.addView(view);
                    s4.o0 layoutManager3 = w0Var.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat7.addListener(new n10(this, layoutManager3));
                        ofFloat7.start();
                        return true;
                    }
                }
                return true;
        }
    }
}
