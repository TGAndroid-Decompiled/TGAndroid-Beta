package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class th1 extends org.telegram.ui.ActionBar.m2 {
    public final SparseArray f38124a;
    public k0 f38125b;
    public sh1 f38126c;
    public int d;
    public float e;
    public boolean f38127f;
    public boolean h;
    public String f38128n;
    public int f38129r;
    public Runnable f38130s;

    public th1() {
        super(null);
        this.f38124a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f38124a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rh1 rh1Var = (rh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (rh1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = rh1Var.f37337a;
                if (m2Var.fragmentView != null) {
                    float r10 = this.f38126c.r(keyAt);
                    boolean z11 = this.f38127f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = rh1Var.f37340f;
                    float f12 = f7 * r10;
                    rh1Var.f37340f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!rh1Var.d && r10 > 0.0f && z11 && m2Var.fragmentView != null) {
                        m2Var.onResume();
                        rh1Var.d = true;
                    }
                    if (!rh1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        m2Var.onTransitionAnimationStart(z10, false);
                        rh1Var.e = true;
                    }
                    if (rh1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        m2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (rh1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        m2Var.onTransitionAnimationEnd(z10, false);
                        rh1Var.e = false;
                    }
                    if (!rh1Var.f37339c && f12 >= 1.0f) {
                        m2Var.onBecomeFullyVisible();
                        rh1Var.f37339c = true;
                    }
                    if (rh1Var.f37339c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        m2Var.onBecomeFullyHidden();
                        rh1Var.f37339c = false;
                    }
                    if (rh1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        m2Var.onPause();
                        rh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.m2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f38124a;
        rh1 rh1Var = (rh1) sparseArray.get(i10);
        if (rh1Var != null) {
            org.telegram.ui.ActionBar.m2 m2Var = rh1Var.f37337a;
            if (rh1Var.f37339c) {
                m2Var.onBecomeFullyHidden();
            }
            if (rh1Var.d) {
                m2Var.onPause();
            }
            m2Var.onFragmentDestroy();
            m2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.m2 X() {
        sh1 sh1Var = this.f38126c;
        if (sh1Var == null) {
            return null;
        }
        rh1 rh1Var = (rh1) this.f38124a.get(sh1Var.getCurrentPosition());
        if (rh1Var == null) {
            return null;
        }
        return rh1Var.f37337a;
    }

    @Override
    public final void clearViews() {
        sh1 sh1Var = this.f38126c;
        if (sh1Var != null) {
            this.d = sh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f38124a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rh1 rh1Var = (rh1) sparseArray.valueAt(i10);
            if (rh1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = rh1Var.f37337a;
                if (rh1Var.d) {
                    m2Var.onPause();
                    rh1Var.d = false;
                }
                m2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.k createActionBar(Context context) {
        return null;
    }

    @Override
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.f38125b = new k0((yg0) this, context, 13);
        sh1 sh1Var = new sh1(this, context);
        this.f38126c = sh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        sh1Var.setPosition(this.d);
        this.f38126c.setAdapter(new zv0(this, context, 3));
        this.f38125b.addView(this.f38126c, w7.y5.c(-1.0f, -1));
        k0 k0Var = this.f38125b;
        this.fragmentView = k0Var;
        ml0 ml0Var = new ml0(this, 26);
        WeakHashMap weakHashMap = r0.i0.f42128a;
        r0.a0.j(k0Var, ml0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f38124a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rh1 rh1Var = (rh1) sparseArray.valueAt(i10);
            if (rh1Var != null) {
                org.telegram.ui.ActionBar.m2 m2Var = rh1Var.f37337a;
                if (m2Var.fragmentView != null) {
                    arrayList.addAll(m2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.m2 X = X();
        if (X != null && X.fragmentView != null) {
            return X.isLightStatusBar();
        }
        return super.isLightStatusBar();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z10) {
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
            }
            return false;
        }
        org.telegram.ui.ActionBar.m2 X = X();
        if (X != null && !X.onBackPressed(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        U();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f38124a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rh1 rh1Var = (rh1) sparseArray.valueAt(i10);
            boolean z10 = rh1Var.f37338b;
            org.telegram.ui.ActionBar.m2 m2Var = rh1Var.f37337a;
            if (z10) {
                m2Var.onFragmentDestroy();
                m2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f38127f = false;
        U();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.m2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f38127f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f38128n = str;
        this.f38129r = i10;
        this.f38130s = runnable;
        SparseArray sparseArray = this.f38124a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            rh1 rh1Var = (rh1) sparseArray.valueAt(i11);
            if (rh1Var != null) {
                rh1Var.f37337a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
