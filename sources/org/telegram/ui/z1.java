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

public final class z1 extends View implements org.telegram.ui.Cells.i9, i3 {

    public final d70 f44988a;

    public final k4 f44989b;

    public f3 f44990c;
    public int d;

    public int f44991e;

    public TL_iv.PageBlock f44992f;

    public z1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f44988a = d70Var;
        this.f44989b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f44990c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f44990c;
        if (f3Var == null) {
            return -1;
        }
        int iA = f3Var.a() + this.d;
        this.f44988a.getClass();
        return iA - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f44990c;
        if (f3Var == null) {
            return -1;
        }
        int iB = f3Var.b() + this.d;
        this.f44988a.getClass();
        return AndroidUtilities.dp(18) + iB;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f44990c;
        if (f3Var == null) {
            return -1;
        }
        int iC = f3Var.c() + this.d;
        this.f44988a.getClass();
        return AndroidUtilities.dp(18) + iC;
    }

    public int getMinWidth() {
        return org.telegram.messenger.rl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f44990c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f44990c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44992f == null || this.f44990c == null) {
            return;
        }
        canvas.save();
        canvas.translate(this.d, this.f44991e);
        m4.v(this.f44988a, canvas, this, 0);
        this.f44990c.draw(canvas, this);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        f3 f3Var = this.f44990c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVHeading, m4.j(this.f44988a, this.f44989b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int height;
        int size = View.MeasureSpec.getSize(i10);
        d70 d70Var = this.f44988a;
        d70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        d70Var.getClass();
        this.f44991e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f44992f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            d70 d70Var2 = this.f44988a;
            d70Var2.getClass();
            int iDp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f44992f;
            k4 k4Var = this.f44989b;
            f3 f3VarP = m4.p(d70Var2, this, null, richText, iDp, 0, pageBlock2, (k4Var == null || !k4Var.C) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.tv0.a(), 0, this.f44989b);
            this.f44990c = f3VarP;
            if (f3VarP != null) {
                d70Var.getClass();
                height = this.f44990c.d.getHeight() + AndroidUtilities.dp(16);
                f3 f3Var = this.f44990c;
                f3Var.f37923s = this.d;
                f3Var.v = this.f44991e;
            } else {
                height = 0;
            }
        } else {
            height = 1;
        }
        setMeasuredDimension(size, height);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return m4.l(this.f44988a, this.f44989b, motionEvent, this, this.f44990c, this.d, this.f44991e) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f44992f = pageBlock;
        requestLayout();
    }
}
