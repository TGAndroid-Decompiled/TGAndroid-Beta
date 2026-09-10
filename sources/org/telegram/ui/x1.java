package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class x1 extends View implements org.telegram.ui.Cells.r9, f3 {
    public final t70 f38552a;
    public final h4 f38553b;
    public c3 f38554c;
    public int d;
    public int e;
    public TL_iv.PageBlock f38555f;

    public x1(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.f38552a = t70Var;
        this.f38553b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f38554c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f38554c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + this.d;
        this.f38552a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f38554c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + this.d;
        this.f38552a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f38554c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + this.d;
        this.f38552a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f38554c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f38554c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38555f != null && this.f38554c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(this.f38552a, canvas, this, 0);
            this.f38554c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f38554c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVHeading, j4.j(this.f38552a, this.f38553b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f38552a;
        t70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        t70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f38555f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            t70 t70Var2 = this.f38552a;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f38555f;
            h4 h4Var = this.f38553b;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = j4.p(t70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f38553b);
            this.f38554c = p5;
            if (p5 != null) {
                t70Var.getClass();
                i12 = this.f38554c.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.f38554c;
                c3Var.f31515s = this.d;
                c3Var.v = this.e;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f38552a, this.f38553b, motionEvent, this, this.f38554c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f38555f = pageBlock;
        requestLayout();
    }
}
