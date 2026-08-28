package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class wh implements m2.e {
    public final AtomicBoolean f44134a;
    public final LinearLayout f44135b;
    public final int f44136c;
    public final HorizontalScrollView d;
    public final SparseIntArray f44137e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f44138f;
    public final int[] f44139g;

    public wh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i9, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f44134a = atomicBoolean;
        this.f44135b = linearLayout;
        this.f44136c = i9;
        this.d = horizontalScrollView;
        this.f44137e = sparseIntArray;
        this.f44138f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f44139g = iArr;
    }

    @Override
    public final void b(int i9) {
        this.f44138f.getSwipeBack().f(this.f44139g[0], this.f44137e.get(i9), true);
    }

    @Override
    public final void c(float f10, int i9, int i10) {
        HorizontalScrollView horizontalScrollView;
        float f11;
        if (!this.f44134a.get()) {
            int i11 = 0;
            float f12 = -1.0f;
            float f13 = -1.0f;
            while (true) {
                LinearLayout linearLayout = this.f44135b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i11 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.fj0 fj0Var = (org.telegram.ui.Components.fj0) linearLayout.getChildAt(i11);
                if (i11 == i9) {
                    f11 = 1.0f - f10;
                } else if (i11 == (i9 + 1) % this.f44136c) {
                    f11 = f10;
                } else {
                    f11 = 0.0f;
                }
                fj0Var.setOutlineProgress(f11);
                if (i11 == i9) {
                    f12 = fj0Var.getX() - ((horizontalScrollView.getWidth() - fj0Var.getWidth()) / 2.0f);
                }
                if (i11 == i9 + 1) {
                    f13 = fj0Var.getX() - ((horizontalScrollView.getWidth() - fj0Var.getWidth()) / 2.0f);
                }
                i11++;
            }
            if (f12 != -1.0f && f13 != -1.0f) {
                horizontalScrollView.setScrollX((int) e2.c.z(f13, f12, f10, f12));
            }
            SparseIntArray sparseIntArray = this.f44137e;
            int i12 = sparseIntArray.get(i9, 0);
            float f14 = sparseIntArray.get(i9 + 1, 0) * f10;
            this.f44138f.getSwipeBack().f(this.f44139g[0], (int) (f14 + ((1.0f - f10) * i12)), false);
        }
    }

    @Override
    public final void d(int i9) {
        if (i9 == 0) {
            this.f44134a.set(false);
        }
    }
}
