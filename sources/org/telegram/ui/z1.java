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
    public final o50 f52416a;
    public final e4 f52417b;
    public z2 f52418c;
    public int d;
    public int f52419e;
    public TL_iv.pageBlockParagraph f52420f;

    public z1(Context context, o50 o50Var, e4 e4Var) {
        super(context);
        this.f52416a = o50Var;
        this.f52417b = e4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f52418c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f52436s;
        this.f52416a.getClass();
        return k10 - org.telegram.messenger.g0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f52418c;
        if (z2Var == null) {
            return -1;
        }
        int l10 = z2Var.l() + z2Var.f52436s;
        this.f52416a.getClass();
        return org.telegram.messenger.g0.L(18) + l10;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f52418c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f52436s;
        this.f52416a.getClass();
        return org.telegram.messenger.g0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.camera.q.a(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f52418c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f52418c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f52418c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f52420f == null) {
            return;
        }
        z2 z2Var = this.f52418c;
        o50 o50Var = this.f52416a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f52419e);
            g4.t(o50Var, canvas, this, 0);
            this.f52418c.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, o50Var, this.f52420f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        z2 z2Var = this.f52418c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(g4.h(this.f52416a, this.f52417b, z2Var));
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockParagraph pageblockparagraph = this.f52420f;
        if (pageblockparagraph != null) {
            int i12 = pageblockparagraph.level;
            o50 o50Var = this.f52416a;
            i11 = 0;
            if (i12 == 0) {
                o50Var.getClass();
                this.f52419e = org.telegram.messenger.g0.L(8);
                o50Var.getClass();
                this.d = org.telegram.messenger.g0.L(18);
            } else {
                this.f52419e = 0;
                o50Var.getClass();
                this.d = org.telegram.messenger.g0.L((this.f52420f.level * 14) + 18);
            }
            if (this.f52420f.text instanceof TL_iv.textMath) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else {
                e4 e4Var = this.f52417b;
                if (e4Var != null && e4Var.G) {
                    alignment = org.telegram.ui.Components.mu0.a();
                } else {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                }
            }
            Layout.Alignment alignment2 = alignment;
            TL_iv.RichText richText = this.f52420f.text;
            o50 o50Var2 = this.f52416a;
            o50Var2.getClass();
            z2 n10 = g4.n(o50Var2, this, null, richText, (size - org.telegram.messenger.g0.L(18)) - this.d, this.f52419e, this.f52420f, alignment2, 0, this.f52417b);
            this.f52418c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight();
                if (this.f52420f.level > 0) {
                    o50Var.getClass();
                    L = org.telegram.messenger.g0.L(8);
                } else {
                    o50Var.getClass();
                    L = org.telegram.messenger.g0.L(16);
                }
                i11 = L + height;
                z2 z2Var = this.f52418c;
                z2Var.f52436s = this.d;
                z2Var.f52437w = this.f52419e;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!g4.j(this.f52416a, this.f52417b, motionEvent, this, this.f52418c, this.d, this.f52419e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockParagraph pageblockparagraph) {
        this.f52420f = pageblockparagraph;
        requestLayout();
    }
}
