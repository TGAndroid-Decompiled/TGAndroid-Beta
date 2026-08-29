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
public final class z1 extends View implements org.telegram.ui.Cells.j9, i3 {
    public final d70 f45008a;
    public final k4 f45009b;
    public f3 f45010c;
    public int d;
    public int f45011e;
    public TL_iv.PageBlock f45012f;

    public z1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f45008a = d70Var;
        this.f45009b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f45010c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f45010c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + this.d;
        this.f45008a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f45010c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + this.d;
        this.f45008a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f45010c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + this.d;
        this.f45008a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f45010c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f45010c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f45012f != null && this.f45010c != null) {
            canvas.save();
            canvas.translate(this.d, this.f45011e);
            m4.v(this.f45008a, canvas, this, 0);
            this.f45010c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f45010c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVHeading, m4.j(this.f45008a, this.f45009b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f45008a;
        d70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        d70Var.getClass();
        this.f45011e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f45012f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            d70 d70Var2 = this.f45008a;
            d70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f45012f;
            k4 k4Var = this.f45009b;
            if (k4Var != null && k4Var.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = m4.p(d70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f45009b);
            this.f45010c = p10;
            if (p10 != null) {
                d70Var.getClass();
                i12 = this.f45010c.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f45010c;
                f3Var.f37974s = this.d;
                f3Var.v = this.f45011e;
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
        if (!m4.l(this.f45008a, this.f45009b, motionEvent, this, this.f45010c, this.d, this.f45011e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f45012f = pageBlock;
        requestLayout();
    }
}
