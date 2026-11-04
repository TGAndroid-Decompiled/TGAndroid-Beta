package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class v1 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f50360a;
    public final g4 f50361b;
    public a3 f50362c;
    public TL_iv.pageBlockKicker d;
    public int f50363e;
    public int f50364f;

    public v1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f50360a = i50Var;
        this.f50361b = g4Var;
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f50362c;
        if (a3Var == null) {
            return -1;
        }
        int k10 = a3Var.k() + a3Var.f43579s;
        this.f50360a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f50362c;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + a3Var.f43579s;
        this.f50360a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f50362c;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + a3Var.f43579s;
        this.f50360a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f50362c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f50362c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f50362c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f50362c != null) {
            canvas.save();
            canvas.translate(this.f50363e, this.f50364f);
            i4.t(this.f50360a, canvas, this, 0);
            this.f50362c.d(canvas, this);
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
        a3 a3Var = this.f50362c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754861, i4.h(this.f50360a, this.f50361b, a3Var)));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i3);
        i50 i50Var = this.f50360a;
        i50Var.getClass();
        this.f50363e = org.telegram.messenger.g0.L(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f50364f = org.telegram.messenger.g0.L(16.0f);
                i11 = org.telegram.messenger.g0.L(8.0f);
            } else {
                this.f50364f = org.telegram.messenger.g0.L(8.0f);
                i11 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            i50 i50Var2 = this.f50360a;
            i50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            int i12 = this.f50364f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            g4 g4Var = this.f50361b;
            if (g4Var != null && g4Var.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 n4 = i4.n(i50Var2, this, null, richText, L, i12, pageblockkicker2, alignment, 0, this.f50361b);
            this.f50362c = n4;
            if (n4 != null) {
                i50Var.getClass();
                i11 += this.f50362c.d.getHeight() + org.telegram.messenger.g0.L(16);
                a3 a3Var = this.f50362c;
                a3Var.f43579s = this.f50363e;
                a3Var.f43580w = this.f50364f;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.j(this.f50360a, this.f50361b, motionEvent, this, this.f50362c, this.f50363e, this.f50364f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
