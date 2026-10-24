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
public final class x1 extends View implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f43445a;
    public final i4 f43446b;
    public c3 f43447c;
    public int d;
    public int e;
    public TL_iv.PageBlock f43448f;

    public x1(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f43445a = f70Var;
        this.f43446b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f43447c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f43447c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + this.d;
        this.f43445a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f43447c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + this.d;
        this.f43445a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f43447c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + this.d;
        this.f43445a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.tl.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f43447c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f43447c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43448f != null && this.f43447c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            k4.v(this.f43445a, canvas, this, 0);
            this.f43447c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        c3 c3Var = this.f43447c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVHeading, k4.j(this.f43445a, this.f43446b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        f70 f70Var = this.f43445a;
        f70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        f70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f43448f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            f70 f70Var2 = this.f43445a;
            f70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f43448f;
            i4 i4Var = this.f43446b;
            if (i4Var != null && i4Var.G) {
                alignment = org.telegram.ui.Components.hx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = k4.p(f70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f43446b);
            this.f43447c = p5;
            if (p5 != null) {
                f70Var.getClass();
                i12 = this.f43447c.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.f43447c;
                c3Var.f36208s = this.d;
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
        if (!k4.l(this.f43445a, this.f43446b, motionEvent, this, this.f43447c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f43448f = pageBlock;
        requestLayout();
    }
}
