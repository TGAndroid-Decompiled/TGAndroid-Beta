package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class v1 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final m60 f42564a;
    public final f4 f42565b;
    public z2 f42566c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f42567f;

    public v1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.f42564a = m60Var;
        this.f42565b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f42566c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f43990s;
        this.f42564a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f42566c;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.f43990s;
        this.f42564a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f42566c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f43990s;
        this.f42564a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f42566c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f42566c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f42566c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f42566c != null) {
            canvas.save();
            canvas.translate(this.e, this.f42567f);
            h4.t(this.f42564a, canvas, this, 0);
            this.f42566c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        z2 z2Var = this.f42566c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754861, h4.h(this.f42564a, this.f42565b, z2Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        m60 m60Var = this.f42564a;
        m60Var.getClass();
        this.e = org.telegram.messenger.i0.L(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f42567f = org.telegram.messenger.i0.L(16.0f);
                i12 = org.telegram.messenger.i0.L(8.0f);
            } else {
                this.f42567f = org.telegram.messenger.i0.L(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            m60 m60Var2 = this.f42564a;
            m60Var2.getClass();
            int L = size - org.telegram.messenger.i0.L(36);
            int i13 = this.f42567f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            f4 f4Var = this.f42565b;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.ov0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = h4.n(m60Var2, this, null, richText, L, i13, pageblockkicker2, alignment, 0, this.f42565b);
            this.f42566c = n10;
            if (n10 != null) {
                m60Var.getClass();
                i12 += this.f42566c.d.getHeight() + org.telegram.messenger.i0.L(16);
                z2 z2Var = this.f42566c;
                z2Var.f43990s = this.e;
                z2Var.f43991w = this.f42567f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f42564a, this.f42565b, motionEvent, this, this.f42566c, this.e, this.f42567f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
