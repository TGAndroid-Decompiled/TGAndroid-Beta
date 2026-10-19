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
public final class x1 extends View implements org.telegram.ui.Cells.m9, g3 {
    public final b70 f42983a;
    public final j4 f42984b;
    public d3 f42985c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f42986f;

    public x1(Context context, b70 b70Var, j4 j4Var) {
        super(context);
        this.f42983a = b70Var;
        this.f42984b = j4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f42985c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        d3 d3Var = this.f42985c;
        if (d3Var == null) {
            return -1;
        }
        int a2 = d3Var.a() + d3Var.f36235s;
        this.f42983a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        d3 d3Var = this.f42985c;
        if (d3Var == null) {
            return -1;
        }
        int b10 = d3Var.b() + d3Var.f36235s;
        this.f42983a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        d3 d3Var = this.f42985c;
        if (d3Var == null) {
            return -1;
        }
        int c10 = d3Var.c() + d3Var.f36235s;
        this.f42983a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.kk.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f42985c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d3 d3Var = this.f42985c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42986f == null) {
            return;
        }
        d3 d3Var = this.f42985c;
        b70 b70Var = this.f42983a;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            l4.v(b70Var, canvas, this, 0);
            this.f42985c.draw(canvas, this);
            canvas.restore();
        }
        l4.u(canvas, b70Var, this.f42986f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        d3 d3Var = this.f42985c;
        if (d3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(l4.i(R.string.AccDescrIVFooter, l4.j(this.f42983a, this.f42984b, d3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f42986f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            b70 b70Var = this.f42983a;
            i12 = 0;
            if (i13 == 0) {
                b70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                b70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                b70Var.getClass();
                this.d = AndroidUtilities.dp((this.f42986f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f42986f.text;
            b70 b70Var2 = this.f42983a;
            b70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f42986f;
            j4 j4Var = this.f42984b;
            if (j4Var != null && j4Var.G) {
                alignment = org.telegram.ui.Components.ex0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            d3 p5 = l4.p(b70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f42984b);
            this.f42985c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f42986f.level > 0) {
                    b70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    b70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                d3 d3Var = this.f42985c;
                d3Var.f36235s = this.d;
                d3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!l4.l(this.f42983a, this.f42984b, motionEvent, this, this.f42985c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f42986f = pageblockfooter;
        requestLayout();
    }
}
