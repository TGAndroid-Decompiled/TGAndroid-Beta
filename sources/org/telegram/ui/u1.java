package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class u1 extends View implements org.telegram.ui.Cells.i9, c3 {
    public final p50 f52412a;
    public final e4 f52413b;
    public z2 f52414c;
    public TL_iv.pageBlockKicker d;
    public int f52415e;
    public int f52416f;

    public u1(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f52412a = p50Var;
        this.f52413b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f52414c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f54343s;
        this.f52412a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f52414c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f54343s;
        this.f52412a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f52414c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f54343s;
        this.f52412a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.o10.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f52414c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f52414c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f52414c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f52414c != null) {
            canvas.save();
            canvas.translate(this.f52415e, this.f52416f);
            g4.t(this.f52412a, canvas, this, 0);
            this.f52414c.d(canvas, this);
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
        z2 z2Var = this.f52414c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754860, g4.h(this.f52412a, this.f52413b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        p50 p50Var = this.f52412a;
        p50Var.getClass();
        this.f52415e = org.telegram.messenger.g0.L(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f52416f = org.telegram.messenger.g0.L(16.0f);
                i11 = org.telegram.messenger.g0.L(8.0f);
            } else {
                this.f52416f = org.telegram.messenger.g0.L(8.0f);
                i11 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            p50 p50Var2 = this.f52412a;
            p50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            int i12 = this.f52416f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            e4 e4Var = this.f52413b;
            if (e4Var != null && e4Var.H) {
                alignment = org.telegram.ui.Components.zu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(p50Var2, this, null, richText, L, i12, pageblockkicker2, alignment, 0, this.f52413b);
            this.f52414c = n10;
            if (n10 != null) {
                p50Var.getClass();
                i11 += this.f52414c.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f52414c;
                z2Var.f54343s = this.f52415e;
                z2Var.f54344w = this.f52416f;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f52412a, this.f52413b, motionEvent, this, this.f52414c, this.f52415e, this.f52416f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
