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
public final class v1 extends View implements org.telegram.ui.Cells.n9, e3 {
    public final t70 f42641a;
    public final g4 f42642b;
    public b3 f42643c;
    public int d;
    public int f42644e;
    public TL_iv.pageBlockFooter f42645f;

    public v1(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f42641a = t70Var;
        this.f42642b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f42643c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f42643c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f36161s;
        this.f42641a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f42643c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f36161s;
        this.f42641a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f42643c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f36161s;
        this.f42641a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f42643c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f42643c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42645f == null) {
            return;
        }
        b3 b3Var = this.f42643c;
        t70 t70Var = this.f42641a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f42644e);
            i4.v(t70Var, canvas, this, 0);
            this.f42643c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, t70Var, this.f42645f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        b3 b3Var = this.f42643c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVFooter, i4.j(this.f42641a, this.f42642b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f42645f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            t70 t70Var = this.f42641a;
            i12 = 0;
            if (i13 == 0) {
                t70Var.getClass();
                this.f42644e = AndroidUtilities.dp(8);
                t70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f42644e = 0;
                t70Var.getClass();
                this.d = AndroidUtilities.dp((this.f42645f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f42645f.text;
            t70 t70Var2 = this.f42641a;
            t70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f42645f;
            g4 g4Var = this.f42642b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.nx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(t70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f42642b);
            this.f42643c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f42645f.level > 0) {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.f42643c;
                b3Var.f36161s = this.d;
                b3Var.v = this.f42644e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f42641a, this.f42642b, motionEvent, this, this.f42643c, this.d, this.f42644e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f42645f = pageblockfooter;
        requestLayout();
    }
}
