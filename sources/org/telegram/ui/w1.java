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
public final class w1 extends View implements org.telegram.ui.Cells.n9, d3 {
    public final t70 f43165a;
    public final f4 f43166b;
    public a3 f43167c;
    public TL_iv.pageBlockKicker d;
    public int f43168e;
    public int f43169f;

    public w1(Context context, t70 t70Var, f4 f4Var) {
        super(context);
        this.f43165a = t70Var;
        this.f43166b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f43167c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f43167c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f35862s;
        this.f43165a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f43167c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f35862s;
        this.f43165a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f43167c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f35862s;
        this.f43165a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ai.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f43167c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f43167c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f43167c != null) {
            canvas.save();
            canvas.translate(this.f43168e, this.f43169f);
            h4.v(this.f43165a, canvas, this, 0);
            this.f43167c.draw(canvas, this);
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
        a3 a3Var = this.f43167c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVKicker, h4.j(this.f43165a, this.f43166b, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f43165a;
        t70Var.getClass();
        this.f43168e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f43169f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f43169f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            t70 t70Var2 = this.f43165a;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f43169f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            f4 f4Var = this.f43166b;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.ox0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p5 = h4.p(t70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f43166b);
            this.f43167c = p5;
            if (p5 != null) {
                t70Var.getClass();
                i12 += this.f43167c.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.f43167c;
                a3Var.f35862s = this.f43168e;
                a3Var.v = this.f43169f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!h4.l(this.f43165a, this.f43166b, motionEvent, this, this.f43167c, this.f43168e, this.f43169f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
