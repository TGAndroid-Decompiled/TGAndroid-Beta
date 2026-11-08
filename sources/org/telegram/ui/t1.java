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
    public final o50 f49875a;
    public final e4 f49876b;
    public z2 f49877c;
    public int d;
    public int f49878e;
    public TL_iv.PageBlock f49879f;

    public t1(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f49875a = o50Var;
        this.f49876b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f49877c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + this.d;
        this.f49875a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f49877c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + this.d;
        this.f49875a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f49877c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + this.d;
        this.f49875a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f49877c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f49877c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f49877c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49879f != null && this.f49877c != null) {
            canvas.save();
            canvas.translate(this.d, this.f49878e);
            g4.t(this.f49875a, canvas, this, 0);
            this.f49877c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f49877c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754863, g4.h(this.f49875a, this.f49876b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        o50 o50Var = this.f49875a;
        o50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        o50Var.getClass();
        this.f49878e = org.telegram.messenger.g0.L(8);
        TL_iv.PageBlock pageBlock = this.f49879f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            o50 o50Var2 = this.f49875a;
            o50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.PageBlock pageBlock2 = this.f49879f;
            e4 e4Var = this.f49876b;
            if (e4Var != null && e4Var.G) {
                alignment = org.telegram.ui.Components.mu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(o50Var2, this, null, richText, L, 0, pageBlock2, alignment, 0, this.f49876b);
            this.f49877c = n10;
            if (n10 != null) {
                o50Var.getClass();
                i11 = this.f49877c.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f49877c;
                z2Var.f52421s = this.d;
                z2Var.f52422w = this.f49878e;
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
        if (!g4.j(this.f49875a, this.f49876b, motionEvent, this, this.f49877c, this.d, this.f49878e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f49879f = pageBlock;
        requestLayout();
    }
}
