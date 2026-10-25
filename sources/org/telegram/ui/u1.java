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
public final class u1 extends View implements org.telegram.ui.Cells.r9, e3 {
    public final h70 f43968a;
    public final h4 f43969b;
    public a3 f43970c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f43971f;

    public u1(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f43968a = h70Var;
        this.f43969b = h4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f43970c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        a3 a3Var = this.f43970c;
        if (a3Var == null) {
            return -1;
        }
        int a2 = a3Var.a() + a3Var.f37631s;
        this.f43968a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        a3 a3Var = this.f43970c;
        if (a3Var == null) {
            return -1;
        }
        int b10 = a3Var.b() + a3Var.f37631s;
        this.f43968a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        a3 a3Var = this.f43970c;
        if (a3Var == null) {
            return -1;
        }
        int c10 = a3Var.c() + a3Var.f37631s;
        this.f43968a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return d3.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f43970c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.f43970c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43971f == null) {
            return;
        }
        a3 a3Var = this.f43970c;
        h70 h70Var = this.f43968a;
        if (a3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            j4.v(h70Var, canvas, this, 0);
            this.f43970c.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, h70Var, this.f43971f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        a3 a3Var = this.f43970c;
        if (a3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(j4.i(R.string.AccDescrIVFooter, j4.j(this.f43968a, this.f43969b, a3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f43971f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            h70 h70Var = this.f43968a;
            i12 = 0;
            if (i13 == 0) {
                h70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                h70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                h70Var.getClass();
                this.d = AndroidUtilities.dp((this.f43971f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f43971f.text;
            h70 h70Var2 = this.f43968a;
            h70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f43971f;
            h4 h4Var = this.f43969b;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.px0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p10 = j4.p(h70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f43969b);
            this.f43970c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f43971f.level > 0) {
                    h70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    h70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                a3 a3Var = this.f43970c;
                a3Var.f37631s = this.d;
                a3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j4.l(this.f43968a, this.f43969b, motionEvent, this, this.f43970c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f43971f = pageblockfooter;
        requestLayout();
    }
}
