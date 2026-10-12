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
public final class z1 extends View implements org.telegram.ui.Cells.n9, g3 {
    public final z70 f42450a;
    public final i4 f42451b;
    public d3 f42452c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f42453f;

    public z1(Context context, z70 z70Var, i4 i4Var) {
        super(context);
        this.f42450a = z70Var;
        this.f42451b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f42452c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f42452c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f35132s;
        this.f42450a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f42452c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f35132s;
        this.f42450a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f42452c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f35132s;
        this.f42450a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.yh.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f42452c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f42452c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f42452c != null) {
            canvas.save();
            canvas.translate(this.e, this.f42453f);
            k4.v(this.f42450a, canvas, this, 0);
            this.f42452c.draw(canvas, this);
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
        d3 d3Var = this.f42452c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVKicker, k4.j(this.f42450a, this.f42451b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        z70 z70Var = this.f42450a;
        z70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f42453f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f42453f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            z70 z70Var2 = this.f42450a;
            z70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f42453f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            i4 i4Var = this.f42451b;
            if (i4Var != null && i4Var.G) {
                alignment = org.telegram.ui.Components.ix0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p5 = k4.p(z70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f42451b);
            this.f42452c = p5;
            if (p5 != null) {
                z70Var.getClass();
                i12 += this.f42452c.d.getHeight() + AndroidUtilities.dp(16);
                d3 d3Var = this.f42452c;
                d3Var.f35132s = this.e;
                d3Var.v = this.f42453f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f42450a, this.f42451b, motionEvent, this, this.f42452c, this.e, this.f42453f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
