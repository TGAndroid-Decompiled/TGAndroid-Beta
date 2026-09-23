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
public final class v2 extends View implements org.telegram.ui.Cells.q9, e3 {
    public b3 f38267a;
    public TL_iv.pageBlockTitle f38268b;
    public int f38269c;
    public int d;
    public final r70 e;
    public final g4 f38270f;

    public v2(Context context, r70 r70Var, g4 g4Var) {
        super(context);
        this.e = r70Var;
        this.f38270f = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f38267a;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f38267a;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f31947s;
        this.e.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f38267a;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f31947s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f38267a;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f31947s;
        this.e.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ul.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f38267a;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f38267a;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38268b != null && this.f38267a != null) {
            canvas.save();
            canvas.translate(this.f38269c, this.d);
            i4.v(this.e, canvas, this, 0);
            this.f38267a.draw(canvas, this);
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
        b3 b3Var = this.f38267a;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVTitle, i4.j(this.e, this.f38270f, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        r70 r70Var = this.e;
        r70Var.getClass();
        this.f38269c = AndroidUtilities.dp(18);
        TL_iv.pageBlockTitle pageblocktitle = this.f38268b;
        if (pageblocktitle != null) {
            if (pageblocktitle.first) {
                r70Var.getClass();
                i12 = AndroidUtilities.dp(8);
                r70Var.getClass();
                this.d = AndroidUtilities.dp(16);
            } else {
                r70Var.getClass();
                this.d = AndroidUtilities.dp(8);
                i12 = 0;
            }
            TL_iv.RichText richText = this.f38268b.text;
            r70 r70Var2 = this.e;
            r70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.pageBlockTitle pageblocktitle2 = this.f38268b;
            g4 g4Var = this.f38270f;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.jw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(r70Var2, this, null, richText, dp, 0, pageblocktitle2, alignment, 0, this.f38270f);
            this.f38267a = p5;
            if (p5 != null) {
                r70Var.getClass();
                i12 += this.f38267a.d.getHeight() + AndroidUtilities.dp(16);
                b3 b3Var = this.f38267a;
                b3Var.f31947s = this.f38269c;
                b3Var.v = this.d;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.e, this.f38270f, motionEvent, this, this.f38267a, this.f38269c, this.d) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockTitle pageblocktitle) {
        this.f38268b = pageblocktitle;
        requestLayout();
    }
}
