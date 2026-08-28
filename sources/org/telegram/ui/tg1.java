package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;
public abstract class tg1 extends org.telegram.ui.ActionBar.o2 {
    public final SparseArray f42997a;
    public m0 f42998b;
    public sg1 f42999c;
    public int d;
    public float f43000e;
    public boolean f43001f;
    public boolean h;
    public String f43002n;
    public int f43003r;
    public Runnable f43004s;

    public tg1() {
        super(null);
        this.f42997a = new SparseArray();
        this.d = -1;
        this.f43000e = 0.0f;
    }

    public final void T() {
        float f10;
        boolean z10;
        float f11;
        SparseArray sparseArray = this.f42997a;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i9);
            int keyAt = sparseArray.keyAt(i9);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f42421a;
                if (o2Var.fragmentView != null) {
                    float r10 = this.f42999c.r(keyAt);
                    boolean z11 = this.f43001f;
                    if (z11) {
                        f10 = this.f43000e;
                    } else {
                        f10 = 0.0f;
                    }
                    boolean z12 = this.h;
                    float f12 = rg1Var.f42425f;
                    float f13 = f10 * r10;
                    rg1Var.f42425f = f13;
                    if (f13 > f12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!rg1Var.d && r10 > 0.0f && z11 && o2Var.fragmentView != null) {
                        o2Var.onResume();
                        rg1Var.d = true;
                    }
                    if (!rg1Var.f42424e && ((f12 == 0.0f || f12 == 1.0f) && f12 != f13 && Math.abs(f12 - f13) != 1.0f)) {
                        o2Var.onTransitionAnimationStart(z10, false);
                        rg1Var.f42424e = true;
                    }
                    if (rg1Var.f42424e && f12 != f13) {
                        if (z10) {
                            f11 = f13;
                        } else {
                            f11 = 1.0f - f13;
                        }
                        o2Var.onTransitionAnimationProgress(z10, f11);
                    }
                    if (rg1Var.f42424e && (f13 == 0.0f || f13 == 1.0f)) {
                        o2Var.onTransitionAnimationEnd(z10, false);
                        rg1Var.f42424e = false;
                    }
                    if (!rg1Var.f42423c && f13 >= 1.0f) {
                        o2Var.onBecomeFullyVisible();
                        rg1Var.f42423c = true;
                    }
                    if (rg1Var.f42423c && ((f13 == 0.0f && !z12) || r10 == 0.0f)) {
                        o2Var.onBecomeFullyHidden();
                        rg1Var.f42423c = false;
                    }
                    if (rg1Var.d && ((f13 == 0.0f && !z11) || r10 == 0.0f)) {
                        o2Var.onPause();
                        rg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.o2 U(int i9);

    public final void V(int i9) {
        SparseArray sparseArray = this.f42997a;
        rg1 rg1Var = (rg1) sparseArray.get(i9);
        if (rg1Var != null) {
            org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f42421a;
            if (rg1Var.f42423c) {
                o2Var.onBecomeFullyHidden();
            }
            if (rg1Var.d) {
                o2Var.onPause();
            }
            o2Var.onFragmentDestroy();
            o2Var.setParentLayout(null);
        }
        sparseArray.remove(i9);
    }

    public final org.telegram.ui.ActionBar.o2 W() {
        sg1 sg1Var = this.f42999c;
        if (sg1Var == null) {
            return null;
        }
        rg1 rg1Var = (rg1) this.f42997a.get(sg1Var.getCurrentPosition());
        if (rg1Var == null) {
            return null;
        }
        return rg1Var.f42421a;
    }

    @Override
    public final void clearViews() {
        sg1 sg1Var = this.f42999c;
        if (sg1Var != null) {
            this.d = sg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f42997a;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i9);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f42421a;
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
        this.f42998b = new m0((ng0) this, context, 13);
        sg1 sg1Var = new sg1(this, context);
        this.f42999c = sg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        sg1Var.setPosition(this.d);
        this.f42999c.setAdapter(new bg.x(this, context, 5));
        this.f42998b.addView(this.f42999c, g7.e6.c(-1.0f, -1));
        m0 m0Var = this.f42998b;
        this.fragmentView = m0Var;
        dl0 dl0Var = new dl0(this, 26);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(m0Var, dl0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f42997a;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i9);
            if (rg1Var != null) {
                org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f42421a;
                if (o2Var.fragmentView != null) {
                    arrayList.addAll(o2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.o2 W = W();
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
        org.telegram.ui.ActionBar.o2 W = W();
        if (W != null && !W.onBackPressed(z10)) {
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.f43000e = 0.0f;
        this.h = false;
        T();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f43000e = 1.0f;
        this.h = true;
        T();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f42997a;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i9);
            boolean z10 = rg1Var.f42422b;
            org.telegram.ui.ActionBar.o2 o2Var = rg1Var.f42421a;
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
        this.f43001f = false;
        T();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.o2 W = W();
        if (W != null) {
            W.onRequestPermissionsResultFragment(i9, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f43001f = true;
        checkSystemBarColors();
        T();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        if (!z10) {
            f10 = 1.0f - f10;
        }
        this.f43000e = f10;
        T();
    }

    @Override
    public final void setTitleOverlayText(String str, int i9, Runnable runnable) {
        super.setTitleOverlayText(str, i9, runnable);
        this.f43002n = str;
        this.f43003r = i9;
        this.f43004s = runnable;
        SparseArray sparseArray = this.f42997a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            rg1 rg1Var = (rg1) sparseArray.valueAt(i10);
            if (rg1Var != null) {
                rg1Var.f42421a.setTitleOverlayText(str, i9, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i9, Runnable runnable) {
        setTitleOverlayText(str, i9, runnable);
    }
}
