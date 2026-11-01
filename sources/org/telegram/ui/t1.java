package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class t1 extends View implements org.telegram.ui.Cells.j9, c3 {
    public final l60 f41505a;
    public final f4 f41506b;
    public z2 f41507c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f41508f;

    public t1(Context context, l60 l60Var, f4 f4Var) {
        super(context);
        this.f41505a = l60Var;
        this.f41506b = f4Var;
    }

    @Override
    public int getBoundLeft() {
        z2 z2Var = this.f41507c;
        if (z2Var == null) {
            return -1;
        }
        int k10 = z2Var.k() + z2Var.f43793s;
        this.f41505a.getClass();
        return k10 - org.telegram.messenger.i0.L(18);
    }

    @Override
    public int getBoundRight() {
        z2 z2Var = this.f41507c;
        if (z2Var == null) {
            return -1;
        }
        int l4 = z2Var.l() + z2Var.f43793s;
        this.f41505a.getClass();
        return org.telegram.messenger.i0.L(18) + l4;
    }

    @Override
    public int getLastLineBoundRight() {
        z2 z2Var = this.f41507c;
        if (z2Var == null) {
            return -1;
        }
        int m10 = z2Var.m() + z2Var.f43793s;
        this.f41505a.getClass();
        return org.telegram.messenger.i0.L(18) + m10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.a30.a(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f41507c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f41507c;
        if (z2Var != null) {
            z2Var.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.f41507c;
        if (z2Var != null) {
            z2Var.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41508f == null) {
            return;
        }
        z2 z2Var = this.f41507c;
        l60 l60Var = this.f41505a;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.t(l60Var, canvas, this, 0);
            this.f41507c.d(canvas, this);
            canvas.restore();
        }
        h4.s(canvas, l60Var, this.f41508f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        z2 z2Var = this.f41507c;
        if (z2Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.g(2131754865, h4.h(this.f41505a, this.f41506b, z2Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int L;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f41508f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            l60 l60Var = this.f41505a;
            i12 = 0;
            if (i13 == 0) {
                l60Var.getClass();
                this.e = org.telegram.messenger.i0.L(8);
                l60Var.getClass();
                this.d = org.telegram.messenger.i0.L(18);
            } else {
                this.e = 0;
                l60Var.getClass();
                this.d = org.telegram.messenger.i0.L((this.f41508f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f41508f.text;
            l60 l60Var2 = this.f41505a;
            l60Var2.getClass();
            int L2 = (size - org.telegram.messenger.i0.L(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f41508f;
            f4 f4Var = this.f41506b;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.pv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = h4.n(l60Var2, this, null, richText, L2, 0, pageblockfooter2, alignment, 0, this.f41506b);
            this.f41507c = n10;
            if (n10 != null) {
                int height = n10.d.getHeight();
                if (this.f41508f.level > 0) {
                    l60Var.getClass();
                    L = org.telegram.messenger.i0.L(8);
                } else {
                    l60Var.getClass();
                    L = org.telegram.messenger.i0.L(16);
                }
                i12 = L + height;
                z2 z2Var = this.f41507c;
                z2Var.f43793s = this.d;
                z2Var.f43794w = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.j(this.f41505a, this.f41506b, motionEvent, this, this.f41507c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f41508f = pageblockfooter;
        requestLayout();
    }
}
