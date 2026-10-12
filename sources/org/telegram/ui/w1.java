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
public final class w1 extends View implements org.telegram.ui.Cells.n9, e3 {
    public final w70 f43019a;
    public final g4 f43020b;
    public b3 f43021c;
    public int d;
    public int f43022e;
    public TL_iv.PageBlock f43023f;

    public w1(Context context, w70 w70Var, g4 g4Var) {
        super(context);
        this.f43019a = w70Var;
        this.f43020b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f43021c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f43021c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + this.d;
        this.f43019a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f43021c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + this.d;
        this.f43019a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f43021c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + this.d;
        this.f43019a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.am.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f43021c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f43021c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43023f != null && this.f43021c != null) {
            canvas.save();
            canvas.translate(this.d, this.f43022e);
            i4.v(this.f43019a, canvas, this, 0);
            this.f43021c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f43021c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVHeading, i4.j(this.f43019a, this.f43020b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        w70 w70Var = this.f43019a;
        w70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        w70Var.getClass();
        this.f43022e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f43023f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            w70 w70Var2 = this.f43019a;
            w70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f43023f;
            g4 g4Var = this.f43020b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.sx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(w70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f43020b);
            this.f43021c = p5;
            if (p5 != null) {
                w70Var.getClass();
                i12 = this.f43021c.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f43021c;
                b3Var.f36044s = this.d;
                b3Var.v = this.f43022e;
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
        if (!i4.l(this.f43019a, this.f43020b, motionEvent, this, this.f43021c, this.d, this.f43022e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f43023f = pageBlock;
        requestLayout();
    }
}
