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
public final class y1 extends View implements org.telegram.ui.Cells.j9, i3 {
    public final d70 f44692a;
    public final k4 f44693b;
    public f3 f44694c;
    public int d;
    public int f44695e;
    public TL_iv.pageBlockFooter f44696f;

    public y1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f44692a = d70Var;
        this.f44693b = k4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f44694c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f44694c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f37974s;
        this.f44692a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f44694c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f37974s;
        this.f44692a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f44694c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f37974s;
        this.f44692a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f44694c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f44694c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f44696f == null) {
            return;
        }
        f3 f3Var = this.f44694c;
        d70 d70Var = this.f44692a;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f44695e);
            m4.v(d70Var, canvas, this, 0);
            this.f44694c.draw(canvas, this);
            canvas.restore();
        }
        m4.u(canvas, d70Var, this.f44696f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        f3 f3Var = this.f44694c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(m4.i(R.string.AccDescrIVFooter, m4.j(this.f44692a, this.f44693b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f44696f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            d70 d70Var = this.f44692a;
            i12 = 0;
            if (i13 == 0) {
                d70Var.getClass();
                this.f44695e = AndroidUtilities.dp(8);
                d70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f44695e = 0;
                d70Var.getClass();
                this.d = AndroidUtilities.dp((this.f44696f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f44696f.text;
            d70 d70Var2 = this.f44692a;
            d70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f44696f;
            k4 k4Var = this.f44693b;
            if (k4Var != null && k4Var.C) {
                alignment = org.telegram.ui.Components.bw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = m4.p(d70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f44693b);
            this.f44694c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f44696f.level > 0) {
                    d70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    d70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                f3 f3Var = this.f44694c;
                f3Var.f37974s = this.d;
                f3Var.v = this.f44695e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m4.l(this.f44692a, this.f44693b, motionEvent, this, this.f44694c, this.d, this.f44695e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f44696f = pageblockfooter;
        requestLayout();
    }
}
