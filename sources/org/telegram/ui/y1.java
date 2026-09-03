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
public final class y1 extends View implements org.telegram.ui.Cells.k9, i3 {
    public final p70 f40112a;
    public final l4 f40113b;
    public f3 f40114c;
    public int d;
    public int e;
    public TL_iv.pageBlockFooter f40115f;

    public y1(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f40112a = p70Var;
        this.f40113b = l4Var;
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f40114c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
    }

    @Override
    public int getBoundLeft() {
        f3 f3Var = this.f40114c;
        if (f3Var == null) {
            return -1;
        }
        int a2 = f3Var.a() + f3Var.f33933s;
        this.f40112a.getClass();
        return a2 - AndroidUtilities.dp(18);
    }

    @Override
    public int getBoundRight() {
        f3 f3Var = this.f40114c;
        if (f3Var == null) {
            return -1;
        }
        int b10 = f3Var.b() + f3Var.f33933s;
        this.f40112a.getClass();
        return AndroidUtilities.dp(18) + b10;
    }

    @Override
    public int getLastLineBoundRight() {
        f3 f3Var = this.f40114c;
        if (f3Var == null) {
            return -1;
        }
        int c3 = f3Var.c() + f3Var.f33933s;
        this.f40112a.getClass();
        return AndroidUtilities.dp(18) + c3;
    }

    public int getMinWidth() {
        return b.b(this);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f40114c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f40114c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40115f == null) {
            return;
        }
        f3 f3Var = this.f40114c;
        p70 p70Var = this.f40112a;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.d, this.e);
            n4.v(p70Var, canvas, this, 0);
            this.f40114c.draw(canvas, this);
            canvas.restore();
        }
        n4.u(canvas, p70Var, this.f40115f, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        f3 f3Var = this.f40114c;
        if (f3Var == null) {
            return;
        }
        accessibilityNodeInfo.setText(n4.i(R.string.AccDescrIVFooter, n4.j(this.f40112a, this.f40113b, f3Var)));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        Layout.Alignment alignment;
        int dp;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockFooter pageblockfooter = this.f40115f;
        if (pageblockfooter != null) {
            int i13 = pageblockfooter.level;
            p70 p70Var = this.f40112a;
            i12 = 0;
            if (i13 == 0) {
                p70Var.getClass();
                this.e = AndroidUtilities.dp(8);
                p70Var.getClass();
                this.d = AndroidUtilities.dp(18);
            } else {
                this.e = 0;
                p70Var.getClass();
                this.d = AndroidUtilities.dp((this.f40115f.level * 14) + 18);
            }
            TL_iv.RichText richText = this.f40115f.text;
            p70 p70Var2 = this.f40112a;
            p70Var2.getClass();
            int dp2 = (size - AndroidUtilities.dp(36)) - this.d;
            TL_iv.pageBlockFooter pageblockfooter2 = this.f40115f;
            l4 l4Var = this.f40113b;
            if (l4Var != null && l4Var.D) {
                alignment = org.telegram.ui.Components.kw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            f3 p10 = n4.p(p70Var2, this, null, richText, dp2, 0, pageblockfooter2, alignment, 0, this.f40113b);
            this.f40114c = p10;
            if (p10 != null) {
                int height = p10.d.getHeight();
                if (this.f40115f.level > 0) {
                    p70Var.getClass();
                    dp = AndroidUtilities.dp(8);
                } else {
                    p70Var.getClass();
                    dp = AndroidUtilities.dp(16);
                }
                i12 = dp + height;
                f3 f3Var = this.f40114c;
                f3Var.f33933s = this.d;
                f3Var.v = this.e;
            }
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n4.l(this.f40112a, this.f40113b, motionEvent, this, this.f40114c, this.d, this.e) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockFooter pageblockfooter) {
        this.f40115f = pageblockfooter;
        requestLayout();
    }
}
