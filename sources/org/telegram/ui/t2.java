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
public final class t2 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final b70 f41580a;
    public final j4 f41581b;
    public d3 f41582c;
    public int d;
    public int e;
    public TL_iv.pageBlockSubheader f41583f;

    public t2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f41580a = b70Var;
        this.f41581b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f41582c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f41582c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f36241s;
        this.f41580a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f41582c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f36241s;
        this.f41580a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f41582c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f36241s;
        this.f41580a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.mk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f41582c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f41582c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f41583f != null && this.f41582c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(this.f41580a, canvas, this, 0);
            this.f41582c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        d3 d3Var = this.f41582c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVHeading, l4.j(this.f41580a, this.f41581b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        b70 b70Var = this.f41580a;
        b70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        b70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.pageBlockSubheader pageblocksubheader = this.f41583f;
        if (pageblocksubheader != null) {
            TL_iv.RichText richText = pageblocksubheader.text;
            b70 b70Var2 = this.f41580a;
            b70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockSubheader pageblocksubheader2 = this.f41583f;
            j4 j4Var = this.f41581b;
            if (j4Var != null && j4Var.G) {
                alignment = org.telegram.ui.Components.fx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p5 = l4.p(b70Var2, this, null, richText, dp, 0, pageblocksubheader2, alignment, 0, this.f41581b);
            this.f41582c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight() + this.e;
                int i13 = this.e;
                i12 = height + i13;
                d3 d3Var = this.f41582c;
                d3Var.f36241s = this.d;
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
        if (!l4.l(this.f41580a, this.f41581b, motionEvent, this, this.f41582c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockSubheader pageblocksubheader) {
        this.f41583f = pageblocksubheader;
        requestLayout();
    }
}
