package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zh implements z4.f {
    public final AtomicBoolean f44104a;
    public final LinearLayout f44105b;
    public final int f44106c;
    public final HorizontalScrollView d;
    public final SparseIntArray e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f44107f;
    public final int[] f44108g;

    public zh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f44104a = atomicBoolean;
        this.f44105b = linearLayout;
        this.f44106c = i10;
        this.d = horizontalScrollView;
        this.e = sparseIntArray;
        this.f44107f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f44108g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f44107f.getSwipeBack().f(this.f44108g[0], this.e.get(i10), true);
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        SparseIntArray sparseIntArray;
        float f10;
        if (!this.f44104a.get()) {
            float f11 = -1.0f;
            float f12 = -1.0f;
            int i12 = 0;
            while (true) {
                LinearLayout linearLayout = this.f44105b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.qk0 qk0Var = (org.telegram.ui.Components.qk0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f7;
                } else if (i12 == (i10 + 1) % this.f44106c) {
                    f10 = f7;
                } else {
                    f10 = 0.0f;
                }
                qk0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = qk0Var.getX() - ((horizontalScrollView.getWidth() - qk0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = qk0Var.getX() - ((horizontalScrollView.getWidth() - qk0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.gms.internal.play_billing.k3.y(f12, f11, f7, f11));
            }
            int i13 = this.e.get(i10, 0);
            this.f44107f.getSwipeBack().f(this.f44108g[0], (int) ((sparseIntArray.get(i10 + 1, 0) * f7) + ((1.0f - f7) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f44104a.set(false);
        }
    }
}
