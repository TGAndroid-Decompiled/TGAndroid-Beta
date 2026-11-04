package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class u2 extends View implements org.telegram.ui.Cells.g9, d3 {
    public a3 f49944a;
    public TL_iv.pageBlockTitle f49945b;
    public int f49946c;
    public int d;
    public final i50 f49947e;
    public final g4 f49948f;

    public u2(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f49947e = i50Var;
        this.f49948f = g4Var;
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f49944a;
        if (a3Var == null) {
            return -1;
        }
        int k10 = a3Var.k() + a3Var.f43579s;
        this.f49947e.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f49944a;
        if (a3Var == null) {
            return -1;
        }
        int l10 = a3Var.l() + a3Var.f43579s;
        this.f49947e.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f49944a;
        if (a3Var == null) {
            return -1;
        }
        int m10 = a3Var.m() + a3Var.f43579s;
        this.f49947e.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f49944a;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f49944a;
        if (a3Var != null) {
            a3Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f49944a;
        if (a3Var != null) {
            a3Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49945b != null && this.f49944a != null) {
            canvas.save();
            canvas.translate(this.f49946c, this.d);
            i4.t(this.f49947e, canvas, this, 0);
            this.f49944a.d(canvas, this);
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
        a3 a3Var = this.f49944a;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.g(2131754853, i4.h(this.f49947e, this.f49948f, a3Var)));
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i3);
        i50 i50Var = this.f49947e;
        i50Var.getClass();
        this.f49946c = org.telegram.messenger.g0.L(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f49945b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                i50Var.getClass();
                i11 = org.telegram.messenger.g0.L(8);
                i50Var.getClass();
                this.d = org.telegram.messenger.g0.L(16);
            } else {
                i50Var.getClass();
                this.d = org.telegram.messenger.g0.L(8);
                i11 = 0;
            }
            TL_iv.RichText richText = this.f49945b.text;
            i50 i50Var2 = this.f49947e;
            i50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f49945b;
            g4 g4Var = this.f49948f;
            if (g4Var != null && g4Var.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 n4 = i4.n(i50Var2, this, null, richText, L, 0, pageblocktitle2, alignment, 0, this.f49948f);
            this.f49944a = n4;
            if (n4 != null) {
                i50Var.getClass();
                i11 += this.f49944a.d.getHeight() + org.telegram.messenger.g0.L(16);
                a3 a3Var = this.f49944a;
                a3Var.f43579s = this.f49946c;
                a3Var.f43580w = this.d;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.j(this.f49947e, this.f49948f, motionEvent, this, this.f49944a, this.f49946c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f49945b = pageblocktitle;
        requestLayout();
    }
}
