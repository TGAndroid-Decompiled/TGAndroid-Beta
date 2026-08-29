package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class vg1 extends org.telegram.ui.ActionBar.o2 {
    public final SparseArray f43592a;
    public n0 f43593b;
    public ug1 f43594c;
    public int d;
    public float f43595e;
    public boolean f43596f;
    public boolean h;
    public String f43597n;
    public int f43598r;
    public Runnable f43599s;

    public vg1() {
        super(null);
        this.f43592a = new SparseArray();
        this.d = -1;
        this.f43595e = 0.0f;
    }

    public final void U() {
        float f9;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f43592a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            tg1 tg1Var = (tg1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (tg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = tg1Var.f42707a;
                if (o2Var.fragmentView != null) {
                    float r6 = this.f43594c.r(keyAt);
                    boolean z11 = this.f43596f;
                    if (z11) {
                        f9 = this.f43595e;
                    } else {
                        f9 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = tg1Var.f42711f;
                    float f12 = f9 * r6;
                    tg1Var.f42711f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!tg1Var.d && r6 > 0.0f && z11 && o2Var.fragmentView != null) {
                        o2Var.onResume();
                        tg1Var.d = true;
                    }
                    if (!tg1Var.f42710e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        o2Var.onTransitionAnimationStart(z10, false);
                        tg1Var.f42710e = true;
                    }
                    if (tg1Var.f42710e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        o2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (tg1Var.f42710e && (f12 == 0.0f || f12 == 1.0f)) {
                        o2Var.onTransitionAnimationEnd(z10, false);
                        tg1Var.f42710e = false;
                    }
                    if (!tg1Var.f42709c && f12 >= 1.0f) {
                        o2Var.onBecomeFullyVisible();
                        tg1Var.f42709c = true;
                    }
                    if (tg1Var.f42709c && ((f12 == 0.0f && !z12) || r6 == 0.0f)) {
                        o2Var.onBecomeFullyHidden();
                        tg1Var.f42709c = false;
                    }
                    if (tg1Var.d && ((f12 == 0.0f && !z11) || r6 == 0.0f)) {
                        o2Var.onPause();
                        tg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.o2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f43592a;
        tg1 tg1Var = (tg1) sparseArray.get(i10);
        if (tg1Var != null) {
            org.telegram.ui.ActionBar.o2 o2Var = tg1Var.f42707a;
            if (tg1Var.f42709c) {
                o2Var.onBecomeFullyHidden();
            }
            if (tg1Var.d) {
                o2Var.onPause();
            }
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.o2 X() {
        ug1 ug1Var = this.f43594c;
        if (ug1Var == null) {
            return null;
        }
        tg1 tg1Var = (tg1) this.f43592a.get(ug1Var.getCurrentPosition());
        if (tg1Var == null) {
            return null;
        }
        return tg1Var.f42707a;
    }

    @Override
    public final void clearViews() {
        ug1 ug1Var = this.f43594c;
        if (ug1Var != null) {
            this.d = ug1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f43592a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            tg1 tg1Var = (tg1) sparseArray.valueAt(i10);
            if (tg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = tg1Var.f42707a;
                if (tg1Var.d) {
                    o2Var.onPause();
                    tg1Var.d = false;
                }
                o2Var.clearViews();
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
        this.f43593b = new n0((ng0) this, context, 13);
        ug1 ug1Var = new ug1(this, context);
        this.f43594c = ug1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        ug1Var.setPosition(this.d);
        this.f43594c.setAdapter(new eg.v(this, context, 5));
        this.f43593b.addView(this.f43594c, i7.f6.c(-1.0f, -1));
        n0 n0Var = this.f43593b;
        this.fragmentView = n0Var;
        zk0 zk0Var = new zk0(this, 26);
        WeakHashMap weakHashMap = r0.j0.f46829a;
        r0.b0.j(n0Var, zk0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f43592a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            tg1 tg1Var = (tg1) sparseArray.valueAt(i10);
            if (tg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = tg1Var.f42707a;
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
        this.f43595e = 0.0f;
        this.h = false;
        U();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f43595e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f43592a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            tg1 tg1Var = (tg1) sparseArray.valueAt(i10);
            boolean z10 = tg1Var.f42708b;
            org.telegram.ui.ActionBar.o2 o2Var = tg1Var.f42707a;
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
        this.f43596f = false;
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
        this.f43596f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f9) {
        super.onTransitionAnimationProgress(z10, f9);
        if (!z10) {
            f9 = 1.0f - f9;
        }
        this.f43595e = f9;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f43597n = str;
        this.f43598r = i10;
        this.f43599s = runnable;
        SparseArray sparseArray = this.f43592a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            tg1 tg1Var = (tg1) sparseArray.valueAt(i11);
            if (tg1Var != null) {
                tg1Var.f42707a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
