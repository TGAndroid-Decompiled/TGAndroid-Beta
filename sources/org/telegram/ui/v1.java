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
public final class v1 extends View implements org.telegram.ui.Cells.p9, d3 {
    public final u70 f38327a;
    public final f4 f38328b;
    public a3 f38329c;
    public int d;
    public int e;
    public TL_iv.PageBlock f38330f;

    public v1(Context context, u70 u70Var, f4 f4Var) {
        super(context);
        this.f38327a = u70Var;
        this.f38328b = f4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f38329c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f38329c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + this.d;
        this.f38327a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f38329c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + this.d;
        this.f38327a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f38329c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + this.d;
        this.f38327a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.wl.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f38329c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f38329c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38330f != null && this.f38329c != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            h4.v(this.f38327a, canvas, this, 0);
            this.f38329c.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        a3 a3Var = this.f38329c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(h4.i(R.string.AccDescrIVHeading, h4.j(this.f38327a, this.f38328b, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int size = View.MeasureSpec.getSize(i10);
        u70 u70Var = this.f38327a;
        u70Var.getClass();
        this.d = AndroidUtilities.dp(18);
        u70Var.getClass();
        this.e = AndroidUtilities.dp(8);
        TL_iv.PageBlock pageBlock = this.f38330f;
        if (pageBlock != null) {
            TL_iv.RichText richText = pageBlock.text;
            u70 u70Var2 = this.f38327a;
            u70Var2.getClass();
            int dp = size - AndroidUtilities.dp(36);
            TL_iv.PageBlock pageBlock2 = this.f38330f;
            f4 f4Var = this.f38328b;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.jw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p5 = h4.p(u70Var2, this, null, richText, dp, 0, pageBlock2, alignment, 0, this.f38328b);
            this.f38329c = p5;
            if (p5 != null) {
                u70Var.getClass();
                i12 = this.f38329c.d.getHeight() + AndroidUtilities.dp(16);
                a3 a3Var = this.f38329c;
                a3Var.f31679s = this.d;
                a3Var.v = this.e;
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
        if (!h4.l(this.f38327a, this.f38328b, motionEvent, this, this.f38329c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.PageBlock pageBlock) {
        this.f38330f = pageBlock;
        requestLayout();
    }
}
