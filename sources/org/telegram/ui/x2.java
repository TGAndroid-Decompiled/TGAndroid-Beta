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
public final class x2 extends View implements org.telegram.ui.Cells.m9, g3 {
    public d3 f42993a;
    public TL_iv.pageBlockTitle f42994b;
    public int f42995c;
    public int d;
    public final b70 e;
    public final j4 f42996f;

    public x2(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.e = b70Var;
        this.f42996f = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f42993a;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f42993a;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f36242s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f42993a;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f36242s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f42993a;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f36242s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.mk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f42993a;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f42993a;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42994b != null && this.f42993a != null) {
            canvas.save();
            canvas.translate(this.f42995c, this.d);
            l4.v(this.e, canvas, this, 0);
            this.f42993a.draw(canvas, this);
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
        d3 d3Var = this.f42993a;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVTitle, l4.j(this.e, this.f42996f, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        b70 b70Var = this.e;
        b70Var.getClass();
        this.f42995c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f42994b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                b70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                b70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                b70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f42994b.text;
            b70 b70Var2 = this.e;
            b70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f42994b;
            j4 j4Var = this.f42996f;
            if (j4Var != null && j4Var.G) {
                alignment = org.telegram.ui.Components.fx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p5 = l4.p(b70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f42996f);
            this.f42993a = p5;
            if (p5 != null) {
                b70Var.getClass();
                i12 += this.f42993a.d.getHeight() + AndroidUtilities.dp(16);
                d3 d3Var = this.f42993a;
                d3Var.f36242s = this.f42995c;
                d3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.e, this.f42996f, motionEvent, this, this.f42993a, this.f42995c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f42994b = pageblocktitle;
        requestLayout();
    }
}
