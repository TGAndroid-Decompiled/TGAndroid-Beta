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
    public final l60 f42379a;
    public final f4 f42380b;
    public z2 f42381c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f42382f;

    public v1(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f42379a = l60Var;
        this.f42380b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f42381c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f43793s;
        this.f42379a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f42381c;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.f43793s;
        this.f42379a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f42381c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f43793s;
        this.f42379a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.a30.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f42381c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f42381c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f42381c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f42381c != null) {
            canvas.save();
            canvas.translate(this.e, this.f42382f);
            h4.t(this.f42379a, canvas, this, 0);
            this.f42381c.d(canvas, this);
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
        z2 z2Var = this.f42381c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754861, h4.h(this.f42379a, this.f42380b, z2Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        l60 l60Var = this.f42379a;
        l60Var.getClass();
        this.e = org.telegram.messenger.i0.L(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f42382f = org.telegram.messenger.i0.L(16.0f);
                i12 = org.telegram.messenger.i0.L(8.0f);
            } else {
                this.f42382f = org.telegram.messenger.i0.L(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            l60 l60Var2 = this.f42379a;
            l60Var2.getClass();
            int L = size - org.telegram.messenger.i0.L(36);
            int i13 = this.f42382f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            f4 f4Var = this.f42380b;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.pv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = h4.n(l60Var2, this, null, richText, L, i13, pageblockkicker2, alignment, 0, this.f42380b);
            this.f42381c = n10;
            if (n10 != null) {
                l60Var.getClass();
                i12 += this.f42381c.d.getHeight() + org.telegram.messenger.i0.L(16);
                z2 z2Var = this.f42381c;
                z2Var.f43793s = this.e;
                z2Var.f43794w = this.f42382f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f42379a, this.f42380b, motionEvent, this, this.f42381c, this.e, this.f42382f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
