package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class rh1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray f40106a;
    public k0 f40107b;
    public qh1 f40108c;
    public int d;
    public float f40109e;
    public boolean f40110f;
    public boolean h;
    public String f40111n;
    public int f40112r;
    public Runnable f40113s;

    public rh1() {
        super(null);
        this.f40106a = new SparseArray();
        this.d = -1;
        this.f40109e = 0.0f;
    }

    public final void S() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f40106a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (ph1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = ph1Var.f39588a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.f40108c.r(keyAt);
                    boolean z11 = this.f40110f;
                    if (z11) {
                        f7 = this.f40109e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = ph1Var.f39592f;
                    float f12 = f7 * r10;
                    ph1Var.f39592f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!ph1Var.d && r10 > 0.0f && z11 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        ph1Var.d = true;
                    }
                    if (!ph1Var.f39591e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z10, false);
                        ph1Var.f39591e = true;
                    }
                    if (ph1Var.f39591e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        n2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (ph1Var.f39591e && (f12 == 0.0f || f12 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z10, false);
                        ph1Var.f39591e = false;
                    }
                    if (!ph1Var.f39590c && f12 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        ph1Var.f39590c = true;
                    }
                    if (ph1Var.f39590c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        ph1Var.f39590c = false;
                    }
                    if (ph1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onPause();
                        ph1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 T(int i10);

    public final void U(int i10) {
        SparseArray sparseArray = this.f40106a;
        ph1 ph1Var = (ph1) sparseArray.get(i10);
        if (ph1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = ph1Var.f39588a;
            if (ph1Var.f39590c) {
                n2Var.onBecomeFullyHidden();
            }
            if (ph1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 W() {
        qh1 qh1Var = this.f40108c;
        if (qh1Var == null) {
            return null;
        }
        ph1 ph1Var = (ph1) this.f40106a.get(qh1Var.getCurrentPosition());
        if (ph1Var == null) {
            return null;
        }
        return ph1Var.f39588a;
    }

    @Override
    public final void clearViews() {
        qh1 qh1Var = this.f40108c;
        if (qh1Var != null) {
            this.d = qh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f40106a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            if (ph1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = ph1Var.f39588a;
                if (ph1Var.d) {
                    n2Var.onPause();
                    ph1Var.d = false;
                }
                n2Var.clearViews();
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
        this.f40107b = new k0((ch0) this, context, 13);
        qh1 qh1Var = new qh1(this, context);
        this.f40108c = qh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        qh1Var.setPosition(this.d);
        this.f40108c.setAdapter(new cw0(this, context, 3));
        this.f40107b.addView(this.f40108c, w7.z5.c(-1.0f, -1));
        k0 k0Var = this.f40107b;
        this.fragmentView = k0Var;
        jl0 jl0Var = new jl0(this, 26);
        WeakHashMap weakHashMap = r0.i0.f45610a;
        r0.a0.j(k0Var, jl0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f40106a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            if (ph1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = ph1Var.f39588a;
                if (n2Var.fragmentView != null) {
                    arrayList.addAll(n2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.n2 W = W();
        if (W != null && W.fragmentView != null) {
            return W.isLightStatusBar();
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
        org.telegram.ui.ActionBar.n2 W = W();
        if (W != null && !W.onBackPressed(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.f40109e = 0.0f;
        this.h = false;
        S();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f40109e = 1.0f;
        this.h = true;
        S();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f40106a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            boolean z10 = ph1Var.f39589b;
            org.telegram.ui.ActionBar.n2 n2Var = ph1Var.f39588a;
            if (z10) {
                n2Var.onFragmentDestroy();
                n2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f40110f = false;
        S();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.n2 W = W();
        if (W != null) {
            W.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f40110f = true;
        checkSystemBarColors();
        S();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.f40109e = f7;
        S();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f40111n = str;
        this.f40112r = i10;
        this.f40113s = runnable;
        SparseArray sparseArray = this.f40106a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i11);
            if (ph1Var != null) {
                ph1Var.f39588a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
