package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.FileLog;
public abstract class tg1 extends org.telegram.ui.ActionBar.o2 {
    public final SparseArray f42049a;
    public l0 f42050b;
    public sg1 f42051c;
    public int d;
    public float e;
    public boolean f42052f;
    public boolean h;
    public String f42053n;
    public int f42054r;
    public Runnable f42055s;

    public tg1() {
        super(null);
        this.f42049a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f42049a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f41154a;
                if (o2Var.fragmentView != null) {
                    float r10 = this.f42051c.r(keyAt);
                    boolean z11 = this.f42052f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = rg1Var.f41157f;
                    float f12 = f7 * r10;
                    rg1Var.f41157f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!rg1Var.d && r10 > 0.0f && z11 && o2Var.fragmentView != null) {
                        o2Var.onResume();
                        rg1Var.d = true;
                    }
                    if (!rg1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        o2Var.onTransitionAnimationStart(z10, false);
                        rg1Var.e = true;
                    }
                    if (rg1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        o2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (rg1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        o2Var.onTransitionAnimationEnd(z10, false);
                        rg1Var.e = false;
                    }
                    if (!rg1Var.f41156c && f12 >= 1.0f) {
                        o2Var.onBecomeFullyVisible();
                        rg1Var.f41156c = true;
                    }
                    if (rg1Var.f41156c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        o2Var.onBecomeFullyHidden();
                        rg1Var.f41156c = false;
                    }
                    if (rg1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        o2Var.onPause();
                        rg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.o2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f42049a;
        rg1 rg1Var = (rg1) sparseArray.get(i10);
        if (rg1Var != null) {
            org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f41154a;
            if (rg1Var.f41156c) {
                o2Var.onBecomeFullyHidden();
            }
            if (rg1Var.d) {
                o2Var.onPause();
            }
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.o2 X() {
        sg1 sg1Var = this.f42051c;
        if (sg1Var == null) {
            return null;
        }
        rg1 rg1Var = (rg1) this.f42049a.get(sg1Var.getCurrentPosition());
        if (rg1Var == null) {
            return null;
        }
        return rg1Var.f41154a;
    }

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f42049a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i10);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f41154a;
                if (o2Var.fragmentView != null) {
                    o2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    @Override
    public final void clearViews() {
        sg1 sg1Var = this.f42051c;
        if (sg1Var != null) {
            this.d = sg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f42049a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i10);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f41154a;
                if (rg1Var.d) {
                    o2Var.onPause();
                    rg1Var.d = false;
                }
                o2Var.clearViews();
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
        this.f42050b = new l0((qg0) this, context, 13);
        sg1 sg1Var = new sg1(this, context);
        this.f42051c = sg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        sg1Var.setPosition(this.d);
        this.f42051c.setAdapter(new ai.j5(this, context, 4));
        this.f42050b.addView(this.f42051c, w7.z5.c(-1.0f, -1));
        l0 l0Var = this.f42050b;
        this.fragmentView = l0Var;
        rp0 rp0Var = new rp0(this, 25);
        WeakHashMap weakHashMap = r0.i0.f45241a;
        r0.a0.i(l0Var, rp0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f42049a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i10);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f41154a;
                if (o2Var.fragmentView != null) {
                    arrayList.addAll(o2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.o2 X = X();
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
        org.telegram.ui.ActionBar.o2 X = X();
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
        SparseArray sparseArray = this.f42049a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i10);
            boolean z10 = rg1Var.f41155b;
            org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f41154a;
            if (z10) {
                o2Var.onFragmentDestroy();
                o2Var.setParentLayout(null);
            }
        }
        sparseArray.clear();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.f42052f = false;
        U();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.o2 X = X();
        if (X != null) {
            X.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f42052f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f42049a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i10);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f41154a;
                if (o2Var.fragmentView != null) {
                    try {
                        o2Var.onThemeColorsChanged();
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
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f42053n = str;
        this.f42054r = i10;
        this.f42055s = runnable;
        SparseArray sparseArray = this.f42049a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i11);
            if (rg1Var != null) {
                rg1Var.f41154a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
