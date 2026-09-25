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
public final class x1 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final p70 f39789a;
    public final g4 f39790b;
    public b3 f39791c;
    public TL_iv.pageBlockKicker d;
    public int e;
    public int f39792f;

    public x1(Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f39789a = p70Var;
        this.f39790b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f39791c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f39791c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f32305s;
        this.f39789a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f39791c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f32305s;
        this.f39789a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f39791c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f32305s;
        this.f39789a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ok.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f39791c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f39791c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f39791c != null) {
            canvas.save();
            canvas.translate(this.e, this.f39792f);
            i4.v(this.f39789a, canvas, this, 0);
            this.f39791c.draw(canvas, this);
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
        b3 b3Var = this.f39791c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVKicker, i4.j(this.f39789a, this.f39790b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.f39789a;
        p70Var.getClass();
        this.e = AndroidUtilities.dp(18);
        TL_iv.pageBlockKicker pageblockkicker = this.d;
        if (pageblockkicker != null) {
            if (pageblockkicker.first) {
                this.f39792f = AndroidUtilities.dp(16.0f);
                i12 = AndroidUtilities.dp(8.0f);
            } else {
                this.f39792f = AndroidUtilities.dp(8.0f);
                i12 = 0;
            }
            TL_iv.RichText richText = this.d.text;
            p70 p70Var2 = this.f39789a;
            p70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            int i13 = this.f39792f;
            TL_iv.pageBlockKicker pageblockkicker2 = this.d;
            g4 g4Var = this.f39790b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.uw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(p70Var2, this, null, richText, dp, i13, pageblockkicker2, alignment, 0, this.f39790b);
            this.f39791c = p5;
            if (p5 != null) {
                p70Var.getClass();
                i12 += this.f39791c.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f39791c;
                b3Var.f32305s = this.e;
                b3Var.v = this.f39792f;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f39789a, this.f39790b, motionEvent, this, this.f39791c, this.e, this.f39792f) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockKicker pageblockkicker) {
        this.d = pageblockkicker;
        requestLayout();
    }
}
