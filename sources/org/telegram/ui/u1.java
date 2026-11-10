package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class u1 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final r50 f50379a;
    public final e4 f50380b;
    public z2 f50381c;
    public TL_iv.pageBlockKicker d;
    public int f50382e;
    public int f50383f;

    public u1(Context context, r50 r50Var, e4 e4Var) {
        super(context);
        this.f50379a = r50Var;
        this.f50380b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f50381c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f52183s;
        this.f50379a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f50381c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f52183s;
        this.f50379a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f50381c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f52183s;
        this.f50379a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f50381c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50381c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50381c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f50381c != null) {
            canvas.save();
            canvas.translate(this.f50382e, this.f50383f);
            g4.t(this.f50379a, canvas, this, 0);
            this.f50381c.d(canvas, this);
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
        z2 z2Var = this.f50381c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754861, g4.h(this.f50379a, this.f50380b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        r50 r50Var = this.f50379a;
        r50Var.getClass();
        this.f50382e = org.telegram.messenger.g0.L(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f50383f = org.telegram.messenger.g0.L(16.0f);
                i11 = org.telegram.messenger.g0.L(8.0f);
            } else {
                this.f50383f = org.telegram.messenger.g0.L(8.0f);
                i11 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            r50 r50Var2 = this.f50379a;
            r50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            int i12 = this.f50383f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            e4 e4Var = this.f50380b;
            if (e4Var != null && e4Var.G) {
                alignment = org.telegram.ui.Components.nu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(r50Var2, this, null, richText, L, i12, pageblockkicker2, alignment, 0, this.f50380b);
            this.f50381c = n10;
            if (n10 != null) {
                r50Var.getClass();
                i11 += this.f50381c.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f50381c;
                z2Var.f52183s = this.f50382e;
                z2Var.f52184w = this.f50383f;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f50379a, this.f50380b, motionEvent, this, this.f50381c, this.f50382e, this.f50383f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
