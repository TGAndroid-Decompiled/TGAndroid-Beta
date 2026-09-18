package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class yh1 extends org.telegram.ui.ActionBar.n2 {
    public final SparseArray f39826a;
    public j0 f39827b;
    public xh1 f39828c;
    public int d;
    public float e;
    public boolean f39829f;
    public boolean h;
    public String f39830n;
    public int f39831r;
    public Runnable f39832s;

    public yh1() {
        super(null);
        this.f39826a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f39826a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            wh1 wh1Var = (wh1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (wh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = wh1Var.f39171a;
                if (n2Var.fragmentView != null) {
                    float r10 = this.f39828c.r(keyAt);
                    boolean z11 = this.f39829f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = wh1Var.f39174f;
                    float f12 = f7 * r10;
                    wh1Var.f39174f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!wh1Var.d && r10 > 0.0f && z11 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        wh1Var.d = true;
                    }
                    if (!wh1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z10, false);
                        wh1Var.e = true;
                    }
                    if (wh1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        n2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (wh1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z10, false);
                        wh1Var.e = false;
                    }
                    if (!wh1Var.f39173c && f12 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        wh1Var.f39173c = true;
                    }
                    if (wh1Var.f39173c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        wh1Var.f39173c = false;
                    }
                    if (wh1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        n2Var.onPause();
                        wh1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f39826a;
        wh1 wh1Var = (wh1) sparseArray.get(i10);
        if (wh1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = wh1Var.f39171a;
            if (wh1Var.f39173c) {
                n2Var.onBecomeFullyHidden();
            }
            if (wh1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 X() {
        xh1 xh1Var = this.f39828c;
        if (xh1Var == null) {
            return null;
        }
        wh1 wh1Var = (wh1) this.f39826a.get(xh1Var.getCurrentPosition());
        if (wh1Var == null) {
            return null;
        }
        return wh1Var.f39171a;
    }

    @Override
    public final void clearViews() {
        xh1 xh1Var = this.f39828c;
        if (xh1Var != null) {
            this.d = xh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f39826a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            wh1 wh1Var = (wh1) sparseArray.valueAt(i10);
            if (wh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = wh1Var.f39171a;
                if (wh1Var.d) {
                    n2Var.onPause();
                    wh1Var.d = false;
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
        this.f39827b = new j0((fh0) this, context, 12);
        xh1 xh1Var = new xh1(this, context);
        this.f39828c = xh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        xh1Var.setPosition(this.d);
        this.f39828c.setAdapter(new iw0(this, context, 3));
        this.f39827b.addView(this.f39828c, w7.y5.c(-1.0f, -1));
        j0 j0Var = this.f39827b;
        this.fragmentView = j0Var;
        ol0 ol0Var = new ol0(this, 27);
        WeakHashMap weakHashMap = r0.i0.f42096a;
        r0.a0.j(j0Var, ol0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f39826a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            wh1 wh1Var = (wh1) sparseArray.valueAt(i10);
            if (wh1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = wh1Var.f39171a;
                if (n2Var.fragmentView != null) {
                    arrayList.addAll(n2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.n2 X = X();
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
        org.telegram.ui.ActionBar.n2 X = X();
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
        SparseArray sparseArray = this.f39826a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            wh1 wh1Var = (wh1) sparseArray.valueAt(i10);
            boolean z10 = wh1Var.f39172b;
            org.telegram.ui.ActionBar.n2 n2Var = wh1Var.f39171a;
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
        this.f39829f = false;
        U();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f39829f = true;
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
        this.f39830n = str;
        this.f39831r = i10;
        this.f39832s = runnable;
        SparseArray sparseArray = this.f39826a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            wh1 wh1Var = (wh1) sparseArray.valueAt(i11);
            if (wh1Var != null) {
                wh1Var.f39171a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
