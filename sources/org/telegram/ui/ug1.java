package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.WeakHashMap;
import org.telegram.messenger.FileLog;
public abstract class ug1 extends org.telegram.ui.ActionBar.r2 {
    public final SparseArray f44133a;
    public k0 f44134b;
    public tg1 f44135c;
    public int d;
    public float e;
    public boolean f44136f;
    public boolean h;
    public String f44137n;
    public int f44138r;
    public Runnable f44139s;

    public ug1() {
        super(null);
        this.f44133a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void V() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f44133a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = sg1Var.f43505a;
                if (r2Var.fragmentView != null) {
                    float r6 = this.f44135c.r(keyAt);
                    boolean z11 = this.f44136f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    if (sg1Var.f43509g <= 0.0f && r6 > 0.0f && z11 && (r2Var instanceof og0)) {
                        ((og0) r2Var).D();
                    }
                    sg1Var.f43509g = r6;
                    float f11 = sg1Var.f43508f;
                    float f12 = f7 * r6;
                    sg1Var.f43508f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!sg1Var.d && r6 > 0.0f && z11 && r2Var.fragmentView != null) {
                        r2Var.onResume();
                        sg1Var.d = true;
                    }
                    if (!sg1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        r2Var.onTransitionAnimationStart(z10, false);
                        sg1Var.e = true;
                    }
                    if (sg1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        r2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (sg1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        r2Var.onTransitionAnimationEnd(z10, false);
                        sg1Var.e = false;
                    }
                    if (!sg1Var.f43507c && f12 >= 1.0f) {
                        r2Var.onBecomeFullyVisible();
                        sg1Var.f43507c = true;
                    }
                    if (sg1Var.f43507c && ((f12 == 0.0f && !z12) || r6 == 0.0f)) {
                        r2Var.onBecomeFullyHidden();
                        sg1Var.f43507c = false;
                    }
                    if (sg1Var.d && ((f12 == 0.0f && !z11) || r6 == 0.0f)) {
                        r2Var.onPause();
                        sg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.r2 W(int i10);

    public final org.telegram.ui.ActionBar.r2 X() {
        tg1 tg1Var = this.f44135c;
        if (tg1Var == null) {
            return null;
        }
        sg1 sg1Var = (sg1) this.f44133a.get(tg1Var.getCurrentPosition());
        if (sg1Var == null) {
            return null;
        }
        return sg1Var.f43505a;
    }

    @Override
    public void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        SparseArray sparseArray = this.f44133a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = sg1Var.f43505a;
                if (r2Var.fragmentView != null) {
                    r2Var.addThemeColorKeys(hashSet);
                }
            }
        }
    }

    @Override
    public final void clearViews() {
        tg1 tg1Var = this.f44135c;
        if (tg1Var != null) {
            this.d = tg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f44133a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = sg1Var.f43505a;
                if (sg1Var.d) {
                    r2Var.onPause();
                    sg1Var.d = false;
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
        this.f44134b = new k0((pg0) this, context, 13);
        tg1 tg1Var = new tg1(this, context);
        this.f44135c = tg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        tg1Var.setPosition(this.d);
        this.f44135c.setAdapter(new bi.e5(this, context, 5));
        this.f44134b.addView(this.f44135c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        k0 k0Var = this.f44134b;
        this.fragmentView = k0Var;
        hl0 hl0Var = new hl0(this, 26);
        WeakHashMap weakHashMap = r0.i0.f47108a;
        r0.a0.i(k0Var, hl0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f44133a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = sg1Var.f43505a;
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
        SparseArray sparseArray = this.f44133a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            boolean z10 = sg1Var.f43506b;
            org.telegram.ui.ActionBar.r2 r2Var = sg1Var.f43505a;
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
        this.f44136f = false;
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
        this.f44136f = true;
        checkSystemBarColors();
        V();
    }

    @Override
    public void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        SparseArray sparseArray = this.f44133a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i10);
            if (sg1Var != null) {
                org.telegram.ui.ActionBar.r2 r2Var = sg1Var.f43505a;
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
        this.f44137n = str;
        this.f44138r = i10;
        this.f44139s = runnable;
        SparseArray sparseArray = this.f44133a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            sg1 sg1Var = (sg1) sparseArray.valueAt(i11);
            if (sg1Var != null) {
                sg1Var.f43505a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
