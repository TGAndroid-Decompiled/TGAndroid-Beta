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
    public final p70 f38950a;
    public final g4 f38951b;
    public b3 f38952c;
    public int d;
    public int e;
    public TL_iv.PageBlock f38953f;

    public w1(Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f38950a = p70Var;
        this.f38951b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f38952c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f38952c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + this.d;
        this.f38950a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f38952c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + this.d;
        this.f38950a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f38952c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + this.d;
        this.f38950a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ok.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f38952c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f38952c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38953f != null && this.f38952c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            i4.v(this.f38950a, canvas, this, 0);
            this.f38952c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f38952c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVHeading, i4.j(this.f38950a, this.f38951b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.f38950a;
        p70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        p70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f38953f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            p70 p70Var2 = this.f38950a;
            p70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f38953f;
            g4 g4Var = this.f38951b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.xw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(p70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f38951b);
            this.f38952c = p5;
            if (p5 != null) {
                p70Var.getClass();
                i12 = this.f38952c.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f38952c;
                b3Var.f32379s = this.d;
                b3Var.v = this.e;
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
        if (!i4.l(this.f38950a, this.f38951b, motionEvent, this, this.f38952c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f38953f = pageBlock;
        requestLayout();
    }
}
