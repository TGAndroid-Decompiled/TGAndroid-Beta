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
public final class x1 extends View implements org.telegram.ui.Cells.p9, f3 {
    public final s70 f39491a;
    public final h4 f39492b;
    public c3 f39493c;
    public int d;
    public int e;
    public TL_iv.PageBlock f39494f;

    public x1(Context context, s70 s70Var, h4 h4Var) {
        super(context);
        this.f39491a = s70Var;
        this.f39492b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f39493c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f39493c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + this.d;
        this.f39491a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f39493c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + this.d;
        this.f39491a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f39493c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + this.d;
        this.f39491a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.qk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f39493c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f39493c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39494f != null && this.f39493c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(this.f39491a, canvas, this, 0);
            this.f39493c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f39493c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVHeading, j4.j(this.f39491a, this.f39492b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        s70 s70Var = this.f39491a;
        s70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        s70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f39494f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            s70 s70Var2 = this.f39491a;
            s70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f39494f;
            h4 h4Var = this.f39492b;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.ww0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = j4.p(s70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f39492b);
            this.f39493c = p5;
            if (p5 != null) {
                s70Var.getClass();
                i12 = this.f39493c.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.f39493c;
                c3Var.f32507s = this.d;
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
        if (!j4.l(this.f39491a, this.f39492b, motionEvent, this, this.f39493c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f39494f = pageBlock;
        requestLayout();
    }
}
