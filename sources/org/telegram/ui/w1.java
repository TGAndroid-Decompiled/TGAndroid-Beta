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
public final class w1 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final t70 f41889a;
    public final g4 f41890b;
    public b3 f41891c;
    public int d;
    public int f41892e;
    public TL_iv.PageBlock f41893f;

    public w1(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f41889a = t70Var;
        this.f41890b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f41891c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f41891c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + this.d;
        this.f41889a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f41891c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + this.d;
        this.f41889a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f41891c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + this.d;
        this.f41889a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f41891c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f41891c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41893f != null && this.f41891c != null) {
            canvas.save();
            canvas.translate(this.d, this.f41892e);
            i4.v(this.f41889a, canvas, this, 0);
            this.f41891c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f41891c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVHeading, i4.j(this.f41889a, this.f41890b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f41889a;
        t70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        t70Var.getClass();
        this.f41892e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f41893f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            t70 t70Var2 = this.f41889a;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f41893f;
            g4 g4Var = this.f41890b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.gx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(t70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f41890b);
            this.f41891c = p5;
            if (p5 != null) {
                t70Var.getClass();
                i12 = this.f41891c.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f41891c;
                b3Var.f35035s = this.d;
                b3Var.v = this.f41892e;
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
        if (!i4.l(this.f41889a, this.f41890b, motionEvent, this, this.f41891c, this.d, this.f41892e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f41893f = pageBlock;
        requestLayout();
    }
}
