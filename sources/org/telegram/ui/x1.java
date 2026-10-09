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
public final class x1 extends View implements org.telegram.ui.Cells.n9, e3 {
    public final t70 f43781a;
    public final g4 f43782b;
    public b3 f43783c;
    public TL_iv.pageBlockKicker d;
    public int f43784e;
    public int f43785f;

    public x1(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f43781a = t70Var;
        this.f43782b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f43783c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f43783c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f36115s;
        this.f43781a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f43783c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f36115s;
        this.f43781a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f43783c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f36115s;
        this.f43781a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f43783c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f43783c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f43783c != null) {
            canvas.save();
            canvas.translate(this.f43784e, this.f43785f);
            i4.v(this.f43781a, canvas, this, 0);
            this.f43783c.draw(canvas, this);
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
        b3 b3Var = this.f43783c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVKicker, i4.j(this.f43781a, this.f43782b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f43781a;
        t70Var.getClass();
        this.f43784e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f43785f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f43785f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            t70 t70Var2 = this.f43781a;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f43785f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            g4 g4Var = this.f43782b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.mx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(t70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f43782b);
            this.f43783c = p5;
            if (p5 != null) {
                t70Var.getClass();
                i12 += this.f43783c.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f43783c;
                b3Var.f36115s = this.f43784e;
                b3Var.v = this.f43785f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f43781a, this.f43782b, motionEvent, this, this.f43783c, this.f43784e, this.f43785f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
