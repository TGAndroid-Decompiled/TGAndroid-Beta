package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class rh1 extends org.telegram.ui.ActionBar.o2 {
    public final SparseArray f37132a;
    public l0 f37133b;
    public qh1 f37134c;
    public int d;
    public float e;
    public boolean f37135f;
    public boolean h;
    public String f37136n;
    public int f37137r;
    public Runnable f37138s;

    public rh1() {
        super(null);
        this.f37132a = new SparseArray();
        this.d = -1;
        this.e = 0.0f;
    }

    public final void U() {
        float f7;
        boolean z10;
        float f10;
        SparseArray sparseArray = this.f37132a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            int keyAt = sparseArray.keyAt(i10);
            if (ph1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = ph1Var.f36485a;
                if (o2Var.fragmentView != null) {
                    float r10 = this.f37134c.r(keyAt);
                    boolean z11 = this.f37135f;
                    if (z11) {
                        f7 = this.e;
                    } else {
                        f7 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f11 = ph1Var.f36488f;
                    float f12 = f7 * r10;
                    ph1Var.f36488f = f12;
                    if (f12 > f11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!ph1Var.d && r10 > 0.0f && z11 && o2Var.fragmentView != null) {
                        o2Var.onResume();
                        ph1Var.d = true;
                    }
                    if (!ph1Var.e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        o2Var.onTransitionAnimationStart(z10, false);
                        ph1Var.e = true;
                    }
                    if (ph1Var.e && f11 != f12) {
                        if (z10) {
                            f10 = f12;
                        } else {
                            f10 = 1.0f - f12;
                        }
                        o2Var.onTransitionAnimationProgress(z10, f10);
                    }
                    if (ph1Var.e && (f12 == 0.0f || f12 == 1.0f)) {
                        o2Var.onTransitionAnimationEnd(z10, false);
                        ph1Var.e = false;
                    }
                    if (!ph1Var.f36487c && f12 >= 1.0f) {
                        o2Var.onBecomeFullyVisible();
                        ph1Var.f36487c = true;
                    }
                    if (ph1Var.f36487c && ((f12 == 0.0f && !z12) || r10 == 0.0f)) {
                        o2Var.onBecomeFullyHidden();
                        ph1Var.f36487c = false;
                    }
                    if (ph1Var.d && ((f12 == 0.0f && !z11) || r10 == 0.0f)) {
                        o2Var.onPause();
                        ph1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.o2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f37132a;
        ph1 ph1Var = (ph1) sparseArray.get(i10);
        if (ph1Var != null) {
            org.telegram.ui.ActionBar.o2 o2Var = ph1Var.f36485a;
            if (ph1Var.f36487c) {
                o2Var.onBecomeFullyHidden();
            }
            if (ph1Var.d) {
                o2Var.onPause();
            }
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.o2 X() {
        qh1 qh1Var = this.f37134c;
        if (qh1Var == null) {
            return null;
        }
        ph1 ph1Var = (ph1) this.f37132a.get(qh1Var.getCurrentPosition());
        if (ph1Var == null) {
            return null;
        }
        return ph1Var.f36485a;
    }

    @Override
    public final void clearViews() {
        qh1 qh1Var = this.f37134c;
        if (qh1Var != null) {
            this.d = qh1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f37132a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            if (ph1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = ph1Var.f36485a;
                if (ph1Var.d) {
                    o2Var.onPause();
                    ph1Var.d = false;
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
        this.f37133b = new l0((bh0) this, context, 12);
        qh1 qh1Var = new qh1(this, context);
        this.f37134c = qh1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        qh1Var.setPosition(this.d);
        this.f37134c.setAdapter(new cw0(this, context, 3));
        this.f37133b.addView(this.f37134c, w7.y5.c(-1.0f, -1));
        l0 l0Var = this.f37133b;
        this.fragmentView = l0Var;
        qk0 qk0Var = new qk0(this, 29);
        WeakHashMap weakHashMap = r0.i0.f42173a;
        r0.a0.j(l0Var, qk0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f37132a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            if (ph1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = ph1Var.f36485a;
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
        SparseArray sparseArray = this.f37132a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i10);
            boolean z10 = ph1Var.f36486b;
            org.telegram.ui.ActionBar.o2 o2Var = ph1Var.f36485a;
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
        this.f37135f = false;
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
        this.f37135f = true;
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
        this.f37136n = str;
        this.f37137r = i10;
        this.f37138s = runnable;
        SparseArray sparseArray = this.f37132a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ph1 ph1Var = (ph1) sparseArray.valueAt(i11);
            if (ph1Var != null) {
                ph1Var.f36485a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
