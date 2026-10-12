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
    public final w70 f42637a;
    public final g4 f42638b;
    public b3 f42639c;
    public int d;
    public int f42640e;
    public TL_iv.pageBlockFooter f42641f;

    public v1(Context context, w70 w70Var, g4 g4Var) {
        super(context);
        this.f42637a = w70Var;
        this.f42638b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f42639c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f42639c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f36046s;
        this.f42637a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f42639c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f36046s;
        this.f42637a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f42639c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f36046s;
        this.f42637a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.am.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f42639c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f42639c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42641f == null) {
            return;
        }
        b3 b3Var = this.f42639c;
        w70 w70Var = this.f42637a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f42640e);
            i4.v(w70Var, canvas, this, 0);
            this.f42639c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, w70Var, this.f42641f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        b3 b3Var = this.f42639c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVFooter, i4.j(this.f42637a, this.f42638b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f42641f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            w70 w70Var = this.f42637a;
            i12 = 0;
            if (i13 == 0) {
                w70Var.getClass();
                this.f42640e = AndroidUtilities.dp(8);
                w70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f42640e = 0;
                w70Var.getClass();
                this.d = AndroidUtilities.dp((this.f42641f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f42641f.text;
            w70 w70Var2 = this.f42637a;
            w70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f42641f;
            g4 g4Var = this.f42638b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.sx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(w70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f42638b);
            this.f42639c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f42641f.level > 0) {
                    w70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    w70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.f42639c;
                b3Var.f36046s = this.d;
                b3Var.v = this.f42640e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f42637a, this.f42638b, motionEvent, this, this.f42639c, this.d, this.f42640e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f42641f = pageblockfooter;
        requestLayout();
    }
}
