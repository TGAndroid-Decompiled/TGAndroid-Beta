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
public final class z2 extends View implements org.telegram.ui.Cells.j9, i3 {
    public f3 f45035a;
    public TL_iv.pageBlockTitle f45036b;
    public int f45037c;
    public int d;
    public final d70 f45038e;
    public final k4 f45039f;

    public z2(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f45038e = d70Var;
        this.f45039f = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f45035a;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f45035a;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f37974s;
        this.f45038e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f45035a;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f37974s;
        this.f45038e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f45035a;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f37974s;
        this.f45038e.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f45035a;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f45035a;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f45036b != null && this.f45035a != null) {
            canvas.save();
            canvas.translate(this.f45037c, this.d);
            m4.v(this.f45038e, canvas, this, 0);
            this.f45035a.draw(canvas, this);
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
        f3 f3Var = this.f45035a;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVTitle, m4.j(this.f45038e, this.f45039f, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f45038e;
        d70Var.getClass();
        this.f45037c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f45036b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                d70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                d70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f45036b.text;
            d70 d70Var2 = this.f45038e;
            d70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f45036b;
            k4 k4Var = this.f45039f;
            if (k4Var != null && k4Var.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = m4.p(d70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f45039f);
            this.f45035a = p10;
            if (p10 != null) {
                d70Var.getClass();
                i12 += this.f45035a.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f45035a;
                f3Var.f37974s = this.f45037c;
                f3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m4.l(this.f45038e, this.f45039f, motionEvent, this, this.f45035a, this.f45037c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f45036b = pageblocktitle;
        requestLayout();
    }
}
