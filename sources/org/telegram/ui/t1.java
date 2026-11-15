package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class t1 extends View implements org.telegram.ui.Cells.g9, c3 {
    public final n50 f51318a;
    public final e4 f51319b;
    public z2 f51320c;
    public int d;
    public int f51321e;
    public TL_iv.PageBlock f51322f;

    public t1(Context context, n50 n50Var, e4 e4Var) {
        super(context);
        this.f51318a = n50Var;
        this.f51319b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f51320c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + this.d;
        this.f51318a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f51320c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + this.d;
        this.f51318a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f51320c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + this.d;
        this.f51318a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.i20.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f51320c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f51320c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f51320c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f51322f != null && this.f51320c != null) {
            canvas.save();
            canvas.translate(this.d, this.f51321e);
            g4.t(this.f51318a, canvas, this, 0);
            this.f51320c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f51320c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754863, g4.h(this.f51318a, this.f51319b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        n50 n50Var = this.f51318a;
        n50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        n50Var.getClass();
        this.f51321e = org.telegram.messenger.g0.L(8);
        TL_iv.PageBlock pageBlock = this.f51322f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            n50 n50Var2 = this.f51318a;
            n50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.PageBlock pageBlock2 = this.f51322f;
            e4 e4Var = this.f51319b;
            if (e4Var != null && e4Var.H) {
                alignment = org.telegram.ui.Components.ou0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(n50Var2, this, null, richText, L, 0, pageBlock2, alignment, 0, this.f51319b);
            this.f51320c = n10;
            if (n10 != null) {
                n50Var.getClass();
                i11 = this.f51320c.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f51320c;
                z2Var.f53812s = this.d;
                z2Var.f53813w = this.f51321e;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f51318a, this.f51319b, motionEvent, this, this.f51320c, this.d, this.f51321e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f51322f = pageBlock;
        requestLayout();
    }
}
