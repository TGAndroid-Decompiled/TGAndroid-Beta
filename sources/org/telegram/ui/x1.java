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
public final class x1 extends View implements org.telegram.ui.Cells.l9, g3 {
    public final o70 f42894a;
    public final j4 f42895b;
    public d3 f42896c;
    public int d;
    public int f42897e;
    public TL_iv.PageBlock f42898f;

    public x1(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f42894a = o70Var;
        this.f42895b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f42896c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f42896c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + this.d;
        this.f42894a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f42896c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + this.d;
        this.f42894a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f42896c;
        if (d3Var == null) {
            return -1;
        }
        int c3 = d3Var.c() + this.d;
        this.f42894a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f42896c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f42896c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42898f != null && this.f42896c != null) {
            canvas.save();
            canvas.translate(this.d, this.f42897e);
            l4.v(this.f42894a, canvas, this, 0);
            this.f42896c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f42896c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVHeading, l4.j(this.f42894a, this.f42895b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        o70 o70Var = this.f42894a;
        o70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        o70Var.getClass();
        this.f42897e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f42898f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            o70 o70Var2 = this.f42894a;
            o70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f42898f;
            j4 j4Var = this.f42895b;
            if (j4Var != null && j4Var.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p10 = l4.p(o70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f42895b);
            this.f42896c = p10;
            if (p10 != null) {
                o70Var.getClass();
                i12 = this.f42896c.d.getHeight() + AndroidUtilities.dp(16);
                d3 d3Var = this.f42896c;
                d3Var.f35964s = this.d;
                d3Var.v = this.f42897e;
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
        if (!l4.l(this.f42894a, this.f42895b, motionEvent, this, this.f42896c, this.d, this.f42897e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f42898f = pageBlock;
        requestLayout();
    }
}
