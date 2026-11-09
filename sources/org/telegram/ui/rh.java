package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class rh implements c5.g {
    public final AtomicBoolean f49480a;
    public final LinearLayout f49481b;
    public final int f49482c;
    public final HorizontalScrollView d;
    public final SparseIntArray f49483e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f49484f;
    public final int[] f49485g;

    public rh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i7, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f49480a = atomicBoolean;
        this.f49481b = linearLayout;
        this.f49482c = i7;
        this.d = horizontalScrollView;
        this.f49483e = sparseIntArray;
        this.f49484f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f49485g = iArr;
    }

    @Override
    public final void a(int i7) {
        this.f49484f.getSwipeBack().f(this.f49485g[0], this.f49483e.get(i7), true);
    }

    @Override
    public final void b(float f10, int i7, int i10) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f11;
        if (!this.f49480a.get()) {
            float f12 = -1.0f;
            float f13 = -1.0f;
            int i11 = 0;
            while (true) {
                LinearLayout linearLayout = this.f49481b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i11 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.th0 th0Var = (org.telegram.ui.Components.th0) linearLayout.getChildAt(i11);
                if (i11 == i7) {
                    f11 = 1.0f - f10;
                } else if (i11 == (i7 + 1) % this.f49482c) {
                    f11 = f10;
                } else {
                    f11 = 0.0f;
                }
                th0Var.setOutlineProgress(f11);
                if (i11 == i7) {
                    f12 = th0Var.getX() - ((horizontalScrollView.getWidth() - th0Var.getWidth()) / 2.0f);
                }
                if (i11 == i7 + 1) {
                    f13 = th0Var.getX() - ((horizontalScrollView.getWidth() - th0Var.getWidth()) / 2.0f);
                }
                i11++;
            }
            if (f12 != -1.0f && f13 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.z(f13, f12, f10, f12));
            }
            int i12 = this.f49483e.get(i7, 0);
            this.f49484f.getSwipeBack().f(this.f49485g[0], (int) ((sparseIntArray.get(i7 + 1, 0) * f10) + ((1.0f - f10) * i12)), false);
        }
    }

    @Override
    public final void c(int i7) {
        if (i7 == 0) {
            this.f49480a.set(false);
        }
    }
}
