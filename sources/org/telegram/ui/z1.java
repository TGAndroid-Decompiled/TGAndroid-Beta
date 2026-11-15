package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class z1 extends View implements org.telegram.ui.Cells.g9, c3 {
    public final n50 f53765a;
    public final e4 f53766b;
    public z2 f53767c;
    public int d;
    public int f53768e;
    public TL_iv.pageBlockParagraph f53769f;

    public z1(Context context, n50 n50Var, e4 e4Var) {
        super(context);
        this.f53765a = n50Var;
        this.f53766b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f53767c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f53777s;
        this.f53765a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f53767c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f53777s;
        this.f53765a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f53767c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f53777s;
        this.f53765a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.i20.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f53767c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f53767c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f53767c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f53769f == null) {
            return;
        }
        z2 z2Var = this.f53767c;
        n50 n50Var = this.f53765a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f53768e);
            g4.t(n50Var, canvas, this, 0);
            this.f53767c.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, n50Var, this.f53769f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f53767c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f53765a, this.f53766b, z2Var));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f53769f;
        if (pageblockparagraph != null) {
            int i12 = pageblockparagraph.level;
            n50 n50Var = this.f53765a;
            i11 = 0;
            if (i12 == 0) {
                n50Var.getClass();
                this.f53768e = org.telegram.messenger.g0.L(8);
                n50Var.getClass();
                this.d = org.telegram.messenger.g0.L(18);
            } else {
                this.f53768e = 0;
                n50Var.getClass();
                this.d = org.telegram.messenger.g0.L((this.f53769f.level * 14) + 18);
            }
            if (this.f53769f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                e4 e4Var = this.f53766b;
                if (e4Var != null && e4Var.H) {
                    alignment = org.telegram.ui.Components.ou0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f53769f.text;
            n50 n50Var2 = this.f53765a;
            n50Var2.getClass();
            z2 n10 = g4.n(n50Var2, this, null, richText, (size - org.telegram.messenger.g0.L(18)) - this.d, this.f53768e, this.f53769f, alignment2, 0, this.f53766b);
            this.f53767c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight();
                if (this.f53769f.level > 0) {
                    n50Var.getClass();
                    L = org.telegram.messenger.g0.L(8);
                } else {
                    n50Var.getClass();
                    L = org.telegram.messenger.g0.L(16);
                }
                i11 = L + height;
                z2 z2Var = this.f53767c;
                z2Var.f53777s = this.d;
                z2Var.f53778w = this.f53768e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f53765a, this.f53766b, motionEvent, this, this.f53767c, this.d, this.f53768e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f53769f = pageblockparagraph;
        requestLayout();
    }
}
