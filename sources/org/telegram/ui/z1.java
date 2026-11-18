package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class z1 extends View implements org.telegram.ui.Cells.h9, c3 {
    public final p50 f54357a;
    public final e4 f54358b;
    public z2 f54359c;
    public int d;
    public int f54360e;
    public TL_iv.pageBlockParagraph f54361f;

    public z1(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f54357a = p50Var;
        this.f54358b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f54359c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f54373s;
        this.f54357a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f54359c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f54373s;
        this.f54357a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f54359c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f54373s;
        this.f54357a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.n10.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f54359c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f54359c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f54359c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f54361f == null) {
            return;
        }
        z2 z2Var = this.f54359c;
        p50 p50Var = this.f54357a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f54360e);
            g4.t(p50Var, canvas, this, 0);
            this.f54359c.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, p50Var, this.f54361f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f54359c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f54357a, this.f54358b, z2Var));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f54361f;
        if (pageblockparagraph != null) {
            int i12 = pageblockparagraph.level;
            p50 p50Var = this.f54357a;
            i11 = 0;
            if (i12 == 0) {
                p50Var.getClass();
                this.f54360e = org.telegram.messenger.g0.L(8);
                p50Var.getClass();
                this.d = org.telegram.messenger.g0.L(18);
            } else {
                this.f54360e = 0;
                p50Var.getClass();
                this.d = org.telegram.messenger.g0.L((this.f54361f.level * 14) + 18);
            }
            if (this.f54361f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                e4 e4Var = this.f54358b;
                if (e4Var != null && e4Var.H) {
                    alignment = org.telegram.ui.Components.wu0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f54361f.text;
            p50 p50Var2 = this.f54357a;
            p50Var2.getClass();
            z2 n10 = g4.n(p50Var2, this, null, richText, (size - org.telegram.messenger.g0.L(18)) - this.d, this.f54360e, this.f54361f, alignment2, 0, this.f54358b);
            this.f54359c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight();
                if (this.f54361f.level > 0) {
                    p50Var.getClass();
                    L = org.telegram.messenger.g0.L(8);
                } else {
                    p50Var.getClass();
                    L = org.telegram.messenger.g0.L(16);
                }
                i11 = L + height;
                z2 z2Var = this.f54359c;
                z2Var.f54373s = this.d;
                z2Var.f54374w = this.f54360e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f54357a, this.f54358b, motionEvent, this, this.f54359c, this.d, this.f54360e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f54361f = pageblockparagraph;
        requestLayout();
    }
}
