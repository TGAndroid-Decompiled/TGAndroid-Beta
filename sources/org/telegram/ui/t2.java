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
public final class t2 extends View implements org.telegram.ui.Cells.l9, g3 {
    public final n70 f38496a;
    public final j4 f38497b;
    public d3 f38498c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubheader f38499f;

    public t2(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.f38496a = n70Var;
        this.f38497b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f38498c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f38498c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f33499s;
        this.f38496a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f38498c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f33499s;
        this.f38496a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f38498c;
        if (d3Var == null) {
            return -1;
        }
        int c3 = d3Var.c() + d3Var.f33499s;
        this.f38496a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f38498c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f38498c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38499f != null && this.f38498c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(this.f38496a, canvas, this, 0);
            this.f38498c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f38498c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVHeading, l4.j(this.f38496a, this.f38497b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        n70 n70Var = this.f38496a;
        n70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        n70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f38499f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            n70 n70Var2 = this.f38496a;
            n70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f38499f;
            j4 j4Var = this.f38497b;
            if (j4Var != null && j4Var.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p10 = l4.p(n70Var2, this, null, richText, dp, 0, pageblocksubheader2, alignment, 0, this.f38497b);
            this.f38498c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight() + this.e;
                int i13 = this.e;
                i12 = height + i13;
                d3 d3Var = this.f38498c;
                d3Var.f33499s = this.d;
                d3Var.v = i13;
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
        if (!l4.l(this.f38496a, this.f38497b, motionEvent, this, this.f38498c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f38499f = pageblocksubheader;
        requestLayout();
    }
}
