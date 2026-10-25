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
public final class w1 extends View implements org.telegram.ui.Cells.r9, e3 {
    public final h70 f44937a;
    public final h4 f44938b;
    public a3 f44939c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f44940f;

    public w1(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f44937a = h70Var;
        this.f44938b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f44939c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f44939c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f37631s;
        this.f44937a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f44939c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f37631s;
        this.f44937a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f44939c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f37631s;
        this.f44937a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f44939c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f44939c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f44939c != null) {
            canvas.save();
            canvas.translate(this.e, this.f44940f);
            j4.v(this.f44937a, canvas, this, 0);
            this.f44939c.draw(canvas, this);
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
        a3 a3Var = this.f44939c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVKicker, j4.j(this.f44937a, this.f44938b, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        h70 h70Var = this.f44937a;
        h70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f44940f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f44940f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            h70 h70Var2 = this.f44937a;
            h70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f44940f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            h4 h4Var = this.f44938b;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.px0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p10 = j4.p(h70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f44938b);
            this.f44939c = p10;
            if (p10 != null) {
                h70Var.getClass();
                i12 += this.f44939c.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.f44939c;
                a3Var.f37631s = this.e;
                a3Var.v = this.f44940f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f44937a, this.f44938b, motionEvent, this, this.f44939c, this.e, this.f44940f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
