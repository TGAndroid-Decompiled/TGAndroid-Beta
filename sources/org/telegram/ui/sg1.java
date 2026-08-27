package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class sg1 extends org.telegram.ui.ActionBar.n2 {

    public final SparseArray f42638a;

    public n0 f42639b;

    public rg1 f42640c;
    public int d;

    public float f42641e;

    public boolean f42642f;
    public boolean h;

    public String f42643n;

    public int f42644r;

    public Runnable f42645s;

    public sg1() {
        super(null);
        this.f42638a = new SparseArray();
        this.d = -1;
        this.f42641e = 0.0f;
    }

    public final void U() {
        SparseArray sparseArray = this.f42638a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            qg1 qg1Var = (qg1) sparseArray.valueAt(i10);
            int iKeyAt = sparseArray.keyAt(i10);
            if (qg1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = qg1Var.f41659a;
                if (n2Var.fragmentView != null) {
                    float fR = this.f42640c.r(iKeyAt);
                    boolean z10 = this.f42642f;
                    float f10 = z10 ? this.f42641e : 0.0f;
                    boolean z11 = this.h;
                    float f11 = qg1Var.f41663f;
                    float f12 = f10 * fR;
                    qg1Var.f41663f = f12;
                    boolean z12 = f12 > f11;
                    if (!qg1Var.d && fR > 0.0f && z10 && n2Var.fragmentView != null) {
                        n2Var.onResume();
                        qg1Var.d = true;
                    }
                    if (!qg1Var.f41662e && ((f11 == 0.0f || f11 == 1.0f) && f11 != f12 && Math.abs(f11 - f12) != 1.0f)) {
                        n2Var.onTransitionAnimationStart(z12, false);
                        qg1Var.f41662e = true;
                    }
                    if (qg1Var.f41662e && f11 != f12) {
                        n2Var.onTransitionAnimationProgress(z12, z12 ? f12 : 1.0f - f12);
                    }
                    if (qg1Var.f41662e && (f12 == 0.0f || f12 == 1.0f)) {
                        n2Var.onTransitionAnimationEnd(z12, false);
                        qg1Var.f41662e = false;
                    }
                    if (!qg1Var.f41661c && f12 >= 1.0f) {
                        n2Var.onBecomeFullyVisible();
                        qg1Var.f41661c = true;
                    }
                    if (qg1Var.f41661c && ((f12 == 0.0f && !z11) || fR == 0.0f)) {
                        n2Var.onBecomeFullyHidden();
                        qg1Var.f41661c = false;
                    }
                    if (qg1Var.d && ((f12 == 0.0f && !z10) || fR == 0.0f)) {
                        n2Var.onPause();
                        qg1Var.d = false;
                    }
                }
            }
        }
    }

    public abstract org.telegram.ui.ActionBar.n2 V(int i10);

    public final void W(int i10) {
        SparseArray sparseArray = this.f42638a;
        qg1 qg1Var = (qg1) sparseArray.get(i10);
        if (qg1Var != null) {
            org.telegram.ui.ActionBar.n2 n2Var = qg1Var.f41659a;
            if (qg1Var.f41661c) {
                n2Var.onBecomeFullyHidden();
            }
            if (qg1Var.d) {
                n2Var.onPause();
            }
            n2Var.onFragmentDestroy();
            n2Var.setParentLayout(null);
        }
        sparseArray.remove(i10);
    }

    public final org.telegram.ui.ActionBar.n2 X() {
        rg1 rg1Var = this.f42640c;
        if (rg1Var == null) {
            return null;
        }
        qg1 qg1Var = (qg1) this.f42638a.get(rg1Var.getCurrentPosition());
        if (qg1Var != null) {
            return qg1Var.f41659a;
        }
        return null;
    }

    @Override
    public final void clearViews() {
        rg1 rg1Var = this.f42640c;
        if (rg1Var != null) {
            this.d = rg1Var.getCurrentPosition();
        }
        SparseArray sparseArray = this.f42638a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            qg1 qg1Var = (qg1) sparseArray.valueAt(i10);
            if (qg1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = qg1Var.f41659a;
                if (qg1Var.d) {
                    n2Var.onPause();
                    qg1Var.d = false;
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
        this.f42639b = new n0((qg0) this, context, 13);
        rg1 rg1Var = new rg1(this, context);
        this.f42640c = rg1Var;
        if (this.d == -1) {
            this.d = 0;
        }
        rg1Var.setPosition(this.d);
        this.f42640c.setAdapter(new cg.u(this, context, 5));
        this.f42639b.addView(this.f42640c, h7.z5.c(-1.0f, -1));
        n0 n0Var = this.f42639b;
        this.fragmentView = n0Var;
        dl0 dl0Var = new dl0(this, 26);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(n0Var, dl0Var);
        return this.fragmentView;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = this.f42638a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            qg1 qg1Var = (qg1) sparseArray.valueAt(i10);
            if (qg1Var != null) {
                org.telegram.ui.ActionBar.n2 n2Var = qg1Var.f41659a;
                if (n2Var.fragmentView != null) {
                    arrayList.addAll(n2Var.getThemeDescriptions());
                }
            }
        }
        return arrayList;
    }

    @Override
    public final boolean isLightStatusBar() {
        org.telegram.ui.ActionBar.n2 n2VarX = X();
        return (n2VarX == null || n2VarX.fragmentView == null) ? super.isLightStatusBar() : n2VarX.isLightStatusBar();
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
        org.telegram.ui.ActionBar.n2 n2VarX = X();
        if (n2VarX == null || n2VarX.onBackPressed(z10)) {
            return super.onBackPressed(z10);
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        this.f42641e = 0.0f;
        this.h = false;
        U();
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        this.f42641e = 1.0f;
        this.h = true;
        U();
        checkSystemBarColors();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        SparseArray sparseArray = this.f42638a;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            qg1 qg1Var = (qg1) sparseArray.valueAt(i10);
            boolean z10 = qg1Var.f41660b;
            org.telegram.ui.ActionBar.n2 n2Var = qg1Var.f41659a;
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
        this.f42642f = false;
        U();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        org.telegram.ui.ActionBar.n2 n2VarX = X();
        if (n2VarX != null) {
            n2VarX.onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        this.f42642f = true;
        checkSystemBarColors();
        U();
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z10, float f10) {
        super.onTransitionAnimationProgress(z10, f10);
        if (!z10) {
            f10 = 1.0f - f10;
        }
        this.f42641e = f10;
        U();
    }

    @Override
    public final void setTitleOverlayText(String str, int i10, Runnable runnable) {
        super.setTitleOverlayText(str, i10, runnable);
        this.f42643n = str;
        this.f42644r = i10;
        this.f42645s = runnable;
        SparseArray sparseArray = this.f42638a;
        int size = sparseArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            qg1 qg1Var = (qg1) sparseArray.valueAt(i11);
            if (qg1Var != null) {
                qg1Var.f41659a.setTitleOverlayText(str, i10, runnable);
            }
        }
    }

    @Override
    public final void setTitleOverlayTextIfActionBarAttached(String str, int i10, Runnable runnable) {
        setTitleOverlayText(str, i10, runnable);
    }
}
