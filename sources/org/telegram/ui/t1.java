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
    public final r50 f50008a;
    public final e4 f50009b;
    public z2 f50010c;
    public int d;
    public int f50011e;
    public TL_iv.PageBlock f50012f;

    public t1(Context context, r50 r50Var, e4 e4Var) {
        super(context);
        this.f50008a = r50Var;
        this.f50009b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f50010c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + this.d;
        this.f50008a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f50010c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + this.d;
        this.f50008a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f50010c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + this.d;
        this.f50008a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f50010c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f50010c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f50010c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f50012f != null && this.f50010c != null) {
            canvas.save();
            canvas.translate(this.d, this.f50011e);
            g4.t(this.f50008a, canvas, this, 0);
            this.f50010c.d(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f50010c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754863, g4.h(this.f50008a, this.f50009b, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        r50 r50Var = this.f50008a;
        r50Var.getClass();
        this.d = org.telegram.messenger.g0.L(18);
        r50Var.getClass();
        this.f50011e = org.telegram.messenger.g0.L(8);
        TL_iv.PageBlock pageBlock = this.f50012f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            r50 r50Var2 = this.f50008a;
            r50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.PageBlock pageBlock2 = this.f50012f;
            e4 e4Var = this.f50009b;
            if (e4Var != null && e4Var.G) {
                alignment = org.telegram.ui.Components.nu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(r50Var2, this, null, richText, L, 0, pageBlock2, alignment, 0, this.f50009b);
            this.f50010c = n10;
            if (n10 != null) {
                r50Var.getClass();
                i11 = this.f50010c.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f50010c;
                z2Var.f52183s = this.d;
                z2Var.f52184w = this.f50011e;
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
        if (!g4.j(this.f50008a, this.f50009b, motionEvent, this, this.f50010c, this.d, this.f50011e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f50012f = pageBlock;
        requestLayout();
    }
}
