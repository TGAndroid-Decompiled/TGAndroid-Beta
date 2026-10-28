package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.FileLog;
public abstract class wg1 extends org.telegram.ui.ActionBar.r2 {
    public final SparseArray f44999a;
    public k0 f45000b;
    public vg1 f45001c;
    public int d;
    public float e;
    public boolean f45002f;
    public boolean h;
    public String f45003n;
    public int f45004r;
    public Runnable f45005s;

    public wg1() {
        super(null);
        this.f44999a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void V() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f44999a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ug1 ug1Var = (ug1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (ug1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = ug1Var.f44021a;
                if (r2Var.fragmentView != null) {
                    float r6 = this.f45001c.r(keyAt);
                    boolean z11 = this.f45002f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    if (ug1Var.f44025g <= 0.0f && r6 > 0.0f && z11 && (r2Var instanceof qg0)) {
                        ((qg0) r2Var).D();
                    }
                    ug1Var.f44025g = r6;
                    float f11 = ug1Var.f44024f;
                    float f12 = f7 * r6;
                    ug1Var.f44024f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!ug1Var.d && r6 > 0.0f && z11 && r2Var.fragmentView != null) {
                        r2Var.onResume();
                        ug1Var.d = true;
                    }
                    if (!ug1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        r2Var.onTransitionAnimationStart(z10, false);
                        ug1Var.e = true;
                    }
                    if (ug1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        r2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (ug1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        r2Var.onTransitionAnimationEnd(z10, false);
                        ug1Var.e = false;
                    }
                    if (!ug1Var.f44023c && f12 >= 1.0f) {
                        r2Var.onBecomeFullyVisible();
                        ug1Var.f44023c = true;
                    }
                    if (ug1Var.f44023c && ((f12 == 0.0f && !z12) || r6 == 0.0f)) {
                        r2Var.onBecomeFullyHidden();
                        ug1Var.f44023c = false;
                    }
                    if (ug1Var.d && ((f12 == 0.0f && !z11) || r6 == 0.0f)) {
                        r2Var.onPause();
                        ug1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.r2 W(int i10);

    public final org.telegram.ui.ActionBar.r2 X() {
        vg1 vg1Var = this.f45001c;
        if (vg1Var == null) {
            return null;
        }
        ug1 ug1Var = (ug1) this.f44999a.get(vg1Var.getCurrentPosition());
        if (ug1Var == null) {
            return null;
        }
        return ug1Var.f44021a;
    }

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f44999a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ug1 ug1Var = (ug1) sparseArray.valueAt(i10);
            if (ug1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = ug1Var.f44021a;
                if (r2Var.fragmentView != null) {
                    r2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    @Override
    public final void clearViews() {
        vg1 vg1Var = this.f45001c;
        if (vg1Var != null) {
            this.d = vg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f44999a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ug1 ug1Var = (ug1) sparseArray.valueAt(i10);
            if (ug1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = ug1Var.f44021a;
                if (ug1Var.d) {
                    r2Var.onPause();
                    ug1Var.d = false;
                }
                r2Var.clearViews();
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
        this.f45000b = new k0((rg0) this, context, 13);
        vg1 vg1Var = new vg1(this, context);
        this.f45001c = vg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        vg1Var.setPosition(this.d);
        this.f45001c.setAdapter(new bi.e5(this, context, 5));
        this.f45000b.addView(this.f45001c, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        k0 k0Var = this.f45000b;
        this.fragmentView = k0Var;
        jl0 jl0Var = new jl0(this, 26);
        WeakHashMap weakHashMap = r0.i0.f47143a;
        r0.a0.i(k0Var, jl0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f44999a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ug1 ug1Var = (ug1) sparseArray.valueAt(i10);
            if (ug1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = ug1Var.f44021a;
                if (r2Var.fragmentView != null) {
                    arrayList.addAll(r2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.r2 X = X();
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
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.z5 z5Var;
        if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.r2 X = X();
            if (X != null) {
                r5Var = X.getSimpleActionBar();
            } else {
                r5Var = null;
            }
            if (r5Var != null && ((z5Var = r5Var.O) != null || (!r5Var.G && r5Var.F))) {
                if (z10) {
                    if (z5Var != null) {
                        z5Var.a(true);
                        return false;
                    }
                    if (!r5Var.G && r5Var.F) {
                        r5Var.f(true);
                    }
                    return false;
                }
            } else if (X == null || X.onBackPressed(z10)) {
                return super.onBackPressed(z10);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.e = 0.0f;
        this.h = false;
        V();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.e = 1.0f;
        this.h = true;
        V();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f44999a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ug1 ug1Var = (ug1) sparseArray.valueAt(i10);
            boolean z10 = ug1Var.f44022b;
            org.telegram.ui.ActionBar.r2 r2Var = ug1Var.f44021a;
            if (z10) {
                r2Var.onFragmentDestroy();
                r2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f45002f = false;
        V();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.r2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f45002f = true;
        checkSystemBarColors();
        V();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f44999a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ug1 ug1Var = (ug1) sparseArray.valueAt(i10);
            if (ug1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = ug1Var.f44021a;
                if (r2Var.fragmentView != null) {
                    try {
                        r2Var.onThemeColorsChanged();
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f7) {
        super.onTransitionAnimationProgress(z10, f7);
        if (!z10) {
            f7 = 1.0f - f7;
        }
        this.e = f7;
        V();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f45003n = str;
        this.f45004r = i10;
        this.f45005s = runnable;
        SparseArray sparseArray = this.f44999a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ug1 ug1Var = (ug1) sparseArray.valueAt(i11);
            if (ug1Var != null) {
                ug1Var.f44021a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
