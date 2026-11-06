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
public final class vp implements ViewTreeObserver.OnPreDrawListener {
    public final int f50808a;
    public final View f50809b;
    public final int f50810c;
    public final Object d;

    public vp(Object obj, org.telegram.ui.Components.lz lzVar, int i7, int i10) {
        this.f50808a = i10;
        this.d = obj;
        this.f50809b = lzVar;
        this.f50810c = i7;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z9;
        float f10;
        float f11;
        int i7;
        int i10 = this.f50808a;
        int i11 = this.f50810c;
        Object obj = this.d;
        View view = this.f50809b;
        float f12 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = true;
        switch (i10) {
            case 0:
                oq oqVar = (oq) obj;
                oqVar.f48474c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = oqVar.f48474c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = oqVar.f48474c.getChildAt(i14);
                    if (childAt != view) {
                        oqVar.f48474c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(oqVar.f48474c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / oqVar.f48474c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    oqVar.f48474c.addView(view);
                    v4.n0 layoutManager = oqVar.f48474c.getLayoutManager();
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
                int childCount2 = vjVar.f38985r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt2 = vjVar.f38985r.getChildAt(i15);
                    if (view != null) {
                        vjVar.f38985r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                            i15++;
                            f13 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f13);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(vjVar.f38985r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / vjVar.f38985r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i15++;
                    f13 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.sj(this));
                ujVar.U.d();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    vjVar.f38985r.addView(view);
                    v4.n0 layoutManager2 = vjVar.f38985r.getLayoutManager();
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
                org.telegram.ui.Components.si0 si0Var = (org.telegram.ui.Components.si0) obj;
                SparseArray sparseArray = si0Var.f38072b;
                org.telegram.ui.Components.pj0 pj0Var = si0Var.f38071a;
                pj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                si0Var.h.remove(this);
                int childCount3 = pj0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                while (i13 < childCount3) {
                    View childAt3 = pj0Var.getChildAt(i13);
                    pj0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        si0Var.d = z10;
                        pj0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.i2(this, R, 5));
                        ofFloat5.addListener(new hi.m2(this, R, 12));
                        ofFloat5.setStartDelay((int) ((Math.min(pj0Var.getMeasuredHeight(), Math.max(i16, childAt3.getTop())) / pj0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i13++;
                    z10 = true;
                    i16 = 0;
                }
                si0Var.f38076g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.v50(3, this, animatorSet3));
                return false;
            default:
                yz yzVar = (yz) obj;
                yzVar.getViewTreeObserver().removeOnPreDrawListener(this);
                zs zsVar = yzVar.f52380b;
                int childCount4 = zsVar.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = zsVar.getChildAt(i17);
                    if (view != null) {
                        zsVar.getClass();
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
                    ofFloat6.setStartDelay((int) ((Math.min(zsVar.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / zsVar.getMeasuredHeight()) * f10));
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
                animatorSet4.addListener(new oz(this));
                yzVar.f52394l0.d();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    zsVar.addView(view);
                    v4.n0 layoutManager3 = zsVar.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i18] = view.getAlpha();
                        fArr2[1] = f14;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr2);
                        ofFloat7.addListener(new oz(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
