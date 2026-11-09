package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class t1 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final q50 f50031a;
    public final e4 f50032b;
    public z2 f50033c;
    public int d;
    public int f50034e;
    public TL_iv.PageBlock f50035f;

    public t1(Context context, q50 q50Var, e4 e4Var) {
        super(context);
        this.f50031a = q50Var;
        this.f50032b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f50033c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + this.d;
        this.f50031a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f50033c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + this.d;
        this.f50031a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f50033c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + this.d;
        this.f50031a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f50033c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50033c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50033c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f50035f != null && this.f50033c != null) {
            canvas.save();
            canvas.translate(this.d, this.f50034e);
            g4.t(this.f50031a, canvas, this, 0);
            this.f50033c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f50033c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754863, g4.h(this.f50031a, this.f50032b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        q50 q50Var = this.f50031a;
        q50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        q50Var.getClass();
        this.f50034e = org.telegram.messenger.g0.L(8);
        TL_iv.PageBlock pageBlock = this.f50035f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            q50 q50Var2 = this.f50031a;
            q50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.PageBlock pageBlock2 = this.f50035f;
            e4 e4Var = this.f50032b;
            if (e4Var != null && e4Var.G) {
                alignment = org.telegram.ui.Components.ou0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(q50Var2, this, null, richText, L, 0, pageBlock2, alignment, 0, this.f50032b);
            this.f50033c = n10;
            if (n10 != null) {
                q50Var.getClass();
                i11 = this.f50033c.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f50033c;
                z2Var.f52397s = this.d;
                z2Var.f52398w = this.f50034e;
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
        if (!g4.j(this.f50031a, this.f50032b, motionEvent, this, this.f50033c, this.d, this.f50034e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f50035f = pageBlock;
        requestLayout();
    }
}
