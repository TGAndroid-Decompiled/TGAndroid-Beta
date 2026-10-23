package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.FileLog;
public abstract class ug1 extends org.telegram.ui.ActionBar.o2 {
    public final SparseArray f42431a;
    public l0 f42432b;
    public tg1 f42433c;
    public int d;
    public float e;
    public boolean f42434f;
    public boolean h;
    public String f42435n;
    public int f42436r;
    public Runnable f42437s;

    public ug1() {
        super(null);
        this.f42431a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f42431a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = sg1Var.f41408a;
                if (o2Var.fragmentView != null) {
                    float r10 = this.f42433c.r(keyAt);
                    boolean z11 = this.f42434f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = sg1Var.f41411f;
                    float f12 = f7 * r10;
                    sg1Var.f41411f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!sg1Var.d && r10 > 0.0f && z11 && o2Var.fragmentView != null) {
                        o2Var.onResume();
                        sg1Var.d = true;
                    }
                    if (!sg1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        o2Var.onTransitionAnimationStart(z10, false);
                        sg1Var.e = true;
                    }
                    if (sg1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        o2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (sg1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        o2Var.onTransitionAnimationEnd(z10, false);
                        sg1Var.e = false;
                    }
                    if (!sg1Var.f41410c && f12 >= 1.0f) {
                        o2Var.onBecomeFullyVisible();
                        sg1Var.f41410c = true;
                    }
                    if (sg1Var.f41410c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        o2Var.onBecomeFullyHidden();
                        sg1Var.f41410c = false;
                    }
                    if (sg1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        o2Var.onPause();
                        sg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.o2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f42431a;
        sg1 sg1Var = (sg1) sparseArray.get(i10);
        if (sg1Var != null) {
            org.telegram.ui.ActionBar.o2 o2Var = sg1Var.f41408a;
            if (sg1Var.f41410c) {
                o2Var.onBecomeFullyHidden();
            }
            if (sg1Var.d) {
                o2Var.onPause();
            }
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.o2 X() {
        tg1 tg1Var = this.f42433c;
        if (tg1Var == null) {
            return null;
        }
        sg1 sg1Var = (sg1) this.f42431a.get(tg1Var.getCurrentPosition());
        if (sg1Var == null) {
            return null;
        }
        return sg1Var.f41408a;
    }

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f42431a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = sg1Var.f41408a;
                if (o2Var.fragmentView != null) {
                    o2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    @Override
    public final void clearViews() {
        tg1 tg1Var = this.f42433c;
        if (tg1Var != null) {
            this.d = tg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f42431a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = sg1Var.f41408a;
                if (sg1Var.d) {
                    o2Var.onPause();
                    sg1Var.d = false;
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
        this.f42432b = new l0((rg0) this, context, 13);
        tg1 tg1Var = new tg1(this, context);
        this.f42433c = tg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        tg1Var.setPosition(this.d);
        this.f42433c.setAdapter(new ai.j5(this, context, 4));
        this.f42432b.addView(this.f42433c, w7.z5.c(-1.0f, -1));
        l0 l0Var = this.f42432b;
        this.fragmentView = l0Var;
        sp0 sp0Var = new sp0(this, 25);
        WeakHashMap weakHashMap = r0.i0.f45242a;
        r0.a0.i(l0Var, sp0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f42431a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = sg1Var.f41408a;
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
        SparseArray sparseArray = this.f42431a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            boolean z10 = sg1Var.f41409b;
            org.telegram.ui.ActionBar.o2 o2Var = sg1Var.f41408a;
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
        this.f42434f = false;
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
        this.f42434f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f42431a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = sg1Var.f41408a;
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
        this.f42435n = str;
        this.f42436r = i10;
        this.f42437s = runnable;
        SparseArray sparseArray = this.f42431a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i11);
            if (sg1Var != null) {
                sg1Var.f41408a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
