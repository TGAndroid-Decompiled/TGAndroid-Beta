package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class u1 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f49937a;
    public final g4 f49938b;
    public a3 f49939c;
    public int d;
    public int f49940e;
    public TL_iv.PageBlock f49941f;

    public u1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f49937a = i50Var;
        this.f49938b = g4Var;
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f49939c;
        if (a3Var == null) {
            return -1;
        }
        int k10 = a3Var.k() + this.d;
        this.f49937a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f49939c;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + this.d;
        this.f49937a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f49939c;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + this.d;
        this.f49937a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f49939c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f49939c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f49939c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49941f != null && this.f49939c != null) {
            canvas.save();
            canvas.translate(this.d, this.f49940e);
            i4.t(this.f49937a, canvas, this, 0);
            this.f49939c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f49939c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754863, i4.h(this.f49937a, this.f49938b, a3Var)));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i3);
        i50 i50Var = this.f49937a;
        i50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        i50Var.getClass();
        this.f49940e = org.telegram.messenger.g0.L(8);
        TL_iv.PageBlock pageBlock = this.f49941f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            i50 i50Var2 = this.f49937a;
            i50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.PageBlock pageBlock2 = this.f49941f;
            g4 g4Var = this.f49938b;
            if (g4Var != null && g4Var.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 n4 = i4.n(i50Var2, this, null, richText, L, 0, pageBlock2, alignment, 0, this.f49938b);
            this.f49939c = n4;
            if (n4 != null) {
                i50Var.getClass();
                i11 = this.f49939c.d.getHeight() + org.telegram.messenger.g0.L(16);
                a3 a3Var = this.f49939c;
                a3Var.f43579s = this.d;
                a3Var.f43580w = this.f49940e;
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
        if (!i4.j(this.f49937a, this.f49938b, motionEvent, this, this.f49939c, this.d, this.f49940e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f49941f = pageBlock;
        requestLayout();
    }
}
