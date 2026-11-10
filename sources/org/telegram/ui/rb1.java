package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
public abstract class rb1 extends org.telegram.ui.ActionBar.f2 {
    public final SparseArray f49343a;
    public k0 f49344b;
    public qb1 f49345c;
    public int d;
    public float f49346e;
    public boolean f49347f;
    public boolean h;
    public String f49348n;
    public int f49349r;
    public Runnable f49350s;

    public rb1() {
        super(null);
        this.f49343a = new SparseArray();
        this.d = -1;
        this.f49346e = 0.0f;
    }

    public final void Z() {
        float f10;
        boolean z9;
        float f11;
        SparseArray sparseArray = this.f49343a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pb1 pb1Var = (pb1) sparseArray.valueAt(i7);
            int keyAt = sparseArray.keyAt(i7);
            if (pb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = pb1Var.f48735a;
                if (f2Var.fragmentView != null) {
                    float r10 = this.f49345c.r(keyAt);
                    boolean z10 = this.f49347f;
                    if (z10) {
                        f10 = this.f49346e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z11 = this.h;
                    float f12 = pb1Var.f48739f;
                    float f13 = f10 * r10;
                    pb1Var.f48739f = f13;
                    if (f13 > f12) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!pb1Var.d && r10 > 0.0f && z10 && f2Var.fragmentView != null) {
                        f2Var.onResume();
                        pb1Var.d = true;
                    }
                    if (!pb1Var.f48738e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        f2Var.onTransitionAnimationStart(z9, false);
                        pb1Var.f48738e = true;
                    }
                    if (pb1Var.f48738e && f12 != f13) {
                        if (z9) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        f2Var.onTransitionAnimationProgress(z9, f11);
                    }
                    if (pb1Var.f48738e && (f13 == 0.0f || f13 == 1.0f)) {
                        f2Var.onTransitionAnimationEnd(z9, false);
                        pb1Var.f48738e = false;
                    }
                    if (!pb1Var.f48737c && f13 >= 1.0f) {
                        f2Var.onBecomeFullyVisible();
                        pb1Var.f48737c = true;
                    }
                    if (pb1Var.f48737c && ((f13 == 0.0f && !z11) || r10 == 0.0f)) {
                        f2Var.onBecomeFullyHidden();
                        pb1Var.f48737c = false;
                    }
                    if (pb1Var.d && ((f13 == 0.0f && !z10) || r10 == 0.0f)) {
                        f2Var.onPause();
                        pb1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.f2 a0(int i7);

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f49343a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pb1 pb1Var = (pb1) sparseArray.valueAt(i7);
            if (pb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = pb1Var.f48735a;
                if (f2Var.fragmentView != null) {
                    f2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    public final void b0(int i7) {
        SparseArray sparseArray = this.f49343a;
        pb1 pb1Var = (pb1) sparseArray.get(i7);
        if (pb1Var != null) {
            org.telegram.ui.ActionBar.f2 f2Var = pb1Var.f48735a;
            if (pb1Var.f48737c) {
                f2Var.onBecomeFullyHidden();
            }
            if (pb1Var.d) {
                f2Var.onPause();
            }
            f2Var.onFragmentDestroy();
            f2Var.setParentLayout(null);
        }
        sparseArray.remove(i7);
    }

    public final org.telegram.ui.ActionBar.f2 c0() {
        qb1 qb1Var = this.f49345c;
        if (qb1Var == null) {
            return null;
        }
        pb1 pb1Var = (pb1) this.f49343a.get(qb1Var.getCurrentPosition());
        if (pb1Var == null) {
            return null;
        }
        return pb1Var.f48735a;
    }

    @Override
    public final void clearViews() {
        qb1 qb1Var = this.f49345c;
        if (qb1Var != null) {
            this.d = qb1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f49343a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pb1 pb1Var = (pb1) sparseArray.valueAt(i7);
            if (pb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = pb1Var.f48735a;
                if (pb1Var.d) {
                    f2Var.onPause();
                    pb1Var.d = false;
                }
                f2Var.clearViews();
            }
        }
        super.clearViews();
    }

    @Override
    public final org.telegram.ui.ActionBar.l createActionBar(Context context) {
        return null;
    }

    @Override
    public View createView(Context context) {
        this.hasOwnBackground = true;
        this.f49344b = new k0(14, context, (me0) this);
        qb1 qb1Var = new qb1(this, context);
        this.f49345c = qb1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        qb1Var.setPosition(this.d);
        this.f49345c.setAdapter(new bi.g5(8, context, this));
        this.f49344b.addView(this.f49345c, c8.ha.c(-1.0f, -1));
        k0 k0Var = this.f49344b;
        this.fragmentView = k0Var;
        oi0 oi0Var = new oi0(this, 24);
        WeakHashMap weakHashMap = r0.i0.f54202a;
        r0.a0.i(k0Var, oi0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f49343a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pb1 pb1Var = (pb1) sparseArray.valueAt(i7);
            if (pb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = pb1Var.f48735a;
                if (f2Var.fragmentView != null) {
                    arrayList.addAll(f2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null && c02.fragmentView != null) {
            return c02.isLightStatusBar();
        }
        return super.isLightStatusBar();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean onBackPressed(boolean z9) {
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.j5 j5Var;
        if (hasShownSheet()) {
            if (z9) {
                closeSheet();
                return false;
            }
        } else {
            org.telegram.ui.ActionBar.f2 c02 = c0();
            if (c02 != null) {
                z4Var = c02.getSimpleActionBar();
            } else {
                z4Var = null;
            }
            if (z4Var != null && ((j5Var = z4Var.Q) != null || (!z4Var.G && z4Var.F))) {
                if (z9) {
                    if (j5Var != null) {
                        j5Var.a(true);
                        return false;
                    }
                    if (!z4Var.G && z4Var.F) {
                        z4Var.l(true);
                    }
                    return false;
                }
            } else if (c02 == null || c02.onBackPressed(z9)) {
                return super.onBackPressed(z9);
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.f49346e = 0.0f;
        this.h = false;
        Z();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f49346e = 1.0f;
        this.h = true;
        Z();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f49343a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pb1 pb1Var = (pb1) sparseArray.valueAt(i7);
            boolean z9 = pb1Var.f48736b;
            org.telegram.ui.ActionBar.f2 f2Var = pb1Var.f48735a;
            if (z9) {
                f2Var.onFragmentDestroy();
                f2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f49347f = false;
        Z();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.f2 c02 = c0();
        if (c02 != null) {
            c02.onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f49347f = true;
        checkSystemBarColors();
        Z();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f49343a;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            pb1 pb1Var = (pb1) sparseArray.valueAt(i7);
            if (pb1Var != null) {
                org.telegram.ui.ActionBar.f2 f2Var = pb1Var.f48735a;
                if (f2Var.fragmentView != null) {
                    try {
                        f2Var.onThemeColorsChanged();
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                }
            }
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z9, float f10) {
        super.onTransitionAnimationProgress(z9, f10);
        if (!z9) {
            f10 = 1.0f - f10;
        }
        this.f49346e = f10;
        Z();
    }

    @Override
    public final void setTitleOverlayText(String str, int i7, Runnable runnable) {
        super.setTitleOverlayText(str, i7, runnable);
        this.f49348n = str;
        this.f49349r = i7;
        this.f49350s = runnable;
        SparseArray sparseArray = this.f49343a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            pb1 pb1Var = (pb1) sparseArray.valueAt(i10);
            if (pb1Var != null) {
                pb1Var.f48735a.setTitleOverlayText(str, i7, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i7, Runnable runnable) {
        setTitleOverlayText(str, i7, runnable);
    }
}
