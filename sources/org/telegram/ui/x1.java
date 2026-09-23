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
public final class x1 extends View implements org.telegram.ui.Cells.q9, e3 {
    public final r70 f39140a;
    public final g4 f39141b;
    public b3 f39142c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f39143f;

    public x1(Context context, r70 r70Var, g4 g4Var) {
        super(context);
        this.f39140a = r70Var;
        this.f39141b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f39142c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f39142c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f31947s;
        this.f39140a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f39142c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f31947s;
        this.f39140a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f39142c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f31947s;
        this.f39140a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ul.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f39142c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f39142c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f39142c != null) {
            canvas.save();
            canvas.translate(this.e, this.f39143f);
            i4.v(this.f39140a, canvas, this, 0);
            this.f39142c.draw(canvas, this);
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
        b3 b3Var = this.f39142c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVKicker, i4.j(this.f39140a, this.f39141b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        r70 r70Var = this.f39140a;
        r70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f39143f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f39143f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            r70 r70Var2 = this.f39140a;
            r70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f39143f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            g4 g4Var = this.f39141b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.jw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(r70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f39141b);
            this.f39142c = p5;
            if (p5 != null) {
                r70Var.getClass();
                i12 += this.f39142c.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f39142c;
                b3Var.f31947s = this.e;
                b3Var.v = this.f39143f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f39140a, this.f39141b, motionEvent, this, this.f39142c, this.e, this.f39143f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
