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
public final class y1 extends View implements org.telegram.ui.Cells.n9, f3 {
    public final f70 f43724a;
    public final i4 f43725b;
    public c3 f43726c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f43727f;

    public y1(Context context, f70 f70Var, i4 i4Var) {
        super(context);
        this.f43724a = f70Var;
        this.f43725b = i4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f43726c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f43726c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f36208s;
        this.f43724a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f43726c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f36208s;
        this.f43724a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f43726c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f36208s;
        this.f43724a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.tl.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f43726c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f43726c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f43726c != null) {
            canvas.save();
            canvas.translate(this.e, this.f43727f);
            k4.v(this.f43724a, canvas, this, 0);
            this.f43726c.draw(canvas, this);
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
        c3 c3Var = this.f43726c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(k4.i(R.string.AccDescrIVKicker, k4.j(this.f43724a, this.f43725b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        f70 f70Var = this.f43724a;
        f70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f43727f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f43727f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            f70 f70Var2 = this.f43724a;
            f70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f43727f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            i4 i4Var = this.f43725b;
            if (i4Var != null && i4Var.G) {
                alignment = org.telegram.ui.Components.hx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = k4.p(f70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f43725b);
            this.f43726c = p5;
            if (p5 != null) {
                f70Var.getClass();
                i12 += this.f43726c.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.f43726c;
                c3Var.f36208s = this.e;
                c3Var.v = this.f43727f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!k4.l(this.f43724a, this.f43725b, motionEvent, this, this.f43726c, this.e, this.f43727f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
