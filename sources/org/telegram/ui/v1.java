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
public final class v1 extends View implements org.telegram.ui.Cells.p9, e3 {
    public final p70 f38584a;
    public final g4 f38585b;
    public b3 f38586c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f38587f;

    public v1(Context context, p70 p70Var, g4 g4Var) {
        super(context);
        this.f38584a = p70Var;
        this.f38585b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f38586c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f38586c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f32303s;
        this.f38584a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f38586c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f32303s;
        this.f38584a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f38586c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f32303s;
        this.f38584a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.ok.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f38586c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f38586c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f38587f == null) {
            return;
        }
        b3 b3Var = this.f38586c;
        p70 p70Var = this.f38584a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            i4.v(p70Var, canvas, this, 0);
            this.f38586c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, p70Var, this.f38587f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        b3 b3Var = this.f38586c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVFooter, i4.j(this.f38584a, this.f38585b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f38587f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            p70 p70Var = this.f38584a;
            i12 = 0;
            if (i13 == 0) {
                p70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                p70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                p70Var.getClass();
                this.d = AndroidUtilities.dp((this.f38587f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f38587f.text;
            p70 p70Var2 = this.f38584a;
            p70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f38587f;
            g4 g4Var = this.f38585b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.vw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(p70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f38585b);
            this.f38586c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f38587f.level > 0) {
                    p70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    p70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.f38586c;
                b3Var.f32303s = this.d;
                b3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f38584a, this.f38585b, motionEvent, this, this.f38586c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f38587f = pageblockfooter;
        requestLayout();
    }
}
