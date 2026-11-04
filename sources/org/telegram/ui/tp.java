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
public final class tp implements ViewTreeObserver.OnPreDrawListener {
    public final int f49862a;
    public final View f49863b;
    public final int f49864c;
    public final Object d;

    public tp(Object obj, org.telegram.ui.Components.iz izVar, int i3, int i10) {
        this.f49862a = i10;
        this.d = obj;
        this.f49863b = izVar;
        this.f49864c = i3;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f10;
        float f11;
        int i3;
        int i10 = this.f49862a;
        int i11 = this.f49864c;
        Object obj = this.d;
        View view = this.f49863b;
        float f12 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z11 = true;
        switch (i10) {
            case 0:
                nq nqVar = (nq) obj;
                nqVar.f48052c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = nqVar.f48052c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = nqVar.f48052c.getChildAt(i14);
                    if (childAt != view) {
                        nqVar.f48052c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(nqVar.f48052c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / nqVar.f48052c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    nqVar.f48052c.addView(view);
                    u4.o0 layoutManager = nqVar.f48052c.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.M(view);
                        z10 = true;
                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat2.addListener(new org.telegram.ui.Cells.w9(this, layoutManager));
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
                org.telegram.ui.Components.tj tjVar = (org.telegram.ui.Components.tj) obj;
                org.telegram.ui.Components.uj ujVar = tjVar.Y;
                ujVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = ujVar.f38770r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt2 = ujVar.f38770r.getChildAt(i15);
                    if (view != null) {
                        ujVar.f38770r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                            i15++;
                            f13 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f13);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(ujVar.f38770r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / ujVar.f38770r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i15++;
                    f13 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.rj(this));
                tjVar.V.d();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    ujVar.f38770r.addView(view);
                    u4.o0 layoutManager2 = ujVar.f38770r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.rj(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i16 = 0;
                org.telegram.ui.Components.wi0 wi0Var = (org.telegram.ui.Components.wi0) obj;
                SparseArray sparseArray = wi0Var.f40014b;
                org.telegram.ui.Components.tj0 tj0Var = wi0Var.f40013a;
                tj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                wi0Var.h.remove(this);
                int childCount3 = tj0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                while (i13 < childCount3) {
                    View childAt3 = tj0Var.getChildAt(i13);
                    tj0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        wi0Var.d = z11;
                        tj0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.g2(this, R, 5));
                        ofFloat5.addListener(new ii.m2(this, R, 12));
                        ofFloat5.setStartDelay((int) ((Math.min(tj0Var.getMeasuredHeight(), Math.max(i16, childAt3.getTop())) / tj0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i13++;
                    z11 = true;
                    i16 = 0;
                }
                wi0Var.f40018g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.ri0(2, this, animatorSet3));
                return false;
            default:
                wz wzVar = (wz) obj;
                wzVar.getViewTreeObserver().removeOnPreDrawListener(this);
                xs xsVar = wzVar.f51638b;
                int childCount4 = xsVar.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = xsVar.getChildAt(i17);
                    if (view != null) {
                        xsVar.getClass();
                        f10 = 100.0f;
                        if (RecyclerView.R(childAt4) < i11) {
                            f11 = f12;
                            i3 = i13;
                            i17++;
                            f12 = f11;
                            i13 = i3;
                            i12 = 2;
                        }
                    } else {
                        f10 = 100.0f;
                    }
                    childAt4.setAlpha(f12);
                    f11 = f12;
                    i3 = i13;
                    float[] fArr = new float[i12];
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(childAt4, View.ALPHA, fArr);
                    ofFloat6.setStartDelay((int) ((Math.min(xsVar.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / xsVar.getMeasuredHeight()) * f10));
                    ofFloat6.setDuration(200L);
                    Animator[] animatorArr = new Animator[1];
                    animatorArr[i3] = ofFloat6;
                    animatorSet4.playTogether(animatorArr);
                    i17++;
                    f12 = f11;
                    i13 = i3;
                    i12 = 2;
                }
                float f14 = f12;
                int i18 = i13;
                animatorSet4.addListener(new mz(this));
                wzVar.m0.d();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    xsVar.addView(view);
                    u4.o0 layoutManager3 = xsVar.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i18] = view.getAlpha();
                        fArr2[1] = f14;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr2);
                        ofFloat7.addListener(new mz(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
