package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class t2 extends View implements org.telegram.ui.Cells.j9, c3 {
    public z2 f41691a;
    public TL_iv.pageBlockTitle f41692b;
    public int f41693c;
    public int d;
    public final m60 e;
    public final f4 f41694f;

    public t2(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.e = m60Var;
        this.f41694f = f4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f41691a;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f43990s;
        this.e.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f41691a;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.f43990s;
        this.e.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f41691a;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f43990s;
        this.e.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.z20.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f41691a;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f41691a;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f41691a;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41692b != null && this.f41691a != null) {
            canvas.save();
            canvas.translate(this.f41693c, this.d);
            h4.t(this.e, canvas, this, 0);
            this.f41691a.d(canvas, this);
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
        z2 z2Var = this.f41691a;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754853, h4.h(this.e, this.f41694f, z2Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        m60 m60Var = this.e;
        m60Var.getClass();
        this.f41693c = org.telegram.messenger.i0.L(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f41692b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                m60Var.getClass();
                i12 = org.telegram.messenger.i0.L(8);
                m60Var.getClass();
                this.d = org.telegram.messenger.i0.L(16);
            } else {
                m60Var.getClass();
                this.d = org.telegram.messenger.i0.L(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f41692b.text;
            m60 m60Var2 = this.e;
            m60Var2.getClass();
            int L = size - org.telegram.messenger.i0.L(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f41692b;
            f4 f4Var = this.f41694f;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.ov0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = h4.n(m60Var2, this, null, richText, L, 0, pageblocktitle2, alignment, 0, this.f41694f);
            this.f41691a = n10;
            if (n10 != null) {
                m60Var.getClass();
                i12 += this.f41691a.d.getHeight() + org.telegram.messenger.i0.L(16);
                z2 z2Var = this.f41691a;
                z2Var.f43990s = this.f41693c;
                z2Var.f43991w = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.e, this.f41694f, motionEvent, this, this.f41691a, this.f41693c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f41692b = pageblocktitle;
        requestLayout();
    }
}
