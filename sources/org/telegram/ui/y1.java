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
public final class y1 extends View implements org.telegram.ui.Cells.r9, f3 {
    public final t70 f38868a;
    public final h4 f38869b;
    public c3 f38870c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f38871f;

    public y1(Context context, t70 t70Var, h4 h4Var) {
        super(context);
        this.f38868a = t70Var;
        this.f38869b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        c3 c3Var = this.f38870c;
        if (c3Var != null) {
            arrayList.add(c3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        c3 c3Var = this.f38870c;
        if (c3Var == null) {
            return -1;
        }
        int a2 = c3Var.a() + c3Var.f31515s;
        this.f38868a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        c3 c3Var = this.f38870c;
        if (c3Var == null) {
            return -1;
        }
        int b10 = c3Var.b() + c3Var.f31515s;
        this.f38868a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        c3 c3Var = this.f38870c;
        if (c3Var == null) {
            return -1;
        }
        int c10 = c3Var.c() + c3Var.f31515s;
        this.f38868a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.em.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c3 c3Var = this.f38870c;
        if (c3Var != null) {
            c3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3 c3Var = this.f38870c;
        if (c3Var != null) {
            c3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f38870c != null) {
            canvas.save();
            canvas.translate(this.e, this.f38871f);
            j4.v(this.f38868a, canvas, this, 0);
            this.f38870c.draw(canvas, this);
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
        c3 c3Var = this.f38870c;
        if (c3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVKicker, j4.j(this.f38868a, this.f38869b, c3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        t70 t70Var = this.f38868a;
        t70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f38871f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f38871f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            t70 t70Var2 = this.f38868a;
            t70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f38871f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            h4 h4Var = this.f38869b;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            c3 p5 = j4.p(t70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f38869b);
            this.f38870c = p5;
            if (p5 != null) {
                t70Var.getClass();
                i12 += this.f38870c.d.getHeight() + AndroidUtilities.dp(16);
                c3 c3Var = this.f38870c;
                c3Var.f31515s = this.e;
                c3Var.v = this.f38871f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f38868a, this.f38869b, motionEvent, this, this.f38870c, this.e, this.f38871f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
