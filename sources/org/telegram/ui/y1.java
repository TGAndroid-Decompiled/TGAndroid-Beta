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
public final class y1 extends View implements org.telegram.ui.Cells.m9, h3 {
    public final a70 f44667a;
    public final j4 f44668b;
    public e3 f44669c;
    public int d;
    public int f44670e;
    public TL_iv.PageBlock f44671f;

    public y1(Context context, a70 a70Var, j4 j4Var) {
        super(context);
        this.f44667a = a70Var;
        this.f44668b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f44669c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        e3 e3Var = this.f44669c;
        if (e3Var == null) {
            return -1;
        }
        int a2 = e3Var.a() + this.d;
        this.f44667a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        e3 e3Var = this.f44669c;
        if (e3Var == null) {
            return -1;
        }
        int b10 = e3Var.b() + this.d;
        this.f44667a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        e3 e3Var = this.f44669c;
        if (e3Var == null) {
            return -1;
        }
        int c10 = e3Var.c() + this.d;
        this.f44667a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ll.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f44669c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e3 e3Var = this.f44669c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44671f != null && this.f44669c != null) {
            canvas.save();
            canvas.translate(this.d, this.f44670e);
            l4.v(this.f44667a, canvas, this, 0);
            this.f44669c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        e3 e3Var = this.f44669c;
        if (e3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVHeading, l4.j(this.f44667a, this.f44668b, e3Var)));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i9);
        a70 a70Var = this.f44667a;
        a70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        a70Var.getClass();
        this.f44670e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f44671f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            a70 a70Var2 = this.f44667a;
            a70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f44671f;
            j4 j4Var = this.f44668b;
            if (j4Var != null && j4Var.C) {
                alignment = org.telegram.ui.Components.rv0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            e3 p6 = l4.p(a70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f44668b);
            this.f44669c = p6;
            if (p6 != null) {
                a70Var.getClass();
                i11 = this.f44669c.d.getHeight() + AndroidUtilities.dp(16);
                e3 e3Var = this.f44669c;
                e3Var.f37805s = this.d;
                e3Var.v = this.f44670e;
            } else {
                i11 = 0;
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f44667a, this.f44668b, motionEvent, this, this.f44669c, this.d, this.f44670e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f44671f = pageBlock;
        requestLayout();
    }
}
