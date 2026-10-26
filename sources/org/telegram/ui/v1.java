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
public final class v1 extends View implements org.telegram.ui.Cells.r9, e3 {
    public final h70 f44566a;
    public final h4 f44567b;
    public a3 f44568c;
    public int d;
    public int e;
    public TL_iv.PageBlock f44569f;

    public v1(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f44566a = h70Var;
        this.f44567b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f44568c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f44568c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + this.d;
        this.f44566a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f44568c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + this.d;
        this.f44566a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f44568c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + this.d;
        this.f44566a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f44568c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f44568c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44569f != null && this.f44568c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(this.f44566a, canvas, this, 0);
            this.f44568c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f44568c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVHeading, j4.j(this.f44566a, this.f44567b, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        h70 h70Var = this.f44566a;
        h70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        h70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f44569f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            h70 h70Var2 = this.f44566a;
            h70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f44569f;
            h4 h4Var = this.f44567b;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.px0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p10 = j4.p(h70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f44567b);
            this.f44568c = p10;
            if (p10 != null) {
                h70Var.getClass();
                i12 = this.f44568c.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.f44568c;
                a3Var.f37634s = this.d;
                a3Var.v = this.e;
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
        if (!j4.l(this.f44566a, this.f44567b, motionEvent, this, this.f44568c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f44569f = pageBlock;
        requestLayout();
    }
}
