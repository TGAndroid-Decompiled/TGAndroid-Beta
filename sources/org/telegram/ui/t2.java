package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class t2 extends View implements org.telegram.ui.Cells.h9, c3 {
    public z2 f49894a;
    public TL_iv.pageBlockTitle f49895b;
    public int f49896c;
    public int d;
    public final o50 f49897e;
    public final e4 f49898f;

    public t2(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f49897e = o50Var;
        this.f49898f = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f49894a;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f52443s;
        this.f49897e.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f49894a;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f52443s;
        this.f49897e.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f49894a;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f52443s;
        this.f49897e.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f49894a;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f49894a;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f49894a;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f49895b != null && this.f49894a != null) {
            canvas.save();
            canvas.translate(this.f49896c, this.d);
            g4.t(this.f49897e, canvas, this, 0);
            this.f49894a.d(canvas, this);
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
        z2 z2Var = this.f49894a;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.g(2131754853, g4.h(this.f49897e, this.f49898f, z2Var)));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i7);
        o50 o50Var = this.f49897e;
        o50Var.getClass();
        this.f49896c = org.telegram.messenger.g0.L(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f49895b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                o50Var.getClass();
                i11 = org.telegram.messenger.g0.L(8);
                o50Var.getClass();
                this.d = org.telegram.messenger.g0.L(16);
            } else {
                o50Var.getClass();
                this.d = org.telegram.messenger.g0.L(8);
                i11 = 0;
            }
            TL_iv.RichText richText = this.f49895b.text;
            o50 o50Var2 = this.f49897e;
            o50Var2.getClass();
            int L = size - org.telegram.messenger.g0.L(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f49895b;
            e4 e4Var = this.f49898f;
            if (e4Var != null && e4Var.G) {
                alignment = org.telegram.ui.Components.mu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(o50Var2, this, null, richText, L, 0, pageblocktitle2, alignment, 0, this.f49898f);
            this.f49894a = n10;
            if (n10 != null) {
                o50Var.getClass();
                i11 += this.f49894a.d.getHeight() + org.telegram.messenger.g0.L(16);
                z2 z2Var = this.f49894a;
                z2Var.f52443s = this.f49896c;
                z2Var.f52444w = this.d;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f49897e, this.f49898f, motionEvent, this, this.f49894a, this.f49896c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f49895b = pageblocktitle;
        requestLayout();
    }
}
