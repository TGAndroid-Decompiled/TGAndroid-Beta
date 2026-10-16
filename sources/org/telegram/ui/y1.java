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
public final class y1 extends View implements org.telegram.ui.Cells.n9, g3 {
    public final z70 f41704a;
    public final i4 f41705b;
    public d3 f41706c;
    public int d;
    public int e;
    public TL_iv.PageBlock f41707f;

    public y1(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.f41704a = z70Var;
        this.f41705b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f41706c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f41706c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + this.d;
        this.f41704a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f41706c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + this.d;
        this.f41704a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f41706c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + this.d;
        this.f41704a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.sk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f41706c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f41706c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41707f != null && this.f41706c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(this.f41704a, canvas, this, 0);
            this.f41706c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f41706c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVHeading, k4.j(this.f41704a, this.f41705b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        z70 z70Var = this.f41704a;
        z70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        z70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f41707f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            z70 z70Var2 = this.f41704a;
            z70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f41707f;
            i4 i4Var = this.f41705b;
            if (i4Var != null && i4Var.G) {
                alignment = org.telegram.ui.Components.ix0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p5 = k4.p(z70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f41705b);
            this.f41706c = p5;
            if (p5 != null) {
                z70Var.getClass();
                i12 = this.f41706c.d.getHeight() + AndroidUtilities.dp(16);
                d3 d3Var = this.f41706c;
                d3Var.f34861s = this.d;
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
        if (!k4.l(this.f41704a, this.f41705b, motionEvent, this, this.f41706c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f41707f = pageBlock;
        requestLayout();
    }
}
