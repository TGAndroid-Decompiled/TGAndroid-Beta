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
public final class z1 extends View implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f40370a;
    public final l4 f40371b;
    public f3 f40372c;
    public int d;
    public int e;
    public TL_iv.PageBlock f40373f;

    public z1(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f40370a = p70Var;
        this.f40371b = l4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f40372c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f40372c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + this.d;
        this.f40370a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f40372c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + this.d;
        this.f40370a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f40372c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + this.d;
        this.f40370a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f40372c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f40372c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40373f != null && this.f40372c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            n4.v(this.f40370a, canvas, this, 0);
            this.f40372c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f40372c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.i(R.string.AccDescrIVHeading, n4.j(this.f40370a, this.f40371b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        p70 p70Var = this.f40370a;
        p70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        p70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f40373f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            p70 p70Var2 = this.f40370a;
            p70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f40373f;
            l4 l4Var = this.f40371b;
            if (l4Var != null && l4Var.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = n4.p(p70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f40371b);
            this.f40372c = p10;
            if (p10 != null) {
                p70Var.getClass();
                i12 = this.f40372c.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f40372c;
                f3Var.f33933s = this.d;
                f3Var.v = this.e;
            } else {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n4.l(this.f40370a, this.f40371b, motionEvent, this, this.f40372c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f40373f = pageBlock;
        requestLayout();
    }
}
