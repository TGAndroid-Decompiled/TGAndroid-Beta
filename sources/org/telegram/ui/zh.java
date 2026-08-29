package org.telegram.ui;

import android.util.SparseIntArray;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zh implements m2.e {
    public final AtomicBoolean f45217a;
    public final LinearLayout f45218b;
    public final int f45219c;
    public final HorizontalScrollView d;
    public final SparseIntArray f45220e;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f45221f;
    public final int[] f45222g;

    public zh(AtomicBoolean atomicBoolean, LinearLayout linearLayout, int i10, HorizontalScrollView horizontalScrollView, SparseIntArray sparseIntArray, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f45217a = atomicBoolean;
        this.f45218b = linearLayout;
        this.f45219c = i10;
        this.d = horizontalScrollView;
        this.f45220e = sparseIntArray;
        this.f45221f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f45222g = iArr;
    }

    @Override
    public final void a(int i10) {
        this.f45221f.getSwipeBack().f(this.f45222g[0], this.f45220e.get(i10), true);
    }

    @Override
    public final void b(float f9, int i10, int i11) {
        HorizontalScrollView horizontalScrollView;
        float f10;
        if (!this.f45217a.get()) {
            int i12 = 0;
            float f11 = -1.0f;
            float f12 = -1.0f;
            while (true) {
                LinearLayout linearLayout = this.f45218b;
                int childCount = linearLayout.getChildCount();
                horizontalScrollView = this.d;
                if (i12 >= childCount) {
                    break;
                }
                org.telegram.ui.Components.qj0 qj0Var = (org.telegram.ui.Components.qj0) linearLayout.getChildAt(i12);
                if (i12 == i10) {
                    f10 = 1.0f - f9;
                } else if (i12 == (i10 + 1) % this.f45219c) {
                    f10 = f9;
                } else {
                    f10 = 0.0f;
                }
                qj0Var.setOutlineProgress(f10);
                if (i12 == i10) {
                    f11 = qj0Var.getX() - ((horizontalScrollView.getWidth() - qj0Var.getWidth()) / 2.0f);
                }
                if (i12 == i10 + 1) {
                    f12 = qj0Var.getX() - ((horizontalScrollView.getWidth() - qj0Var.getWidth()) / 2.0f);
                }
                i12++;
            }
            if (f11 != -1.0f && f12 != -1.0f) {
                horizontalScrollView.setScrollX((int) com.google.android.recaptcha.internal.a.z(f12, f11, f9, f11));
            }
            SparseIntArray sparseIntArray = this.f45220e;
            int i13 = sparseIntArray.get(i10, 0);
            float f13 = sparseIntArray.get(i10 + 1, 0) * f9;
            this.f45221f.getSwipeBack().f(this.f45222g[0], (int) (f13 + ((1.0f - f9) * i13)), false);
        }
    }

    @Override
    public final void c(int i10) {
        if (i10 == 0) {
            this.f45217a.set(false);
        }
    }
}
