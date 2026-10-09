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
    public final t70 f42595a;
    public final g4 f42596b;
    public b3 f42597c;
    public int d;
    public int f42598e;
    public TL_iv.pageBlockFooter f42599f;

    public v1(Context context, t70 t70Var, g4 g4Var) {
        super(context);
        this.f42595a = t70Var;
        this.f42596b = g4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.f42597c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        b3 b3Var = this.f42597c;
        if (b3Var == null) {
            return -1;
        }
        int a2 = b3Var.a() + b3Var.f36115s;
        this.f42595a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        b3 b3Var = this.f42597c;
        if (b3Var == null) {
            return -1;
        }
        int b10 = b3Var.b() + b3Var.f36115s;
        this.f42595a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        b3 b3Var = this.f42597c;
        if (b3Var == null) {
            return -1;
        }
        int c10 = b3Var.c() + b3Var.f36115s;
        this.f42595a.getClass();
        return AndroidUtilities.dp(18) + c10;
    }

    public int getMinWidth() {
        return org.telegram.messenger.bi.a(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.f42597c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.f42597c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f42599f == null) {
            return;
        }
        b3 b3Var = this.f42597c;
        t70 t70Var = this.f42595a;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.f42598e);
            i4.v(t70Var, canvas, this, 0);
            this.f42597c.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, t70Var, this.f42599f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        b3 b3Var = this.f42597c;
        if (b3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(i4.i(R.string.AccDescrIVFooter, i4.j(this.f42595a, this.f42596b, b3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f42599f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            t70 t70Var = this.f42595a;
            i12 = 0;
            if (i13 == 0) {
                t70Var.getClass();
                this.f42598e = AndroidUtilities.dp(8);
                t70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.f42598e = 0;
                t70Var.getClass();
                this.d = AndroidUtilities.dp((this.f42599f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f42599f.text;
            t70 t70Var2 = this.f42595a;
            t70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f42599f;
            g4 g4Var = this.f42596b;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.mx0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(t70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f42596b);
            this.f42597c = p5;
            if (p5 != null) {
                int height = p5.d.getHeight();
                if (this.f42599f.level > 0) {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    t70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                b3 b3Var = this.f42597c;
                b3Var.f36115s = this.d;
                b3Var.v = this.f42598e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!i4.l(this.f42595a, this.f42596b, motionEvent, this, this.f42597c, this.d, this.f42598e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f42599f = pageblockfooter;
        requestLayout();
    }
}
