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
public final class y1 extends View implements org.telegram.ui.Cells.l9, g3 {
    public final n70 f40349a;
    public final j4 f40350b;
    public d3 f40351c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f40352f;

    public y1(Context context, n70 n70Var, j4 j4Var) {
        super(context);
        this.f40349a = n70Var;
        this.f40350b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f40351c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f40351c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f33499s;
        this.f40349a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f40351c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f33499s;
        this.f40349a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f40351c;
        if (d3Var == null) {
            return -1;
        }
        int c3 = d3Var.c() + d3Var.f33499s;
        this.f40349a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f40351c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f40351c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f40351c != null) {
            canvas.save();
            canvas.translate(this.e, this.f40352f);
            l4.v(this.f40349a, canvas, this, 0);
            this.f40351c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        d3 d3Var = this.f40351c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVKicker, l4.j(this.f40349a, this.f40350b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        n70 n70Var = this.f40349a;
        n70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f40352f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f40352f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            n70 n70Var2 = this.f40349a;
            n70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f40352f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            j4 j4Var = this.f40350b;
            if (j4Var != null && j4Var.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p10 = l4.p(n70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f40350b);
            this.f40351c = p10;
            if (p10 != null) {
                n70Var.getClass();
                i12 += this.f40351c.d.getHeight() + AndroidUtilities.dp(16);
                d3 d3Var = this.f40351c;
                d3Var.f33499s = this.e;
                d3Var.v = this.f40352f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f40349a, this.f40350b, motionEvent, this, this.f40351c, this.e, this.f40352f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
