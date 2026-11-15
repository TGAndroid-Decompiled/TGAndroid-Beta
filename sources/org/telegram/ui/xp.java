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
    public final int f53279a;
    public final View f53280b;
    public final int f53281c;
    public final Object d;

    public xp(Object obj, org.telegram.ui.Components.pz pzVar, int i7, int i10) {
        this.f53279a = i10;
        this.d = obj;
        this.f53280b = pzVar;
        this.f53281c = i7;
    }

    @Override
    public final boolean onPreDraw() {
        boolean z10;
        float f10;
        float f11;
        int i7;
        int i10 = this.f53279a;
        int i11 = this.f53281c;
        Object obj = this.d;
        View view = this.f53280b;
        float f12 = 0.0f;
        int i12 = 2;
        int i13 = 0;
        boolean z11 = true;
        switch (i10) {
            case 0:
                qq qqVar = (qq) obj;
                qqVar.f50714c.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount = qqVar.f50714c.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = qqVar.f50714c.getChildAt(i14);
                    if (childAt != view) {
                        qqVar.f50714c.getClass();
                        if (RecyclerView.R(childAt) >= i11) {
                            childAt.setAlpha(0.0f);
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                            ofFloat.setStartDelay((int) ((Math.min(qqVar.f50714c.getMeasuredHeight(), Math.max(0, childAt.getTop())) / qqVar.f50714c.getMeasuredHeight()) * 100.0f));
                            ofFloat.setDuration(200L);
                            animatorSet.playTogether(ofFloat);
                        }
                    }
                }
                if (view != null && view.getParent() == null) {
                    qqVar.f50714c.addView(view);
                    v4.o0 layoutManager = qqVar.f50714c.getLayoutManager();
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
                org.telegram.ui.Components.ck ckVar = (org.telegram.ui.Components.ck) obj;
                org.telegram.ui.Components.dk dkVar = ckVar.Y;
                dkVar.getViewTreeObserver().removeOnPreDrawListener(this);
                int childCount2 = dkVar.f33952r.getChildCount();
                AnimatorSet animatorSet2 = new AnimatorSet();
                int i15 = 0;
                while (i15 < childCount2) {
                    View childAt2 = dkVar.f33952r.getChildAt(i15);
                    if (view != null) {
                        dkVar.f33952r.getClass();
                        if (RecyclerView.R(childAt2) < i11) {
                            i15++;
                            f13 = 0.0f;
                        }
                    }
                    childAt2.setAlpha(f13);
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.ALPHA, 0.0f, 1.0f);
                    ofFloat3.setStartDelay((int) ((Math.min(dkVar.f33952r.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / dkVar.f33952r.getMeasuredHeight()) * 100.0f));
                    ofFloat3.setDuration(200L);
                    animatorSet2.playTogether(ofFloat3);
                    i15++;
                    f13 = 0.0f;
                }
                animatorSet2.addListener(new org.telegram.ui.Components.ak(this));
                ckVar.V.d();
                animatorSet2.start();
                if (view != null && view.getParent() == null) {
                    dkVar.f33952r.addView(view);
                    v4.o0 layoutManager2 = dkVar.f33952r.getLayoutManager();
                    if (layoutManager2 != null) {
                        layoutManager2.M(view);
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, View.ALPHA, view.getAlpha(), 0.0f);
                        ofFloat4.addListener(new org.telegram.ui.Components.ak(this, layoutManager2));
                        ofFloat4.start();
                        return true;
                    }
                }
                return true;
            case 2:
                int i16 = 0;
                org.telegram.ui.Components.xi0 xi0Var = (org.telegram.ui.Components.xi0) obj;
                SparseArray sparseArray = xi0Var.f41698b;
                org.telegram.ui.Components.uj0 uj0Var = xi0Var.f41697a;
                uj0Var.getViewTreeObserver().removeOnPreDrawListener(this);
                xi0Var.h.remove(this);
                int childCount3 = uj0Var.getChildCount();
                AnimatorSet animatorSet3 = new AnimatorSet();
                while (i13 < childCount3) {
                    View childAt3 = uj0Var.getChildAt(i13);
                    uj0Var.getClass();
                    int R = RecyclerView.R(childAt3);
                    if (childAt3 != view && R >= i11 - 1 && sparseArray.get(R, null) == null) {
                        sparseArray.put(R, Float.valueOf(0.0f));
                        xi0Var.d = z11;
                        uj0Var.invalidate();
                        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat5.addUpdateListener(new org.telegram.ui.ActionBar.h2(this, R, 5));
                        ofFloat5.addListener(new ki.j2(this, R, 12));
                        ofFloat5.setStartDelay((int) ((Math.min(uj0Var.getMeasuredHeight(), Math.max(i16, childAt3.getTop())) / uj0Var.getMeasuredHeight()) * 100.0f));
                        ofFloat5.setDuration(200L);
                        animatorSet3.playTogether(ofFloat5);
                    }
                    i13++;
                    z11 = true;
                    i16 = 0;
                }
                xi0Var.f41702g.add(animatorSet3);
                animatorSet3.start();
                animatorSet3.addListener(new org.telegram.ui.Components.y50(3, this, animatorSet3));
                return false;
            default:
                zz zzVar = (zz) obj;
                zzVar.getViewTreeObserver().removeOnPreDrawListener(this);
                ct ctVar = zzVar.f54075b;
                int childCount4 = ctVar.getChildCount();
                AnimatorSet animatorSet4 = new AnimatorSet();
                int i17 = 0;
                while (i17 < childCount4) {
                    View childAt4 = ctVar.getChildAt(i17);
                    if (view != null) {
                        ctVar.getClass();
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
                    ofFloat6.setStartDelay((int) ((Math.min(ctVar.getMeasuredHeight(), Math.max(i13, childAt4.getTop())) / ctVar.getMeasuredHeight()) * f10));
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
                animatorSet4.addListener(new pz(this));
                zzVar.m0.d();
                animatorSet4.start();
                if (view != null && view.getParent() == null) {
                    ctVar.addView(view);
                    v4.o0 layoutManager3 = ctVar.getLayoutManager();
                    if (layoutManager3 != null) {
                        layoutManager3.M(view);
                        Property property = View.ALPHA;
                        float[] fArr2 = new float[2];
                        fArr2[i18] = view.getAlpha();
                        fArr2[1] = f14;
                        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr2);
                        ofFloat7.addListener(new pz(this, layoutManager3));
                        ofFloat7.start();
                    }
                }
                return true;
        }
    }
}
