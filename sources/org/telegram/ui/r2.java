package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class r2 extends View implements org.telegram.ui.Cells.g9, d3 {
    public final i50 f49002a;
    public final g4 f49003b;
    public a3 f49004c;
    public int d;
    public int f49005e;
    public TL_iv.pageBlockSubtitle f49006f;

    public r2(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f49002a = i50Var;
        this.f49003b = g4Var;
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f49004c;
        if (a3Var == null) {
            return -1;
        }
        int k10 = a3Var.k() + a3Var.f43579s;
        this.f49002a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f49004c;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + a3Var.f43579s;
        this.f49002a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f49004c;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + a3Var.f43579s;
        this.f49002a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f49004c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f49004c;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f49004c;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49006f != null && this.f49004c != null) {
            canvas.save();
            canvas.translate(this.d, this.f49005e);
            i4.t(this.f49002a, canvas, this, 0);
            this.f49004c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f49004c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754863, i4.h(this.f49002a, this.f49003b, a3Var)));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i3);
        i50 i50Var = this.f49002a;
        i50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        i50Var.getClass();
        this.f49005e = org.telegram.messenger.g0.L(8);
        TL_iv.pageBlockSubtitle pageblocksubtitle = this.f49006f;
        if (pageblocksubtitle != null) {
            TL_iv.RichText richText = pageblocksubtitle.text;
            i50 i50Var2 = this.f49002a;
            i50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockSubtitle pageblocksubtitle2 = this.f49006f;
            g4 g4Var = this.f49003b;
            if (g4Var != null && g4Var.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 n4 = i4.n(i50Var2, this, null, richText, L, 0, pageblocksubtitle2, alignment, 0, this.f49003b);
            this.f49004c = n4;
            if (n4 != null) {
                i50Var.getClass();
                i11 = this.f49004c.d.getHeight() + org.telegram.messenger.g0.L(16);
                a3 a3Var = this.f49004c;
                a3Var.f43579s = this.d;
                a3Var.f43580w = this.f49005e;
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
        if (!i4.j(this.f49002a, this.f49003b, motionEvent, this, this.f49004c, this.d, this.f49005e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubtitle pageblocksubtitle) {
        this.f49006f = pageblocksubtitle;
        requestLayout();
    }
}
