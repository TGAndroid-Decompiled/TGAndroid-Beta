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
public final class w1 extends View implements org.telegram.ui.Cells.l9, g3 {
    public final o70 f42246a;
    public final j4 f42247b;
    public d3 f42248c;
    public int d;
    public int f42249e;
    public TL_iv.pageBlockFooter f42250f;

    public w1(Context context, o70 o70Var, j4 j4Var) {
        super(context);
        this.f42246a = o70Var;
        this.f42247b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f42248c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f42248c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f35964s;
        this.f42246a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f42248c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f35964s;
        this.f42246a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f42248c;
        if (d3Var == null) {
            return -1;
        }
        int c3 = d3Var.c() + d3Var.f35964s;
        this.f42246a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f42248c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f42248c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42250f == null) {
            return;
        }
        d3 d3Var = this.f42248c;
        o70 o70Var = this.f42246a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f42249e);
            l4.v(o70Var, canvas, this, 0);
            this.f42248c.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, o70Var, this.f42250f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        d3 d3Var = this.f42248c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVFooter, l4.j(this.f42246a, this.f42247b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f42250f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            o70 o70Var = this.f42246a;
            i12 = 0;
            if (i13 == 0) {
                o70Var.getClass();
                this.f42249e = AndroidUtilities.dp(8);
                o70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f42249e = 0;
                o70Var.getClass();
                this.d = AndroidUtilities.dp((this.f42250f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f42250f.text;
            o70 o70Var2 = this.f42246a;
            o70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f42250f;
            j4 j4Var = this.f42247b;
            if (j4Var != null && j4Var.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p10 = l4.p(o70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f42247b);
            this.f42248c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f42250f.level > 0) {
                    o70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    o70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                d3 d3Var = this.f42248c;
                d3Var.f35964s = this.d;
                d3Var.v = this.f42249e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f42246a, this.f42247b, motionEvent, this, this.f42248c, this.d, this.f42249e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f42250f = pageblockfooter;
        requestLayout();
    }
}
