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
public final class y1 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final b70 f43313a;
    public final j4 f43314b;
    public d3 f43315c;
    public int d;
    public int e;
    public TL_iv.PageBlock f43316f;

    public y1(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f43313a = b70Var;
        this.f43314b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f43315c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f43315c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + this.d;
        this.f43313a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f43315c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + this.d;
        this.f43313a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f43315c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + this.d;
        this.f43313a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f43315c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f43315c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43316f != null && this.f43315c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(this.f43313a, canvas, this, 0);
            this.f43315c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f43315c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVHeading, l4.j(this.f43313a, this.f43314b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        b70 b70Var = this.f43313a;
        b70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        b70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f43316f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            b70 b70Var2 = this.f43313a;
            b70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f43316f;
            j4 j4Var = this.f43314b;
            if (j4Var != null && j4Var.G) {
                alignment = org.telegram.ui.Components.ex0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p5 = l4.p(b70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f43314b);
            this.f43315c = p5;
            if (p5 != null) {
                b70Var.getClass();
                i12 = this.f43315c.d.getHeight() + AndroidUtilities.dp(16);
                d3 d3Var = this.f43315c;
                d3Var.f36235s = this.d;
                d3Var.v = this.e;
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
        if (!l4.l(this.f43313a, this.f43314b, motionEvent, this, this.f43315c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f43316f = pageBlock;
        requestLayout();
    }
}
