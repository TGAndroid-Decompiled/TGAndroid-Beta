package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class u1 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final l60 f41763a;
    public final f4 f41764b;
    public z2 f41765c;
    public int d;
    public int e;
    public TL_iv.PageBlock f41766f;

    public u1(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f41763a = l60Var;
        this.f41764b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f41765c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + this.d;
        this.f41763a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f41765c;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + this.d;
        this.f41763a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f41765c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + this.d;
        this.f41763a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.a30.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f41765c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f41765c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f41765c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41766f != null && this.f41765c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.t(this.f41763a, canvas, this, 0);
            this.f41765c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f41765c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754863, h4.h(this.f41763a, this.f41764b, z2Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        l60 l60Var = this.f41763a;
        l60Var.getClass();
        this.d = org.telegram.messenger.i0.L(18);
        l60Var.getClass();
        this.e = org.telegram.messenger.i0.L(8);
        TL_iv.PageBlock pageBlock = this.f41766f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            l60 l60Var2 = this.f41763a;
            l60Var2.getClass();
            int L = size - org.telegram.messenger.i0.L(36);
            TL_iv.PageBlock pageBlock2 = this.f41766f;
            f4 f4Var = this.f41764b;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.pv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = h4.n(l60Var2, this, null, richText, L, 0, pageBlock2, alignment, 0, this.f41764b);
            this.f41765c = n10;
            if (n10 != null) {
                l60Var.getClass();
                i12 = this.f41765c.d.getHeight() + org.telegram.messenger.i0.L(16);
                z2 z2Var = this.f41765c;
                z2Var.f43793s = this.d;
                z2Var.f43794w = this.e;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f41763a, this.f41764b, motionEvent, this, this.f41765c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f41766f = pageBlock;
        requestLayout();
    }
}
