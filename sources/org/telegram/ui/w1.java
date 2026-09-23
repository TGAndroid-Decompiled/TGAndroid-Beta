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
public final class w1 extends View implements org.telegram.ui.Cells.q9, e3 {
    public final r70 f38504a;
    public final g4 f38505b;
    public b3 f38506c;
    public int d;
    public int e;
    public TL_iv.PageBlock f38507f;

    public w1(Context context, r70 r70Var, g4 g4Var) {
        super(context);
        this.f38504a = r70Var;
        this.f38505b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f38506c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f38506c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + this.d;
        this.f38504a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f38506c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + this.d;
        this.f38504a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f38506c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + this.d;
        this.f38504a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ul.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f38506c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f38506c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38507f != null && this.f38506c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            i4.v(this.f38504a, canvas, this, 0);
            this.f38506c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        b3 b3Var = this.f38506c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVHeading, i4.j(this.f38504a, this.f38505b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        r70 r70Var = this.f38504a;
        r70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        r70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f38507f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            r70 r70Var2 = this.f38504a;
            r70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f38507f;
            g4 g4Var = this.f38505b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.jw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(r70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f38505b);
            this.f38506c = p5;
            if (p5 != null) {
                r70Var.getClass();
                i12 = this.f38506c.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f38506c;
                b3Var.f31947s = this.d;
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
        if (!i4.l(this.f38504a, this.f38505b, motionEvent, this, this.f38506c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f38507f = pageBlock;
        requestLayout();
    }
}
