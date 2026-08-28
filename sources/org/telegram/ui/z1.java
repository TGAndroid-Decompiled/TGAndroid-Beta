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
public final class z1 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f44993a;
    public final j4 f44994b;
    public e3 f44995c;
    public TL_iv.pageBlockKicker d;
    public int f44996e;
    public int f44997f;

    public z1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f44993a = a70Var;
        this.f44994b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f44995c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        e3 e3Var = this.f44995c;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + e3Var.f37805s;
        this.f44993a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        e3 e3Var = this.f44995c;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + e3Var.f37805s;
        this.f44993a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        e3 e3Var = this.f44995c;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + e3Var.f37805s;
        this.f44993a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f44995c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f44995c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f44995c != null) {
            canvas.save();
            canvas.translate(this.f44996e, this.f44997f);
            l4.v(this.f44993a, canvas, this, 0);
            this.f44995c.draw(canvas, this);
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
        e3 e3Var = this.f44995c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVKicker, l4.j(this.f44993a, this.f44994b, e3Var)));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i9);
        a70 a70Var = this.f44993a;
        a70Var.getClass();
        this.f44996e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f44997f = AndroidUtilities.dp(16.0f);
                i11 = AndroidUtilities.dp(8.0f);
            } else {
                this.f44997f = AndroidUtilities.dp(8.0f);
                i11 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            a70 a70Var2 = this.f44993a;
            a70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i12 = this.f44997f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            j4 j4Var = this.f44994b;
            if (j4Var != null && j4Var.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            e3 p6 = l4.p(a70Var2, this, null, richText, dp, i12, pageblockkicker2, alignment, 0, this.f44994b);
            this.f44995c = p6;
            if (p6 != null) {
                a70Var.getClass();
                i11 += this.f44995c.d.getHeight() + AndroidUtilities.dp(16);
                e3 e3Var = this.f44995c;
                e3Var.f37805s = this.f44996e;
                e3Var.v = this.f44997f;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f44993a, this.f44994b, motionEvent, this, this.f44995c, this.f44996e, this.f44997f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
