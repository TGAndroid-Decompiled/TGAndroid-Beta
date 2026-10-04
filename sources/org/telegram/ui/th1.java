package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class th1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray f40846a;
    public k0 f40847b;
    public sh1 f40848c;
    public int d;
    public float f40849e;
    public boolean f40850f;
    public boolean h;
    public String f40851n;
    public int f40852r;
    public Runnable f40853s;

    public th1() {
        super(null);
        this.f40846a = new SparseArray();
        this.d = -1;
        this.f40849e = 0.0f;
    }

    public final void S() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f40846a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rh1 rh1Var = (rh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (rh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = rh1Var.f40128a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.f40848c.r(keyAt);
                    boolean z11 = this.f40850f;
                    if (z11) {
                        f7 = this.f40849e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = rh1Var.f40132f;
                    float f12 = f7 * r10;
                    rh1Var.f40132f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!rh1Var.d && r10 > 0.0f && z11 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        rh1Var.d = true;
                    }
                    if (!rh1Var.f40131e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z10, false);
                        rh1Var.f40131e = true;
                    }
                    if (rh1Var.f40131e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        n2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (rh1Var.f40131e && (f12 == 0.0f || f12 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z10, false);
                        rh1Var.f40131e = false;
                    }
                    if (!rh1Var.f40130c && f12 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        rh1Var.f40130c = true;
                    }
                    if (rh1Var.f40130c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        rh1Var.f40130c = false;
                    }
                    if (rh1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onPause();
                        rh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 T(int i10);

    public final void U(int i10) {
        SparseArray sparseArray = this.f40846a;
        rh1 rh1Var = (rh1) sparseArray.get(i10);
        if (rh1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = rh1Var.f40128a;
            if (rh1Var.f40130c) {
                n2Var.onBecomeFullyHidden();
            }
            if (rh1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 W() {
        sh1 sh1Var = this.f40848c;
        if (sh1Var == null) {
            return null;
        }
        rh1 rh1Var = (rh1) this.f40846a.get(sh1Var.getCurrentPosition());
        if (rh1Var == null) {
            return null;
        }
        return rh1Var.f40128a;
    }

    @Override
    public final void clearViews() {
        sh1 sh1Var = this.f40848c;
        if (sh1Var != null) {
            this.d = sh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f40846a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rh1 rh1Var = (rh1) sparseArray.valueAt(i10);
            if (rh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = rh1Var.f40128a;
                if (rh1Var.d) {
                    n2Var.onPause();
                    rh1Var.d = false;
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
        this.f40847b = new k0((ch0) this, context, 13);
        sh1 sh1Var = new sh1(this, context);
        this.f40848c = sh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        sh1Var.setPosition(this.d);
        this.f40848c.setAdapter(new cw0(this, context, 3));
        this.f40847b.addView(this.f40848c, w7.z5.c(-1.0f, -1));
        k0 k0Var = this.f40847b;
        this.fragmentView = k0Var;
        jl0 jl0Var = new jl0(this, 26);
        WeakHashMap weakHashMap = r0.i0.f45595a;
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
        SparseArray sparseArray = this.f40846a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rh1 rh1Var = (rh1) sparseArray.valueAt(i10);
            if (rh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = rh1Var.f40128a;
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
        this.f40849e = 0.0f;
        this.h = false;
        S();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f40849e = 1.0f;
        this.h = true;
        S();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f40846a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rh1 rh1Var = (rh1) sparseArray.valueAt(i10);
            boolean z10 = rh1Var.f40129b;
            org.telegram.ui.ActionBar.n2 n2Var = rh1Var.f40128a;
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
        this.f40850f = false;
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
        this.f40850f = true;
        checkSystemBarColors();
        S();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.f40849e = f7;
        S();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f40851n = str;
        this.f40852r = i10;
        this.f40853s = runnable;
        SparseArray sparseArray = this.f40846a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            rh1 rh1Var = (rh1) sparseArray.valueAt(i11);
            if (rh1Var != null) {
                rh1Var.f40128a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
