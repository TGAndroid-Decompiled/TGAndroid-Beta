package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class yh implements m2.e {

    public final AtomicBoolean f44831a;

    public final LinearLayout f44832b;

    public final int f44833c;
    public final HorizontalScrollView d;

    public final SparseIntArray f44834e;

    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f44835f;

    public final int[] f44836g;

    public yh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f44831a = atomicBoolean;
        this.f44832b = linearLayout;
        this.f44833c = i10;
        this.d = horizontalScrollView;
        this.f44834e = sparseIntArray;
        this.f44835f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f44836g = iArr;
    }

    @Override
    public final void b(int i10) {
        this.f44835f.getSwipeBack().f(this.f44836g[0], this.f44834e.get(i10), true);
    }

    @Override
    public final void c(float f10, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        float f11;
        if (this.f44831a.get()) {
            return;
        }
        int i12 = 0;
        float x8 = -1.0f;
        float x10 = -1.0f;
        while (true) {
            LinearLayout linearLayout = this.f44832b;
            int childCount = linearLayout.getChildCount();
            horizontalScrollView = this.d;
            if (i12 >= childCount) {
                break;
            }
            org.telegram.ui.Components.hj0 hj0Var = (org.telegram.ui.Components.hj0) linearLayout.getChildAt(i12);
            if (i12 == i10) {
                f11 = 1.0f - f10;
            } else {
                f11 = i12 == (i10 + 1) % this.f44833c ? f10 : 0.0f;
            }
            hj0Var.setOutlineProgress(f11);
            if (i12 == i10) {
                x8 = hj0Var.getX() - ((horizontalScrollView.getWidth() - hj0Var.getWidth()) / 2.0f);
            }
            if (i12 == i10 + 1) {
                x10 = hj0Var.getX() - ((horizontalScrollView.getWidth() - hj0Var.getWidth()) / 2.0f);
            }
            i12++;
        }
        if (x8 != -1.0f && x10 != -1.0f) {
            horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.z(x10, x8, f10, x8));
        }
        SparseIntArray sparseIntArray = this.f44834e;
        this.f44835f.getSwipeBack().f(this.f44836g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f10) + ((1.0f - f10) * sparseIntArray.get(i10, 0))), false);
    }

    @Override
    public final void d(int i10) {
        if (i10 == 0) {
            this.f44831a.set(false);
        }
    }
}
